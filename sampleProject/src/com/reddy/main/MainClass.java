package com.reddy.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.reddy.ContactsDBDetails;
import com.reddy.NotificationContact;
import com.reddy.NotificationLoc;
import com.reddy.WorkArea;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ContactsDBDetails> dbDetails = new ArrayList<ContactsDBDetails>();
		
		dbDetails.add(new ContactsDBDetails(1, 11, 111));
		dbDetails.add(new ContactsDBDetails(1, 12, 121));
		dbDetails.add(new ContactsDBDetails(2, 21, 211));
		dbDetails.add(new ContactsDBDetails(3, 31, 311));
		dbDetails.add(new ContactsDBDetails(4, 41, 411));
		dbDetails.add(new ContactsDBDetails(5, 52, 521));
		dbDetails.add(new ContactsDBDetails(1, 11, 112));
		dbDetails.add(new ContactsDBDetails(2, 22, 221));
		dbDetails.add(new ContactsDBDetails(4, 42, 421));
		dbDetails.add(new ContactsDBDetails(5, 55, 551));
		dbDetails.add(new ContactsDBDetails(3, 31, 312));
		
		Map<Integer, NotificationContact> contacMap = new HashMap<Integer, NotificationContact>();
		Map<Integer, NotificationLoc> locMap = new HashMap<Integer, NotificationLoc>();
		
		for (ContactsDBDetails contactsDBDetails : dbDetails) {
			
			if(!contacMap.containsKey(contactsDBDetails.getContactId())){
				
				NotificationContact notificationContact = new NotificationContact();
				notificationContact.setNotificationContactId(contactsDBDetails.getContactId());
				
				contacMap.put(contactsDBDetails.getContactId(),notificationContact);
			}
			
			if(!locMap.containsKey(contactsDBDetails.getContactLocId())){
				
				NotificationLoc notificationLoc = new NotificationLoc();
				notificationLoc.setNotificationLocId(contactsDBDetails.getContactLocId());
				contacMap.get(contactsDBDetails.getContactId()).getNotificationLocList().add(notificationLoc);
				locMap.put(contactsDBDetails.getContactLocId(), notificationLoc);
			}
			
			WorkArea workArea = new WorkArea();
			workArea.setWrkAreaSeqNbr(contactsDBDetails.getWrkAreaSeqNbr());
			locMap.get(contactsDBDetails.getContactLocId()).getWorkAreaList().add(workArea );
           
		}
		
		System.out.println("========================================");
		
		for (ContactsDBDetails contactsDBDetails : dbDetails) {
			System.out.println(contactsDBDetails);
		}
		
		System.out.println("========================================");
		
		for (Integer key : contacMap.keySet()) {
			System.out.println(contacMap.get(key).getNotificationContactId());
			System.out.println("------------------");
			
			for (NotificationLoc notificationLoc : contacMap.get(key).getNotificationLocList()) {
				
				System.out.println(notificationLoc.getNotificationLocId());
				
				System.out.println("................");
				
				for (WorkArea workArea : notificationLoc.getWorkAreaList()) {
					
					System.out.println(workArea.getWrkAreaSeqNbr());
				}
				System.out.println("................");
			}
			System.out.println("------------------");
		}
		
		System.out.println("========================================");
	}

}
