package com.bobo.movie.vo;

import com.bobo.movie.domain.Movie;

public class MovieVO extends Movie {
	
	
	private String uptimeStart;//上映开始时间
	private String uptimeEnd;
	private String durationStart;//电影时间长
	private String durationEnd;
	private String priceStart;//最低价格
	private String priceEnd;
	private String orderByColumn; //排序字段
	private String orderByMethod;//排序方法 asc desc
	/**
	 * @return the uptimeStart
	 */
	public String getUptimeStart() {
		return uptimeStart;
	}
	/**
	 * @param uptimeStart the uptimeStart to set
	 */
	public void setUptimeStart(String uptimeStart) {
		this.uptimeStart = uptimeStart;
	}
	/**
	 * @return the uptimeEnd
	 */
	public String getUptimeEnd() {
		return uptimeEnd;
	}
	/**
	 * @param uptimeEnd the uptimeEnd to set
	 */
	public void setUptimeEnd(String uptimeEnd) {
		this.uptimeEnd = uptimeEnd;
	}
	/**
	 * @return the durationStart
	 */
	public String getDurationStart() {
		return durationStart;
	}
	/**
	 * @param durationStart the durationStart to set
	 */
	public void setDurationStart(String durationStart) {
		this.durationStart = durationStart;
	}
	/**
	 * @return the durationEnd
	 */
	public String getDurationEnd() {
		return durationEnd;
	}
	/**
	 * @param durationEnd the durationEnd to set
	 */
	public void setDurationEnd(String durationEnd) {
		this.durationEnd = durationEnd;
	}
	/**
	 * @return the priceStart
	 */
	public String getPriceStart() {
		return priceStart;
	}
	/**
	 * @param priceStart the priceStart to set
	 */
	public void setPriceStart(String priceStart) {
		this.priceStart = priceStart;
	}
	/**
	 * @return the priceEnd
	 */
	public String getPriceEnd() {
		return priceEnd;
	}
	/**
	 * @param priceEnd the priceEnd to set
	 */
	public void setPriceEnd(String priceEnd) {
		this.priceEnd = priceEnd;
	}
	/**
	 * @return the orderByColumn
	 */
	public String getOrderByColumn() {
		return orderByColumn;
	}
	/**
	 * @param orderByColumn the orderByColumn to set
	 */
	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}
	/**
	 * @return the orderByMethod
	 */
	public String getOrderByMethod() {
		return orderByMethod;
	}
	/**
	 * @param orderByMethod the orderByMethod to set
	 */
	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
	}
	
	
	
	
	
	

}
