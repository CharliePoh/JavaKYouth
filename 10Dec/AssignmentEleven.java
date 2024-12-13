import java.util.Scanner;

abstract class Car{
    abstract void price();
    
    void slogan(){
        System.out.println("Promotion Dayyyy");
    }
}

class toyota extends Car{
    void price(){
        System.out.println("25,000RM");
    }
}

class BMW extends Car{
    void price(){
        System.out.println("85,000RM");
    }
}

class tesla extends Car{
    void price(){
        System.out.println("75,000RM");
    }
}

public class AssignmentEleven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = scan.nextLine();

        if(carType.equalsIgnoreCase("Toyota")){
            Car toyotaCar = new toyota();
            toyotaCar.slogan();
            toyotaCar.price();
        } else if (carType.equalsIgnoreCase("BMW")){
            Car BMWCar = new BMW();
            BMWCar.slogan();
            BMWCar.price();
        }else if (carType.equalsIgnoreCase("Tesla") ){
            Car TeslaCar = new tesla();
            TeslaCar.slogan();
            TeslaCar.price();
        }
    }
}