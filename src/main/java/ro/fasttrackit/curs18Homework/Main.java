package ro.fasttrackit.curs18Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop<Electronics> shop = new Shop<>(initializeList());
        System.out.println(shop.getList());
        System.out.println(shop.remove("LG TV"));
        System.out.println(shop.getList());
        System.out.println(shop.findWhitLowerPrice(4500));
    }

    public static List<Electronics> initializeList() {
        List<Electronics> shop = new ArrayList<>();
        Electronics samsungTv = new Electronics("Samsung 8K UHD TV", 5000, Category.ON_SALE);
        Electronics sonyTv = new Electronics("Sony 4k", 1000, Category.REFURBISHED);
        Electronics samsungTv2 = new Electronics("Samsung 4K UHD TV", 2000, Category.ON_SALE);
        Electronics lgTv = new Electronics("LG TV", 1500, Category.NEW);
        shop.add(samsungTv);
        shop.add(sonyTv);
        shop.add(samsungTv2);
        shop.add(lgTv);
        return shop;
    }
}
