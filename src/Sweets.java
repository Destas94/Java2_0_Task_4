public abstract class Sweets {
    private String name;
    private Integer weight;
    private Double price;

    public Sweets() {}

    public Sweets(String name, Integer weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название='" + name + '\'' +
               ", вес='" + weight + '\'' +
               ", цена='" + price + '\'';
    }
}
