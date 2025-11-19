package fundamentosBasicos;

import java.util.*;

public class Ejercicio_77 {
    public static void main(String[]args){
        /*
        77: List<Integer> mergeSorted(List<Integer> a, List<Integer> b) — combina y devuelve lista ordenada (pure function).
         */

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(55);
        list1.add(55);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(45);
        list2.add(68);
        List<Integer> listOrder = mergeSorted(list1, list2);

        printList(listOrder);

    }

    public static List<Integer> mergeSorted(List<Integer> a, List<Integer> b){
        List<Integer> lista = new ArrayList<>();
        lista.addAll(a);
        lista.addAll(b);
        lista.sort(Comparator.naturalOrder());
        return  lista;
    }

    public static List<Integer> printList (List<Integer> a){
        for (int li: a){
            System.out.print(li + " ");
        }
        return a;
    }
}
