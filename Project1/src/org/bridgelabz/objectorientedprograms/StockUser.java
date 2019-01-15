package org.bridgelabz.objectorientedprograms;

/**
 * Purpose: Stock user class
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   12/01/2019
 */
public class StockUser {
	String userId;
	String userName;
	String shareName;
	int numberOfShare;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getNumberofShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
}
