package com.duastone.stalactite.action;

import java.util.List;

import com.duastone.stalactite.entity.LtaaaTitle;
import com.duastone.stalactite.entity.Pager;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:22:20 PM 
 */
public interface LtaaaAction extends BaseAction<LtaaaTitle>{
	
	public int total();
	
	public List<LtaaaTitle> getList(Pager pager);
}
