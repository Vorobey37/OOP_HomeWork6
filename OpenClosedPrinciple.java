public class OpenClosedPrinciple {
    //Переписать код SpeedCalculation в соответствии с Open-Closed Principle
}

//было так
class SpeedCalculation {

    public double calculateAllowedSpeed(Vehicle vehicle) {

    if (vehicle.getType().equalsIgnoreCase("Car")) {
        return vehicle.getMaxSpeed() * 0.8;
    } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
        return vehicle.getMaxSpeed() * 0.6;
    }
    return 0.0;
    }
}
class Vehicle {

    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}

//стало так: добавил два класса-потомка Vehicle1, 
//добавил интерфейс, который определит коэффициент скорости (мало-ли коэффициент будет определяться не просто числом, а какой-нибудь формулой).
class SpeedCalculation1 {

    public double calculateCarAllowedSpeed(Vehicle1 vehicle1) {
        return vehicle1.getMaxSpeed()*vehicle1.vehicleCoefficient();
        }

}
class Vehicle1 implements iVehicleCoefficient {

    int maxSpeed;
    String type;

    public Vehicle1 (int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
   
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public double vehicleCoefficient(){
        return 0.0;
    }
}
class Car extends Vehicle1 {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double vehicleCoefficient() {  
        return 0.8;
    }


}
class Bus extends Vehicle1 {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double vehicleCoefficient() {
        return 0.6;
    }

}
interface iVehicleCoefficient {
    public double vehicleCoefficient();
}
