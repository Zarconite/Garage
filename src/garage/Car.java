package garage;

public class Car extends Vehicle{
	//attributes
	
	String carModel;
	String carType;
	int numberOfSeats;
	
	//constructors

	public Car(int vVehcileID, String vCarType, String vCarModel, int vNumberOfSeats, String vBrand, int vWeight) {	
		super(vVehcileID, vBrand, vWeight);
		this.carModel = vCarModel;
		this.carType = vCarType;
		this.numberOfSeats = vNumberOfSeats;
	}
	
	/* ?????
	public Car(String vBrand,String vCarModel) {
		this(vBrand,vCarModel,);
	}*/
	
	public Car(Car vCar) {
		super(vCar.getBrand(),vCar.carModel);
	}
	
	//methods

}
