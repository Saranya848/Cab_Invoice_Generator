package invoice.generator;

public class InvoiceGenerator {
	/**
	 * costperkm - cost per Kilometer
	 * costpermin - cost per Minute
	 * minimumfare - Minimum Fare
	 * Procedure :
	 * 1. Calculating total Fare
	 * 
	 */
	private static final double costPerKM = 10;
	private static final double costPerMin = 1;
	private static final double minimumFare = 5;

	/**
	 * 1. Calculating total fare
	 * 
	 * @param distance - Distance travelled in Kilometer
	 * @param time     - Time taken of Travelled
	 * @return total fare
	 */
	public double calculateTotalFare(double distance, double time) {
		// double fare = (distance * 10 + time * 1);
		double fare = (distance * costPerKM + time * costPerMin);
		fare = Math.max(minimumFare, fare);
		return fare;
	}
}
