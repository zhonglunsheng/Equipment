package com.zls.model;

import java.util.Date;
/**
 * ά��״̬ʵ��
 * @author zhonglunsheng
 *
 */
public class Repair {

	private Integer id;
	private Integer equipmentId;
	private String equipmentName;
	private String equipmentNo;
	/**������*/
	private String userMan;
	/**ά����*/
	private String repairMan; 
	/**����ʱ��*/
	private Date repairTime;
	/**�������ʱ��*/
	private Date finishTime;
	/**�����豸״̬ 1 ά�޳ɹ� 2 �豸���ϡ�*/
	private Integer state;
	/**1 δ���� 2 �������*/
	private Integer finishState; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	public String getUserMan() {
		return userMan;
	}
	public void setUserMan(String userMan) {
		this.userMan = userMan;
	}
	public String getRepairMan() {
		return repairMan;
	}
	public void setRepairMan(String repairMan) {
		this.repairMan = repairMan;
	}
	public Date getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getFinishState() {
		return finishState;
	}
	public void setFinishState(Integer finishState) {
		this.finishState = finishState;
	}
	
	
}
