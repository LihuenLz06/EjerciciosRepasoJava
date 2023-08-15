package Servicios;

import Entidades.raices;

import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    raices raiz = new raices();

    public void ingresoDatos(){
        System.out.println("Ingrese el valor de a, b, c");
        raiz.setA(sc.nextDouble());
        raiz.setB(sc.nextDouble());
        raiz.setC(sc.nextDouble());

    }

    public double Discriminante(){
        double disc = Math.pow(raiz.getB(), 2)-4*raiz.getA()*raiz.getC();
        return disc;
    }

    public boolean tieneRaices(){
        boolean boo=false;
        if(Discriminante()>0){
            boo = true;
        }
        return boo;
    }

    public boolean tieneraiz(){
        boolean buu=false;
        if(Discriminante()==0){
            buu = true;
        }
        return buu;
    }

    public void obtenerRaices(){
        double raiz1;
        double raiz2;

        if(tieneRaices()==true){
            raiz1 = (-raiz.getB()+(Math.sqrt(Discriminante())))/2*raiz.getA();
            System.out.println("Raiz 1 = "+raiz1);
            raiz2 = (-raiz.getB()-(Math.sqrt(Discriminante())))/2*raiz.getA();
            System.out.println("Raiz 2 = "+raiz2);
        }else{
            System.out.println("No tiene dos raices");
        }

    }

    public void obtenerRaiz(){
        double raiz1;
        if(tieneraiz()==true){
            raiz1 = -raiz.getB()/2*raiz.getA();
            System.out.println("La raiz es : "+ raiz1);
        }else{
            System.out.println("No tiene una raiz");
        }
    }


    public void calcular(){
        if(tieneRaices()==true){
            obtenerRaices();
        }else if(tieneraiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene raices reales");
        }
    }

    public void Menu(){
        int opcion;
        boolean salir=false;

        do{
            System.out.println("elija una opcion: \n " +
                    "1. Discriminante \n " +
                    "2. Tiene raices \n " +
                    "3. Tiene raiz \n " +
                    "4. Obtener raices \n " +
                    "5. Obtener raiz \n" +
                    "6. Calcular raices \n"+
                    "7. Salir \n");
            opcion= sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("El discriminante es igual a : "+ Discriminante());
                    break;
                case 2:
                    System.out.println(tieneRaices());
                    break;
                case 3:
                    System.out.println(tieneraiz());
                    break;
                case 4:
                    obtenerRaices();
                    break;
                case 5:
                    obtenerRaiz();
                    break;
                case 6:
                    calcular();
                    break;
                case 7:
                    salir= true;
                    break;
            }

        }while(!salir);

    }



}
