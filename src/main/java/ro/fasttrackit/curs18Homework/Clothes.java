package ro.fasttrackit.curs18Homework;

import java.util.Objects;

public class Clothes implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;
        Clothes clothes = (Clothes) o;
        return getPrice() == clothes.getPrice() &&
                Objects.equals(getName(), clothes.getName()) &&
                getCategory() == clothes.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCategory());
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
