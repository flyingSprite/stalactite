package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.action.LabelAction;
import com.duastone.stalactite.entity.Label;
import com.duastone.stalactite.exception.ValueErrorException;
import com.duastone.stalactite.service.LabelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by Fernando on 8/24/16.
 */
@Service("labelService")
public class LabelServiceImpl implements LabelService {

    @Resource
    private LabelAction labelAction;

    @Override
    public List<Label> getList(String categoryId) throws ValueErrorException {

        if (StringUtils.isBlank(categoryId)) {
            throw new ValueErrorException("Category id cannot be null when get labels.");
        }
        return labelAction.find(categoryId);
    }

    @Override
    public Label get(String id) throws ValueErrorException {
        return null;
    }

    @Override
    public void save(Label label) throws ValueErrorException {
        if (StringUtils.isBlank(label.getValue())) {
            throw new ValueErrorException("Label value cannot be null.");
        }
        if (StringUtils.isBlank(label.getCategoryId()) && StringUtils.isBlank(label.getCategoryId())) {
            throw new ValueErrorException("Category id cannot be null when save label.");
        }
        labelAction.save(label);
    }

    @Override
    public void update(Label label) throws ValueErrorException {
    }

    @Override
    public void delete(String id) throws ValueErrorException {
        if (StringUtils.isBlank(id)) {
            throw new ValueErrorException("Id cannot be null.");
        }
        labelAction.delete(id);
    }
}
