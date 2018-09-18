/**
 * 
 */
import java.util.*;
/**
 * @author Mike Manigault Jr
 *
 */
public class Sparse_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
 int J = scan.nextInt();
 for (int i = 0; i < J; i++) {
	 String[] word = new String[J];
	 word[i] = scan.nextLine();
 } 
	 int M = scan.nextInt();
	 String searchWord[]= new String[M];
	 for (int i = 0; i < M; i++) {
		 searchWord[i] = scan.nextLine();
 }
	 int counter = 0;
	 
	  for(int i=0; i < M; i++){
	       for(int j =0; j < J; j++ ){
	           String[] word;
			if(word[j] == searchWord[i]){
	               counter++;
	           }
	       }
	       System.out.println(counter); 
	       counter = 0;
	  }
	}
}

	


