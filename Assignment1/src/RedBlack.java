import searchtrees.BinarySearchTree;
import searchtrees.RedBlackBST;

public class RedBlack 
{
	public static void main(String args[])
	{
        RedBlackBST<Integer, Integer> t = new RedBlackBST<Integer, Integer>();
	     insertRedBlack(t);
	     searchRedBlack(t);
	     deleteRedBlack(t);
       
	}
	private static void insertRedBlack(RedBlackBST<Integer, Integer> t)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		  for(int i =1;i<=100000;i++)     
	     {	 
	    	 start=System.nanoTime();
	         t.put(i,i);
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/100000;
         System.out.println("The average after insertion " +avg);

	}
	private static void searchRedBlack( RedBlackBST<Integer, Integer> t)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 1;i<=100000; i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 t.contains(i);
	         end= System.nanoTime();
             sum+= (end-start);
	     }
             avg= sum/100000;
             System.out.println("The average after searching" +avg);
	    
	}
	
	
	private static void deleteRedBlack( RedBlackBST<Integer, Integer> t)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 1;i<=100000; i++)
	     {	 
	    	 if(t.contains(i))
	    	 {
	       start=System.nanoTime();
	        t.delete(i);
	        end= System.nanoTime();
            sum+= (end-start);
	    	 }
	     }
	    	 
             avg= sum/100000;
             System.out.println("The average after deletion" +avg);
	    
	     
	
      }
}
