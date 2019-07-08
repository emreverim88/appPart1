package com.testinium.appPart1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App 
{
	
	
    public static void main( String[] args )
    {
    	int height = treeValidation();
    	
    	App app = new App();
		app.drawTree(height);    	
    	        
    }
    
    public static void drawTree (int height) {
		
    	// Representation of tree solution one : After long consideration, I believe I am asked to print an exact tree representation.
    	// Therefore, Solution one will generate a perfect tree.
    	
    	for ( int i = 0 ; i < height ; i ++ ) {    		
    		
    		for(int j = i; j < height - 1 ; j++) {
    			
    			System.out.print(" ");
    		}
    		
    		System.out.print("*");
    		
    		for ( int j = 0; j < i ; j ++) {
    			
    			System.out.print("**");
    			
    		}
    		
    		System.out.println();
    		
    	}
    	// End of tree solution one    		    		
    		
    		
    		// Representation of tree solution two : In the example tree I receive , after third line , level doesn't change. 
    		// Third line and fourth line are in the same level. Therefore, in my program, after fourth line, other lines level will not change.
    		
    		// Please remove comments to see the tree with solution two
    	
    /*		for ( int i = 0 ; i < height ; i ++ ) {
     * 
    			if ( i == 0) {
    			
    				System.out.print("  "+"*");
    			}
    		
    			else if (i == 1) {
    			
    				System.out.print(" "+"*");
    			}
    			
    			else System.out.print("*");
    			
	    		for ( int j = 0; j < i ; j ++) {
	    		
	    			System.out.print("**");
	    		}
	    		System.out.println();    
	    		
    	} */
    	
	}
    
    public static int treeValidation() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	boolean integerControl = false;
    	
    	System.out.println("Enter the height of the tree");
    	
    	int height = 0;
    	
    	while (integerControl == false) {
    		
    		if(scanner.hasNextInt()) {
    			
    			height = scanner.nextInt();
    			
    			if ( height > 2) {
    				
    				integerControl = true;
    				
    			}
    			
    			else {    				
    				System.out.println("Please enter a number bigger than 2!");        			
    			}
    			
    		}
    		else if(!scanner.hasNextInt()) {
    			
    			System.out.println("Please enter a number!");
    			scanner.next();
    			
    		} 
    		
    	}
    		    		    		
    	    	return height;
    	
    }
    
    
    
}
