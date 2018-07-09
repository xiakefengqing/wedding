package com.wedding.user.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="wed_user")
public class UserVO {
	
	/**
	 * 主键
	 */
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
	private long pk_user;

	/**
	 * 用户名称
	 */
	@NotBlank
	private String userName;
	
	/**
	 * 密码
	 */
	@NotBlank
	private String passWd;
	
	
	/**
	 * 用户编码
	 */
	private String userCode;
	
	/**
	 * 联系方式
	 *
	 */
	@NotBlank
	private String phone;
	
	/**
	 * 备用联系方式
	 */
	private String phone1;
	
	/**
	 * 备用联系人
	 */
	private String linkMan1;
	
	/**
	 * 邮箱
	 */
	@Email
	private String mail;
	
	/**
	 * 收货地址
	 */
	private String deliveryAddress;
	
	/**
	 * 注册时间
	 */
	private Date registerTime;
	
	private String ts;
	
	private int dr;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getLinkMan1() {
		return linkMan1;
	}

	public void setLinkMan1(String linkMan1) {
		this.linkMan1 = linkMan1;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	public long getPk_user() {
		return pk_user;
	}

	public void setPk_user(long pk_user) {
		this.pk_user = pk_user;
	}
	

}
