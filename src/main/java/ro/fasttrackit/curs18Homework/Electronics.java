package ro.fasttrackit.curs18Homework;

import java.util.Objects;

public class Electronics implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Electronics(String name, int price, Category category) {
        if (validateObject(name, price)) {
            this.name = name;
            this.price = price;
            this.category = category;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean validateObject(String name, int price) {
        if (name != null && name.length() > 0 && price > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronics)) return false;
        Electronics that = (Electronics) o;
        return getPrice() == that.getPrice() &&
                Objects.equals(getName(), that.getName()) &&
                getCategory() == that.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCategory());
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
