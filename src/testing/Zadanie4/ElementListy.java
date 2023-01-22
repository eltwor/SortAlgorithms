package testing.Zadanie4;

public class ElementListy {
    public int data;
    public ElementListy next; // następny elemnt listy
    public ElementListy(int data) {
        this.data = data;
        next = null;
    }
    public String toString(){
        return Integer.toString(data);
    }
}
