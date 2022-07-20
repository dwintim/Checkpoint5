public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger(true);
        Lion lion = new Lion();

        tiger.setAge(10);
        System.out.println("Было имя кота — " + lion.getName());
        lion.setName("Бонифаций");
        System.out.println("имя льва — " + lion.getName());
        tiger.setName("Тигруля");
        System.out.println("имя тигра — " + tiger.getName());

        Animal[] animal = new Animal[2];
        animal[0] = tiger;
        animal[1] = lion;
        System.out.println();
        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println();
        System.out.println(tiger.voice());
        System.out.println(lion.voice());
        System.out.println();


        for (Animal value : animal) {
            System.out.println(value.isAlive() + " name= " + value.getName());
        }
    }
}




