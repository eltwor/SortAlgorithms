import java.util.LinkedList;

public class LinkedListList
{

    private LinkedList<Double> oList;

    public LinkedListList()          // konstruktor
    {
        oList = new LinkedList<Double>();
    }

    public boolean isEmpty()  // spr. czy pusta
    {
        return oList.isEmpty();
    }

    public void insertFirst(Double elem)  // Wstawienie na poczatek listy
    {
        oList.addFirst(elem);
    }

    public void insertLast(Double elem)  // Wstawienie na koniec listy
    {
        oList.addLast(elem);
    }

    public Double deleteFirst()     // Usuniecie pierwszego elementu listy
    {
        return oList.removeFirst();
    }

    public Double deleteLast()     // Usuniecie ostatniego elementu listy
    {
        return oList.removeLast();
    }

    public Double getFirst()     // Pobranie pierwszego elementu listy
    {
        return oList.getFirst();
    }

    public Double getLast()     // Pobranie ostatniego elementu listy
    {
        return oList.getLast();
    }

    public int size()  // rozmiar listy
    {
        return oList.size();
    }

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
