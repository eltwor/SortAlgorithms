package testing.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Zbiory {
    TreeSet<Double> sets;
    public Zbiory(){sets = new TreeSet<>();}
    public TreeSet getSet(){return sets;}

    public void add(Double elem){
        if(!member(elem))
            sets.add(elem);
    }
    public boolean member(Double elem) {return sets.contains(elem);}
    public boolean remove(Double elem){
        if(!member(elem)) return false;
        else sets.remove(elem); return true;
    }
    public int size(){return sets.size();}
    public void print(){
        Iterator<Double> it = sets.iterator();
        while (it.hasNext())
            System.out.print(it.next().doubleValue()+" ");
        System.out.println();
    }
    public Zbiory union(Zbiory b){
        Iterator<Double> itA = sets.iterator();
        Iterator<Double> itB = b.getSet().iterator();
        Zbiory union = new Zbiory();
        while (itA.hasNext())
            union.add(itA.next().doubleValue());
        while (itB.hasNext())
            union.add(itB.next().doubleValue());
        return union;
    }
    public Zbiory iloczyn(Zbiory b){
        Iterator<Double> itA = sets.iterator();
        Zbiory iloczyn = new Zbiory();
        while (itA.hasNext()){
            Double valueA = itA.next().doubleValue();
            if(b.member(valueA))
                iloczyn.add(valueA);
        }
        return iloczyn;
    }
    public Zbiory roznica(Zbiory b){
        Iterator<Double> itA = sets.iterator();
        Zbiory roznica = new Zbiory();
        while (itA.hasNext()){
            Double valueA = itA.next().doubleValue();
            if(!b.member(valueA))
                roznica.add(valueA);
        }
        return roznica;
    }
    public static void main(String[] args) {
        Zbiory zbiorA = new Zbiory();
        Zbiory zbiorB = new Zbiory();
        zbiorA.add(3.6);
        zbiorA.add(4.61);
        zbiorA.add(2.11);
        zbiorA.add(7.3);
        zbiorB.add(1.1);
        zbiorB.add(4.61);
        zbiorB.add(3.05);
        System.out.println("Zbiór A:");
        zbiorA.print();
        System.out.println("Zbiór B:");
        zbiorB.print();
        System.out.println("Usuń 3.05 z B:");
        System.out.println(zbiorB.remove(3.05));
        System.out.println("Rozmiar A:");
        System.out.println(zbiorA.size());
        System.out.println("Suma A i B");
        zbiorA.union(zbiorB).print();

        System.out.println("Iloczyn A i B");
        zbiorA.iloczyn(zbiorB).print();
        System.out.println("Roznica A i B");
        zbiorA.roznica(zbiorB).print();
    }
}
