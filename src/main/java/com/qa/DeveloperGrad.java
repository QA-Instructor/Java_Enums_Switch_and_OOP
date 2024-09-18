package com.qa;

//DeveloperGrad is a kind of Graduate
public class DeveloperGrad extends Graduate implements Alarm{

    @Override
    public String turnAlarmOn() {
        return "Dev Grad " + this.getFirstname() + " is " +  Alarm.super.turnAlarmOn();
    }

    public DeveloperGrad(String firstname, int age, String educationalProjectName){
        super(firstname, age);
        this.setEducationalProjectName(educationalProjectName);
    }
    public DeveloperGrad(){
        this("Unknown Name", 22, "Unassigned Project");
    }

    public DeveloperGrad(String firstname){
        this(firstname, 22, "Unassigned Project");
    }

    public DeveloperGrad(String firstname, int age){
        this(firstname, age, "Unassigned Project");
    }
    public String getEducationalProjectName() {
        return educationalProjectName;
    }

    public void setEducationalProjectName(String educationalProjectName) {
        this.educationalProjectName = educationalProjectName;
    }

    private String educationalProjectName;

    @Override
    public String toString() {
//        call the inherited vaersion using super
        String info = super.toString();
        info = info + "\nEducational Project is " + this.getEducationalProjectName();
        return info;
    }

    @Override
    public String myAbstractMethod(String message) {
        return "Dev grad codes " + message;
    }
}
