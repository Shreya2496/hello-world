import java.util.Random;

import searchtrees.BinarySearchTree;

public class Binary5
{
	public static void main(String args[])
	{
	     BinarySearchTree<Integer> t = new BinarySearchTree<>( );
	     insertBinaryTree(t);
	     searchBinary(t);
	     deleteBinary(t);
       
	}
	private static void insertBinaryTree(BinarySearchTree<Integer> t)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		Random r= new Random();
		  for(int i =1;i<=100000;i++)     
	     {	 
		     int random=r.nextInt(100000);
			   random+=1;
	    	 start=System.nanoTime();
	         t.insert(i);
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/100000;
         System.out.println("The average after insertion " +avg);

	}
	private static void searchBinary(BinarySearchTree<Integer> t)
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
             System.out.println("The average after searching " +avg);
	    
	}
	
	
	private static void deleteBinary(BinarySearchTree<Integer> t)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		Random r= new Random();

	     for( int i = 1;i<=100000; i++)
	     {	 
	    	 int random=r.nextInt(100000);
			   random+=1;
	    	 if(t.contains(random))
	    	 {
	         start=System.nanoTime();
	          t.remove(i);
	        end= System.nanoTime();
            sum+= (end-start);
	    	 }
	     }
	    	 
             avg= sum/100000;
             System.out.println("The average after deletion " +avg);
	    
	     
	
      }
}
