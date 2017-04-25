package com.duastone.stalactite.action.impl;

import com.alibaba.fastjson.JSONObject;
import com.duastone.stalactite.action.WildRequestAction;
import com.mongodb.DBCollection;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * Created by Quesle on 03/04/2017.
 */
@Repository("wildRequestAction")
public class WildRequestActionAchieve implements WildRequestAction {

    @Resource
    public MongoTemplate mongoTemplate;

    private DBCollection getCollection(String collectionName) {
        return this.mongoTemplate.getCollection(collectionName);
    }

    @Override
    public int total(String collectionName) {
        long count = this.getCollection(collectionName).count();
        return (int) count;
    }

    @Override
    public List<JSONObject> get(String collectionName, int start, int count) {
        count = count == 0 ? 20 : count;
        Criteria criteria = new Criteria();
        Query query = new Query(criteria);
        query.skip(start);
        query.limit(count);

        List<JSONObject> results = mongoTemplate.find(query, JSONObject.class, collectionName);
        results.forEach((item) -> {
            item.put("_id", String.valueOf(item.get("_id")));
        });
        return results;
    }
}
