package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.DocContent;
import com.duastone.stalactite.entity.DocSubject;
import com.duastone.stalactite.entity.DocTitle;
import com.duastone.stalactite.exception.ValueErrorException;

import java.util.List;

/**
 * Doc Service interface.
 * Created by Fernando on 9/4/16.
 */
public interface DocSystemService {

    // Get Doc Subject list.
    public List<DocSubject> getDocSubjects();

    // Get Doc Subject by id.
    public DocSubject getDocSubject(String subjectId) throws ValueErrorException;

    // Get Doc Title list through by subject id.
    public List<DocTitle> getDocTitle(String subjectId) throws ValueErrorException;

    // Get Doc content through by content id.
    public DocContent getDocContent(String titleId) throws ValueErrorException;

    // Save a new Doc Subject
    public void saveDocSubject(DocSubject subject) throws ValueErrorException;

    // Save a new Doc Title
    public void saveDocTitle(DocTitle title) throws ValueErrorException;

    // Save a new Doc Content
    public void saveDocContent(DocContent content) throws ValueErrorException;

    // Update a new Doc Subject
    public void updateDocSubject(DocSubject subject) throws ValueErrorException;

    // Update a new Doc Title
    public void updateDocTitle(DocTitle title) throws ValueErrorException;

    // Update a new Doc Content
    public void updateDocContent(DocContent content) throws ValueErrorException;

    // Delete a new Doc Subject
    public void deleteDocSubject(String subjectId) throws ValueErrorException;

    // Delete a new Doc Title
    public void deleteDocTitle(String titleId) throws ValueErrorException;

    // Delete a new Doc Content
    public void deleteDocContent(String contentId) throws ValueErrorException;
}
