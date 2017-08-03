package com.umdp.generic.bean;

import java.util.List;

public class TableResult {
  
  private Long dataCounts;
  
  private List<?> data;
    
 
  public TableResult() {
    
  }
   
  public TableResult(Long dataCounts, List<?> data) {
    super();
    this.dataCounts = dataCounts;
    this.data = data;
  }

  public Long getDataCounts() {
    return dataCounts;
  }

  public void setDataCounts(Long dataCounts) {
    this.dataCounts = dataCounts;
  }

  public List<?> getData() {
    return data;
  }

  public void setData(List<?> data) {
    this.data = data;
  }
  
  
}
