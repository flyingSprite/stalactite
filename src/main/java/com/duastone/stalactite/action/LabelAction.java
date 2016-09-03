package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.Label;

import java.util.List;

/**
 * Created by Fernando on 8/24/16.
 */
public interface LabelAction extends BaseAction<Label>{

    public List<Label> find(String categoryId);

    public void delete(String id);

    public void deleteByCategoryId(String categoryId);

}
