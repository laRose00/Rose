package raceDay;
import java.util.*;


public class RaceDay {

	// Attribute
	private int maxLaps;
	private int currentLap;
	List <Car> cars = new ArrayList<>();
	
	// Konstruktor
	public RaceDay() {
	}
	
	
// Methoden
	public void addCar(Car c) {
		cars.add(c);
	}
	
	public void startRace( ) {
		System.out.println("The race starts now.");
		// drive as many laps as given
		while(this.getCurrentLap()<=this.getMaxLaps()) {
			System.out.println("Round "+this.getCurrentLap());
			for(Car currentCar : cars) {
				System.out.println(currentCar);
			}
			this.currentLap++;
			// take your time, you need to drive the laps
			sleep();
			// someone is faster than the other
			changePosition();
			// stop to change wheels in the middle of the race
			if(this.getCurrentLap() == ((this.getMaxLaps()+1)/2)) {
				pitStop();
			}
		}
		// at the end, give out the podium
		System.out.println("The Winners are: ");
//			for(Car currentCar : cars) {
//				int podium = cars.indexOf(currentCar)+1;
//				if(podium <=3) {
//					System.out.println(podium+" "+currentCar.getDriver());
//				}
//			}
		for(int i = 0; i<3; i++) {
			Car c = cars.get(i);
			System.out.println(c);
		}
		}
	
	// a lap takes 2000 ms
	public void sleep() {
		try {Thread.sleep(2000);} catch (Exception e) {}
	}
		
	// you can overtake a car before you
	public void changePosition() {
		int listIndex = (int) ((cars.size() - 1) * Math.random());
		Car c = cars.get(listIndex);
		cars.set(listIndex, cars.get(listIndex+1));
		cars.set(listIndex +1, c);
		System.out.println();
	}
	
	public void pitStop() {
		// change random cars after half the rounds
		System.out.println("Test: Half the rounds");
		int listIndex = (int) ((cars.size()-1) * Math.random());
		int listIndex2 = (int) ((cars.size()) * Math.random());
		Car c = cars.get(listIndex);
		if (listIndex2 != listIndex) {
			cars.set(listIndex, cars.get(listIndex2));
			cars.set(listIndex2, c);
		}
		System.out.println();
	}
	
	
	
// setter- & getter methods	
	public void setMaxLaps(int maxLaps) {
		if(maxLaps > 0) {
			this.maxLaps = maxLaps;
		}
	}
	
	public int getMaxLaps() {
		return maxLaps;
	}
	
	public void setCurrentLap(int currentLap) {
		if(currentLap<=maxLaps) {
			this.currentLap = currentLap;
		}
	}
	
	public int getCurrentLap() {
		return currentLap;
	}
	
}
