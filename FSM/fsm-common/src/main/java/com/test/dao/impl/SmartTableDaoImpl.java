package com.test.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.bean.SmartTable;
import com.test.dao.SmartTableDao;
import com.umdp.generic.bean.TableState;

@Repository
@Transactional
public class SmartTableDaoImpl implements SmartTableDao{


	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<SmartTable> getSmartTableData(TableState tableState) {

	  CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	  CriteriaQuery<SmartTable> criteria = builder.createQuery( SmartTable.class );
	  Root<SmartTable> root = criteria.from( SmartTable.class );
	  
	  criteria.select( root );     
	  //order by
	  String predeicate = tableState.getSort().getPredicate();
	  if(predeicate != null) {
	    if(tableState.getSort().getReverse()) {
	        criteria.orderBy(builder.desc(root.get(predeicate)));
	      }else {
	        criteria.orderBy(builder.asc(root.get(predeicate)));
	      }
	  }
      
      //Search obj 
      Map<String, Object> searchObj = tableState.getSearch().getPredicateObject();
      if(searchObj != null) {
        for (String key : searchObj.keySet()) {          
          criteria.where(builder.like(root.<String>get(key).as(String.class), "%" + searchObj.get(key).toString()+ "%"));
        }
      }
      
      //get result with limits
	  List<SmartTable> result = entityManager.createQuery( criteria )
	                                         .setFirstResult(tableState.getPagination().getStart())
	                                         .setMaxResults(tableState.getPagination().getNumber())
	                                         .getResultList();
	  return result;
	}

	
  @Override
  public Long getDataCount(TableState tableState) {
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    CriteriaQuery<Long> criteria = builder.createQuery( Long.class );
    Root<SmartTable> root = criteria.from( SmartTable.class );
    
    criteria.select( builder.count(root) );
    //Search obj 
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
