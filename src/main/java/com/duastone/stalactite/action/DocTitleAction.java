package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.DocTitle;

import java.util.List;

/**
 * Interface for docTitle collection in mongodb
 * Created by Fernando on 9/4/16.
 */
public interface DocTitleAction extends BaseAction<DocTitle>{

    public List<DocTitle> find(String subjectId);

    public void removeBySubjectId(String subjectId);

    /* Get total size of title by subject ID */
    public int totalBySubjectId(String subjectId);
}
