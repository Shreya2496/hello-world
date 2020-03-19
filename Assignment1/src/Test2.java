import java.util.ArrayList;
import java.util.Scanner;

import hashTable.CuckooHashTable;
import hashTable.QuadraticProbingHashTable;
import hashTable.SeparateChainingHashTable;
import hashTable.StringHashFamily;

public class Test2
{
	public static void main(String args[])
	{
		String temp;
		ArrayList<String> arrli = new ArrayList<String>(); 
	    QuadraticProbingHashTable<String> H1 = new QuadraticProbingHashTable<>( );
		CuckooHashTable<String> H = new CuckooHashTable<>( new StringHashFamily( 3 ), 2000);
        SeparateChainingHashTable<String> H2 = new SeparateChainingHashTable<>( );
        for(int i=1;i<=20;i++)
        {
   	    for(int j=1;j<Math.pow(2, i);j++)
   	    {
        temp = createRandomStrings(10);
        arrli.add(temp);
	    
        }
      System.out.println("Average for Cuckoo table insertion for 2^"+i+"is") ;
   	  addCuckoRecord(arrli,H);
   	  System.out.println("\n ");

   	  System.out.println("Average for Quadratic Probing Hasing table insertion for 2^"+i+"is");
   	  addProbRecord(arrli,H1);
   	  System.out.println("\n ");
   	  
   	System.out.println("Average for Separate Chaining insertion for 2^"+i+"is");
 	  addSepaRecord(arrli,H2);
 	  System.out.println("\n ");


      System.out.println("Average for Cuckoo table searching for 2^"+i+"is");
   	  addCuckoSearch(arrli,H);
   	  System.out.println("\n ");

   	  System.out.println("Average for Quadratic Probing Hasing table searching for 2^"+i+"is");
   	  addProbSearch(arrli,H1);
   	  System.out.println("\n ");
   	  

      System.out.println("Average for Separate chaining  searching for 2^"+i+"is");
   	  addSepaSearch(arrli,H2);
   	  System.out.println("\n ");

        }
	
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
	private static void addCuckoSearch(ArrayList<String> arrli,CuckooHashTable<String> H )
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H.contains(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
             if(H.contains(arrli.get(i)))
            		 {
            	     H.remove(arrli.get(i));
            		 }
	    	}
             avg= sum/arrli.size();
             System.out.println("The average  is " +avg);
	    
	}
	

	private static void addCuckoRecord(ArrayList<String> arrli,CuckooHashTable<String> H)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	 start=System.nanoTime();
	         H.insert(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/arrli.size();
         System.out.println("The average  is " +avg);

	}
	private static void addProbSearch(ArrayList<String> arrli,QuadraticProbingHashTable<String> H1 )
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H1.contains(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
             if(H1.contains(arrli.get(i)))
            		 {
            	     H1.remove(arrli.get(i));
            		 }
	    	}
             avg= sum/arrli.size();
             System.out.println("The average is " +avg);
	       	
		
	}
	

	private static void addProbRecord(ArrayList<String> arrli,QuadraticProbingHashTable<String> H1)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	 start=System.nanoTime();
	         H1.insert(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/arrli.size();
         System.out.println("The average is " +avg);

	}
	
	private static void addSepaSearch(ArrayList<String> arrli, SeparateChainingHashTable<String> H2)
	{
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	
	    	 start=System.nanoTime();
	    	 H2.contains(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
             if(H2.contains(arrli.get(i)))
            		 {
            	     H2.remove(arrli.get(i));
            		 }
	    	}
             avg= sum/arrli.size();
             System.out.println("The average is " +avg);
	       
             
	}
          
	    	
	

	private static void addSepaRecord(ArrayList<String> arrli,SeparateChainingHashTable<String> H2)
	{
		long start=0;
		long end=0;
		long sum=0;
		long avg=0;
		

	     for( int i = 0; i<arrli.size(); i++)
	     {	 
	    	 start=System.nanoTime();
	         H2.insert(arrli.get(i));
	         end= System.nanoTime();
             sum+= (end-start);
	    }
	     avg= sum/arrli.size();
         System.out.println("The average is " +avg);

	}



}
