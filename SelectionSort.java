import java.util.Scanner;

public class SelectionSort{
    static void selectionSort(int arr[]){
        int len = arr.length;
 
        for (int i = 0; i < len-1; i++){
            int min = i;
            
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min])
                    min = j;
 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
 
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter no. of elements to be sorted: ");
        int number = scan.nextInt();
        
        int []arr = new int[number];
        
        System.out.print("\nNumbers: ");
        for(int i=0; i<number; i++){
            arr[i] = scan.nextInt();
        }
        
        selectionSort(arr);
        
        System.out.print("\nSorted Numbers: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\n");
    }
}