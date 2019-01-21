package invoice;

public class Invoice {
	public int iInvoiceNumber, iBalanceDue, iMonth, iDay, iYear;
	
	//Constructor for Invoice
	Invoice(int pInvoiceNumber, int pBalanceDue, int pMonth, int pDay, int pYear) {
		
		//If parameter is greater than or equal to 1000 then it sets parameter equal to invoice number else it sets equal to 0
		if(pInvoiceNumber >= 1000) {
			iInvoiceNumber = pInvoiceNumber;
		}
		else {
			iInvoiceNumber = 0;
		}
		
		//Balance Due has no requirements, so sets parameter equal to balance due
		iBalanceDue = pBalanceDue;
		
		//If parameter is greater than 0 or less than 13 it sets parameter equal to month, else it sets equal to 0
		if(pMonth > 0 && pMonth < 13) {
			iMonth = pMonth;
		}
		else {
			iMonth = 0;
		}
		
		//If parameter is greater than 0 or less than 32, it sets parameter equal to month, else it equals to 0
		if(pDay > 0 && pDay < 32) {
			iDay = pDay;
		}
		else {
			iDay = 0;
		}
		
		//If parameter is greater than or equal to 2015 or less than or equal to 2022 it equals to year, else it equals to 0
		if(pYear >= 2015 && pYear <= 2022) {
			pYear = iYear;
		}
		else {
			iYear = 0;
		}
	}
	
	//Function that returns formatted string
	public String format() {
		
		//Adds beginning strings, then changes integers to strings
		String InvoiceNumber = "Invoice Number: " + Integer.toString(iInvoiceNumber);
		String BalanceDue = "Balance Due: " + Integer.toString(iBalanceDue);
		String Date = "Date: " + Integer.toString(iMonth) + "/" + Integer.toString(iDay) + "/" + Integer.toString(iYear);
		
		//Adds strings together and end lines
		String Formatted = InvoiceNumber + "\n" + BalanceDue + "\n" + Date + "\n";
		System.out.println(Formatted);
		
		//returns formatted string
		return Formatted;
		
	}
	
}