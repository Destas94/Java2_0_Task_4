public class JellyBean extends Sweets {
    private String color;
    public JellyBean() {}
    public JellyBean(String name, Integer weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Мармеладные бобы: " + super.toString() + ", цвет = '" + color + "' ";
    }
}
