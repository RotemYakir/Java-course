package family_02_structural.dp_01_facade.services;

import family_02_structural.dp_01_facade.repos.CoffeeRepository;
import family_02_structural.dp_01_facade.repos.SmokeRepository;

public class MorningService {

    private CoffeeRepository coffeeRepository = new CoffeeRepository();
    private SmokeRepository smokeRepository = new SmokeRepository();

    public String goodMorningSir(){
        return String.format("Drink %s coffee , Smoke %s cigarrete",coffeeRepository.getCoffee("Black"),smokeRepository.getSmoke("VERY VERY BAD"));
    }
}
