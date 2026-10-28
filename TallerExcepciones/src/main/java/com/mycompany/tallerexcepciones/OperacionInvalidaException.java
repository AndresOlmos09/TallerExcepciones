/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerexcepciones;

/**
 *
 * @author Estudiante
 */
public class OperacionInvalidaException extends Exception {
    
    private final String operacion;

    public OperacionInvalidaException(String operacion){
        super("Operación no valida ´" + operacion + "´. Use +, -, * o /");
        this.operacion= operacion;
    }
    
    public String getOperacion() {
        return operacion;
    }
    
    
    
}
