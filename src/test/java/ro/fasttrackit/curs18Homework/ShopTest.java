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
        List<ShopItem> list = shop.findByCategory(Category.ON_SALE);
        assertTrue(list.isEmpty());
    }
}