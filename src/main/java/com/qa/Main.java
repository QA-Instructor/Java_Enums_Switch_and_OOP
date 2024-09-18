package com.qa;

import java.util.Arrays;

public class Main {
//    method
//    public scope (public protected private, default = package private)
//    access modifiers
//    void is the return type = nothing
//    static - belongs to a class (shared)
//    opposite of static is 'instance'
//    instance methods belong to an object instance
    public static void main(String[] args) {
//        Strings in Java use double quotes " hello "
//        Single quotes are for char datatype 'a'
//        System.out.println("Hello world!");
//        System.out.println("Another line");
//
//        System.out.println("sout is the code snippet for this functionality");

//        monday();
//        usingSwitchA();
//        usingSwitchB();
//        usingSwitchC();
//        usingSwitchD();
//        usingEnumsA();
//        usingEnumsB();


//        Direction move = Direction.NORTH;
//        System.out.println(move);
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println("This is i: " + i);
//        }
//
//        int j;
//        for (j = 1; j <= 10; j++){
//            System.out.println("This is j: " + j);
//        }
//        System.out.println("Final j " + j);
//        double answer = calculate("+", 4, 6);
//        System.out.println(answer);
//        useGraduate();
//        typesPractice();
        oop();
    }

    public static void typesPractice() {
        int i, j;
        i = 5;
        j = i;
        System.out.println(i);
        System.out.println(j);
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);

        DeveloperGrad a = new DeveloperGrad();
        a.setFirstname("Bob");
        System.out.println(a.getFirstname());
        Graduate b = a;
        System.out.println(b.getFirstname());
        a.setFirstname("Bobby");
//        a.firstname = "Bobby";
        System.out.println(a.getFirstname());
        System.out.println(b.getFirstname());

//        Graduate c = (Graduate) a.clone();

    }

    public static void oop(){
        Graduate simon = new TechnologyGrad();
        simon.setFirstname("Simon");
        System.out.println(simon);

        DeveloperGrad devGrad = new DeveloperGrad();
        devGrad.bookLeave(5);
        System.out.println(devGrad);

        DeveloperGrad sally = new DeveloperGrad();
        sally.setFirstname("Sally");
        sally.setEducationalProjectName("GenAI");
        System.out.println(sally);

        STGPGrad seb = new CyberGrad();
        seb.setFirstname("Seb");
        seb.setRotationName("Product Owner Sky News");

        System.out.println(seb);

//        POLYMORPHISM
        Graduate[] graduates = {simon, devGrad, sally, seb};
        System.out.println("####################################");

        for (Graduate g : graduates) {
            System.out.println("**********");
            System.out.println(g);
        }

        Object o = new DeveloperGrad();
        System.out.println(o);

        DeveloperGrad dg = (DeveloperGrad) o;
        dg.setEducationalProjectName("Sky Sports Dashboard");
        System.out.println(dg);
        System.out.println(o);

//        Arrays.sort(graduates);

        for (Graduate g : graduates){
            System.out.println(g.myAbstractMethod("Hello"));
            System.out.println(g.takeBreak(15));
        }


    }
    public static void useGraduate(){
        DeveloperGrad tanya = new DeveloperGrad();
        tanya.setFirstname("Tanya");
        System.out.println(tanya.getFirstname());

//        tanya.firstname = "anything at all 1234";
        System.out.println(tanya.getFirstname());

        DeveloperGrad libby = new DeveloperGrad();
        libby.setFirstname("Libby");
        System.out.println(libby.getFirstname());
//        this calls a method called toString()
        System.out.println(libby);
        System.out.println(tanya);
        System.out.println(libby.toString());
        libby.setAnnualLeave(23.5);
        tanya.setAnnualLeave(23.5);
//        libby.annualLeave = 23.5;
//        tanya.annualLeave = 23.5;
        System.out.println("Libby's leave:" + libby.getAnnualLeave());
        System.out.println(tanya.getAnnualLeave());
        libby.bookLeave(3.5);
        System.out.println("Libby's leave:" + libby.getAnnualLeave());
        double tanyaLeaveRemaining = tanya.bookLeave(0.5);
        System.out.println("Tanya's holidays " + tanya.getAnnualLeave());
        System.out.println(tanyaLeaveRemaining);

        tanya.setAnnualLeave(400);
        System.out.println("Tanya's holidays " + tanya.getAnnualLeave());
        tanya = null;

        DeveloperGrad elvis = new DeveloperGrad();
        System.out.println(elvis.getAge());
        System.out.println(elvis.getFirstname());
        elvis.setFirstname("Elvis");
        System.out.println(elvis.getFirstname());

        DeveloperGrad rana = new DeveloperGrad("Rana");
        System.out.println(rana.getFirstname());
        System.out.println(rana.getAnnualLeave());

        DeveloperGrad julie = new DeveloperGrad("Julie", 32);
        System.out.println(julie.getFirstname());
        System.out.println(julie.getAge());
        System.out.println(julie.getAnnualLeave());

        julie.bookLeave(4);
        System.out.println(julie);

    }

