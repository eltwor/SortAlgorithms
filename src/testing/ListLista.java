package testing;

import java.util.LinkedList;
import java.util.Random;

public class ListLista {
    private LinkedList<Double> lista;
    public ListLista(){lista = new LinkedList<Double>();}

    public void addFirst(Double elem){lista.addFirst(elem);}
    public void addLast(Double elem){lista.addLast(elem);}

    public Double removeFirst(){return lista.removeFirst();}
    public Double removeLast(){return lista.removeLast();}

    public Double getFirst(){return lista.getFirst();}
    public Double getLast(){return lista.getLast();}

    public boolean isEmpty(){return lista.isEmpty();}
    public int size(){return lista.size();}

    public void print(){
        for(int i=0;i<lista.size();i++)
            System.out.print(lista.get(i)+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        ListLista l = new ListLista();
        l.addFirst(new Double(3.6));
        l.addFirst(new Double(6.72));
        l.addFirst(new Double(9.2));
        l.addLast(new Double(8.32));
        l.addLast(new Double(7.14));
        l.addLast(new Double(84.14));
        System.out.println("Wypisz wszystko:");
        l.print();
        System.out.println("Zwróć pierwszy: "+l.getFirst());
        System.out.println("Zwróć ostatni: "+l.getLast());
        System.out.println("Usuń pierwszy: "+l.removeFirst());
        System.out.println("Usuń ostatni: "+l.removeLast());
        System.out.println("Wypisz wszystko:");
        l.print();
    }
}
