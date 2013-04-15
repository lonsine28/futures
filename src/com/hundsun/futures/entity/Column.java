package com.hundsun.futures.entity;
// default package



/**
 * Column entity. @author MyEclipse Persistence Tools
 */

public class Column  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String column;
	/**
	 * @return the id
	 */
 	public Column() {
		// TODO Auto-generated constructor stub
	}
	public Column(Integer id, String column) {
		super();
		this.id = id;
		this.column = column;
	}
    
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the column
	 */
	public String getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(String column) {
		this.column = column;
	}


   








}