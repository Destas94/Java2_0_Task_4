public class Bisquit extends Sweets{
    private String filling;
    public Bisquit () {}

    public Bisquit(String name, Integer weight, Double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Висквит: " + super.toString() + ", начинка = '" + filling + "' ";
    }
}
