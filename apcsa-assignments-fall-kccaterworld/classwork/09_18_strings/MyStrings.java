public class MyStrings
{
    public static void main(String[] args)
    {
        // Remember the first letter of an String starts at position 0 (ZERO)
        
       String msg = "The people who are crazy enough to think they can change the world are the ones who do."; 
       System.out.println("My message:\n" + msg);

       // Print the length of msg
       System.out.println(msg.length());
       
       String firstSubs = msg.substring(4, 10);
       System.out.println("msg.substring(4, 10): " + firstSubs);
       // What is the outuput?
       // Are characters 4 and 10 included? Answer: 4 yes, 10 no
       // Print the lenght of firstSub
       System.out.println(firstSubs.length());

       String secondSubs = msg.substring(41);
       System.out.println("msg.substring(41): " + secondSubs);
       // What is the outuput?
       // Is the character 41 included? Answer: Yes
       // Print the lenght of secodSubs
       System.out.println(secondSubs.length());
       
       // Get and print the word people
       String people = msg.substring(4, 10);
       System.out.println(people);
       // Get and print the last three characters of msg
       String last3 = msg.substring(84);
       System.out.println(last3);

       System.out.println("firstSubs: " + firstSubs);
       System.out.println("secondSubs: " + secondSubs);

       System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));
        // What is the result of the comparisson? Answer: False
        // Create a new String object newStr and assign a value. Requirement: firstSubs.equals(newStr) should be True
        String newStr = new String(firstSubs);
        System.out.println(firstSubs.equals(newStr));
        // REMEMBER DO NOT USE == TO COMPARE STRINGS

        System.out.println( "msg.charAt(0) is: " + msg.charAt(0));
        // What is the output? Answer: T
        // Print the last character of msg using the method charAt()
        char lastChar = msg.charAt(86);
        System.out.println(lastChar);

        // YOU CAN COMPARE CHARACTERS USING ==
        System.out.println("msg.charAt(0) == \'A\': ");
        System.out.println(msg.charAt(0) == 'A'); 

    }
}
