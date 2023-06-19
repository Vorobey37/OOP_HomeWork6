public class DependencyInversionPrinciple {
    //Переписать код в соответствии с Dependency Inversion Principle:
    public static void main(String[] args) {
        
        iGetStart petrol = new PetrolEngine1();
        iGetStart diesel = new DieselEngine();
        iGetStart gas = new GazEngine();

        Car1 car1 = new Car1(petrol);
        Car1 car2 = new Car1(diesel);
        Car1 car3 = new Car1(gas);

        car1.start();
        car2.start();
        car3.start();
    }
}

//было так:
class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
        }

    public void start() {
        this.engine.start();
        }
}
class PetrolEngine {
    public void start() {
        }
}

//стало так:
class Car1 {
    private iGetStart engine;

    public Car1(iGetStart engine) {
        this.engine = engine;
        }

    public void start() {
        this.engine.start();
        }
}
class PetrolEngine1 implements iGetStart{
    @Override
    public void start() {
        }
}
class DieselEngine implements iGetStart{
    @Override
    public void start() {
        }
}
class GazEngine implements iGetStart{
    @Override
    public void start() {
        }
}
interface iGetStart {
    public void start();
}