public class Candy extends Sweets{
    private String form;
    public Candy () {};
    public Candy(String name, Integer weight, Double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Конфеты: " + super.toString() + ", форма = '" + form + "' ]";
    }

}
