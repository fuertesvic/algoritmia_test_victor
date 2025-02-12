package ejercicios_algoritmia;

public class Ejercicio2 {
	public static class Persona {
	   public char sexo;
	   public int  edad;
	   public Persona (char sexo, int edad) {
		   this.sexo = sexo;
		   this.edad = edad;
	   }
   }
   
	public static Persona[] leerPersonas() {
	   Persona[] personas = { 
			                  new Persona('M', 16),
			                  new Persona('F', 32),
			                  new Persona('M', 27),
			                  new Persona('M', 12),
			                  new Persona('M', 13),
			                  new Persona('F', 23),
			   				  new Persona('M', 29),
							  new Persona('F', 13),
							  new Persona('M', 17),
			                  new Persona('F' ,21),
			                  new Persona('M' ,50)
			                };
	   return personas;
    }
    
    public static void clasificaPersonas(Persona[] personas) {
       int mayor  = 0;
       int mujer  = 0;
       int homMay = 0;
       int mujMen = 0;
       int total  = personas.length;
       
       for (Persona p: personas) {
    	   if (p.edad >= 18) {
    		   mayor++;
               if (p.sexo == 'M') {
            	   homMay++;
               }
    	   }
    	   if (p.sexo == 'F') { 
    		   mujer++;
               if (p.edad < 18) {
            	   mujMen++;
               }
    	   }
       }    
    
       double perMay = 100 * ((double)mayor/(double)total);
       double perMuj = 100 * ((double)mujer/(double)total); 
    
       System.out.println ("Cantidad de personas mayores de edad "+ mayor);
       System.out.println ("Cantidad de personas menores de edad "+ (total - mayor));
       System.out.println ("Cantidad de hombres mayores de edad "+ homMay);
       System.out.println ("Cantidad de mujeres menores de edad "+ mujMen);
       System.out.printf  ("Porcentaje mayores    %3.2f\n", perMay);
       System.out.printf  ("Porcentaje mujeres    %3.2f\n", perMuj);
    }
    
    public static void main (String [] args) {
    	Persona[] personas = leerPersonas();  
        clasificaPersonas(personas);
    }
}

