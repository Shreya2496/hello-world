import searchtrees.BinarySearchTree;
import searchtrees.SplayTree;

public class Splay 
{
	public static void main(String args[])
	{
	     SplayTree<Integer> t = new SplayTree<Integer>( );
	     insertSplay(t);
	     searchSplay(t);
	     deleteSplay(t);
       
	}
	private static void insertSplay(SplayTree<Integer> t)
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
         System.out.println("The average after insertion " +avg);

	}
	private static void searchSplay(SplayTree<Integer> t)
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
	
	
	private static void deleteSplay(SplayTree<Integer> t)
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
