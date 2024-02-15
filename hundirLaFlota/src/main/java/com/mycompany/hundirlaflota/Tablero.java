/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hundirlaflota;

import java.util.Arrays;

/**
 *
 * @author Fran
 */
public class Tablero {
    char [][] tablero;
	Barco [] barcos;
	
	
	public Tablero(char [][] tablero, Barco[] barcos) {
		this.tablero=tablero;
		this.barcos=barcos;
	}
	
	void inicializarTablero() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				
				tablero[i][j]='A';
			}
		}
		
	}
	
	void imprimirTablero() {
		Arrays.toString(tablero);
	}
        
        void colocarBarco(){
            //Aqui ya no se seguir
            int numAleatorio=0;
            for(int i=0; i<barcos.length;i++){
               barcos[i]=barcos[numAleatorio]; 
            }
        }
}
