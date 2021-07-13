
package javaexample40arraycopyusingsystemmethod;


public class JavaExample40ArrayCopyUsingSystemMethod {

    
    public static void main(String[] args) {
        
        int[] v1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[]{11, 22, 33, 44};
        int[] v3 = new int[]{0, 0};
        int[] v4 = new int[]{100, 100, 100, 100, 100, 100};
        int[] v5 = null;

        Moves(v1, v2, v3, v4, v5);

    }
    private  static void Moves(int[] v1,int[] v2, int[] v3, int[] v4, int[] v5)
    {
        
            
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v2, 1, v1, 3, 3);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v3, 6, v1, 2, 1);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v4, 2, v1, 15, 2);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v4, 2, v1, 1, 700);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v1, 1, v5, 3, 2);
        System.out.print("Array v5: ");
        PrintArray(v5);
        System.out.println("---");

        MyArrayCopy(v3, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v5, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        MyArrayCopy(v3, 300, v5, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v5);
        System.out.println("---");
        
    }// end moves()

    private static void PrintArray(int[] a) {
        try {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }// end try
        catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }// end PrintArray()
    
    private static void MyArrayCopy(int[] source, int indexSource, int[] destination, int indexDestination, int numOfItems)
    {
        try{
            System.arraycopy(source, indexSource, destination, indexDestination, numOfItems);
        }catch(Exception e)
        {
            System.out.println(e.toString());
            return;
        }
    }

}
