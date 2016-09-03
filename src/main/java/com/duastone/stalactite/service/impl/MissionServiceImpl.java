package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.action.MissionAction;
import com.duastone.stalactite.entity.Mission;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.MissionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Fernando on 8/14/16.
 */
@Service("missionService")
public class MissionServiceImpl implements MissionService{

    @Resource
    private MissionAction missionAction;

    @Override
    public void save(Mission mission) throws ValueErrorException {

        // Mission content is required, cannot be null.
        if (StringUtils.isBlank(mission.getContent())) {
            throw new ValueErrorException("Mission content cannot be null.");
        }

        // If create date is null, set current time millis
        if (mission.getCreateDate() == 0) {
            mission.setCreateDate(System.currentTimeMillis());
        }

        // If start date is null, set current time millis
        if (mission.getStartDate() == 0) {
            mission.setStartDate(System.currentTimeMillis());
        }

        // If end date is null, set current time millis
        if (mission.getEndDate() == 0) {
            mission.setEndDate(System.currentTimeMillis());
        }

        // To save mission
        missionAction.save(mission);
    }

    @Override
    public void update(Mission mission) throws ValueErrorException {

        // Mission ID is primary key, cannot be null.
        if (StringUtils.isBlank(mission.getId())) {
            throw new ValueErrorException("Mission ID cannot be null when update.");
        }

        // Mission title is required, cannot be null.
        if (StringUtils.isBlank(mission.getTitle())) {
            throw new ValueErrorException("Mission title cannot be null.");
        }

        // Mission content is required, cannot be null.
        if (StringUtils.isBlank(mission.getContent())) {
            throw new ValueErrorException("Mission content cannot be null.");
        }

        // If create date is null, set current time millis
        if (mission.getCreateDate() == 0) {
            mission.setCreateDate(System.currentTimeMillis());
        }

        // If start date is null, set current time millis
        if (mission.getStartDate() == 0) {
            mission.setStartDate(System.currentTimeMillis());
        }

        // If end date is null, set current time millis
        if (mission.getEndDate() == 0) {
            mission.setEndDate(System.currentTimeMillis());
        }

        // To update mission
        missionAction.update(mission);

    }

    @Override
    public List<Mission> getMissionList(String type) {
        return missionAction.getMssionList();
    }

    /**
     * To delete the mission by Id
     * @param id Mission id
     * @throws ValueErrorException
     */
    @Override
    public void delete(String id) throws ValueErrorException {
        // The mission is required when delete mission.
        if (StringUtils.isBlank(id)) {
            throw new ValueErrorException("Mission id cannot be null when delete mission.");
        }

        missionAction.delete(id);

    }
}
