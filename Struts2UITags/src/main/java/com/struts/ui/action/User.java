package com.struts.ui.action;

import java.util.Date;

public class User {

	private String name;
	private String password;
	private String bio;
	private boolean receiveUpdates;
	private String[] rolesSelect;
	private String roleCheckbox;
	private String[] rolesRadio;
	private String doubleSelectRole;
	private String doubleSelectExpertise;
	private String yourFruits;
	private String yourMonth;
	private String[] favFastFood;
	private Date dob;
	private int yourLuckyNumber;
	private String leftNumber;
	private String rightNumber;
	private String yourFavDatabase;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean isReceiveUpdates() {
		return receiveUpdates;
	}

	public void setReceiveUpdates(boolean receiveUpdates) {
		this.receiveUpdates = receiveUpdates;
	}

	public String[] getRolesSelect() {
		return rolesSelect;
	}

	public void setRolesSelect(String[] rolesSelect) {
		this.rolesSelect = rolesSelect;
	}

	public String getRoleCheckbox() {
		return roleCheckbox;
	}

	public void setRoleCheckbox(String roleCheckbox) {
		this.roleCheckbox = roleCheckbox;
	}

	public String[] getRolesRadio() {
		return rolesRadio;
	}

	public void setRolesRadio(String[] rolesRadio) {
		this.rolesRadio = rolesRadio;
	}

	public String getDoubleSelectExpertise() {
		return doubleSelectExpertise;
	}

	public void setDoubleSelectExpertise(String doubleSelectExpertise) {
		this.doubleSelectExpertise = doubleSelectExpertise;
	}

	public String getDoubleSelectRole() {
		return doubleSelectRole;
	}

	public void setDoubleSelectRole(String doubleSelectRole) {
		this.doubleSelectRole = doubleSelectRole;
	}

	public String getYourMonth() {
		return yourMonth;
	}

	public void setYourMonth(String yourMonth) {
		this.yourMonth = yourMonth;
	}

	public String getYourFruits() {
		return yourFruits;
	}

	public void setYourFruits(String yourFruits) {
		this.yourFruits = yourFruits;
	}

	public String[] getFavFastFood() {
		return favFastFood;
	}

	public void setFavFastFood(String[] favFastFood) {
		this.favFastFood = favFastFood;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getYourLuckyNumber() {
		return yourLuckyNumber;
	}

	public void setYourLuckyNumber(int yourLuckyNumber) {
		this.yourLuckyNumber = yourLuckyNumber;
	}

	public String getLeftNumber() {
		return leftNumber;
	}

	public void setLeftNumber(String leftNumber) {
		this.leftNumber = leftNumber;
	}

	public String getRightNumber() {
		return rightNumber;
	}

	public void setRightNumber(String rightNumber) {
		this.rightNumber = rightNumber;
	}

	public String getYourFavDatabase() {
		return yourFavDatabase;
	}

	public void setYourFavDatabase(String yourFavDatabase) {
		this.yourFavDatabase = yourFavDatabase;
	}

}