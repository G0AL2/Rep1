package zb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes3.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f40485a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f40486b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40487c;

    public b(int i10, int i11) {
        this.f40486b = i10;
        this.f40487c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f40487c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i10 ? trim.substring(0, i10) : trim;
        }
        return str;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f40485a));
    }

    public synchronized void d(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b10 = b(entry.getKey());
            if (this.f40485a.size() >= this.f40486b && !this.f40485a.containsKey(b10)) {
                i10++;
            }
            String value = entry.getValue();
            this.f40485a.put(b10, value == null ? "" : c(value, this.f40487c));
        }
        if (i10 > 0) {
            vb.f f10 = vb.f.f();
            f10.k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f40486b);
        }
    }
}
