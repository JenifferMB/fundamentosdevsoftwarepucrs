package com.exercicio03;

/**
 * Hello world!
 *
 */
public class Encomenda 
{
    //private int[] resultado; 

    static int [] qtdadeBarras(int qtdade1, int qtdade5, int peso){
        int[] resultado = new int[2];    

        int peso1kg = 1; int peso5kg = 5;
        int quantidade1 = 0, quantidade5 = 0;
        
        while(peso>0){
        if(peso >= peso5kg){
            peso = peso - peso5kg;
            quantidade5++;
        }

        if(peso < peso5kg){
            peso = peso - peso1kg;
            quantidade1++;
        }
    }

        resultado[0] = quantidade1;
        resultado[1] = quantidade5;
        

        return resultado;
    }

}
