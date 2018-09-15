package trabajo;
import java.util.Scanner;
import java.lang.String;

public class trabajo {
	public Scanner sc;
   private  String nombre="camilo";
  public int pago;
  public int datos;

   
   
   //construtor
   public trabajo() {
	   sc=new Scanner(System.in);
	  
	   System.out.println("ingrese nombre: "+getNombre());
		setNombre(sc.next());
	   
		 System.out.println("ingrese tu paga: ");
		 pago(sc.nextInt());
		 
		 
  
   }
   

    private void pago(int pago) {
	           this.pago=pago;
	
     }

      public int getpago() {
	        return pago;
    }

      public String getNombre() {
	             return nombre;
    }
      public void setNombre(String nombre) {
	              this.nombre = nombre;
    }


   
    }

