package com.uming.fsm.vessellist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;
import com.uming.fsm.bean.FsmCurVessel;
import com.uming.fsm.vessellist.dao.IVesselListDao;
import com.uming.fsm.vessellist.service.IVesselListService;

@Service
public class VesselListServiceImpl implements IVesselListService {
  @Autowired
  private IVesselListDao iVesselListDao;
  
  @Override
  public TableResult getTableData(TableState tableState) {
    List<FsmCurVessel> data = iVesselListDao.getTableData(tableState);
    Long dataCount = iVesselListDao.getDataCount(tableState);  
    return new TableResult(dataCount, data);
  }

}
