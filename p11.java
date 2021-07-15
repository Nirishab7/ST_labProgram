import  java.util.*;

public class p11 {
    public static void main(String[] args) {
        int arr[],n,i;
        arr=new int[20];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=scan.nextInt();
        if (n <= 0)
        {
            System.out.println("Number of elements cannot be zero"); 
        }
        else
        {
            System.out.println("Enter " + n +" elements ");
            for(i=0;i<n;i++)
                arr[i]=scan.nextInt();
            quickSort( arr, 0, n - 1 );
            System.out.println("Elements of the array are;");
            for(i=0;i<n;i++)
                System.out.println(arr[i]);
            return;
        }
    }

    public static void quickSort (int arr[], int l, int h){
        int stack[],p;
        stack=new int[10];
        int top=-1;
        stack[ ++top ] = l;
        stack[ ++top]= h;

        while( top >=0)
        {
            h= stack[ top-- ];
            l= stack[ top-- ];
            p = partition( arr, l,h );
            if(p-1>l)
            {
                stack[ ++top ] = l;
                stack[ ++top ] = p- 1;
            }
            if(p+1<h)
            {
                stack[ ++top ]=p+ 1;
                stack[ ++top]= h;
            }
        }
    }

   public static int partition (int arr[], int l, int h){
        int x= arr[h],t;
        int i=(l-1),j;
        for (j= l;j <=h- 1; j++)
        {
            if (arr[j] <= x)
            {
                i++;
                t=arr[i];
                arr[i]=arr[j];
                arr[j]= t;
            }
        }
        t= arr[i+1];
        arr[i+1]= arr[h];
        arr[h]= t;
        return (i+ 1);
    }
}
