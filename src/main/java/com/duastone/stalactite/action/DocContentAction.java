package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.DocContent;

/**
 * Interface for docContent collection in mongodb.
 * Created by Fernando on 9/4/16.
 */
public interface DocContentAction extends BaseAction<DocContent>{

    public DocContent findOne(String titleId);

    public void removeByTitleId(String titleId);

    public void removeBySubjectId(String subjectId);

    public void updateContent(DocContent content);
}
