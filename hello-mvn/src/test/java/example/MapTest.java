package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    void TestGetFromMap() {
        // 如果 map 为空，get 时返回的结果为null
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        Assertions.assertEquals(map.get("hello"), "world");
        String val = map.get("hello2");
        Assertions.assertNull(val);
    }
}
