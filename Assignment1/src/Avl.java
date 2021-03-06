import searchtrees.AVLTree;
import searchtrees.BinarySearchTree;

public class Avl 
{
	public static void main(String args[])
	{
	     AVLTree<Integer> t = new AVLTree<>( );
	     insertAvlTree(t);
	     searchAvlTree(t);
	     deleteAvlTree(t);
       
	}
	private static void insertAvlTree( AVLTree<Integer> t)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

		  for(int i =1;i<=100000;i++)     
	     {	 
	    	 start=System.nanoTime();
	         t.insert(i);
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/100000;
         System.out.println("The average after insertion  " +avg);

	}
	private static void searchAvlTree( AVLTree<Integer> t)
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
	
	
	private static void deleteAvlTree(AVLTree<Integer> t)
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
	        t.remove(i);
	        end= System.nanoTime();
            sum+= (end-start);
	    	 }
	     }
	    	 
             avg= sum/100000;
             System.out.println("The average after deletion" +avg);
	    
	     
	
      }
}
