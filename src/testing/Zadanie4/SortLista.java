package testing.Zadanie4;

import java.util.Random;

public class SortLista {
    private ElementListy first;

    public SortLista() {
        first = null;
    }
    boolean isEmpty() {
        return (first==null);
    }
    public void insertFirst(int data) {
        ElementListy newElem = new ElementListy(data);
        newElem.next = first;
        first = newElem;
    }
    public void insert(int data) {
        ElementListy newElem = new ElementListy(data);
        ElementListy previous = null;
        ElementListy current = first;
        while (current!=null&&newElem.data>current.data){
            previous = current;
            current = current.next;
        }
        if(previous==null) first = newElem;
        else previous.next = newElem;
        newElem.next = current;
    }

    public ElementListy find(int elem){
        if(isEmpty()) return null;
        ElementListy current = first;
        while (current.data!=elem) {
            if(current.next == null) return null;
            else current = current.next; }
        return current;
    }
    public ElementListy removeFirst(){
        if(isEmpty()) return null;
        ElementListy usunE = first;
        first = first.next;
        return usunE;
    }
    public ElementListy remove(int elem){
        if(isEmpty()) return null;
        ElementListy previous = null;
        ElementListy current = first;
        while (current.data!=elem){
            if(current.next==null) return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if(previous==null) first = first.next;
        else previous.next = current.next;
        return current;
    }
    public void print(){
        System.out.println("Lista: ");
        if(isEmpty()) System.out.println("Brak elementów");
        else {
            ElementListy current = first;
            while (current.next!=null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortLista lista = new SortLista();
        Random rand = new Random();
        lista.insert(3);
        lista.insert(6);
        lista.insert(4);
        lista.insert(9);
        lista.insert(1);
        lista.print();
        System.out.println("Usuwam: "+lista.remove(4));
        lista.print();
        System.out.println("Szukam elementu 3");
        System.out.println(lista.find(7));
        System.out.println("Dodaje z przodu 7");
        lista.insertFirst(7);
        lista.print();
        System.out.println("Usuwam z przodu");
        lista.removeFirst();
        lista.print();
    }
}
