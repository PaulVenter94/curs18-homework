package ro.fasttrackit.curs18Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private Shop<Electronics> shop;

    @BeforeEach
    void setup() {
        shop = new Shop(new ArrayList());
    }

    @Test
    @DisplayName("When adding a null element THEN throw error")
    void addingNullItem() {
        assertThrows(IllegalArgumentException.class, () -> shop.add(null));
    }

    @Test
    @DisplayName("When adding an valid item THEN its added to the list")
    void addItem() {
        Electronics samsungTv = new Electronics("Samsung 8K UHD TV", 5000, Category.ON_SALE);
        shop.add(samsungTv);

        assertThat(shop.getList().size()).isEqualTo(1);
        assertEquals(samsungTv, shop.getList().get(0));
    }

    @Test
    @DisplayName("When search by category if nothing foud THEN empty list is returned")
    void whenNothingIsFound() {
        List<Electronics> list = shop.findByCategory(Category.ON_SALE);
        assertTrue(list.isEmpty());
    }

    @Test
    @DisplayName("When search by cat THEN return a list inly with those items")
    void searchByCategory() {
        initializeShopList();
        List<Electronics> list = shop.findByCategory(Category.ON_SALE);
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("When given lower price THEN return an list with lower price")
    void searchByLowerPrice() {
        initializeShopList();
        List<Electronics> list = shop.findWhitLowerPrice(2000);
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("When not finding matching name THEN return an empty optional")
    void emptyOptional() {
        initializeShopList();
        assertThat(shop.findByName("Goldstar TV")).isEqualTo(null);
    }

    private void initializeShopList() {
        Electronics samsungTv = new Electronics("Samsung 8K UHD TV", 5000, Category.ON_SALE);
        Electronics sonyTv = new Electronics("Sony 4k", 1000, Category.REFURBISHED);
        Electronics samsungTv2 = new Electronics("Samsung 4K UHD TV", 2000, Category.ON_SALE);
        Electronics lgTv = new Electronics("LG TV", 1500, Category.NEW);
        shop.add(samsungTv);
        shop.add(sonyTv);
        shop.add(samsungTv2);
        shop.add(lgTv);
    }
}