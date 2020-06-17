package clases;

import java.util.Scanner;

public class Ccola {
 Scanner teclado = new Scanner (System.in);  
 
      private int max;
      private int[] COLA;
      private int FRENTE;
      private int FINAL;
      
public Ccola(){
        this.max = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.max +1];
         
}
public Ccola(int max){
        this.max = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.max +1];
         
}
public boolean IsColallena(){
    if(this.FINAL == this.max){
        return true; 
    }else {
        return false ;
    }
}
public boolean IsColaVacia(){
  if(this.FRENTE == this.FINAL){
        return true; 
    }else {
        return false ;
    }   
}

public void InsertarCola(){
        if (this.IsColallena()) {
            System.out.println("La Cola esta llena");      
     }else {
            int aux ;
            System.out.print("Ingrese el elemento a ingresar :");
            aux = teclado.nextInt();
            this.FINAL++;
            this.COLA[FINAL] = aux;
        }
}

public void MostrarCola() {
        if(this.IsColaVacia()) {
    System.out.println("La cola esta vacia no hay datos");
        }else{
    System.out.println("Los elementos son : "); 
    for (int i = FRENTE +1; i<= FINAL; i++) {
   System.out.print(COLA[i] + " <--"); 
    }
        }
}

  public void EliminarCola(){
        if(this.FRENTE == this.FINAL){
System.out.println("La Cola esta vacia");      
        }else {
  for (int i = FRENTE +1; i<= FINAL; i++) {
      COLA[i] = COLA [i+1];
  }
  System.out.println("Elementos Eliminado.... "); 
FINAL--;
        }
  }
  
  public void VaciarCola(){
        FRENTE = 0;
        FINAL = 0;
 System.out.println("Elementos Eliminados....");
}
}
