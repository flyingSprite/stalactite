package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.DocContentAction;
import com.duastone.stalactite.entity.Blog;
import com.duastone.stalactite.entity.DocContent;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Implement of {@link DocContentAction}
 * Created by Fernando on 9/4/16.
 */
@Repository("docContentAction")
public class DocContentActionAchieve extends BaseActionAchieve<DocContent> implements DocContentAction {

    @Override
    public DocContent findOne(String titleId) {
        return mongoTemplate.findOne(
                query(where("titleId").is(titleId)),
                DocContent.class
        );
    }

    // Remove doc content by title id.
    @Override
    public void removeByTitleId(String titleId) {
        mongoTemplate.remove(query(where("titleId").is(titleId)), DocContent.class);
    }

    // Remove doc content by subject id.
    @Override
    public void removeBySubjectId(String subjectId) {
        mongoTemplate.remove(query(where("subjectId").is(subjectId)), DocContent.class);
    }

    @Override
    public void updateContent(DocContent content) {
        Update update = new Update();
        update.set("content", content.getContent());
        update.set("updateTime", content.getUpdateTime());
        mongoTemplate.upsert(query(where("titleId").is(content.getTitleId())),
                update,
                DocContent.class);
    }
}
