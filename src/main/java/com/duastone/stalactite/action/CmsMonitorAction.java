package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.CmsMonitor;

import java.util.List;

/**
 * Cms monitor mongodb service
 *
 * @author Quesle
 * Github Quesle
 * Created by Fernando on 8/11/16.
 */
public interface CmsMonitorAction extends BaseAction<CmsMonitor>{

    public List<CmsMonitor> getLastTenCells();

    public int total();

}
