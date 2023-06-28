import java.util.ArrayList;
import java.util.Scanner;

public class Insertion_Sorting {
 public static void main(String[] args) {

  //Getting the size of the Array
  System.out.print("Enter the size of the ArrayList : ");
  Scanner input = new Scanner(System.in);
  int size = input.nextInt();

  //Initializing the ArrayList
  ArrayList<Integer> array = new ArrayList<>();

  //Getting elements from the user
  for(int i=0; i<size; i++){
      System.out.print("Enter the element #"+(i+1)+" : ");
      array.add(input.nextInt());
  }

  System.out.println("The unsorted ArrayList is : "+ array);
  
  //Here we're starting with index 1 not 0
  for(int i=1; i<size; i++){
   int current = array.get(i);
   int index = i-1;
   while (index >= 0 && array.get(index) > current) {
    array.set(index + 1, array.get(index));
    index--;
}
   array.set(index+1, current);
   System.out.println("Iteration #"+(i)+ " : "+array);
  }
  System.out.println("By using Insertion Sort, the sorted ArrayList is: " + array);
 }
}
