package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.action.CmsMonitorAction;
import com.duastone.stalactite.entity.CmsMonitor;
import com.duastone.stalactite.service.CmsMonitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * {@link CmsMonitorService } implement
 *
 * @author Quesle
 * Github Quesle
 * Created by Fernando on 8/11/16.
 */
@Service("cmsMonitorService")
public class CmsMonitorServiceImpl implements CmsMonitorService{

    @Resource
    private CmsMonitorAction cmsMonitorAction;

    @Override
    public List<CmsMonitor> getCpuMonitorLast10Mins() {
        return cmsMonitorAction.getLastTenCells();
    }
}
