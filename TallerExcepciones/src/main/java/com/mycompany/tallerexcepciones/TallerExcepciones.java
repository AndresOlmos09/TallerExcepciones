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
            
            System.out.println("Ingrese la operacion (+, -, *, /): ");
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
                    throw new OperacionInvalidaException(operacion);
            }
            
            
            if("+".equals(operacion)){
                System.out.println("El resultado de la suma entre " + numero1 + " y " +numero2 + " es: "+resultado);
            }
            if("-".equals(operacion)){
                System.out.println("El resultado de la resta entre " + numero1 + " y " +numero2 + " es: "+resultado);
            }
            if("*".equals(operacion)){
                System.out.println("El resultado de la multiplicacion entre " + numero1 + " y " +numero2 + " es: "+resultado);
            }
            if("/".equals(operacion)){
                System.out.println("El resultado de la divicion entre " + numero1 + " y " +numero2 + " es: "+resultado);
            }
            
        }catch (NumberFormatException e) {
            System.out.println("Error: Entrada no numerica. Debe ingresar un numero entero valido.");
            
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico: " + e.getMessage());
            
        } catch (OperacionInvalidaException e) {
            System.out.println("Error de operacion: " + e.getMessage());
            
        } finally {
            System.out.println("Cerrando el Scanner");
            scanner.close();
        }
    }
            
    
        
}
