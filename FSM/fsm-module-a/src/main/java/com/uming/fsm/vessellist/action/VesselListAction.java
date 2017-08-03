package com.uming.fsm.vessellist.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.facade.SmartTableFacade;
import com.umdp.generic.action.BaseAction;
import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;
import com.uming.fsm.vessellist.facade.IVesselListFacade;

@Controller
@Scope(value="prototype")
@RequestMapping("/VesselList")
public class VesselListAction extends BaseAction {

    @Autowired
    private IVesselListFacade iVesselListFacade;
    
    @RequestMapping(value = "/getData", method = RequestMethod.POST)
    public void getTaleData(@RequestBody TableState tableState, ModelMap modelMap) throws JsonProcessingException{
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(mapper.writeValueAsString(tableState));
        TableResult tableData = iVesselListFacade.getTableData(tableState);
//        System.out.println(tableState.getPagination().getNumber());
        modelMap.addAllAttributes(super.getReturnAttribute(tableData));
    }
    
}

