package testing.Stosy;

import java.util.ArrayList;
import java.util.Random;

public class StosArray {
    private ArrayList<Double> ArrayStack;
    public StosArray(){ArrayStack = new ArrayList<Double>();}
    public void add(Double elem){ArrayStack.add(elem);}
    public Double remove(){return ArrayStack.remove(ArrayStack.size()-1);}
    public Double peek(){return ArrayStack.get(ArrayStack.size()-1);}
    public boolean isEmpty(){return ArrayStack.isEmpty();}

    public static void main(String[] args) {
        StosArray stack = new StosArray();
        Random rand = new Random();
        for(int i=0;i<10;i++)
            stack.add(rand.nextDouble(0.007,0.1));
        System.out.println("Na szczycie: ");
        System.out.println(stack.peek());
        System.out.println("Usuwam wartość: ");
        System.out.println(stack.remove());
        System.out.println("Nowy szczyt: ");
        System.out.println(stack.peek());
        System.out.println("Wszystkie elementy:");
        while (!stack.isEmpty())
            System.out.println(stack.remove());
    }
}
