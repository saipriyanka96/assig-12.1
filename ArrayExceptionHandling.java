package ae;

import java.util.Arrays;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int[] Array={1,87,34,8,45,99,2,90,2,10};
		//creating an array of size 10
		int[] newArray=new int[9];
		//another array and declared an array size of 9
		for(int i=0;i<Array.length;i++)
			//here i=0 it means array starts from 0
			//i value is equal to array length which we have and this will be incremented
		{
			try
			{
				newArray[i]=Array[i];//given array is equal to new array
			}
			catch(Exception e)
			{
				System.out.println("ArrayIndexOutOfBoundsException ae");
			//Array is going out of the give size then we will have 
				//ArrayIndexOutOfBoundsException 
				}
			/*the code is prone to exceptions is placed in the try block
			 *when exception occurs that exception occurred is handled by the 
			 *catch block associated with it
			 */
		}
		System.out.println(Arrays.toString(Array));//exist array
		//system is final class
	//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
				
		System.out.println(Arrays.toString(newArray));//copied array
	}

}
