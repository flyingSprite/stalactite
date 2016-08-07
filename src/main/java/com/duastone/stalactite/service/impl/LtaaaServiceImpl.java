package com.duastone.stalactite.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.LtaaaAction;
import com.duastone.stalactite.entity.ListValue;
import com.duastone.stalactite.entity.LtaaaTitle;
import com.duastone.stalactite.entity.Pager;
import com.duastone.stalactite.service.LtaaaSerivce;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:46:44 PM 
 */
@Service("ltaaaService")
public class LtaaaServiceImpl implements LtaaaSerivce{
	
	@Resource
	private LtaaaAction ltaaaAction;
	
	@Override
	public long total() {
		return ltaaaAction.total();
	}

	@Override
	public ListValue list(Pager pager) {
		if (pager == null) {
			pager = new Pager();
		}
		
		long total = ltaaaAction.total();
		pager.setTotal(total);
		
		List<LtaaaTitle> list = ltaaaAction.getList(pager);
		ListValue value = new ListValue();
		value.setData(list);
		value.setPager(pager);
		return value;
	}

	
}
