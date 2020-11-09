public class Runner {

    public static void main(String[] args) {

        Planet mars = new Planet("Mars",908973);

        String planetName = mars.getName();

        int planetSize = mars.getSize();

        System.out.println(planetName + planetSize);

        mars.explode();


    }

}
