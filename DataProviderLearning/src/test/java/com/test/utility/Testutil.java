package com.test.utility;

import java.util.ArrayList;

public class Testutil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> a=new ArrayList<Object[]>();
		try {
			 reader=new Xls_Reader("C://Users//abhis//OneDrive//Desktop//HalfBayTestData.xlsx");
	        //Create an object of File class to open xlsx file
	       
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		for(int rowncount=2;rowncount<=reader.getRowCount("RegTestData");rowncount++) {
			String firstName=reader.getCellData("RegTestData", "FirstName", rowncount);
			String lastName=reader.getCellData("RegTestData", "LastName", rowncount);
			String Address1=reader.getCellData("RegTestData", "Address1", rowncount);
			String Address2=reader.getCellData("RegTestData", "Address2", rowncount);
			String City=reader.getCellData("RegTestData", "City", rowncount);
			String Zipcode=reader.getCellData("RegTestData", "Zipcode", rowncount);
			String EmailAddress=reader.getCellData("RegTestData", "EmailAddress", rowncount);
			
			
			
		}
		
		return a;
		
		
	}

}
