package com.hundsun.futures.entity;
// default package

import java.util.Date;


/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer pid;
     private String aid;
     private String content;
     private Date time;
     private Integer child;


    // Constructors

    /** default constructor */
    public Reply() {
    }


	public Reply(Integer id, Integer pid, String aid, String content,
			Date time, Integer child) {
		super();
		this.id = id;
		this.pid = pid;
		this.aid = aid;
		this.content = content;
		this.time = time;
		this.child = child;
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
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}


	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}


	/**
	 * @return the aid
	 */
	public String getAid() {
		return aid;
	}


	/**
	 * @param aid the aid to set
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}


	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}


	/**
	 * @return the child
	 */
	public Integer getChild() {
		return child;
	}


	/**
	 * @param child the child to set
	 */
	public void setChild(Integer child) {
		this.child = child;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reply [id=" + id + ", pid=" + pid + ", aid=" + aid
				+ ", content=" + content + ", time=" + time + ", child="
				+ child + "]";
	}

    
    








}