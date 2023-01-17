import java.util.LinkedList;

public class LinkedListStack
{
    private LinkedList<Integer> intStack;

    public LinkedListStack()    // konstruktor
    {
        intStack = new LinkedList<Integer>();
    }

    public void push(Integer elem)    // odkłada element na szczyt stosu
    {
        intStack.push(elem);
    }

    public Integer pop() // pobiera element ze szczytu stosu
    {
        return intStack.pop();
    }

    public Integer peek()  // podgląda wartość na szczycie stosu
    {
        return intStack.peek();
    }

    public boolean isEmpty()    // zwraca true, jeżeli stos pusty
    {
        return intStack.isEmpty();
    }

    public static void main(String[] args)
    {
        LinkedListStack theStack = new LinkedListStack();
        theStack.push(20);     // odkładamy elementy na stosie
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.pop();
        theStack.pop();

        theStack.push(11);
        theStack.push(31);
        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            long value = theStack.pop();
            System.out.print(value+"\n");      // wypisanie elementu
        }
        System.out.println("");
    }
}