import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

    int[] array = new int[10];
    System.out.println("Random Generated Array...");
    
    for (int i = 0; i < array.length; i++) {
    	array[i] = (int) (Math.random() * 100);
        System.out.print(" "+array[i]);
    }
   
    Scanner input = new Scanner(System.in);
    System.out.print("\n"+"Enter an index: ");
    
    try {
        int index = input.nextInt();
        System.out.println("array[" + index + "] = " + array[index]);
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("INDEX " + ex + " is out of bounds");
    	} 
	}
}
