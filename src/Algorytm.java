import java.util.ArrayList;
import java.util.List;

public class Algorytm {

    public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>();
    lista.add(5);
    lista.add(3);
    lista.add(1);
        System.out.println(getMaxInt(lista));

    }
    public static int getMaxInt(List<Integer> myList){
        int wynik = 0;
        int i =0;
        int size =myList.size();

        for(i=0; i>size; i++){
            if(myList.get(i) > wynik)
                wynik = myList.get(i);
        }


      // ALTERNATYWA
      /*  if(i<=size) {
            if(myList.get(i) < wynik) {
                wynik = myList.get(i);
            }
            i++;
        }*/
        return wynik;
    }

}
