package july5;

public class Ex6_out_of_Bound_Exception {
    public static void main(String[] args) {
        int a[] = new int[3];
      try
      {

          a[0] = 3;
          a[1] = 4;
          a[2] = 5;
          a[3] = 6;
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

     }
     catch (ArrayIndexOutOfBoundsException e)
     {
         System.out.println(e.getMessage());
         System.out.println("you are not allow to overflow the array index");
     }
    }
}
