package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.CmsMonitor;
import com.duastone.stalactite.service.CmsMonitorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Cms monitor data api
 * Created by Fernando on 8/11/16.
 */
@RestController("cmsMonitorController")
public class CmsMonitorController {

    @Resource
    private CmsMonitorService cmsMonitorService;

    @RequestMapping(value="/cms", method = RequestMethod.GET)
    public List<CmsMonitor> get() {

        return cmsMonitorService.getCpuMonitorLast10Mins();
    }
}
