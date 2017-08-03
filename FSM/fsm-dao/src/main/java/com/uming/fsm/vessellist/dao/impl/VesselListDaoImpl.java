package com.uming.fsm.vessellist.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.umdp.generic.bean.TableState;
import com.uming.fsm.bean.FsmCurVessel;
import com.uming.fsm.vessellist.dao.IVesselListDao;

/**
 * @description DAO for FSM_CUR_VESSEL table
 * @author Hao Hung
 * @since 2017年8月3日
 */
@Repository
@Transactional
public class VesselListDaoImpl implements IVesselListDao{
  
  @PersistenceContext
  private EntityManager entityManager;
  
  @Override
  public List<FsmCurVessel> getTableData(TableState tableState) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<FsmCurVessel> criteria = builder.createQuery( FsmCurVessel.class );
    Root<FsmCurVessel> root = criteria.from( FsmCurVessel.class );
    criteria.select( root );
    //排序，依條件做升冪或降冪
    String predicate = tableState.getSort().getPredicate();
    if(predicate != null) {
      if(tableState.getSort().getReverse()) {
          criteria.orderBy(builder.desc(root.get(predicate)));
        }else {
          criteria.orderBy(builder.asc(root.get(predicate)));
        }
    }
    //搜尋
    Map<String, Object> searchObj = tableState.getSearch().getPredicateObject();
//    System.out.println(searchObj.get("no"));
    if(searchObj != null) {
      for (String key : searchObj.keySet()) {          
        criteria.where(builder.like(root.<String>get(key).as(String.class), "%" + searchObj.get(key).toString()+ "%"));
      }
    }
    
    List<FsmCurVessel> result = entityManager.createQuery(criteria).getResultList();
    return result;
  }

  @Override
  public Long getDataCount(TableState tableState) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Long> criteria = builder.createQuery( Long.class );
    Root<FsmCurVessel> root = criteria.from( FsmCurVessel.class );
    criteria.select( builder.count(root) );
    //搜尋
    Map<String, Object> searchObj = tableState.getSearch().getPredicateObject();
    if(searchObj != null) {
      for (String key : searchObj.keySet()) {
        criteria.where(builder.like(root.<String>get(key).as(String.class), "%" + searchObj.get(key).toString()+ "%"));
      }
    }
    
    Long resultCount = entityManager.createQuery( criteria ).getSingleResult();
    return resultCount;
  }
  
}
