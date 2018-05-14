public class Kivetelkezeles {
	  public static void main(String[] args) {
	    
	   int i = 0;
	
	    do {
	
	      try {
	      
	        switch (i) {
	
	          case 0:
	              //oszt�s direkt null�val
              i = i / 0;
	              break;
	
	          case 1:
	              int[] tomb = new int[3];
	              //direkt rossz indexhivatkoz�s
	              tomb[3] = 42;
	              break;
	
	          case 2:
	              //direkt nincs felt�ltve a t�mb objektumokkal
	              Object[] objektum = new Object[1];
	              System.out.println(objektum[0].toString());
	              break;
	
	          case 3:
	              Object objektum2 = new Object();
	              //direkt rossz cast-ol�s
	              System.out.println((String)objektum2);
	              break;
	
	          case 4:
	              //RuntimeException dob�sa
	              throw new RuntimeException();
	              //break;
	
	          case 5:
	              //erre nincs catch blokk,
	              //RuntimeException az �se
	              //a RuntimeException fogja elkapni
	              throw new IllegalArgumentException();
	              //break;
	
	          case 6:
	              //erre nincs catch blokk, Exception az �se
	              //az Exception fogja elkapni
	              throw new InterruptedException();
	              //break;
	
	        }//switch
	
	      }//try
	      catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("IndexOutOf kiv�tel elkapva");
	      }
	      catch (ArithmeticException e) {
	        System.out.println("Arithmetic kiv�tel elkapva");
	      }      
	      catch (ClassCastException e) {
	        System.out.println("ClassCast kiv�tel elkapva");
	      }      
	      catch (NullPointerException e) {
	        System.out.println("NullPointer kiv�tel elkapva");
	      }      
	      catch (RuntimeException e) {
	        System.out.println("Runtime kiv�tel elkapva");
	      }
	      catch (Exception e) {
	        System.out.println("�ltal�nos kiv�tel elkapva");
	      }
	      finally {
	        System.out.println("finally blokk");
	        i++;
	      }
	
	    } while (i < 7);
	
	  }
	}