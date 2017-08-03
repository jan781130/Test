package com.test.service;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

public interface SmartTableService {
	
  TableResult getTableData(TableState tableState);
}
