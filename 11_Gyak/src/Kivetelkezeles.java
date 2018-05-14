public class Kivetelkezeles {
	  public static void main(String[] args) {
	    
	   int i = 0;
	
	    do {
	
	      try {
	      
	        switch (i) {
	
	          case 0:
	              //osztás direkt nullával
              i = i / 0;
	              break;
	
	          case 1:
	              int[] tomb = new int[3];
	              //direkt rossz indexhivatkozás
	              tomb[3] = 42;
	              break;
	
	          case 2:
	              //direkt nincs feltöltve a tömb objektumokkal
	              Object[] objektum = new Object[1];
	              System.out.println(objektum[0].toString());
	              break;
	
	          case 3:
	              Object objektum2 = new Object();
	              //direkt rossz cast-olás
	              System.out.println((String)objektum2);
	              break;
	
	          case 4:
	              //RuntimeException dobása
	              throw new RuntimeException();
	              //break;
	
	          case 5:
	              //erre nincs catch blokk,
	              //RuntimeException az õse
	              //a RuntimeException fogja elkapni
	              throw new IllegalArgumentException();
	              //break;
	
	          case 6:
	              //erre nincs catch blokk, Exception az õse
	              //az Exception fogja elkapni
	              throw new InterruptedException();
	              //break;
	
	        }//switch
	
	      }//try
	      catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("IndexOutOf kivétel elkapva");
	      }
	      catch (ArithmeticException e) {
	        System.out.println("Arithmetic kivétel elkapva");
	      }      
	      catch (ClassCastException e) {
	        System.out.println("ClassCast kivétel elkapva");
	      }      
	      catch (NullPointerException e) {
	        System.out.println("NullPointer kivétel elkapva");
	      }      
	      catch (RuntimeException e) {
	        System.out.println("Runtime kivétel elkapva");
	      }
	      catch (Exception e) {
	        System.out.println("általános kivétel elkapva");
	      }
	      finally {
	        System.out.println("finally blokk");
	        i++;
	      }
	
	    } while (i < 7);
	
	  }
	}