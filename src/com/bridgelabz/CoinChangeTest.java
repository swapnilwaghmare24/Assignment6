package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {
    @Test
    public void testCoinChange() {
        CoinChange coinChange = new CoinChange();
        int[] ds = new int[46];
        Arrays.fill(ds, -1);
        int actual = coinChange.minCoin(45, ds);

        assertEquals(5, actual);
    }

}
