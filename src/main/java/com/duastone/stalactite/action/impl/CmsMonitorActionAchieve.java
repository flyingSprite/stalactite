package com.duastone.stalactite.action.impl;

import com.duastone.stalactite.action.CmsMonitorAction;
import com.duastone.stalactite.entity.CmsMonitor;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * {@link CmsMonitorAction} implement
 *
 * @author Quesle
 * Github Quesle
 * Created by Fernando on 8/11/16.
 */
@Repository("cmsMonitorAction")
public class CmsMonitorActionAchieve extends BaseActionAchieve<CmsMonitor> implements CmsMonitorAction {

    @Override
    public List<CmsMonitor> getLastTenCells() {
        Sort sort = new Sort(Sort.Direction.DESC, "timestamp");
        return mongoTemplate.find(
                query(new Criteria()).with(sort).limit(10),
                CmsMonitor.class);
    }

    @Override
    public int total() {
        return (int) this.mongoTemplate.getCollection("cmsMonitor").count();
    }
}
