public class fizzbuzz {

	public static void main(String[] args) {
		
		int ArraySize = 100; //array size - change here to change throughout programme
		int Fizz = 3; //divisor 1 - change here to change divisor throughout programme
		int Buzz = 5; //divisor 2 - change here to change divisor throughout programme
		
		int[] Numbers = new int[ArraySize]; //declare and initialise array
		
		fillArray(Numbers,ArraySize); //populate array with numbers from 1 to ArraySize
		
		printArray(Numbers, ArraySize, Fizz, Buzz); //print array contents using method conditions	
	
	}
	
	//check a number is a multiple of another number
	public static boolean modZero (int num, int divisor) {
		if (num%divisor ==0) {
			return true;
		}else {
			return false;
		}
	}
	
	//a method that populates an array with the numbers 1 to size
	public static void fillArray (int Array[], int size) {
		int j=1;
		
		for (int i=0;i<size;i++) {
			Array[i] = j;
			j++;
		}
	}
	
	//print array contents
	public static void printArray (int Array[], int size, int divsr1, int divsr2) {
		
	for (int i=0; i<size; i++) {
			
			if ((modZero(Array[i],divsr1))&&(modZero(Array[i],divsr2))){ //if array item a multiple of divsr1 and divsr2 print FizzBuzz
				System.out.println("FizzBuzz");
			}else if ((modZero(Array[i],divsr1))&&!(modZero(Array[i],divsr2))) { //if array item is a multiple of divsr1 but not divsr2 then print Fizz
				System.out.println ("Fizz");
			}else if ((modZero(Array[i],divsr1))&&!(modZero(Array[i],divsr2))) { //if array item is a multiple of divsr2 but not divsr1 then print Buzz
				System.out.println("Buzz");
			}else {
				System.out.println (Array[i]); //print array item
			}
		}
		
	}

}
