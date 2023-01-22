package testing;

import java.util.ArrayList;

public class SortArray {
    String [] tablica;
    int nElems; //liczba elementów
    public SortArray(int maxSize){
        tablica = new String[maxSize];
        nElems = 0;
    }
    public void add(String nString){
        if(nElems >= tablica.length) {
            String [] temp = new String[tablica.length*2];
            for(int i=0;i< tablica.length;i++){
                temp[i] = tablica[i];
            }
            tablica = temp;
        }
        int j;
        for(j=0;j< tablica.length;j++)
            if(tablica[j].compareTo(nString)>0) break;
        for(int k=nElems;)

    }

    public static void main(String[] args) {
        SortArray ar = new SortArray(10);
    }
}
