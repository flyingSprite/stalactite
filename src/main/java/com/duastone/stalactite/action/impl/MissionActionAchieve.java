package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.MissionAction;
import com.duastone.stalactite.entity.Blog;
import com.duastone.stalactite.entity.Mission;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * The mission action achieve.
 * Created by Fernando on 8/14/16.
 */
@Repository("missionAction")
public class MissionActionAchieve extends BaseActionAchieve<Mission> implements MissionAction{

    @Override
    public List<Mission> getMssionList() {
        Sort sort = new Sort(Sort.Direction.DESC, "timestamp");
        List<Mission> cmsList = mongoTemplate.find(
                query(new Criteria()).with(sort),
                Mission.class);
        Collections.reverse(cmsList);
        return cmsList;
    }

    @Override
    public void update(Mission mission) {
        Update update = new Update();
        update.set("title", mission.getTitle());
        update.set("type", mission.getType());
        update.set("content", mission.getContent());
        update.set("author", mission.getAuthor());
        update.set("reaper", mission.getReaper());
        update.set("status", mission.getStatus());
        update.set("createDate", mission.getCreateDate());
        update.set("startDate", mission.getStartDate());
        update.set("endDate", mission.getEndDate());

        mongoTemplate.upsert(query(where("_id").is(mission.getId())),
                update,
                Mission.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(query(where("_id").is(id)), Mission.class);
    }
}
