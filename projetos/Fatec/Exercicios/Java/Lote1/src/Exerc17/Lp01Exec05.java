/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).  
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec05 {
    public static void main(String []args){
        double aX = 0,bX = 0, cX =0, delta = 0, x1 = 0, x2 = 0;
        Scanner equac = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        aX = equac.nextInt();
        System.out.println("Digite o valor de B: ");
        bX = equac.nextInt();
        System.out.println("Digite o valor de C: ");
        cX = equac.nextInt();
        delta = (int) (Math.pow(bX,2)-(4*aX*cX));
        if(delta > 0){
        x1 =  ((-(bX)-Math.sqrt(delta))/(2*aX));
        x2 = ((-(bX)+Math.sqrt(delta))/(2*aX));
        System.out.println("O valor de x1 é: " + x1 + "O valor de x2 é: " + x2+ " e delta: "+delta);
    }else{
            System.out.println("O delta é menor que zero: "+delta+" Portanto é indefinido");
        }
        }
}
