package bb;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Map<String, Integer>> f5200a;

    static {
        new HashSet(Arrays.asList("review"));
        new HashSet(Arrays.asList("native", "unity"));
        f5200a = new HashMap();
        new cb.e("PlayCoreVersion");
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> b10 = b("review");
        bundle.putInt("playcore_version_code", b10.get("java").intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", b10.get("native").intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b10.get("unity").intValue());
        }
        return bundle;
    }

    public static synchronized Map<String, Integer> b(String str) {
        Map<String, Integer> map;
        synchronized (b.class) {
            Map<String, Map<String, Integer>> map2 = f5200a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10800);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }
}
