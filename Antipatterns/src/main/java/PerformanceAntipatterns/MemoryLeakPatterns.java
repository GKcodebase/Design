package PerformanceAntipatterns;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeakPatterns {

    // Antipattern
    static class CacheManager {
        private static Map<String, Object> cache = new HashMap<>();

        public void addToCache(String key, Object value) {
            cache.put(key, value);  // Never removed
        }
    }


    // Better Solution
    class ModernCacheManager {
        private static Map<String, Object> cache = new WeakHashMap<>();
        // or
        private static Cache<String, Object> cache =
                CacheBuilder.newBuilder()
                        .maximumSize(1000)
                        .expireAfterWrite(10, TimeUnit.MINUTES)
                        .build();
    }


}
