package Hash_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostPopularVideoCreator {
    // https://leetcode.com/problems/most-popular-video-creator/
    // You are given two string arrays creators and ids, and an integer array views, all of length n.
    // The ith video on a platform was created by creator[i], has an id of ids[i], and has views[i] views.
    //The popularity of a creator is the sum of the number of views on all of the creator's videos.
    // Find the creator with the highest popularity and the id of their most viewed video.
    //    If multiple creators have the highest popularity, find all of them.
    //    If multiple videos have the highest view count for a creator, find the lexicographically smallest id.
    //Return a 2D array of strings answer where answer[i] = [creatori, idi] means that creatori has the highest popularity and idi is the id of their most popular video. The answer can be returned in any order.

    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, long[]> map = new HashMap<>();
        long maxViews = 0;

        for (int i = 0; i < creators.length; i++) {
            String creator = creators[i];
            long viewCount = views[i];
            if (map.containsKey(creator)) {
                long[] popularity = map.get(creator);
                popularity[0] += viewCount;

                int popularVideoIndex = (int) popularity[1];
                if (viewCount > views[popularVideoIndex] ||
                        (viewCount == views[popularVideoIndex] && ids[i].compareTo(ids[popularVideoIndex]) < 0)) {
                    popularity[1] = i;
                }
            } else {
                map.put(creator, new long[]{viewCount, i});
            }

            maxViews = Math.max(maxViews, map.get(creator)[0]);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, long[]> entry : map.entrySet()) {
            if (entry.getValue()[0] == maxViews) {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                list.add(ids[(int)entry.getValue()[1]]);
                result.add(list);
            }
        }

        return result;
    }
}
