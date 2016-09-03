package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.Mission;
import com.duastone.stalactite.exception.ValueErrorException;

import java.util.List;

/**
 *
 * Created by Fernando on 8/14/16.
 */
public interface MissionService {

    public void save(Mission mission) throws ValueErrorException;

    public void update(Mission mission) throws ValueErrorException;

    public List<Mission> getMissionList(String type);

    public void delete(String id) throws ValueErrorException;
}
