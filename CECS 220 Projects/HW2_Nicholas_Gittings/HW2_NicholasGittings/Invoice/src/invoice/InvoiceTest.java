package invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		//Tests for values greater than requirements
		Invoice myInvoice = new Invoice(1001, 1300, 13, 32, 2023);
		myInvoice.format();
		
		//Tests for values less than requirements
		Invoice otherInvoice = new Invoice(999, 1300, -1, -1, 2014);
		otherInvoice.format();
		
		//Tests for values within requirements
		Invoice lastInvoice = new Invoice(10467, 420, 5, 27, 2020);
		lastInvoice.format();
	}

}
