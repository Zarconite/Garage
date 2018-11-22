package garage;

public abstract class Vehicle {
		//attributes
	
	protected int vehicleID;
	protected String brand;
	protected int weight;
	
		//constructors
	
	public Vehicle(int vVehicleID, String vBrand, int vWeight) {
		this.vehicleID = vVehicleID;
		this.brand = vBrand;
		this.weight = vWeight;
	}
	
	public Vehicle(int vVehicleID, String vBrand) {
		this.vehicleID = vVehicleID;
		this.brand = vBrand;
		this.weight = 0;
	}
	
		//methods
	public void setWeight(int vWeight) {
		this.weight = vWeight;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
}
