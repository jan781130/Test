package com.uming.fsm.vessellist.service;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

public interface IVesselListService {
  TableResult getTableData(TableState tableState);
}