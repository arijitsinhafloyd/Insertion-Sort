import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
        while(j>=0 && a[j]>current){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=current;
        }
    }
}
