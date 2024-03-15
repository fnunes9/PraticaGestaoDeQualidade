/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author fernanda.nunes
 */
public class Exe1 {
    public static int CalculaDobro(int numero){
        return numero*2;
    }
    
    public static int MostraMaior(int num1,int num2){
        if(num1>num2){
            return num1;    
        }
        return num2;
    }
    
    public static float CalculaMedia(float vetor[]){
        float soma=0;
        for(int i=0;i<vetor.length;i++){
                soma+=vetor[i];
        }
        return soma/vetor.length;
    }
    public static double CalculaFatorial(double numFat){
         double sub=1;
        for(int i=(int)numFat;i>0;i--){
           sub*=i;
        }
       return sub;
    }
    public static int SomaInf(int somaInfinita){
        int soma=0;
        if(somaInfinita>=0){
            for(int i=0;i<=somaInfinita;i++){
            soma+=i;
            }
            return soma;
        }
        return 0;
    }
    
    public static boolean VerificaPar(int par){
        return par%2==0;
    }
}
