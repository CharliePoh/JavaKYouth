import java.util.Scanner;

class Car{
    void price(){
        
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

public class assignmentTen{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = scan.nextLine();

        if(carType.equalsIgnoreCase("Toyota")){
            Car toyotaCar = new toyota();
            toyotaCar.price();
        } else if (carType.equalsIgnoreCase("BMW")){
            Car BMWCar = new BMW();
            BMWCar.price();
        }else if (carType.equalsIgnoreCase("Tesla") ){
            Car TeslaCar = new tesla();
            TeslaCar.price();
        }
    }
}