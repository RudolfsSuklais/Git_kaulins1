import java.util.Random;
import java.util.Scanner;
public class Kaulins {

	public static void main(String[] args) {

     int reizes;

     Scanner scan = new Scanner(System.in);
     do {
     System.out.println("Cik reizes mest kauliņu?");
     reizes = scan.nextInt();
     }while(reizes<1);
     scan.close();

		mestKaulinu(5);
	}
	
		static void mestKaulinu(int reizes) {
			 int skaitlis;
		     Random rand = new Random();
		     for(int i=0; i<reizes; i++) {
		    	 
		     
		     skaitlis = rand.nextInt(6)+1;
		     System.out.println("Tu uzmeti: "+skaitlis);
		     }
		
		
     
     

		
		
		
		
		
	}

}
