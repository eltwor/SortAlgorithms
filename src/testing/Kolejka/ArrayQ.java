package testing.Kolejka;

import java.util.ArrayList;
import java.util.Random;

public class ArrayQ {
    private ArrayList<Double> AKolejka;
    public ArrayQ(){AKolejka = new ArrayList<Double>();}
    public void insert(Double elem){AKolejka.add(elem);}
    public Double remove(){return AKolejka.remove(0);}
    public Double peek(){return AKolejka.get(0).doubleValue();}
    public int size(){return AKolejka.size();}
    public boolean isEmpty(){return AKolejka.isEmpty();}
    public static void main(String[] args) {
        ArrayQ kolejka = new ArrayQ();
        Random rand = new Random();
        for(int i=0;i<10;i++)
            kolejka.insert(rand.nextDouble());
        System.out.println("Czy pusta?");
        System.out.println(kolejka.isEmpty());
        System.out.println("Rozmiar");
        System.out.println(kolejka.size());
        System.out.println("Co na górze");
        System.out.println(kolejka.peek());
        System.out.println("Usuwam: ");
        System.out.println(kolejka.remove());
        System.out.println("Wypisuje: ");
        while (!kolejka.isEmpty())
            System.out.print(kolejka.remove()+" ");

    }
}
