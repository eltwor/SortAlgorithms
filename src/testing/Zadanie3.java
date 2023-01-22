package testing;

import java.util.Random;

public class Zadanie3 {
    static int[] tab;
    static int nElems = 10;
    public static void main(String[] args) {
        tab = new int[nElems];
//        tab= new int[]{1, 3, 4, 6, 1, 7,8,7,6,9};
        Random rand = new Random();
        for(int i=0;i<nElems;i++)
            tab[i]=rand.nextInt(100);
        print();
        bubbleSort();
        print();
    }

    private static void print() {
        for(int i=0;i<nElems;i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }

    private static void bubbleSort() {
        for(int i=nElems-1;i>0;i--) {
            for(int j=0;j<i;j++){
                if(tab[j]>tab[j+1]) {
                    int temp = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }
}
