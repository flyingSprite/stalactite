package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.Category;

import java.util.List;

/**
 * Created by Fernando on 8/24/16.
 */
public interface CategoryService extends BasicService<Category>{


    public List<Category> getList();
}
