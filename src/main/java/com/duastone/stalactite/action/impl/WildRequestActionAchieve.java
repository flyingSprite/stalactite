package com.duastone.stalactite.action.impl;

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
    public List<Object> get(String collectionName, int start, int count) {
        count = count == 0 ? 20 : count;
//        DBCollection collection = this.getCollection(collectionName);
        Criteria criteria = new Criteria();
        Query query = new Query(criteria);
        query.skip(start);
        query.limit(count);
        List<Object> results = mongoTemplate.find(query, Object.class, collectionName);
        for (Object res : results) {
            try {
                Field field = res.getClass().getDeclaredField("_id");
                System.out.println(field.get(res).toString());
                field.set(res, field.get(res).toString());
            } catch (NoSuchFieldException | IllegalAccessException e) {
                // Do nothing.
            }
        }
        return results;
    }
}
