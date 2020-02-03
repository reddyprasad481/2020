package com.reddy;

public class ContactsDBDetails {

	public ContactsDBDetails(int conId,int conLocId,int wrkSeqNbr) {
		
		this.contactId = conId;
		this.ContactLocId = conLocId;
		this.wrkAreaSeqNbr = wrkSeqNbr;
	}
	
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public int getContactLocId() {
		return ContactLocId;
	}
	public void setContactLocId(int contactLocId) {
		ContactLocId = contactLocId;
	}
	public int getWrkAreaSeqNbr() {
		return wrkAreaSeqNbr;
	}
	public void setWrkAreaSeqNbr(int wrkAreaSeqNbr) {
		this.wrkAreaSeqNbr = wrkAreaSeqNbr;
	}


	private int contactId;
	private int ContactLocId;
	private int wrkAreaSeqNbr;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return contactId+"-"+ContactLocId+"-"+wrkAreaSeqNbr;
	}
}
