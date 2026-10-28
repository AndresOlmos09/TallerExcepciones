/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerexcepciones;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class TallerExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{

            System.out.println("Ingrese el primer numero: ");
            int numero1 = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Ingrese el segundo numero: ");
            int numero2 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Ingrese la operación (+, -, *, /): ");
            String operacion = scanner.nextLine();
            
            int resultado = 0;
            
            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = numero1 / numero2;
                    break;
                default:
                    // Ahora solo envías la variable 'operacion', tu clase arma el mensaje
                    throw new OperacionInvalidaException(operacion);
            }
            
        }
            
    
        
}
