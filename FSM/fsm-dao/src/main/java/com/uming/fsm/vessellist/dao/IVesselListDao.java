package com.uming.fsm.vessellist.dao;

import java.util.List;

import com.umdp.generic.bean.TableState;
import com.uming.fsm.bean.FsmCurVessel;

/**
 * @description DAO interface for FSM_CUR_VESSEL table
 * @author Hao Hung
 * @since 2017年8月3日
 */
public interface IVesselListDao {
  List<FsmCurVessel> getTableData(TableState tableState);
  
  Long getDataCount(TableState tableState);
}
