package com.example.demo;
import org.springframework.stereotype.Component;


@Component
public class Company {

   private IEmployee employee;
   private String name;

   // Constructor based DI
   //@Autowired
   public Company(IEmployee employee, String name) {
      this.employee = employee;
      this.name = name;
   }
   /*
   @Autowired
   public void setName(String name)
   {
	   this.name = name;
   }
*/
   public void showEmployeeInfo() {
	   System.out.println(this.name + " Company: We will ask our Employee to introduce himself.");
      employee.showEmployeeInfo();
   }

}