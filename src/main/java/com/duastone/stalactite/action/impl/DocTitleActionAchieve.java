package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.DocTitleAction;
import com.duastone.stalactite.entity.DocTitle;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Implement of {@link DocTitleAction}
 * Created by Fernando on 9/4/16.
 */
@Repository("docTitleAction")
public class DocTitleActionAchieve extends BaseActionAchieve<DocTitle> implements DocTitleAction{

    @Override
    public List<DocTitle> find(String subjectId) {
        return mongoTemplate.find(
            query(where("subjectId").is(subjectId)),
            DocTitle.class
        );
    }

    // Remove doc content by subject id.
    @Override
    public void removeBySubjectId(String subjectId) {
        mongoTemplate.remove(
            query(where("subjectId").is(subjectId)),
            DocTitle.class
        );
    }

    /* Get total size of title by subject ID */
    @Override
    public int totalBySubjectId(String subjectId) {
        return (int) this.mongoTemplate.count(
            query(where("subjectId").is(subjectId)),
            DocTitle.class
        );
    }
}
