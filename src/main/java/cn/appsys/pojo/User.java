package cn.appsys.pojo;

import java.util.Date;

/**
 * 
 * 
 *@ds2017-7-24
 *@version1.0
 */
	/** ������ʵ���� */
public class User {

  private Integer id;//����id
  private String devCode;//�������ʺ�
  private String devName;//����������
  private String devPassword;//����������
  private String devEmail;//�����ߵ�������
  private String devInfo;//�����߼��
  private Integer createdBy;//�����ߣ���Դ��backend_user�û�����û�id��
  private Date creationDate;//����ʱ��
  private String modifyBy;//�����ߣ���Դ��backend_user�û�����û�id��
  private Date modifyDate;//���¸���ʱ��
  
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDevCode() {
	return devCode;
}
public void setDevCode(String devCode) {
	this.devCode = devCode;
}
public String getDevName() {
	return devName;
}
public void setDevName(String devName) {
	this.devName = devName;
}
public String getDevPassword() {
	return devPassword;
}
public void setDevPassword(String devPassword) {
	this.devPassword = devPassword;
}
public String getDevEmail() {
	return devEmail;
}
public void setDevEmail(String devEmail) {
	this.devEmail = devEmail;
}
public String getDevInfo() {
	return devInfo;
}
public void setDevInfo(String devInfo) {
	this.devInfo = devInfo;
}
public Integer getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(Integer createdBy) {
	this.createdBy = createdBy;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public String getModifyBy() {
	return modifyBy;
}
public void setModifyBy(String modifyBy) {
	this.modifyBy = modifyBy;
}
public Date getModifyDate() {
	return modifyDate;
}
public void setModifyDate(Date modifyDate) {
	this.modifyDate = modifyDate;
}
  
  
  
}
