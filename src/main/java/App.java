import com.car.Car;
import com.car.SportCar;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    
    public static void main(String[] args) {
    	Car car = new Car("v12","miqilin"); 
    	System.out.println(car.start());
    	SportCar sportcar = new SportCar("v20","niubi","������");
    	System.out.println(sportcar.start());
    	System.out.println(sportcar.speedOn());
    	
    }
}
