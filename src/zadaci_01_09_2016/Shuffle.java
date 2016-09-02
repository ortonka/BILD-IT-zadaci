package zadaci_01_09_2016;

import java.util.ArrayList;

public class Shuffle {

	public static void main(String[] args) {
		//kreiraj ArrayList sa objektima tipa Number
		 ArrayList<Number> list = new ArrayList<>();
		 //stavi elemente u listu
	        for (int i = 0; i < 20; i++) {
	            list.add(i);
	        }
	        //ispisi listu prije shuffle
	        System.out.println(list);
	        //poziv metoda
	        shuffle(list);
	        //ispis nakon shuffle
	        System.out.println(list);

	}
	//metod izvrši shuffle unutar liste
	 public static  void shuffle(ArrayList<Number> list) {

	        for (int i = 0; i < list.size(); i++) {
	            int random = (int) (Math.random() * list.size());
	            Number tmp = list.get(random);
	            list.set(random, list.get(i));
	            list.set(i, tmp);
	        }
	    }

}
