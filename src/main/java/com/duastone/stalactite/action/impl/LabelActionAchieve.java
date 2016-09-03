package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.LabelAction;
import com.duastone.stalactite.entity.Label;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Created by Fernando on 8/24/16.
 */
@Repository("labelAction")
public class LabelActionAchieve extends BaseActionAchieve<Label> implements LabelAction{

    @Override
    public List<Label> find(String categoryId) {
        return mongoTemplate.find(
                query(where("categoryId").is(categoryId)),
                Label.class
        );
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(query(where("_id").is(id)), Label.class);
    }

    @Override
    public void deleteByCategoryId(String categoryId) {
        mongoTemplate.remove(query(where("categoryId").is(categoryId)), Label.class);
    }
}
