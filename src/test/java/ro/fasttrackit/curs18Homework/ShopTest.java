package ro.fasttrackit.curs18Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private Shop shop;

    @BeforeEach
    void setup() {
        Shop shop = new Shop(new ArrayList());
    }

    @Test
    @DisplayName("When adding a null element THEN throw error")
    void addingNullItem() {
        assertThrows(IllegalArgumentException.class, () -> shop.add(null));
    }
}