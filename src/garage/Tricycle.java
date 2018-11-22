package garage;

public class Tricycle extends Vehicle{
	//attributes
	
	String trikeModel;
	Boolean hasTwoFrontWheels;
	
	//constructors
	
	public Tricycle(int vVehcileID, String vTrikeModel, Boolean vHasTwoFrontWheels, String vBrand, int vWeight) {	
		super(vVehcileID, vBrand, vWeight);
		this.trikeModel = vTrikeModel;
		this.hasTwoFrontWheels = vHasTwoFrontWheels;
	}
	
	public Tricycle(Tricycle vTricycle) {
		super(vTricycle.getBrand(),vTricycle.trikeModel);
	}

	//methods

}
