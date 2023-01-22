package testing.Kolejka;

import java.util.LinkedList;

public class ListQ {
    private LinkedList<Double> list;
    public ListQ(){list = new LinkedList<Double>();}
    public void insert(Double elem){list.addLast(elem);}
    public Double remove(){return list.removeFirst();}
    public Double peek(){return list.peekFirst().doubleValue();}
    public int size(){return list.size();}
    public boolean isEmpty(){return list.isEmpty();}
    public static void main(String[] args) {
        ListQ lista = new ListQ();
        lista.insert(new Double(3.6));
        lista.insert(new Double(6.24));
        lista.insert(new Double(0.625));
        lista.insert(new Double(1.626));
        System.out.println("Rozmiar listy:");
        System.out.println(lista.size());
        System.out.println("Góra listy:");
        System.out.println(lista.peek());
        System.out.println("Usuń górę listy:");
        System.out.println(lista.remove());
        System.out.println("Wszystkie elemnty:");
        while (!lista.isEmpty())
            System.out.print(lista.remove()+" ");
    }
}
