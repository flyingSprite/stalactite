package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.CmsMonitor;

import java.util.List;

/**
 * CmsMonitor serivce
 *
 * @author Quesle
 * Github Quesle
 * Created by Fernando on 8/11/16.
 */
public interface CmsMonitorService {

    public List<CmsMonitor> getCpuMonitorLast10Mins();
}
