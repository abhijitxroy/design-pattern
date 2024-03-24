import interf.AbstractFactory;
import interf.Profession;

public class App {

    public static void main(String[] args) {
        
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession engg = abstractFactory.getProfession("Trainee Engineer");

        engg.work();
    }
}
