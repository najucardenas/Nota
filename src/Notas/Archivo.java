package Notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {
	String cadena;
	
	
	public void guardar(String cadena) {
		
		try {
			FileWriter archivo=new FileWriter("archivo1.txt");
			try(BufferedWriter escribir=new BufferedWriter(archivo)){
				escribir.write(cadena+"\n");
				escribir.close();
			}
			
			archivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public ArrayList<String> leer(){
		ArrayList<String> datos=new ArrayList<>();
		try {
			FileReader archivo=new FileReader("archivo1.txt");
			BufferedReader lectura=new BufferedReader(archivo);
			String cadena;
			while((cadena=lectura.readLine())!=null) {
				datos.add(cadena);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
		
	return datos;	
	}

}
