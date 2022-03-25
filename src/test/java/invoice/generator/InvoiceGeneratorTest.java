package invoice.generator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
	@Test
	public void givenReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double totalFare = invoiceGenerator.calculateTotalFare(100, 20);
		Assert.assertEquals(120.0, totalFare, 0.0);
	}

	@Test
	public void givenReturnMinimumFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double totalFare = invoiceGenerator.calculateTotalFare(0.1, 1);
		Assert.assertEquals(5, totalFare, 0.0);

	}
}
