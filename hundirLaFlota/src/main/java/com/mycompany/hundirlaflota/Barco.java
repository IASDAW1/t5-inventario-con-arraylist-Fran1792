/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hundirlaflota;

/**
 *
 * @author Fran
 */
public class Barco {
    int longitud;
	String nombre;
	boolean[] partes;
	
	
	public Barco(String nombre, int longitud) {
		
		this.nombre=nombre;
		this.longitud=longitud;
		
	}
	public void rellenarBarco(int numeroDePartes) {
		partes=new boolean[numeroDePartes];
		for (int i = 0; i < numeroDePartes; i++) {
            partes[i] = false;
        }
	}
	
	boolean haSidoHundido() {
		
		int contador=0;
		for (boolean b : partes) {
			if(b!=false) {
				
				contador++;
				
			}
		}
		if(contador==partes.length) {
			
			return true;
		}
		
		return false;
	}
	
	void hundirParte(int parte) {
		
		if(!partes[parte]) {
			
			partes[parte]=true;
				 
			System.out.println("¡Parte del barco golpeada!");
		   } 
			 else {
		        	
		          System.out.println("Esta parte del barco ya fue golpeada anteriormente.");
		        
			 	} 
			 }
}
