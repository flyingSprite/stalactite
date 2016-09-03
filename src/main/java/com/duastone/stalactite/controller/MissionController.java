package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.Mission;
import com.duastone.stalactite.entity.api.Res;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.MissionService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Fernando on 8/14/16.
 */
@RestController
public class MissionController {

    @Resource
    private MissionService missionService;

    @RequestMapping(value="/mission", method= RequestMethod.GET)
    public List<Mission> get(){
        return missionService.getMissionList("");
    }

    @RequestMapping(value="/mission", method= RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mission post(@RequestBody Mission mission){
        System.out.println(mission);
        try {
            missionService.save(mission);
            return mission;
        } catch (Exception e) {
            return new Mission();
        }

    }

    @RequestMapping(value="/mission", method= RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mission put(@RequestBody Mission mission){
        System.out.println(mission);
        try {
            missionService.update(mission);
            return mission;
        } catch (Exception e) {
            return new Mission();
        }

    }

    @RequestMapping(value="/mission", method= RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Res delete(@RequestBody Mission mission) {
        Res res = new Res();
        try{
            missionService.delete(mission.getId());
            res.setCode(200);
            res.setMessage("Delete mission " + mission.getId() + " successful");
        } catch (ValueErrorException e) {
            res.setCode(404);
            res.setData(e);
            res.setMessage("Delete mission " + mission.getId() + " failure");
        }
        return res;
    }
}
