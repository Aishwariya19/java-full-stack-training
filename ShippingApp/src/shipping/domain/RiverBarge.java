package shipping.domain;

public class RiverBarge extends Vehicle{
	private int loadCapacityInTon;

	public RiverBarge() {
		super();
	}

	public int getLoadCapacityInTon() {
		return loadCapacityInTon;
	}

	public void setLoadCapacityInTon(int loadCapacityInTon) {
		this.loadCapacityInTon = loadCapacityInTon;
	}
	

}