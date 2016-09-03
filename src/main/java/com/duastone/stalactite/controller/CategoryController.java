package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.Category;
import com.duastone.stalactite.entity.Label;
import com.duastone.stalactite.entity.api.Res;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.CategoryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * Created by Fernando on 8/24/16.
 */
@RestController
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping(value="/category", method= RequestMethod.GET)
    public Res get(){
        Res res = new Res(200);
        res.setData(categoryService.getList());
        return res;
    }

    @RequestMapping(value="/category", method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res post(@RequestBody Category category) {
        Res res;
        try {
            categoryService.save(category);
            res = new Res(200, "Save Category Successful", category);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }

    @RequestMapping(value="/category", method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res delete(@RequestBody Category category) {
        Res res;
        try {
            categoryService.delete(category.getId());
            res = new Res(200, "Delete Category Successful", category);
        } catch (ValueErrorException e) {
            res = new Res(404, e.getMessage());
        }
        return res;
    }
}
