
public class PatientFile {
	
	String cid, firstName, lastName, address, postalCode, ohipNum, phone, email;
	
	public PatientFile(String id, String fN, String lN,  String addr,  String pC, String oN, String p, String e) {
		
		cid = id;
		firstName = fN;
		lastName = lN;
		address = addr;
		postalCode = pC;
		ohipNum =  oN;
		phone = p;
		email = e;
	}
	
	@Override
	public String toString() {
		
	 return "CID: " + cid + " Name: " + firstName + " " + lastName + " Phone: " + phone + " Address: " + address + " Postal Code: " + postalCode + " OHIP #: " + ohipNum +  " Email: " + email;
		
	}
	
	
	
	
	
	

}
