package com.duastone.stalactite.action;

import java.util.List;

/**
 * Created by Quesle on 03/04/2017.
 */
public interface WildRequestAction {

    public int total(String collectionName);

    public List<Object> get(String collectionName, int start, int count);

}
