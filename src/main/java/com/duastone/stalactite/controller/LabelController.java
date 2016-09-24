package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.Label;
import com.duastone.stalactite.entity.api.Res;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.LabelService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * The Label Controler.
 * Get save update label(s).
 * Created by Fernando on 8/24/16.
 */
@RestController
public class LabelController {

    @Resource
    private LabelService labelService;

    // Get Lalbe list by category id.
    @RequestMapping(value="/label", method=RequestMethod.GET)
    public Res get(@RequestParam String categoryId){
        Res res;
        try {
            res = new Res(200);
            res.setData(labelService.getList(categoryId));
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/label", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res post(@RequestBody Label label) {
        Res res;
        try {
            labelService.save(label);
            res = new Res(200, "Save Label Successful", label);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/label", method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res delete(@RequestBody Label label) {
        Res res;
        try {
            labelService.delete(label.getId());
            res = new Res(200, "Delete Label Successful", label);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }

        return res;
    }

}
