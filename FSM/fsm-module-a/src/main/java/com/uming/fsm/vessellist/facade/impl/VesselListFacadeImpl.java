package com.uming.fsm.vessellist.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;
import com.uming.fsm.vessellist.facade.IVesselListFacade;
import com.uming.fsm.vessellist.service.IVesselListService;
@Component
public class VesselListFacadeImpl implements IVesselListFacade{
  
  @Autowired
  private IVesselListService iVesselListService; 
  
  @Override
  public TableResult getTableData(TableState tableState) {
    return iVesselListService.getTableData(tableState);
  }

}