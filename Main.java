abstract class Car{
    int maxSpeed;
    abstract void accelerate(); //Only declared not implemented
    //Child class must provide the implementation.
}

class Mustang extends Car{
    int maxSpeed=120;
    void accelerate(){
        System.out.println("Accelerating to : "+maxSpeed+"kmph.");
    }
}

public class Main{
    public static void main(String args[])
    {
        Mustang m1=new Mustang();
        m1.accelerate();
    }
}