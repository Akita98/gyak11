package sajat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Proba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meret = 5;
		int [] egeszTomb = new int [meret];
		InputStreamReader bemenetiAdatfolyam = new InputStreamReader(System.in);
		
		BufferedReader beolvasas = new BufferedReader(bemenetiAdatfolyam);
		
		BufferedReader beolvasas2 = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=0; i<egeszTomb.length; i++){
		
		try {
			boolean rosszAdat = true;
			
			do {
				
				try {
					System.out.println("Kérem adjon meg egy egész számot!");
					
					String sztring = beolvasas.readLine();
					egeszTomb[i] = Integer.parseInt(sztring);
					rosszAdat = false;	
				} catch (NumberFormatException e) {
					System.out.println("Nem egész számot kaptunk. Adja meg újból: ");
					// TODO: handle exception
				}
				
				
				
				
				
			} while (rosszAdat);
			
		} catch (IOException kivetelObjektum) {
			// TODO Auto-generated catch block
			kivetelObjektum.printStackTrace();
		}
	}
		for (int i : egeszTomb) {
			System.out.println(i);
			
		}
	}
}
