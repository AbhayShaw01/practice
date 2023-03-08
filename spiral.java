

import java.util.Scanner;


public class spiralMatrix {
    public static void spiralmatrix(int[][] a) {
        int T,B,L,R,dir;
        T=0;
        B= a.length-1;
        L=0;
        R=a[0].length-1;
        dir=0;
        int i;


        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(i=L;i<=R;i++)
                    System.out.print((a[T][i]+"\t"));
                T++;
            }
            else if(dir==1)
            {
                for(i=T;i<=B;i++)
                    System.out.print(a[i][R]+"\t");
                R--;
            }
            else if(dir==2)
            {
                for(i=R;i>=L;i--)
                    System.out.print(a[B][i]+"\t");
                B--;
            }
            else if(dir==3)
            {
                for(i=B;i>=T;i--)
                    System.out.print(a[i][L]+"\t");
                L++;
            }
            dir=(dir+1)%4;
        }

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int m,n;
        System.out.println("Enter the row of the matrix");
        m=in.nextInt();
        System.out.println("Enter the columns of the matrix");
        n=in.nextInt();
        System.out.println("Enter the array elements");
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
      spiralmatrix(arr);

    }
}
