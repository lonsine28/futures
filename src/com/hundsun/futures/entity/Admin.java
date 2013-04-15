package com.hundsun.futures.entity;
// default package



/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String pwd;
     private Integer level;


    // Constructors

    /** default constructor */
    public Admin() {
    }


	public Admin(Integer id, String name, String pwd, Integer level) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.level = level;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public Integer getLevel() {
		return level;
	}


	public void setLevel(Integer level) {
		this.level = level;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {//it is used to debug
		return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", level=" + level + "]";
	}

    

   

   








}