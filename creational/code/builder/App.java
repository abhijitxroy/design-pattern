package abstractfactorymethoddp;

public class App {
    
    public static void main(String[] args) {
        Employee emp = new EmplyeeBuilder()
                                            .setId(1)
                                            .setName("Abhijit")
                                            .setProfession("Developer")
                                            .getEmployee();
        System.out.println("Employee: " + emp);
        
    }
    
}
