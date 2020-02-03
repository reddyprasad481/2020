package com.reddy;

import java.util.ArrayList;
import java.util.List;

public class NotificationLoc {

	
	public List<WorkArea> getWorkAreaList() {
		if(workAreaList == null)
			workAreaList = new ArrayList<WorkArea>();
		return workAreaList;
	}
	public void setWorkAreaList(List<WorkArea> workAreaList) {
		this.workAreaList = workAreaList;
	}
	public int getNotificationLocId() {
		return notificationLocId;
	}
	public void setNotificationLocId(int notificationLocId) {
		this.notificationLocId = notificationLocId;
	}
	
	
	private List<WorkArea> workAreaList;
	private int notificationLocId;
}
