package com.duastone.stalactite.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.duastone.stalactite.action.WildRequestAction;
import com.duastone.stalactite.entity.WildRequest;
import com.duastone.stalactite.service.WildRequestService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Quesle on 04/04/2017.
 */
@Service("wildRequestService")
public class WildRequestServiceImpl implements WildRequestService{

    @Resource
    private WildRequestAction wildRequestAction;

    @Override
    public WildRequest getResult(WildRequest request) {
        if (request == null) {
            request = new WildRequest("Unknow request!");
            return request;
        }

        if (StringUtils.isBlank(request.getName())) {
            request.setErr("Unknow request name!");
            return request;
        }

        if (request.getCount() > 100) {
            request.setCount(100);
        }

        int total = wildRequestAction.total(request.getName());
        request.setTotal(total);

        List<JSONObject> objs = wildRequestAction.get(
                request.getName(),
                request.getStart(),
                request.getCount()
        );
        request.setResult(objs);
        return request;
    }
}
