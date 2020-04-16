package raceDay;

public class RaceDayTest {

	public static void main(String[] args) {
		RaceDay raceDay = new RaceDay();
		Car c1 = new Car(0, "Timo Glock", "BMW", "M4 DTM");
		Car c2 = new Car(1, "Anakin", "Spacer", "A2");
		Car c3 = new Car(2, "Fred Weasley", "FlyingCar", "Electricity");
		Car c4 = new Car(3, "Win Ner", "BMW", "M1 DTM");
		
		raceDay.setMaxLaps(5);
		raceDay.setCurrentLap(0);
		
		raceDay.addCar(c1);
		raceDay.addCar(c2);
		raceDay.addCar(c3);
		raceDay.addCar(c4);
		
		raceDay.startRace();
	}
	
	
}
