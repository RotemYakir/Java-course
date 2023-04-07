package family_02_structural.dp_01_facade;

import family_02_structural.dp_01_facade.services.MorningService;

public class App {

    public static void main(String[] args) {
        MorningService morningService = new MorningService();
        System.out.println(morningService.goodMorningSir());
    }
}