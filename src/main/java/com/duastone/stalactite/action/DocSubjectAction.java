package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.DocSubject;

/**
 * Interface for docSubject collection in mongodb.
 * Created by Fernando on 9/4/16.
 */
public interface DocSubjectAction extends BaseAction<DocSubject>{

    public DocSubject findById(String subjectId);
}
