package ro.fasttrackit.curs18Homework;

import java.util.ArrayList;
import java.util.List;

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

    public List<ShopItem> findByCategory(Category category) {
        List<ShopItem> result = new ArrayList<>();
        for (ShopItem item : list) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        return result;
    }
}
