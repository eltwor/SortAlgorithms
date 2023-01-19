import java.util.ArrayList;

//Implementacja stosu liczb calkowitych za pomoca tablicy dynamicznej ArrayList przez OSADZANIE
public class ArrayListStack
{
    private ArrayList<Integer> intStack;
    public ArrayListStack() {intStack = new ArrayList<Integer>();} // konstruktor
    public void push(Integer elem) {intStack.add(elem);} // odkłada element na szczyt stosu
    public Integer pop() {return intStack.remove(intStack.size()-1);} // pobiera element ze szczytu stosu
    public Integer peek() {return intStack.get(intStack.size()-1);} //Zwraca ostatni element
    public boolean isEmpty() {return intStack.isEmpty();} // zwraca true, jeżeli stos pusty

    public static void main(String[] args)
    {
        ArrayListStack theStack = new ArrayListStack();  // tworzymy nowy stos o rozmiarze 10 (z relokacja)
        theStack.push(20);
        theStack.push(42);
        theStack.push(123);

        theStack.pop();
        theStack.pop();

        theStack.push(23);
        theStack.push(4);

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            Integer value = theStack.pop();
            System.out.println(value+" ");      // wypisanie elementu
        }
        System.out.println("");
    }
}

