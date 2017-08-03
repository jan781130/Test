package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.SmartTable;
import com.test.dao.SmartTableDao;
import com.test.service.SmartTableService;
import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

@Service
public class SmartTableServiceImpl implements SmartTableService{

	@Autowired
	SmartTableDao smartTableDao;
	
	@Override
	public TableResult getTableData(TableState tableState) {
	   List<SmartTable> data = smartTableDao.getSmartTableData(tableState);
	   Long dataCount = smartTableDao.getDataCount(tableState);	   
	  return new TableResult(dataCount, data);
	}

}
