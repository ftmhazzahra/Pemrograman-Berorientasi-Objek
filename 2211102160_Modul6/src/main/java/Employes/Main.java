/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;
//Fatimah Az Zahra_2211102160_IF10K

public class Main {
    public static void main(String[] args) {
        // Membuat objek SalariedEmployee
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "123456", 1000.0);
        System.out.println("Salaried Employee:");
        salariedEmployee.displayInfo();
        System.out.println("Pay: $" + salariedEmployee.calculatePay());
        System.out.println();

        // Membuat objek CommissionEmployee
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jane Smith", "789012", 500.0, 0.1, 2000.0);
        System.out.println("Commission Employee:");
        commissionEmployee.displayInfo(); 
        System.out.println("Pay: $" + commissionEmployee.calculatePay()); 
        System.out.println();

        // Membuat objek ProjectPlanner
        ProjectPlanner projectPlanner = new ProjectPlanner("Alice Johnson", "345678", 800.0, 0.05, 10000.0);
        System.out.println("Project Planner:");
        projectPlanner.displayInfo();
        System.out.println("Pay: $" + projectPlanner.calculatePay());
    }
}
