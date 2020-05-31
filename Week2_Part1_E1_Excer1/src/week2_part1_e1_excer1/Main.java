package week2_part1_e1_excer1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.err.println("please insert next number or insert (-1) to end:");
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lists=new ArrayList<Integer>();
        int inpoutNumber;
        int temp = 0;
        while(true)
        {
            inpoutNumber=sc.nextInt();
            if(inpoutNumber!=-1)
            {
             lists.add(inpoutNumber);
            }
            else
            {
                break;
            }
        }
        //heapSort(lists,lists.size(),inpoutNumber);
        sortLists(lists);
        System.err.println("sorted List: ");
        for(int i=0;i<lists.size();i++)
            System.err.print(lists.get(i)+"  ");
        System.err.println("\nMidle Number is: "+lists.get((lists.size()-1)/2));
           }
   static void heapSort(ArrayList<Integer> heap, int n, int v){
 	    int i, temp;
 	    //heap[++n] = v;
            heap.add(v);
 	    for(i = n; i > 0 && heap.get(i) > heap.get(i/2) ; i /= 2){
 	        temp = heap.get(i); 
                heap.set(i, heap.get(i/2));
	        heap.set(i/2, temp);
	    }
	}

    private static void sortLists(ArrayList<Integer> lists)
    {
        int minNumber=0;
        for(int i=0;i<lists.size();i++)
        {
            minNumber=lists.get(i);
            for(int j=i+1;j<lists.size();j++)
            {
                if(minNumber>lists.get(j))
                {
                    lists.set(i,lists.get(j) );
                    lists.set(j, minNumber);
                    minNumber=lists.get(i);
                }
                else
                {}
            }
        }
    }
    
}
