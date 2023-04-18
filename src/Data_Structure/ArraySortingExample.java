package Data_Structure;
import java.util.Scanner;

public class ArraySortingExample {

    public static void main(String[] args) {

        // taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }

        // sorting the array
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // printing the sorted array
        System.out.println("Sorted Array:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
