package com.qa;

//implicit inheritance from java.lang.Object

// abstract classes can not be instantiated
// abstract classes can contain abstract members
public abstract class Graduate implements Moveable{
//    constructors
//    special method that initialises an object instance
//    has the same name as the class, has no return type not even void
//if we don't create any constructors, java creates one for us
//    default or no-args /parameterless constructor
    public Graduate(){
        this("Unknown", 21);
//        this.firstname = "Unknown";
//        this.annualLeave = 20.5;
////        this.age = 21;
//        this.setAge(21);
    }
//    method overloading
//    same named-method, different signature, gives flexibility

//    constructor overloading
    public Graduate(String firstname){
        this(firstname, 21); //calls the 3rd constructor
//        this.firstname = firstname;
//        this.annualLeave = 20.5;
//        this.setAge(21);
    }

    public Graduate(String firstname, int age){
        this.firstname = firstname;
        this.annualLeave = 20.5;
        this.setAge(age);
    }

//    overriding is changing the behaviour of an inherited method
//    toString is implicitly inherited from java.lang.Object

//@Override is an Annotation
    @Override
    public String toString() {
//        return super.toString();
        String gradString = "Graduate: Firstname is " + this.getFirstname() + "\nAge is " + this.getAge() + "\nDays leave is " + this.getAnnualLeave();
        return gradString;
    }

    //    behaviour methods
    public double bookLeave(double days){
        annualLeave -= days;
        return annualLeave;
    }

//    this is an abstract method
//    abstract methods do not contain implementation (code) nor braces { }
//    abstract methods can only belong to abstract classes
    public abstract String myAbstractMethod(String message);

//    public abstract String myAbstractMethod(String message, int key);

// getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
//        validation
        this.age = age;
    }

//    getter
//    a getter is a special method that retrieves the data of a private field
    public double getAnnualLeave(){
        return annualLeave;
//        sometimes we might convert the data
    }

//    setter
//    setters are for writing to a data field
//    Validate!
    public void setAnnualLeave(double leaveDays){
        if (leaveDays <= 45) {
            annualLeave = leaveDays;
        }
        else {
            annualLeave = 0;
//            raise an exception
        }
    }



    //private fields
    private String firstname;
    private double annualLeave;
    private int age;

    @Override
    public String takeBreak(int minutes) {
        return this.getFirstname() + " is on break for " + minutes + " minutes";
    }

    @Override
    public String getLost() {
        return this.getFirstname() + " is lost";
    }
}
