package raceDay;

public class Car {
	
	// Attribute
	private int number;
	private String driver;
	private String brand;
	private String model;
	
	// Konstruktor
	public Car(int number, String driver, String brand, String model) {
		setNumber(number);
		setDriver(driver);
		setBrand(brand);
		setModel(model);
		
	}
	
	
	
	// Methods
	public String toString() {
		return ("[#"+(number+1)+"] "+driver+" ("+brand+" "+model+")");
	}

	
	// getter & setter
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		if(number > 0) {
			this.number = number;
		}
	}
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String driver) {
		if(driver!= null && driver.length()>1 && driver.length()<50 && driver.matches("[\\w ]+")) {
			this.driver = driver;
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		if(brand!=null && brand.length()>1 && brand.length()<50) {
			this.brand = brand;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model!=null && model.length()>1 && model.length()<50) {
			this.model = model;
		}
	}
	
	
}
