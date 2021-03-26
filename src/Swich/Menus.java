package Swich;

import java.util.Scanner;

public class Menus {
        public static int  menu=0;
    public static void main(String[] args) {
        System.out.println("====Recomendaciones ===");
        System.out.println("Ingresa 1- Muscica \n" +
                "Ingresa 2- Peliculas\n"+ "Ingresa 3- Videos  \n"+
                "Ingresa 4- Videojuegos \n"+ "Ingresa 5- Deportes");
        Scanner sc= new Scanner(System.in);
        menu=Integer.valueOf(sc.nextLine());
        menu(menu);
    }

    public static void menu(int menu){
        switch (menu){
            case 1:
                System.out.println("===tu recomendaciones de musica son ========");
                System.out.println("1)rock");
                System.out.println("2)pop");
                System.out.println("3)charradas");
                System.out.println("4)rap");
                System.out.println("5)hiphop");
                break;
            case 2:
                System.out.println("===tu recomendaciones dePeliculas son ========");
                System.out.println("1) it");
                System.out.println("2) home");
                System.out.println("3) los increibles ");
                System.out.println("4) moana");
                System.out.println("5) titanes");
                break;
            case 3:
                System.out.println("===tu recomendaciones de videos son ========");
                System.out.println("1)luisito comunica");
                System.out.println("2)vejeta777");
                System.out.println("3)programacion");
                System.out.println("4)thewilirex");
                System.out.println("5)el rubius");
                break;
            case 4:
                System.out.println("===tu recomendaciones de videojuegos son ========");
                System.out.println("1)serpientes y escaleras");
                System.out.println("2)atrapadas");
                System.out.println("3)monopoli");
                System.out.println("4)trompo");
                System.out.println("5)a la cuerda");
                break;
            case 5:
                System.out.println("===tu recomendaciones de deportes son ========");
                System.out.println("1)futbol");
                System.out.println("2)NBA");
                System.out.println("3)baisbol");
                System.out.println("4)box");
                System.out.println("5)tenis");
                break;
            default:
                System.out.println("ingresa un numero del 1 al 5");
        }
    }

}
