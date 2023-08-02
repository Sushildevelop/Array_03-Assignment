package Practice.Array.Array_03.Assignment;

import java.util.Scanner;

public class adsolute_difference {
    public static void  absoluteDifference(int arr[], int x){
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[j]-arr[i]==x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Difference values: ");
        int x= sc.nextInt();
        absoluteDifference(arr,x);

    }
}
