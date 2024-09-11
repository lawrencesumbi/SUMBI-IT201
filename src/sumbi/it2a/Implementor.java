package sumbi.it2a;

public class Implementor {
    
    String ap_name, ap_fitness;
    int ap_id;
    int ap_age;
    double ap_bmi;
    
    public void addRecord(int ID, String name, int age, double BMI, String fitness){
        this.ap_id = ID;
        this.ap_name = name;
        this.ap_age = age;
        this.ap_bmi = BMI;
        this.ap_fitness = fitness;
    }
    
    public void viewRecord(){
        
        System.out.printf("%-10d %-10s %-10d %-10.2f %-10s \n",
                this.ap_id, this.ap_name, this.ap_age, this.ap_bmi, this.ap_fitness);
        
    }
    
    
}
