import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class testSort {
    TreeSet<Double> treeSet;
    private testSort(){treeSet = new TreeSet<Double>();}
    public TreeSet getTreeset(){return treeSet;}
    public boolean member(Double elem){return treeSet.contains(elem);}
    public void insert(Double elem) {
        if(!member(elem))
            treeSet.add(elem);

    }
    public boolean remove(Double elem){
        if(member(elem)) {
            treeSet.remove(elem);
            return true; }
        else return false;
    }
    public int size(){return treeSet.size();}
    public void print(){
        Iterator<Double> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next().doubleValue()+" ");
        }
        System.out.println("");
    }
    public testSort union(testSort b){
        testSort unionSet = new testSort();
        Iterator<Double> iteratorA = treeSet.iterator();
        while (iteratorA.hasNext()) {
            unionSet.insert(iteratorA.next().doubleValue());
        }
        Iterator<Double> iteratorB = b.getTreeset().iterator();
        while (iteratorB.hasNext()){
            unionSet.insert(iteratorB.next().doubleValue());
        }
        return unionSet;
    }
    public testSort iloczyn(testSort b){
        testSort iloczynSet = new testSort();
        Iterator<Double> iteratorA = treeSet.iterator();
        while (iteratorA.hasNext()) {
            Double locElem = iteratorA.next().doubleValue();
            if(b.member(locElem)) {
                iloczynSet.insert(locElem);
            }
        }
        return iloczynSet;
    }

    public testSort roznica(testSort b){
        testSort roznicaSet = new testSort();
        Iterator<Double> iteratorA = treeSet.iterator();
        while (iteratorA.hasNext()) {
            Double locElem = iteratorA.next().doubleValue();
            if(!b.member(locElem)) {
                roznicaSet.insert(locElem);
            }
        }
        return roznicaSet;
    }

    public static void main(String[] args) {
        testSort zbiorA = new testSort();
        testSort zbiorB = new testSort();
        zbiorA.insert(new Double(3.5));
        zbiorA.insert(new Double(4.2));
        zbiorA.insert(new Double(2.13));
        zbiorA.insert(new Double(7.13));
        System.out.println("Zbiór A: ");
        zbiorA.print();
        System.out.println("Usuwam ze zbioru A 3.5");
        zbiorA.remove(3.5);
        System.out.println("Zbiór A: ");
        zbiorA.print();
        System.out.println("Rozmiar A: ");
        System.out.println(zbiorA.size());
        zbiorB.insert(new Double(4.2));
        zbiorB.insert(new Double(3.13));
        zbiorB.insert(new Double(6.12));
        System.out.println("Zbiór B: ");
        zbiorB.print();
        System.out.println("Suma A i B: ");
        zbiorA.union(zbiorB).print();
        System.out.println("Iloczyn A i B: ");
        zbiorA.iloczyn(zbiorB).print();
        System.out.println("Roznica A i B: ");
        zbiorA.roznica(zbiorB).print();
        System.out.println("Roznica B i A: ");
        zbiorB.roznica(zbiorA).print();
    }
}

