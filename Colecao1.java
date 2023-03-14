import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colecao1 {
    public static void main(String[]args){
        List<Integer>lista = new ArrayList<>();
        List<String>nomes = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        nomes.add("Maria");
        nomes.add("Mariana");
        nomes.add("Marta");
        nomes.add("Marcia");
        nomes.add("Marcos");

        System.out.println(lista);
        System.out.println("Quantidade de elementos na lista: " + lista.size());
        System.out.println("");

        System.out.println(nomes);
        Collections.sort(nomes);//Desordena
        System.out.println(nomes);
        System.out.println("");

        for (int i=0;i< lista.size();i++){
            Integer integer = lista.get(i);
            System.out.println(integer);
        }

        System.out.println("");

        for (String text: nomes){
            System.out.println(text);
        }

        System.out.println("");

        Iterator<String>iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
