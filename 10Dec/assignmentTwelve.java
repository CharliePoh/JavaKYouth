import java.util.Scanner;

interface Car{
    void message();
    void price();
}

class toyota implements Car{
    public void message(){
        System.out.println("");
    }
    public void price(){
        System.out.println("25,000RM");
    }
}

class BMW implements Car{
    public void message(){
        System.out.println("BMW is one of the coolest car in the world");
    }
    public void price(){
        System.out.println("85,000RM");
    }
}

class tesla implements Car{
    public void message(){
        System.out.println("Yes Tesla is the best electric car");
    }
    public void price(){
        System.out.println("75,000RM");
    }
}

public class assignmentTwelve{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = scan.nextLine();

        if(carType.equalsIgnoreCase("Toyota")){
            Car toyotaCar = new toyota();
            toyotaCar.message();
            toyotaCar.price();
 
        } else if (carType.equalsIgnoreCase("BMW")){
            Car BMWCar = new BMW();
            BMWCar.message();
            BMWCar.price();

        }else if (carType.equalsIgnoreCase("Tesla") ){
            Car TeslaCar = new tesla();
            TeslaCar.message();
            TeslaCar.price();
        }
    }
}