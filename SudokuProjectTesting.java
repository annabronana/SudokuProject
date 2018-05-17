import java.util.*;
//HECK YEA IT DOES
//HOW ABOUT GOING BACK???
//I'D SAY SOOOOOO!! YAAAAAYYY!!
public class SudokuProjectTesting {

	public static void main(String[] args) {
		  ArrayList<Integer> board = new ArrayList<Integer>();
		  Scanner userInput = new Scanner(System.in);
		  System.out.print("What number would you like to check? ");
		  int n = userInput.nextInt();
		  int L = 0;
		  for (int i = 0; i <= 9; i++) {
			  L = L + 1;
			  board.add(L);
		  }
		  for (int j = 0; j <= 9; j ++) {
			  if (n == board.get(j)) {
				  System.out.println("That number is indeed in the array!");
			  }

		  
		  }  	
			  

	
		  }
	}


