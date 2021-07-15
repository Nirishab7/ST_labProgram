import java.util.*;
public class p10 {
    public static void main(String[] args){
        int a[],n,low = 0,high,mid,key,flag = 0;
        a=new int[20];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n:\n");
        n=scan.nextInt();
        System.out.println("Enter the elements in ASCENDING order\n");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the key element to be searched\n");
        key=scan.nextInt();
        high=n-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==key)
            {
                System.out.println("Successful search\n");
                System.out.println("Element found at Location"+(mid+1));
                flag = 1;
                break;
            }
            else if(a[mid]<key)
            {
                
            }
            else
            {
                high=mid-1;
            }
        }
        if (flag == 1)
        System.out.println("Key Element found\n");
        else
        System.out.println("Key Element not found\n");
        scan.close();
    }
}
