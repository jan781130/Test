package com.umdp.generic.bean;

import java.util.List;
import java.util.Map;

public class TableState {

	
	/*
	 * 用來當表格搜尋條件的 Bean
	 */
	private Search search;
	
	/*
	 * 用來當表格排序的Bean
	 */
	private Sort sort;
	
	/*
	 * 用來當表格pagination的Bean
	 */
	private Pagination pagination;
	
	/*
	 * 表格所有資料筆數
	 */
	private Long totalCount;
	
	/*
	 * 表格資料
	 */
	private List<?> result;


	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<?> getResult() {
		return result;
	}

	public void setResult(List<?> result) {
		this.result = result;
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}
	
	
	public class Pagination{
		private Integer start;
		private Integer totalItemCount;
		private Integer number;
		private Integer numberOfPages;
		
		public Integer getStart() {
			return start;
		}
		public void setStart(Integer start) {
			this.start = start;
		}
		public Integer getTotalItemCount() {
			return totalItemCount;
		}
		public void setTotalItemCount(Integer totalItemCount) {
			this.totalItemCount = totalItemCount;
		}
		public Integer getNumber() {
			return number;
		}
		public void setNumber(Integer number) {
			this.number = number;
		}
		public Integer getNumberOfPages() {
			return numberOfPages;
		}
		public void setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
		}
		
	}
	
	public class Sort{
		
		private String predicate;
		private Boolean reverse;
		
		public String getPredicate() {
			return predicate;
		}
		public void setPredicate(String predicate) {
			this.predicate = predicate;
		}
		public Boolean getReverse() {
			return reverse;
		}
		public void setReverse(Boolean reverse) {
			this.reverse = reverse;
		}
		
		
	}
	
	public class Search{
		
		private Map<String,Object> predicateObject;
		
		public Map<String,Object> getPredicateObject() {
			return predicateObject;
		}
		public void setPredicateObject(Map<String,Object> predicateObject) {
			this.predicateObject = predicateObject;
		}
		
	}
}
