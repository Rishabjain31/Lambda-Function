//interface A
//	{
//		void show(int i);
//	}
//public class lambda {
//	public static void main(String args[]) {
//		A obj;
////		obj=new A()
////		{
////			public void show()
////			{
////				System.out.println("Hello");
////			}
////		};
//		obj= i -> System.out.println("Hello " +i);
//		obj.show(5);
//	}
//
//}
import java.util.*;
class lambda
{
    public static void main(String args[])
    {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
 
        // Using lambda expression to print all elements
        // of arrL
        System.out.println(arrL);
        arrL.forEach(n -> System.out.println(n));
 
        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
        long t1 = System.currentTimeMillis();  
        System.out.println(t1);

    }
}
