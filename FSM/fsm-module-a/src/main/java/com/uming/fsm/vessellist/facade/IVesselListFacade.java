package com.uming.fsm.vessellist.facade;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

public interface IVesselListFacade {
  TableResult getTableData(TableState tableState);
}