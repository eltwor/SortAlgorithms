import java.util.LinkedList;

public class LinkedListStack
{
    private LinkedList<Integer> intStack;
    public LinkedListStack() {intStack = new LinkedList<Integer>();} // konstruktor
    public void push(Integer elem) {intStack.push(elem);} // odkłada element na szczyt stosu
    public Integer pop() {return intStack.pop();} // pobiera element ze szczytu stosu
    public Integer peek() {return intStack.peek();} // podgląda wartość na szczycie stosu
    public boolean isEmpty() {return intStack.isEmpty();} // zwraca true, jeżeli stos pusty

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