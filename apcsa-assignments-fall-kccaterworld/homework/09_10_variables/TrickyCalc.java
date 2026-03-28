public class TrickyCalc{
   public static void main(String[] args){
       double mySum = 0.1 + 0.1 + 0.1;
       double tmp = 0.3;
       boolean checkResult = mySum == tmp;

       System.out.println("0.1 + 0.1 + 0.1 = " + mySum);
       System.out.println(mySum + " == " + tmp + " is " + checkResult);
   }
}
