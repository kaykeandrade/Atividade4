/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class Exercício4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);
        System.out.println("Digite o valor de A: ");
        float a = enter.nextFloat();
        System.out.println("Digite o valor de B: ");    
        float b = enter.nextFloat();
        System.out.println("Digite o valor de C: ");
        float c = enter.nextFloat();
        float delta = (float)(Math.pow(b,2)-(4*a*c));
        float raiz = (float) sqrt(delta); 
        float x1 = (float) ((-(b)+raiz)/(2*a));
        float x2 = (float) ((+(b)+raiz)/(2*a));
        
        if (a==0)
            System.out.println("O valor é inválido");
        else{
            if (delta==0)
               System.out.println("Duas raízes reais: "+x1+" "+x2);
            else
                if (delta==0)
                    System.out.println("Uma única raíz real: "+x1);
                else
                    System.out.println("A equação não possui resultados reais");
                }
            }
        }
        
   
        
        
    
    

