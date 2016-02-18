//This class is trying to represent a person
public class Person
{
    // instance variables
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private int IQ;
    private String birthdate;
    private boolean isFemale;
    private String status;
    private int luckyNum;
    private static int newLuckyNum = (int)(Math.random() * 100);

    //Constructors
    public Person()
    {
        firstName = "Sam";
        lastName = "Last Name";
        age = 16;
        height = 66;//Mesured in inches
        weight = 175;//Mesured in pounds
        IQ = 100;
        birthdate = "00/00/00";
        if(Math.random()>0.5)
            isFemale = false;
        else
            isFemale = true;
        status = "Single";
        luckyNum = newLuckyNum;
        newLuckyNum = (int)Math.random() * 100;
    }

    public Person(boolean nIsFemale)
    {
        firstName = "Sam";
        lastName = "Last Name";
        age = 16;
        height = 66;//Mesured in inches
        weight = 175;//Mesured in pounds
        IQ = 100;
        birthdate = "00/00/00";
        isFemale = nIsFemale;
        status = "Single";
        luckyNum = newLuckyNum;
        newLuckyNum = (int)Math.random() * 100;
    }

    public Person(String nFName, String nLName, int nAge, double nHeight, double nWeight, int nIQ, String nBirthdate, boolean nIsFemale, String nStatus)
    {
        firstName = nFName;
        lastName = nLName;
        age = nAge;
        height = nHeight;
        weight = nWeight;
        IQ = nIQ;
        birthdate = nBirthdate;
        isFemale = nIsFemale;
        status = nStatus;
        luckyNum = newLuckyNum;
        newLuckyNum = (int)Math.random() * 100;
    }
    //Accessor Methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getIQ()
    {
        return IQ;
    }

    public String getBirthdate()
    {
        return birthdate;
    }

    public boolean isPersonFemale()
    {
        return isFemale;
    }
    //Mutator Methods
    public void changeFirstName(String fName)
    {
        firstName = fName;
    }

    public void changeLastName(String lName)
    {
        lastName = lName;
    }

    public void increaseAge()
    {
        age++;
    }

    public void changeWeight(double nWeight)
    {
        weight = nWeight;
    }

    public void changeHeight(double nHeight)
    {
        height = nHeight;
    }

    public boolean randomGender()
    {
        if(Math.random()>0.5)
            return false;
        else
            return true;
    }

    public void changeStatus(String nStatus)
    {
        status = nStatus;
    }

    public void printPersonalReport()
    {
        System.out.println("********************");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("IQ: " + IQ);
        System.out.println("Birthdate: " + birthdate);
        if(isFemale == true)
            System.out.println("Gender: Female");
        else
            System.out.println("Gender: Male");
        System.out.println("********************");
    }

    public Person createChild(Person partner, String cName, String cBirthdate)
    {
        Person father = null;
        Person mother = null;
        Person child = null;
        if(this.isFemale == true && partner.isFemale == false)
        {
            mother = this;
            father = partner;
            child = new Person(cName, father.getLastName(), 0, 20, 7.5, mother.getIQ(), cBirthdate, this.randomGender(), "uncommitted");
        }
        else if(this.isFemale == false && partner.isFemale == true)
        {
            father = this;
            mother = partner;
            child = new Person(cName, father.getLastName(), 0, 20, 7.5, mother.getIQ(), cBirthdate, this.randomGender(), "uncommitted");
        }
        else
            System.out.println("That is not possible with this configuration.");

        return child;
    }

}

