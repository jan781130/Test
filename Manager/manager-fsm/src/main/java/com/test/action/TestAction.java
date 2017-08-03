package com.test.action;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.manager.generic.action.BaseAction;
import com.test.bean.User;
import com.test.facade.TestFacade;
import com.umdp.generic.bean.UmingSysException;
import com.umdp.generic.config.ErrorMsgLocation;

@Controller
@Scope(value = "prototype")
@RequestMapping("/test")
public class TestAction extends BaseAction {

  @Autowired
  private TestFacade testFacade;

  /**
   * 當使用http://localhost:8080/Manager/test/test.json 時, 返回json
   * 
   * @param modelMap
   */
  @RequestMapping(value = "test", method = RequestMethod.GET)
  public void test(ModelMap modelMap) {
    HashMap<String, String> fackData = new HashMap<String, String>();
    fackData.put("status", "success");
    modelMap.addAllAttributes(super.getReturnAttribute(fackData));
  }

  /**
   * 先執行source/testsql/testSql.sql 當使用http://localhost:8080/Manager/test/getAllUser.json 時, 返回json
   * 
   * @param modelMap
   */
  @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
  public void getAllUser(ModelMap modelMap) {
    List<User> allUser = testFacade.getAllUser();
    modelMap.addAllAttributes(super.getReturnAttribute(allUser));
  }

  /**
   * 當使用http://localhost:8080/Manager/test/getUserById.json?id=1 時, 返回json
   * 
   * @param Integer id
   * @param modelMap
   */
  @RequestMapping(value = "getUserById", method = RequestMethod.GET)
  public void getUserById(@RequestParam Integer id, ModelMap modelMap) {
    User user = testFacade.getUserById(id);
    modelMap.addAllAttributes(super.getReturnAttribute(user));
  }

  /**
   * ExceptionHandler Example 當有例外發生，catch後 throw UmingSysException
   * 
   * @param String errorCode
   * @param ErrorMsgLocation ErrorMsgLocation.DB | ErrorMsgLocation.SYSTEM
   */
  @RequestMapping(value = "exceptionTest", method = RequestMethod.GET)
  public void exceptionTest() {
    throw new UmingSysException("TEST_ERROR_CODE", ErrorMsgLocation.SYSTEM);
  }

}
