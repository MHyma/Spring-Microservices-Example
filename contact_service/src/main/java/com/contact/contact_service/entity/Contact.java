package com.contact.contact_service.entity;

public class Contact {

	private long cid;
	private String email;
	private String contactName;
	
	private long userid;

	public Contact(long cid, String email, String contactName, long userid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userid = userid;
	}

	public Contact() {
		super();
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
	
	
	
	
	
	
	
	
	
}
