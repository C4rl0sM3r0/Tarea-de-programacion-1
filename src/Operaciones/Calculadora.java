package Operaciones;

public class Calculadora {
    public int suma(int n1,int n2){
        return n1 + n2;
    }

    public int suma(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int suma(int[] numeros){
        int suma=0;
        for(int num:numeros){
            suma=suma+num;
        }

        return suma;
    }
    public double suma(double n1, double n2){
        return n1+n2;
    }
}