//    access-modifier instance/static return-type name(datatype paramname, datatype param2name)
    private static void monday() {
//        variable practice
//        datatype variableName
        String name = "Victoria";
        System.out.println(name);
        boolean likeSushi = true;
        int luckyNumber = 13;

        int number = (int)3.6;
        long number2 = number;
        long number4 = 5L;

        float number3 = 4.99f;

// (non-static) classes need to be instantiated
////        Classname variableName = new Classname();
//        Graduate marat = new Graduate(); // this calls the class's constructor
//        marat.firstname = "Marat";
//        System.out.println(marat.firstname);
//
//        String myName = "Bob";

        int itemCount = 0;
        System.out.println(itemCount);
//        int additionalItems = 3;
////        itemCount = itemCount + additionalItems;
//        itemCount += additionalItems;
//        System.out.println(itemCount);
//         increment by 1
//        itemCount = itemCount + 1;
//        itemCount += 1;
//        itemCount++;
//        System.out.println(itemCount);
//        ++itemCount;
//        System.out.println(itemCount);
        System.out.println("Item count is " + itemCount);
        int result = 0;
        System.out.println("Result is " + result);
        result = itemCount++;
        System.out.println("Result is " + result);
        System.out.println("Item count is " + itemCount);
        result = ++itemCount;
        System.out.println("Result is " + result);
        System.out.println("Item count is " + itemCount);




//    myName = "Bob";
//        System.out.println(myName);


    }

    private static void usingSwitchA(){
        int choice = 38;

        switch (choice) {
            case 37: case 38: case 39:
                System.out.println("Coffee? ");
                break;
            case 45:
            case 47:
                System.out.println("Tea? ");
                break;
            default:
                System.out.println("Please try again");
        }
    }
    private static void usingSwitchB(){
        int choice = 39;

        switch (choice) {
            case 37,38,39 ->
                System.out.println("Coffee? ");
            case 45, 47 ->
                System.out.println("Tea? ");
            default ->
                System.out.println("Please try again");
        }

    }

    private static void usingSwitchC(){
//        It is possible to switch on a String
        String str = "E";

        var result = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D", "E", "F" -> 4;
            default -> 5;
        };
        System.out.println(result);
    }

    public static void usingSwitchD() {
//        yield can be used to cause an enclosing switch expression to produce a specified value
        String greeting = "hi";

        int value = switch (greeting) {
            case "hi":
                System.out.println("I am not just yielding!");
                yield 1;
            case "hello":
                System.out.println("Me too.");
                yield 2;
            default:
                System.out.println("OK");
                yield -1;
        };
        System.out.println("The value returned is: " + value);
    }
    private static void usingEnumsA() {
        TrafficLights light = TrafficLights.Green;
        System.out.println(light);

        switch (light){
            case Red:{
                System.out.println("Stop!");
                break;
            }
            case Amber: {
                System.out.println("Slow down.");
                break;
            }
            case Green: {
                System.out.println("Carry on.");
                break;
            }
            default: {
                System.out.println("Light must be broken, drive carefully!");
                break;
            }
        }
    }
    private static void usingEnumsB() {
        TrafficLights light = TrafficLights.Red;
        System.out.println(light);

        switch (light) {

            case Red -> {
                System.out.println("Stop!");
            }
            case Amber -> {
                System.out.println("Slow down.");
            }
            case Green -> {
                System.out.println("Carry on.");
            }
            default -> {
                System.out.println("Light must be broken, drive carefully!");
            }
        }
    }
        public static double calculate(String operator, double x, double y) {
            return switch (operator) {
                case "+" -> x + y;
                case "-" -> x - y;
                case "*" -> x * y;
                case "/" -> {
                    if (y == 0) {
                        throw new IllegalArgumentException("Can't divide by 0");
                    }
                    yield x / y;
                }
                default -> throw new IllegalArgumentException("Unknown operator '%s'".formatted(operator));
            };
        }

}