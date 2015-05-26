/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.lang.Math;
/**
 *
 * @author a1611810
 */
public class Equacao2Grau<X extends Number> {
     private X a, b, c;
     private double delta;
     
     private static final String MSG_A_NULO = "Coeficiente a não pode ser zero";
     private static final String MSG_DELTA_NEGATIVO = "Equação não tem solução real";

public Equacao2Grau(X a, X b, X c) {   
    if (a.doubleValue() == 0.0){
        throw new RuntimeException(MSG_A_NULO);
    }        
    this.a = a;
    this.b = b;
    this.c = c;        
}

public X getA(){
    return a;
}

public X getB(){
    return b;
}

public X getC(){
    return c;
}

public void setA(X a){    
    if (a.doubleValue() == 0.0){
        throw new RuntimeException(MSG_A_NULO);
    }
    this.a = a;
}

public void setB(X b){
    this.b = b;
}

public void setC(X c){
    this.c = c;
}

public double getRaiz1(){
    delta = (Math.pow(this.b.doubleValue(),2) - 4*this.a.doubleValue()*this.c.doubleValue());
    if (delta < 0){
        throw new RuntimeException(MSG_DELTA_NEGATIVO);
    }
    return ((-this.b.doubleValue() + Math.sqrt(delta))/2*this.a.doubleValue());
}

public double getRaiz2(){
    delta = (Math.pow(this.b.doubleValue(),2) - 4*this.a.doubleValue()*this.c.doubleValue());
    if (delta < 0){
        throw new RuntimeException(MSG_DELTA_NEGATIVO);
    }
    return ((-this.b.doubleValue() - Math.sqrt(delta))/2*this.a.doubleValue());
}



}