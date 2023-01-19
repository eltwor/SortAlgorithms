import java.util.LinkedList;

public class LinkedListList
{

    private LinkedList<Double> oList;
    public LinkedListList() {oList = new LinkedList<Double>();} // konstruktor
    public boolean isEmpty() {return oList.isEmpty();} // spr. czy pusta
    public void insertFirst(Double elem) {oList.addFirst(elem);} // Wstawienie na poczatek listy
    public void insertLast(Double elem) {oList.addLast(elem);} // Wstawienie na koniec listy
    public Double deleteFirst() {return oList.removeFirst();} // Usuniecie pierwszego elementu listy
    public Double deleteLast() {return oList.removeLast();} // Usuniecie ostatniego elementu listy
    public Double getFirst() {return oList.getFirst();} // Pobranie pierwszego elementu listy
    public Double getLast() {return oList.getLast();} // Pobranie ostatniego elementu listy
    public int size() {return oList.size();} // rozmiar listy
    public void print()
    {
        for (int i = 0; i < oList.size(); i++)
        {
            System.out.print(oList.get(i)+" ");
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedListList theList = new LinkedListList();

        theList.insertFirst(22.21);       // wstawiamy na poczatek
        theList.insertFirst(44.2);
        theList.insertFirst(66.1);

        theList.insertLast(11.6);        // wstawiamy na koniec
        theList.insertLast(33.71);
        theList.insertLast(55.01);

        theList.print();         // wypisujemy zawartosc listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

        theList.deleteLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie
    }

}
