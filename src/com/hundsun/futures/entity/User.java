package com.hundsun.futures.entity;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String pwd;
     private String email;
     private Integer type;
     private Integer level;


    // Constructors

    /** default constructor */
    public User() {
    }


	public User(Integer id, String name, String pwd, String email,
			Integer type, Integer level) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.type = type;
		this.level = level;
	}


	/**
	 * @return the id
	 */
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}


	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}


	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", email=" + email + ", type=" + type + ", level=" + level
				+ "]";
	}

    







}