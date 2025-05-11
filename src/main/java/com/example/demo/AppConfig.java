package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

   @Bean
   public IEmployee getEmployee() {
      return new Employee(getPerson(), getYearOfEmployment());
   }

   @Bean
   public Person getPerson() {
      return new Person("Jan", "Kowalski");
   }

   @Bean
   public YearOfEmployment getYearOfEmployment() {
      return new YearOfEmployment(2015);
   }

   @Bean
   public String getName() {
      return "Zlomex";
   }
}
