package com.reddy;

import java.util.ArrayList;
import java.util.List;

public class NotificationContact {

	
	public int getNotificationContactId() {
		return NotificationContactId;
	}
	public void setNotificationContactId(int notificationContactId) {
		NotificationContactId = notificationContactId;
	}
	public List<NotificationLoc> getNotificationLocList() {
		if(notificationLocList == null)
			notificationLocList = new ArrayList<NotificationLoc>();
		return notificationLocList;
	}
	public void setNotificationLocList(List<NotificationLoc> notificationLocList) {
		this.notificationLocList = notificationLocList;
	}
	
	private int NotificationContactId;
	private List<NotificationLoc> notificationLocList;
}
