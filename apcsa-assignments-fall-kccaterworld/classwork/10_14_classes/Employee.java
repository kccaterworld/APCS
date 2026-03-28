public class Employee {
    /*Total employee count*/
    private static int totalEmployees = 0;
    /*Instance Variables*/
    private String name;
    private int age;
    private int experience;
    private String role;
    /*Constructors*/
    public Employee() {totalEmployees++;}
    public Employee(String empName, int empAge, int empExp) {
        name = empName;
        age = empAge;
        experience = empExp;
        totalEmployees++;
    }
    public Employee(String empName, String empRole) {
        name = empName;
        role = empRole;
        totalEmployees++;
    }
    /*Setters*/
    public void setAge(int empAge) {age = empAge;}
    public void setExp(int empExp) {experience = empExp;}
    public void setName(String empName) {name = empName;}
    public void setRole(String setRole) {role = setRole;}
    /*Getters*/
    public int getAge() {return age;}
    public int getExp() {return experience;}
    public String getName() {return name;}
    public String getRole() {return role;}
     /*Static methods*/
    public static int getTotal() {return totalEmployees;}
    public static void getStatus() {System.out.println("Class is working!");}
    /*Non static regular methods*/
    public int getYearsNotWork() {return age - experience;}
    // 1: Yes, using this
    // 2: No, it needs an object not a class
    
}
