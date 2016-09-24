package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.DocContent;
import com.duastone.stalactite.entity.DocSubject;
import com.duastone.stalactite.entity.DocTitle;
import com.duastone.stalactite.entity.api.Res;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.DocSystemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Doc System controller
 * Created by Fernando on 9/4/16.
 */
@RestController
public class DocSystemController {

    /** Inject {@link DocSystemService} to controller.*/
    @Resource
    private DocSystemService docSystemService;

    @RequestMapping(value="/doc/subject", method= RequestMethod.GET)
    public Res getDocSubject() {
        Res res = new Res(200);
        res.setData(docSystemService.getDocSubjects());
        return res;
    }

    @RequestMapping(value="/doc/subject/id", method= RequestMethod.GET)
    public Res getDocSubject(@RequestParam String subjectId) {
        Res res;
        try {
            res = new Res(200);
            res.setData(docSystemService.getDocSubject(subjectId));
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/doc/subject", method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res postDocSubject(@RequestBody DocSubject subject) {
        Res res;
        try {
            docSystemService.saveDocSubject(subject);
            res = new Res(200, "Svae Doc Suject successful.");
            res.setData(subject);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }

        return res;
    }

    @RequestMapping(value="/doc/subject", method= RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res deleteDocSubject(@RequestBody DocSubject subject) {
        Res res;
        try {
            System.out.println(subject);
            docSystemService.deleteDocSubject(subject.getId());
            res = new Res(200, "Svae Doc Suject successful.");
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }

        return res;
    }

    @RequestMapping(value="/doc/title", method=RequestMethod.GET)
    public Res getDocTitle(@RequestParam String subjectId) {
        Res res;
        try {
            System.out.println(subjectId);
            res = new Res(200);
            res.setData(docSystemService.getDocTitle(subjectId));
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/doc/title", method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res postDocTitle(@RequestBody DocTitle title) {
        Res res;
        try {
            docSystemService.saveDocTitle(title);
            res = new Res(200, "Svae Doc Title successful.");
            res.setData(title);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }

        return res;
    }

    @RequestMapping(value="/doc/title", method= RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res deleteDocTitle(@RequestBody DocTitle title) {
        Res res;
        try {
            System.out.println(title);
            docSystemService.deleteDocTitle(title.getId());
            res = new Res(200, "Delete Doc Title successful.");
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }

        return res;
    }

    @RequestMapping(value="/doc/content", method=RequestMethod.GET)
    public Res getDocContent(@RequestParam String titleId) {
        Res res;
        try {
            res = new Res(200);
            res.setData(docSystemService.getDocContent(titleId));
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/doc/content", method=RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res postDocContent(@RequestBody DocContent content) {
        Res res;
        try {
            docSystemService.saveDocContent(content);
            res = new Res(200);
            res.setData(content);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/doc/content", method=RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res putDocContent(@RequestBody DocContent content) {
        Res res;
        try {
            docSystemService.updateDocContent(content);
            res = new Res(200);
            res.setData(content);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

}
