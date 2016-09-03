package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.Mission;

import java.util.List;

/**
 * Mission action interface
 * Created by Fernando on 8/14/16.
 */
public interface MissionAction extends BaseAction<Mission>{

    public List<Mission> getMssionList();

    public void update(Mission mission);

    public void delete(String id);

}
