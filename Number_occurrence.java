package Practice.Array.Array_03.Assignment;

import java.util.Scanner;

public class Number_occurrence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Number : ");
        int x=sc.nextInt();
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
