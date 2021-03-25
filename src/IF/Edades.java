package IF;

import java.util.Scanner;

public class Edades {
    public static  int edadPersona=0;
    public static void main(String[] args) {

        System.out.println("Ingresa tu edad:");
        Scanner sc = new Scanner(System.in);
        edadPersona=Integer.valueOf(sc.nextLine());
        //edad1(edadPersona); //te dice si eres mayor de edad
        //edad2(edadPersona); //te dice tu
        //edad3(edadPersona);//te dice tu año en que naciste y te dice tu generacion
    }
    public static void edad1(int edadPersona) {
        if (edadPersona <18) {
            System.out.println("eres menor de edad:");
        }else{
            System.out.println("eres mayor de edad:");
        }
    }
    public static void edad2(int edadPersona){
         if(edadPersona>=1 && edadPersona<=5){
            System.out.println("eres un bébe");
        }else if(edadPersona>=6 && edadPersona<=13 ){
             System.out.println("eres una niña o niño");
         }else if(edadPersona>=14 &&  edadPersona<=18){
             System.out.println("eres adolecente");
         }else if(edadPersona>=19 && edadPersona<=35){
             System.out.println("eres jove");
         }else if(edadPersona>=36 && edadPersona<=50){
             System.out.println("eres señor");
         }else if (edadPersona>=51 && edadPersona<=100){
             System.out.println("eres abuelo");
         }else{
             System.out.println("ingresa una edad correcta");
         }

    }
    public static void edad3(int edadPersona){
        int year =2021, yearPersona=0;
        if(edadPersona>=1){
            yearPersona=year-edadPersona;
            if (yearPersona >=1900 && yearPersona <=1914){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es Niños de la postguerra (1930-1948)");
            }else if (yearPersona >=1949 && yearPersona <=1968){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es Baby boom (1949-1968)");
            }else if (yearPersona >=1969 && yearPersona <=1980){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es  X (1969-1980)");
            }else if (yearPersona >=1981 && yearPersona <=1993){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es Millennials (1981-1993)");
            }else if (yearPersona >=1994 && yearPersona <=2010){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es Z (1994-2010)");
            }else if (yearPersona >=2011 && yearPersona <=2021){
                System.out.println("naciste en :"+yearPersona+" y tu Generación es alfa (2011-hasta ahora 2021)");
            }else {
                System.out.println("ingresa una edad correcta");
            }
        }else{
            System.out.println("ingresa una edad positiva");
        }
    }

}
