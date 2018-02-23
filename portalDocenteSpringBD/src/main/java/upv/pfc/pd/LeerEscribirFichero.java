package upv.pfc.pd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LeerEscribirFichero {
	
	public String leer(String archivoN) throws FileNotFoundException
	{
		File archivo=new File(archivoN);
		FileReader fr=new FileReader (archivo);
		BufferedReader br=new BufferedReader(fr);
		String enlaces="";
		try
		{

		 String linea;
	       while((linea=br.readLine())!=null)
	          enlaces+=linea;
	    }
	    catch(Exception e){
	       e.printStackTrace();
	    }finally{
	       // En el finally cerramos el fichero, para asegurarnos
	       // que se cierra tanto si todo va bien como si salta 
	       // una excepcion.
	       try{                    
	          if( null != fr ){   
	             fr.close();     
	          }                  
	       }catch (Exception e2){ 
	          e2.printStackTrace();
	       }
	}
		return enlaces;
	}
	public void escribirF(String ficheroN,String texto)
	{
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(ficheroN,true);
            pw = new PrintWriter(fichero);

          
                pw.println("<li type='disc'><a href='/portalDocenteSpringBD/profesor/"+texto+"'>"+texto+"</a></li>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	public void comprobar()
	{
		File folder = new File("C:\\Pfc/enlacesBD");
        if(!folder.exists())
        {
     	  //logger.info("entra");
     	   folder.mkdirs();
     	  
           FileWriter fichero = null;
           PrintWriter pw = null;
           try
           {
               fichero = new FileWriter("C:\\Pfc/enlacesBD/enlacesBD.txt");
               pw = new PrintWriter(fichero);

             
                   pw.println("<ul class='enlaces_lateral'>  <li type='disc'><a href='/portalDocenteSpringBD/profesor/addE'>Añadir enlace</a>");

           } catch (Exception e) {
               e.printStackTrace();
           } finally {
              try {
              // Nuevamente aprovechamos el finally para 
              // asegurarnos que se cierra el fichero.
              if (null != fichero)
                 fichero.close();
              } catch (Exception e2) {
                 e2.printStackTrace();
              }
           }
        }

	}
}
   