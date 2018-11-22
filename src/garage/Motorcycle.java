package garage;

public class Motorcycle extends Vehicle{
	//attributes
	
	String bikeModel;
	Boolean hasStorageBox;
	
	//constructors
	
	public Motorcycle(int vVehcileID, String vBikeModel, Boolean vHasStorageBox, String vBrand, int vWeight) {	
		super(vVehcileID, vBrand, vWeight);
		this.bikeModel = vBikeModel;
		this.hasStorageBox = vHasStorageBox;
	}
	
	public Motorcycle(Motorcycle vMotorcycle) {
		super(vMotorcycle.getBrand(),vMotorcycle.bikeModel);
	}

	//methods

}
