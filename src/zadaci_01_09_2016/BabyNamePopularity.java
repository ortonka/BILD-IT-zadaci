package zadaci_01_09_2016;


public class BabyNamePopularity {
	
	 public static void main(String[] args) throws java.io.IOException {

		 java.util.Scanner input = new java.util.Scanner(System.in);
	        //unos godine
	        System.out.print("Enter year (2010 - 2015): ");
	        String year = input.next();
	        //unos roda
	        System.out.print("Enter gender (f or m): ");
	        String gender = input.next();
	        //unos imena
	        System.out.print("Enter name: ");
	        String name = input.next();
	        input.close();
	        //kreiranje putanje za dohvatanje file-a
	        String path ="src/zadaci_01_09_2016/" + "babynameranking" + year + ".txt";
	        java.io.File file = new java.io.File(path);
	        //provjera da li file postoji
	        if (!file.exists()) {
	            System.out.println("No record for " + year);
	            System.exit(1);
	        }
	        //varijabla za spremanje ranka
	        int rank = 0;
	        try ( java.util.Scanner read = new java.util.Scanner(file)){
	            while (read.hasNext()) {
	            	//procitaj liniju unutar fila
	                String s = read.nextLine();
	                //razdijeli je u niz, splitter je tab
	                String[] temp = s.split("\t");
	                //ako je muski rod i postoji ime
	                if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
	                    rank = new Integer(temp[0]);
	                //ako nije, a postoji ime
	                else if (temp[3].contains(name))
	                    rank = new Integer(temp[0]);
	            }
	        } catch (java.io.FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        //ispis
	        if (rank == 0) {
	            System.out.println("The name "+name+" is not ranked in year " + year);
	        } else {

	            System.out.println(name+" is ranked #"+rank+" in year "+ year);
	        }


	    }

}
