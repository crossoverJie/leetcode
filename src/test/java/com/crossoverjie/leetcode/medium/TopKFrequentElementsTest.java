package com.crossoverjie.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopKFrequentElementsTest {
    @Test
    public void topKFrequent() throws Exception {
        int[] a = {1,1,1,2,2,3,3,3};
        List<Integer> integers = TopKFrequentElements.topKFrequent(a, 2);
        System.out.println(integers);
    }
    @Test
    public void topKFrequent2() throws Exception {
        int[] a = {1,1,1,2,2,2,3,3,3};
        List<Integer> integers = TopKFrequentElements.topKFrequent(a, 2);
        System.out.println(integers);
    }

}