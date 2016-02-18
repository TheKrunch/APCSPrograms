public class Employee
{
    // instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String idNum;
    private String title;
    private double salary;
    private int personID;
    private static int nextPersonID = 1;
    
    //constructors
    public Employee(){
        // initialise instance variables
        firstName = "first name";
        lastName = "last name";
        age = 0;
        idNum = "00-000-0000";
        title = "title";
        salary = 0.0;
        personID = nextPersonID;
        nextPersonID++;
    }
    public Employee(String fName, String lName, int eAge, String job, double payment){
        // initialise instance variables
        firstName = fName;//employee's first name
        lastName = lName;//employee's last name
        age = eAge;//employee's age
        idNum = "00-000-0000";//employee's id number
        title = job;//employee's title
        salary = payment;//employee's salary
        personID = nextPersonID;
        nextPersonID++;
    }
    //methods
    public String getFirst(){//gets and returns the employee's first name
        return firstName;
    }
    public String getLast(){
        return lastName;
    }
    public void setID(String eNum){
        idNum = eNum;
    }
    public String getId(){
        return idNum;
    }
    public void increaseAge(){
        age++;
    }
    public void giveRaise(double raise){
        salary = salary + raise;
    }
    public void changePosition(String nTitle, double nSalary){
        title = nTitle;
        salary = nSalary;
    }
    public void fire(){
        title = "Terminated";
        salary = 0.0;
    }
    public void printPersonnelReport(){
        System.out.println("***Personnel Report***");
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID Number: " + idNum);
        System.out.println("Employee Job Title: " + title);
        System.out.println("Employee Salary: $" + salary);
    }
}

