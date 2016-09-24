package com.duastone.stalactite.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Version Controller.
 * Get project basic infomation.
 * Such as version
 * Created by Fernando on 9/24/16.
 */
@RestController
public class VersionController {

    @RequestMapping(value="/version", method= RequestMethod.GET)
    public JSONObject get() {
        JSONObject object = new JSONObject();
        object.put("name", "Stalactite");
        object.put("version", "v0.1.2");
        object.put("news", "Add version module and support subject total size.");
        return object;
    }
}
