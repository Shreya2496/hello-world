import java.util.Scanner;

import hashTable.CuckooHashTable;
import hashTable.QuadraticProbingHashTable;
import hashTable.SeparateChainingHashTable;
import hashTable.StringHashFamily;

class CuckoQn1
{
	public static void main(String args[])
	{
		int n =0;
		System.out.println("Enter the number of strings you wish to enter");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
        String[] temp= new String[n];
        CuckooHashTable<String> H = new CuckooHashTable<>( new StringHashFamily( 3 ), 2000);
        QuadraticProbingHashTable<String> H1= new QuadraticProbingHashTable<>( );
        SeparateChainingHashTable<String> H2 = new SeparateChainingHashTable<>( );

   	    for(int i=0;i<n;i++)
   	    {
         temp[i]= createRandomStrings(10);

	    }
   	    addRecord1(temp,H);
        addSearch(temp,H);
        addQuadProb(temp,H1);
        searchQuadProb(temp,H1);
        addSeparateChaining(temp,H2);
        searchSeparateChaining(temp,H2);
       
   	 
	}

	private static void addSearch(String[] temp,CuckooHashTable<String> H )
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H.contains(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The duration for searching in Cuckoo Hash Table "+ (end-start));
             sum+= (end-start);
             if(H.contains(temp[i]))
            		 {
            	     H.remove(temp[i]);
            		 }
	    	}
             avg= sum/temp.length;
             System.out.println("The average after searching in Cuckoo Hash table " +avg);
	       
             
             
          
	    	
	
		
		
	}
	

	private static void addRecord1(String[] temp, CuckooHashTable<String> H )
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	 start=System.nanoTime();
	         H.insert(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The string " +temp[i]);

	         System.out.println("The duration for insertion in Cuckoo Hash Table "+ (end-start));
             sum+= (end-start);
	    }
	     avg= sum/temp.length;
         System.out.println("The average  after insertion for Cuckoo Hash Table " +avg);

	}
	private static void searchQuadProb(String[] temp, QuadraticProbingHashTable<String> H1)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H1.contains(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The duration for searching in Quadratic Probing Hash table "+ (end-start));
             sum+= (end-start);
             if(H1.contains(temp[i]))
            		 {
            	     H1.remove(temp[i]);
            		 }
	    	}
             avg= sum/temp.length;
             System.out.println("The average after searching in  Quadratic Probing Hash table  " +avg);
	       
             
             
          
	    	
	
		
		
	}
	

	private static void addQuadProb(String[] temp, QuadraticProbingHashTable<String> H1)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	 start=System.nanoTime();
	         H1.insert(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The string " +temp[i]);

	         System.out.println("The duration for insertion in  Quadratic Probing Hash table  "+ (end-start));
             sum+= (end-start);
	    }
	     avg= sum/temp.length;
         System.out.println("The average after insertion  in  Quadratic Probing Hash table " +avg);

	}
	private static void searchSeparateChaining(String[] temp, SeparateChainingHashTable<String> H2)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H2.contains(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The duration for searching in Separate Chaining Hash table "+ (end-start));
             sum+= (end-start);
             if(H2.contains(temp[i]))
            		 {
            	     H2.remove(temp[i]);
            		 }
	    	}
             avg= sum/temp.length;
             System.out.println("The average after searching in  Separate Chaining Hash table  " +avg);
	       
             
             
          
	    	
	
		
		
	}
	

	private static void addSeparateChaining(String[] temp, SeparateChainingHashTable<String> H2)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<temp.length; i++)
	     {	 
	    	 start=System.nanoTime();
	         H2.insert(temp[i]);
	         end= System.nanoTime();
	         System.out.println("The string " +temp[i]);

	         System.out.println("The duration for insertion in  Separate Chaining Hash table  "+ (end-start));
             sum+= (end-start);
	    }
	     avg= sum/temp.length;
         System.out.println("The average  after insertion  in  Separate Chaining Hash table " +avg);

	}
	private static String createRandomStrings(int i)
	{
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(i); 
	  
	        for (int i1 = 0; i1 < i; i1++)
	        { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString();
		
	}
}