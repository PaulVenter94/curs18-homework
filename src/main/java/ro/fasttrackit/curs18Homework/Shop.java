package ro.fasttrackit.curs18Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private final List<T> list;

    public Shop(List<T> list) {
        this.list = list == null ? new ArrayList<>() : new ArrayList<>(list);
    }

    public List<ShopItem> getList() {
        return new ArrayList<>(list);
    }

    public void add(T item) {
        if (item == null) throw new IllegalArgumentException();
        list.add(item);
    }

    public List<T> findByCategory(Category category) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWhitLowerPrice(int price) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.getPrice() < price) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        for (T item : list) {
            if (item.getName().equalsIgnoreCase(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
