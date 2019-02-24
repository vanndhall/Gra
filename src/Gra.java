import java.util.Random;
import java.util.Scanner;

public class Gra {
    //GRA
    //1. Wylosuj x
    //2. Pobierz liczbe
    //3. Sprawdz
    //4.opcjonalnie stworzyc zautomatyzowane rozwiazanie uzywajac wyszukiwania binarnego
    public static void main(String[] args) {

        int x = getRandomInt();
        System.out.println("x = "+ x);
       // Wynik(x);
        getAutoBigger(x);

    }

    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getUserValue(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        return  scan.nextInt();

    }
     public static void Wynik(int x){

         //System.out.println(getAutoBigger(50));
         //System.out.println(getAutoLower(50));
         int liczba = getUserValue();


        if(x> liczba) {
            System.out.println("Liczba jest  większa");
            Wynik(x);
        }

        else if(x< liczba) {
            System.out.println("Liczba jest mniejsza");
            Wynik(x);
        }
        else
            System.out.println("Sukcess!");

     }


     //OPTYMALNIE UZYC Wyszukiwania binarnego
        public static int getAutoBigger(int x)
             {
                 int wartosc = 50;
                 if(wartosc <x) {

                     wartosc = wartosc + (wartosc / 2 );
                     System.out.println("wartość = " + wartosc +" jest mniejsza od szukanej");
                     getAutoBigger(x);
                 }
                 else if(wartosc >x) {
                     wartosc = wartosc - (wartosc / 2);
                     System.out.println("wartość = " + wartosc + " jest większa od szukanej");
                     getAutoBigger(x);
                 }
                     else
                         System.out.println("sukcess");

                    return wartosc;

            }



    }

