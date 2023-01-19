//Implementacja zbioru liczb calkowitych za pomoca klasy TreeSet

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSet
{
    private TreeSet<Double> treeSet;
    public TreeSetSet() {treeSet = new TreeSet<Double>();} // konstruktor
    public TreeSet<Double> getTreeSet()
    {
        return treeSet;
    }
    public int size() {return treeSet.size();} //Zwraca liczbe elementow w zbiorze
    public void insert(Double elem) {   // wstawia element do zbioru
        if (!member(elem)) // sprawdza, czy dany element nalezy do zbioru
            treeSet.add(elem); }
    public boolean member(Double elem) {return treeSet.contains(elem);} // sprawdza, czy dany element nalezy do zbioru
    public boolean delete(Double elem) {  // usuwa element ze zbioru
        if (member(elem)){ // sprawdza, czy dany element nalezy do zbioru
            treeSet.remove(elem);
            return true; }
        else return false; }
    public TreeSetSet union(TreeSetSet secondSet) //Oblicza sume zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet unionSet = new TreeSetSet();
        Iterator<Double> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            unionSet.insert(locElem);
        }

        Iterator<Double> iteratorS = secondSet.getTreeSet().iterator();
        while (iteratorS.hasNext())
        {
            Double locElem = iteratorS.next().doubleValue();
            unionSet.insert(locElem);
        }

        return unionSet;
    }

    public TreeSetSet intersection(TreeSetSet secondSet) //Oblicza iloczyn zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet intersectionSet = new TreeSetSet();

        Iterator<Double> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            if (secondSet.member(locElem))
                intersectionSet.insert(locElem);
        }
        return intersectionSet;
    }

    public TreeSetSet difference(TreeSetSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet differenceSet = new TreeSetSet();

        Iterator<Double> iterator = treeSet.iterator();

        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            if (!secondSet.member(locElem))
                differenceSet.insert(locElem);
        }

        return differenceSet;
    }

    public void print()
    {
        Iterator<Double> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            Double locElem = iterator.next().doubleValue();
            System.out.print(locElem+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        TreeSetSet theSetA = new TreeSetSet();  // tworzymy nowy zbior A
        theSetA.insert(60.1);     // dodajemy elementy do zbioru
        theSetA.insert(20.51);
        theSetA.insert(40.31);

        theSetA.print();

        boolean test20 = theSetA.member(20.51);
        System.out.println("Wynik testu w zbiorze A dla 20: "+test20);

        theSetA.print();

        boolean test30 = theSetA.member(30.1);
        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: "+test30);

        theSetA.insert(30.1);

        theSetA.print();

        test30 = theSetA.member(30.1);
        System.out.println("Wynik w zbiorze A drugiego testu dla 30: "+test30);

        theSetA.delete(30.1);

        theSetA.print();

        test30 = theSetA.member(30.1);
        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: "+test30);

        theSetA.insert(10.02); //Dodanie jeszcze dwoch elementow
        theSetA.insert(90.0);

        System.out.println("--------------------------------------------");

        System.out.println("Zbior A:");
        theSetA.print();

        TreeSetSet theSetB = new TreeSetSet();  // tworzymy nowy zbior B
        theSetB.insert(40.31);     // dodajemy elementy do zbioru
        theSetB.insert(70.31);
        theSetB.insert(60.1);
        theSetB.insert(80.2);

        System.out.println("Zbior B:");
        theSetB.print();


        TreeSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        TreeSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        TreeSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();

    }
}
