package plata;
import trabajo.trabajo;
import java.lang.String;
class plata {

	public static void main(String[] args) {
		  trabajo sc = new trabajo();
		  if(sc.getpago()>1500000) {
				 System.out.println("usted tiene que pagar interes: ");
			 }if(sc.getpago()<1500000) {
				 System.out.println("usted no tiene que pagar interes ");
				 
			 }
		  System.out.println("hola: "+sc.getNombre());
		  System.out.println("ingrese nombre: "+sc.getpago());
		  
		 
	}

}
