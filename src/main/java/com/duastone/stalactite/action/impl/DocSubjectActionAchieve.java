package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.DocSubjectAction;
import com.duastone.stalactite.entity.DocSubject;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Implement of {@link DocSubjectAction}
 * Created by Fernando on 9/4/16.
 */
@Repository("docSubjectAction")
public class DocSubjectActionAchieve extends BaseActionAchieve<DocSubject> implements DocSubjectAction {

    // Find doc Subject by mongodb Id
    @Override
    public DocSubject findById(String subjectId) {
        return mongoTemplate.findOne(
                query(where("_id").is(subjectId)),
                DocSubject.class
        );
    }
}
