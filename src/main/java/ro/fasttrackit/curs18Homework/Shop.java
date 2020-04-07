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
        list.add(item);
    }
}
