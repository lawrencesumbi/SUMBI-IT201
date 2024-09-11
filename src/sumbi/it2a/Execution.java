package sumbi.it2a;

import java.util.Scanner;

public class Execution {
  
    Scanner input = new Scanner(System.in); 
    Implementor[] imp = new Implementor[100];
    
    public void manageApplication(){ 
       
        int i;    
        int numapp;    

        System.out.print("Enter number of Applications: ");
        numapp = input.nextInt();

        for(i = 0; i < numapp; i++) {
            System.out.println("\nEnter details of application "+ (i+1) +":");

            System.out.print("ID: ");
            int ID = input.nextInt();

            System.out.print("Name: ");
            String name = input.next();
            
            System.out.print("Age: ");
            int age = input.nextInt();
            
            System.out.print("BMI: ");
            double BMI = input.nextDouble();
            
            System.out.print("Fitness Goals: ");
            String fitness = input.next();
            
            imp[i] = new Implementor();
            imp[i].addRecord(ID, name, age, BMI, fitness);
            
        }
    
        for(i = 0; i < numapp; i++) {
            imp[i].viewRecord();
        }    
    }
}
