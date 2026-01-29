import java.util.ArrayList;

public class StudyAtHome
{
   public static void main(String[] args)
   {
      // YOU MAY REMOVE MY CODE FOR ARRAY AFTER YOU CREATE YOUR ARRAYLIST.
      
       // Rewrite this code using an ArrayList instead of an array
       ArrayList<String> toDoList = new ArrayList<String>();
       toDoList.add("Review the lessons");
       toDoList.add("Drink water");
       toDoList.add("Work on the lab");

       // changing element 1
       toDoList.set(1,"Do homework");

       System.out.println(toDoList.size() + " things to do!");
       System.out.println("Here's the first thing to do: " + toDoList.get(0));

       // remove item 0 and move everything down
       // (this can be done in 1 line with ArrayList)
       toDoList.remove(0);

       System.out.println("Here's the next thing to do: " + toDoList.get(0));

   }
}
