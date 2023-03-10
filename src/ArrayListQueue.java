import java.util.ArrayList;

public class ArrayListQueue
{
    private ArrayList<Integer> intQueue;
    public ArrayListQueue() {intQueue = new ArrayList<Integer>();} // konstruktor

    public void insert(Integer elem) {intQueue.add(elem);} // wstawia element na koniec kolejki

    public Integer remove() {return intQueue.remove(0);} // usuwa element z początku kolejki

    public Integer peek() {return intQueue.get(0).intValue();} // podgląda element na początku kolejki

    public boolean isEmpty() {return intQueue.isEmpty();} // zwraca true, jeżeli kolejka pusta

    public int size() {return intQueue.size();} // zwraca liczbę elementów w kolejce

    public static void main(String[] args)
    {
        ArrayListQueue theQueue = new ArrayListQueue();  // kolejka pięcioelementowa z relokacja

        System.out.println("Wstawiam: 10");
        theQueue.insert(10);
        System.out.println("Wstawiam: 20");
        theQueue.insert(20);
        System.out.println("Wstawiam: 30");
        theQueue.insert(30);
        System.out.println("Wstawiam: 40");
        theQueue.insert(40);

        Integer elem = theQueue.remove();              // usuwamy 3 elementy
        System.out.println(" Usuwam: "+elem);
        System.out.println(" Usuwam: "+theQueue.remove());
        System.out.println(" Usuwam: "+theQueue.remove());

        System.out.println("Wstawiam: 50");
        theQueue.insert(50);
        System.out.println("Wstawiam: 60");
        theQueue.insert(60);
        System.out.println("Wstawiam: 70");
        theQueue.insert(70);
        System.out.println("Wstawiam: 80");
        theQueue.insert(80);

        while (!theQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+theQueue.remove());
        }
        System.out.println("");
    }
}
