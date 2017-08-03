package com.test.dao;

import java.util.List;

import com.test.bean.SmartTable;
import com.umdp.generic.bean.TableState;

public interface SmartTableDao {
	
	List<SmartTable> getSmartTableData(TableState tableState);
	
	Long getDataCount(TableState tableState);
}
