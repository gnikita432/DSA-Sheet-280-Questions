// Sort a Stack

//Recurssion Approach
import java.util.* ;
import java.io.*; 
public class Solution {
 
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        if(stack.isEmpty()){
            return;
        }
        //Step 1 : Go to till the bottom of stack to the last single element
        int temp = stack.peek();
        stack.pop();
        sortStack(stack);
        sortInsert(stack, temp);
	}
   
    //Step 2 : Insert the element in the sorted stack
     public static void sortInsert(Stack<Integer> stack, int temp){
        if(stack.isEmpty() || stack.peek()<temp){
            stack.push(temp);
            return;
        }
        int num = stack.peek();
        stack.pop();
        sortInsert(stack, temp);
        stack.push(num);
     }
    
}

// For Brute force approach we will be taking extra space
