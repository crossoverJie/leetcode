package com.crossoverjie.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Function: 出现频率最高的 K 个数
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 *
 * @author crossoverJie
 *         Date: 25/03/2018 23:29
 * @since JDK 1.8
 */
public class TopKFrequentElements {

    /**
     * 桶排序
     * 先把每个数字出现的次数放入一个 Map 中
     * 之后根据出现的次数放入到对应的桶中，如 1 就放在 3 号桶，2 放在 2 号桶，3 放在一号桶。
     * 最后倒序遍历这个桶到一个 list 中，直到 list 的 大小等于 K，退出。
     *
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //根据数字出现的次数存入 map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        /**
         * 根据传入的数字数组生成对应的桶的大小，有可能每个数字都是唯一的。如[1,2,3,4,5,6,7,8,9]
         * 之所以是一个 List 数组，是有可能存在两个数出现的次数是一样的，所以就应该放在一个桶中，所以是存在了 list 中。
         */
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            //取出出现的次数
            int frequency = map.get(key) ;

            /**
             * 查看桶中该位置是否有数据，没有就新增一个。
             */
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>() ;
            }
            bucket[frequency].add(key);
        }

        /**
         * 从这个列表后朝前遍历，因为在后面的出现次数越多。
         * 只要取到的数量 >= k 就退出。
         */
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        return result;
    }
}
