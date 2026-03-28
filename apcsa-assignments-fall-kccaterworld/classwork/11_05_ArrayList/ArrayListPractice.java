import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println(listSumEvenIndexes(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        System.out.println(listSumEvenIndexes(new ArrayList<>(Arrays.asList(8, 16, 10))));
        System.out.println(listSumEvenIndexes(new ArrayList<>(Arrays.asList(5, 0, -10))));
        System.out.println(listCatty(new ArrayList<>(Arrays.asList("buffalo", "dog"))));
        System.out.println(listCatty(new ArrayList<>(Arrays.asList("bobcat", "siamese cat", "catbird"))));
        System.out.println(listCatty(new ArrayList<>(Arrays.asList("Cat", "frog", "mouse"))));
        System.out.println(listFairlyOddNums(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        System.out.println(listFairlyOddNums(new ArrayList<>(Arrays.asList(8, 16, 10))));
        System.out.println(listFairlyOddNums(new ArrayList<>(Arrays.asList(5, 0, 13, 51))));
    }
    public static int listSumEvenIndexes(ArrayList<Integer> numsList) {  
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) if (i % 2 == 0) sum += numsList.get(i);
        return sum;
    }
    public static ArrayList<String> listCatty(ArrayList<String> animalsList) {    
        ArrayList<String> cats = new ArrayList<String>();
        for (String animal : animalsList) {
            if (animal.contains("cat") || animal.contains("Cat")) {
                cats.add(animal);
            }
        }
        return cats;
    }
    public static int listFairlyOddNums(ArrayList<Integer> numsList) { 
        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) if ((numsList.get(i) % 2 == 0 && i % 2 == 1) || (numsList.get(i) % 2 == 1 && i % 2 == 0)) sum += numsList.get(i);
        return sum;
    }
}
