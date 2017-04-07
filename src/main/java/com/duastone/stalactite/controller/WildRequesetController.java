package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.WildRequest;
import com.duastone.stalactite.service.WildRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 为了对接所有的mongo集合的查询
 * 目前主要包括
 * 1. 分页查询
 * Created by Quesle on 04/04/2017.
 */
@RestController
public class WildRequesetController {

    @Resource
    private WildRequestService wildRequestService;

    @RequestMapping(value="/wild")
    public WildRequest get(WildRequest wildRequest) {
        WildRequest response = wildRequestService.getResult(wildRequest);
        return response;
    }
}
