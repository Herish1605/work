public class oopc {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // we have created a pen object named p1
        p1.setColor("blue" );
        // System.out.println(p1.color);
        // // p1.setTip(5);
        // System.out.println(p1.tip);
      
        System.out.print(this.); 
        BankAccount harry = new BankAccount();
        harry.username = "Herish";
        
}
}  
class BankAccount {
    public String username;
    private String Password;
    public void setPassword(String pwd){
        Password = pwd;
    }
}


class Pen{
    //prop + function
    private String color;
    private int tip;

    int getTip(){
        return this.tip;
    }
    void setColor(String newVColor){
        color = newVColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calculateper(int phy, int math, int chem){
        percentage= (phy+chem+math)/3; 
    }
}
