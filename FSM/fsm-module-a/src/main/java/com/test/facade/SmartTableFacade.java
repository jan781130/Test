package com.test.facade;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

public interface SmartTableFacade {
	
  TableResult getTableData(TableState tableState);
	
}
