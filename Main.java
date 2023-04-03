import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String frase = "Non è tanto chi sei tanto quello che fai che ti qualifica";
		
		
		System.out.println("Inserisci una parola per vedere se è contenuta nella frase");
		
		String scelta = scan.nextLine();
		
		ricercaParola(frase, scelta);
		

	}

	public static void ricercaParola(String frase,String scelta) {
		
		String [] array = frase.split(" ");
		
		boolean flag= true;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i].equals(scelta)) {
				
				System.out.println("Parola contenuta");
				
				flag=false;
				
				break;
				
			}
		}
	
		if(flag==true) {
			
			System.out.println("Parola non contenuta");
		}
	}
}
