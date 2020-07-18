import java.util.*;
public class Average
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    //System.out.println("Enter the size of array:");
    int n= sc.nextInt();
    int[] ar = new int[n];
    //System.out.println("Enter the numbers into the array");
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    System.out.println(avg(ar,n));

}
static int avg(int ar[],int n){
    int s=0;
    for(int i=0;i<n;i++){
        s=s+ar[i];
    }
    return s/n;
}
}