package invoice.generator;

class Ride {
	public final double distance;
	public final double time;

	public Ride(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}
}

public class CabServices {
	private final int rides;
	private final double totalFare;
	private final double avarageFare;

	public CabServices(int rides, double totalFare) {
		this.rides = rides;
		this.totalFare = totalFare;
		this.avarageFare = this.totalFare / this.rides;
	}

	/**
	 * method for Enchanced invoice
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CabServices cs = (CabServices) o;
		return rides == cs.rides && Double.compare(cs.totalFare, totalFare) == 0
				&& Double.compare(cs.avarageFare, avarageFare) == 0;
	}
}
