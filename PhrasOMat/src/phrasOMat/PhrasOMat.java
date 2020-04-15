package phrasOMat;

public class PhrasOMat {
	public static void main(String[] args) {
		PhrasOMat kr = new PhrasOMat();
		for (int i = 0; i < 10; i++) {
			kr.printPhrase();
		}
	}
	
	// three wordPools
	String[] wordPoolOne = {"clevere", "zukunftsfähige", "neue", "analytische", "heißblütige", "berauschende","gravierende", "idealistische", "liebenswerte" };
	String[] wordPoolTwo = {"abenteuerliche", "lustige", "bedeutende", "harmonische", "charismatische", "fabelhafte", "geheimnisvolle", "innovative", "königliche"};
	String[] wordPoolThree = {"Sehnsüchte", "Quadratlatschen", "Quietscheentchen", "Himmelsschlösser", "Briefbögen", "Eisverkäufer", "Erdbeeren", "Rolltreppen", "Wettervorhersagen"};
	

	public void printPhrase() {
		// Select one random word per word pool and build a fantastic phrase
		int randomNumber1 = (int) ((wordPoolOne.length) * Math.random());
		int randomNumber2 = (int) ((wordPoolTwo.length) * Math.random());
		int randomNumber3 = (int) ((wordPoolThree.length) * Math.random());
		System.out.println("Wir brauchen dringend "+wordPoolOne[randomNumber1]+", "+wordPoolTwo[randomNumber2]+" "+wordPoolThree[randomNumber3]+".");
	}
	
}
