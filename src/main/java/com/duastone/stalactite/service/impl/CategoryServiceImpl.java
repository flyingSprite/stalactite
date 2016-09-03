package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.action.CategoryAction;
import com.duastone.stalactite.action.LabelAction;
import com.duastone.stalactite.entity.Category;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Fernando on 8/24/16.
 */
@Service("categorySerive")
public class CategoryServiceImpl implements CategoryService{

    @Resource
    private CategoryAction categoryAction;
    @Resource
    private LabelAction labelAction;

    @Override
    public List<Category> getList() {
        return categoryAction.getAll();
    }

    @Override
    public Category get(String id) throws ValueErrorException {
        if (StringUtils.isBlank(id)) {
            throw new ValueErrorException("Id cannot be null.");
        }
        return null;
    }

    @Override
    public void save(Category category) throws ValueErrorException{
        if (StringUtils.isBlank(category.getValue())) {
            throw new ValueErrorException("Category value cannot be null.");
        }
        categoryAction.save(category);
    }

    @Override
    public void update(Category category) {
    }

    @Override
    public void delete(String id) throws ValueErrorException{
        if (StringUtils.isBlank(id)) {
            throw new ValueErrorException("Category Id cannot be null.");
        }
        categoryAction.delete(id);
        labelAction.deleteByCategoryId(id);
    }
}
