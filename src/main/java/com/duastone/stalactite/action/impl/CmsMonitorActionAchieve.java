package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.CmsMonitorAction;
import com.duastone.stalactite.entity.CmsMonitor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * {@link CmsMonitorAction} implement
 *
 * @author Quesle
 * Github Quesle
 * Created by Fernando on 8/11/16.
 */
@Repository("cmsMonitorAction")
public class CmsMonitorActionAchieve extends BaseActionAchieve<CmsMonitor> implements CmsMonitorAction {

    private List<CmsMonitor> getCells(int number){
        Sort sort = new Sort(Sort.Direction.DESC, "timestamp");
        List<CmsMonitor> cmsList = mongoTemplate.find(
                query(new Criteria()).with(sort).limit(number),
                CmsMonitor.class);
        Collections.reverse(cmsList);
        return cmsList;
    }

    @Override
    public List<CmsMonitor> getLastTenCells() {
        return this.getCells(10);
    }

    @Override
    public List<CmsMonitor> getLastHourCells() {
        return this.getCells(60);
    }

    @Override
    public int total() {
        return (int) this.mongoTemplate.getCollection("cmsMonitor").count();
    }
}
