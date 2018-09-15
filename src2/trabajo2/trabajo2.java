package trabajo2;
import java.util.*;
import java.util.Scanner;
import java.lang.String;


public class trabajo2 {
    public Scanner sc;
	public int dato1;
	public int dato2;
	public int p,l,s,m;
	

public trabajo2() {
	sc=new Scanner(System.in);
	System.out.println("ingrese un dato1: ");
	dato1(sc.nextInt());
	System.out.println("ingrese un dato2: ");
	dato2(sc.nextInt());
	
	p=dato1+dato2;

	l=dato1-dato2;

	s=dato1*dato2;

	m=dato1/dato2;
	
	
   }

      public void dato1(int dato1) {
	           this.dato1=dato1;
      }  
             public int getdato1(){
	
	               return dato1;
     }
             public int  getdato2(){
            		
                 return dato2;
               
         }

       public void dato2(int dato2) {
	              this.dato2=dato2;
   }
         
}