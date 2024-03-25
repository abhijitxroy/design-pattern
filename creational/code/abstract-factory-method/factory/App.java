import abstractfactorymethoddp.interf.FactoryMethod;
import abstractfactorymethoddp.interf.Profession;

public class App {
    public static void main(String[] args) {
    
        Profession profession =  FactoryMethod.getProfession("devops");
        profession.work();
        
    }
}
