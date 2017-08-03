package com.test.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.facade.SmartTableFacade;
import com.test.service.SmartTableService;
import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

@Component
public class SmartTableFacadeImpl implements SmartTableFacade{
    
	@Autowired
	private SmartTableService smartTableService;

	@Override
	public TableResult getTableData(TableState tableState) {
		return smartTableService.getTableData(tableState);
	}


}
