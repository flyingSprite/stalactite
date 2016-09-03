package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.Label;
import com.duastone.stalactite.exception.ValueErrorException;

import java.util.List;

/**
 *
 * Created by Fernando on 8/24/16.
 */
public interface LabelService extends BasicService<Label>{

    public List<Label> getList(String categoryId) throws ValueErrorException;

}
