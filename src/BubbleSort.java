import java.util.Random;

public class BubbleSort
{
    private static int[] table;  //Referencja do tablicy
    private static int nElems = 10;

    public static void main(String[] args)
    {
        table = new int[nElems];

        // Wypelnienie tablicy losowymi wartosciami
        Random rand = new Random();
        for (int i=0; i<nElems; i++) {
            table[i]=rand.nextInt(100);
        }

        System.out.println("Przed sortowaniem:");
        print();

        bubbleSort();  // sortowanie babelkowe

        System.out.println("Po sortowaniu:");
        print();
    }
    //-----------------------------------------------------------------

    public static void bubbleSort() //Sortowanie bąbelkowe
    {
        for (int i = nElems - 1; i > 0; i--)   // petla zewnetrzna (malejaca)
        {
            for (int j = 0; j < i; j++)        // petla wewnetrzna (rosnaca)
            {
                if (table[j] > table[j + 1])       // zla kolejnosc?
                {
                    swap(j, j + 1);     // no to zamiana
                }
            }
        }
    }

    //--------------------------------------------------------------
    public static void swap(int one, int two) //Zamiana elementow tablicy
    {
        int temp = table[one];
        table[one] = table[two];
        table[two] = temp;
    }
//--------------------------------------------------------------

    public static void print()
    {
        for (int i = 0; i < nElems; i++)
        {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }


}
