package com.example.demo;

public class Employee implements IEmployee {

   private Person person;
   private YearOfEmployment yearOfEmployment;

   public Employee(Person person, YearOfEmployment yearOfEmployment) {
      this.person = person;
      this.yearOfEmployment = yearOfEmployment;
   }

   @Override
   public void showEmployeeInfo() {
      System.out.println("My name is " + person.getFullName() +
              ", I am an Employee since " + yearOfEmployment.getYear() + ".");
   }
}
