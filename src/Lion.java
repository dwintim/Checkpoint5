public class Lion extends Animal {
    private Animal lion;
    public Lion() {
    }
    @Override
    public String toString() {
        return "Lion  {" +
                getColour() + " " +
                getName() + " " +
                getAge() + " " +
                getTheWeight() +
                '}';
    }
    public void lionName() {

        lion.setName("Бонифаций");
    }
    @Override
    public String voice() {
        return String.format("мяу, мой цвет = %s, а возраст = %d",
                getColour(), getAge());
    }
}