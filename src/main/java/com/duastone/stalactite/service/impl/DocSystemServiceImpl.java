package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.action.DocContentAction;
import com.duastone.stalactite.action.DocSubjectAction;
import com.duastone.stalactite.action.DocTitleAction;
import com.duastone.stalactite.entity.DocContent;
import com.duastone.stalactite.entity.DocSubject;
import com.duastone.stalactite.entity.DocTitle;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.DocSystemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Implement of {@link DocSystemService}
 * Created by Fernando on 9/4/16.
 */
@Service("docSystemService")
public class DocSystemServiceImpl implements DocSystemService{

    @Resource
    private DocSubjectAction docSubjectAction;

    @Resource
    private DocTitleAction docTitleAction;

    @Resource
    private DocContentAction docContentAction;

    // Get Doc Subject list.
    @Override
    public List<DocSubject> getDocSubjects(){

        List<DocSubject> subjects = docSubjectAction.findAll(DocSubject.class);

        // Get title size by the subject one by one
        for (DocSubject subject : subjects) {
            subject.setSize(docTitleAction.totalBySubjectId(subject.getId()));
        }
        return subjects;
    }

    @Override
    public DocSubject getDocSubject(String subjectId) throws ValueErrorException {
        if (StringUtils.isBlank(subjectId)) {
            throw new ValueErrorException("DocContent id must exist when query.");
        }

        return docSubjectAction.findById(subjectId);
    }

    // Get Doc Title list through by subject id.
    @Override
    public List<DocTitle> getDocTitle(String subjectId) throws ValueErrorException {
        if (StringUtils.isBlank(subjectId)) {
            throw new ValueErrorException("DocContent id must exist when query.");
        }

        return docTitleAction.find(subjectId);
    }

    // Get Doc content through by content id.
    @Override
    public DocContent getDocContent(String titleId) throws ValueErrorException{
        if (StringUtils.isBlank(titleId)) {
            throw new ValueErrorException("DocContent id must exist when query.");
        }
        return docContentAction.findOne(titleId);
    }

    // Save a new Doc Subject
    @Override
    public void saveDocSubject(DocSubject subject) throws ValueErrorException{

        if (StringUtils.isBlank(subject.getName())) {
            throw new ValueErrorException("DocSubject name value must exist.");
        }

        // Set default create time.
        if (subject.getCreateTime() == 0) {
            subject.setCreateTime(System.currentTimeMillis());
        }

        // Set default update time.
        if (subject.getUpdateTime() == 0) {
            subject.setUpdateTime(System.currentTimeMillis());
        }

        // Save doc subject
        docSubjectAction.save(subject);
    }

    // Save a new Doc Title
    @Override
    public void saveDocTitle(DocTitle title) throws ValueErrorException{

        if (StringUtils.isBlank(title.getSubjectId())) {
            throw new ValueErrorException("DocTitle subject id must exist.");
        }

        if (StringUtils.isBlank(title.getTitle())) {
            throw new ValueErrorException("DocTitle title value must exist.");
        }

        // Set default create time.
        if (title.getCreateTime() == 0) {
            title.setCreateTime(System.currentTimeMillis());
        }

        // Set default update time.
        if (title.getUpdateTime() == 0) {
            title.setUpdateTime(System.currentTimeMillis());
        }

        // save doc title
        docTitleAction.save(title);
    }

    // Save a new Doc Content
    @Override
    public void saveDocContent(DocContent content) throws ValueErrorException{

        if (content == null) {
            throw new ValueErrorException("DocContent object id must exist.");
        }

        if (StringUtils.isBlank(content.getTitleId())) {
            throw new ValueErrorException("DocContent title id must exist.");
        }

        if (StringUtils.isBlank(content.getContent())) {
            throw new ValueErrorException("DocContent content value must exist.");
        }

        // Set default create time.
        if (content.getCreateTime() == 0) {
            content.setCreateTime(System.currentTimeMillis());
        }

        // Set default update time.
        if (content.getUpdateTime() == 0) {
            content.setUpdateTime(System.currentTimeMillis());
        }

        DocContent existContent = this.getDocContent(content.getTitleId());
        if (existContent == null) {
            // save doc content.
            docContentAction.save(content);
        } else {
            content.setId(existContent.getId());
            this.updateDocContent(content);
        }


    }

    // Update a new Doc Subject
    @Override
    public void updateDocSubject(DocSubject subject) throws ValueErrorException{

        if (StringUtils.isBlank(subject.getId())) {
            throw new ValueErrorException("DocSubject id must exist when update.");
        }

        if (StringUtils.isBlank(subject.getName())) {
            throw new ValueErrorException("DocSubject name value must exist.");
        }

        // Set new update time.
        subject.setUpdateTime(System.currentTimeMillis());
    }

    // Update a new Doc Title
    @Override
    public void updateDocTitle(DocTitle title) throws ValueErrorException{

        if (StringUtils.isBlank(title.getId())) {
            throw new ValueErrorException("DocTitle id must exist when update.");
        }

        if (StringUtils.isBlank(title.getSubjectId())) {
            throw new ValueErrorException("DocTitle subject id must exist.");
        }

        if (StringUtils.isBlank(title.getTitle())) {
            throw new ValueErrorException("DocTitle title value must exist.");
        }

        // Set new update time.
        title.setUpdateTime(System.currentTimeMillis());

    }

    // Update a new Doc Content
    @Override
    public void updateDocContent(DocContent content) throws ValueErrorException{

        if (StringUtils.isBlank(content.getId())) {
            throw new ValueErrorException("DocContent id must exist when update.");
        }

        if (StringUtils.isBlank(content.getTitleId())) {
            throw new ValueErrorException("DocContent title id must exist.");
        }

        if (StringUtils.isBlank(content.getContent())) {
            throw new ValueErrorException("DocContent content value must exist.");
        }

        // Set new update time.
        content.setUpdateTime(System.currentTimeMillis());

        docContentAction.updateContent(content);
    }

    // Delete a new Doc Subject
    @Override
    public void deleteDocSubject(String subjectId) throws ValueErrorException{
        if (StringUtils.isBlank(subjectId)) {
            throw new ValueErrorException("DocSubject id must exist when delete.");
        }

        docSubjectAction.removeById(subjectId, DocSubject.class);
        docTitleAction.removeBySubjectId(subjectId);
        docContentAction.removeBySubjectId(subjectId);
    }

    // Delete a new Doc Title
    @Override
    public void deleteDocTitle(String titleId) throws ValueErrorException{
        if (StringUtils.isBlank(titleId)) {
            throw new ValueErrorException("DocTitle id must exist when delete.");
        }

        docTitleAction.removeById(titleId, DocTitle.class);
        docContentAction.removeByTitleId(titleId);
    }

    // Delete a new Doc Content
    @Override
    public void deleteDocContent(String contentId) throws ValueErrorException{
        if (StringUtils.isBlank(contentId)) {
            throw new ValueErrorException("DocContent id must exist when delete.");
        }

        docContentAction.removeById(contentId, DocContent.class);
    }
}
