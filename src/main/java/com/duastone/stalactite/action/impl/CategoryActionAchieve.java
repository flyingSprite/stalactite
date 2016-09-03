package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.CategoryAction;
import com.duastone.stalactite.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Created by Fernando on 8/24/16.
 */
@Repository("categoryAction")
public class CategoryActionAchieve extends BaseActionAchieve<Category> implements CategoryAction{

    @Override
    public List<Category> getAll() {
        return mongoTemplate.findAll(Category.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.remove(query(where("_id").is(id)), Category.class);
    }

}
