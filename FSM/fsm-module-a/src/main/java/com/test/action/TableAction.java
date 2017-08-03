package com.test.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.facade.SmartTableFacade;
import com.umdp.generic.action.BaseAction;
import com.umdp.generic.bean.TableResult;
import com.umdp.generic.bean.TableState;

@Controller
@Scope(value="prototype")
@RequestMapping("/table")
public class TableAction extends BaseAction {

	@Autowired
	private SmartTableFacade smartTableFacade;
	
	@RequestMapping(value = "/getData", method = RequestMethod.POST)
	public void getTaleData(@RequestBody TableState tableState, ModelMap modelMap) throws JsonProcessingException{
   		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(tableState));
		TableResult tableData = smartTableFacade.getTableData(tableState);
		System.out.println(tableState.getPagination().getNumber());
		modelMap.addAllAttributes(super.getReturnAttribute(tableData));
	}
	
}
