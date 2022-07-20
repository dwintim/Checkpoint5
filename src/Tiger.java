//Пункт 2
public class Tiger extends Animal {
    public Animal tiger;

    public Tiger(boolean isAlive) {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void tigerName() {
        tiger.setName("Тигруля");
    }

    @Override
    public String voice() {

        return String.format("ррр, мне лет " + getTheWeight());
    }


}


