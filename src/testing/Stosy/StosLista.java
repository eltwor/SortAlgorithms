package testing.Stosy;

import java.util.LinkedList;
import java.util.Random;


public class StosLista {
    private LinkedList<Double> stosLista;
    public StosLista(){stosLista = new LinkedList<Double>();}
    public void push(Double elem){stosLista.push(elem);}
    public Double pop(){return stosLista.pop();}
    public Double peek(){return stosLista.peek();}
    public boolean isEmpty(){return stosLista.isEmpty();}

    public static void main(String[] args) {
        StosLista stos = new StosLista();
        Random rand = new Random();
        for(int i=0;i<10;i++)
            stos.push(rand.nextDouble());
        System.out.println("Co jest na górze stosu");
        System.out.println(stos.peek());
        System.out.println("Usuwam wartość: ");
        System.out.println(stos.pop());
        System.out.println("Co jest teraz na górze stosu");
        System.out.println(stos.peek());
        System.out.println("Wypisuje wszystko:");
        while(!stos.isEmpty())
            System.out.println(stos.pop());
    }
}
