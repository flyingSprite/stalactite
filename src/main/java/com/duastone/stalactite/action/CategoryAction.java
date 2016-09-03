package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.Category;

import java.util.List;

/**
 * Created by Fernando on 8/24/16.
 */
public interface CategoryAction extends BaseAction<Category>{

    public List<Category> getAll();

    public void delete(String id);

}
