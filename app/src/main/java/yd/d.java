package yd;

import java.util.HashMap;
import java.util.Map;

/* compiled from: SignalsStorage.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, b> f39527a = new HashMap();

    public Map<String, b> a() {
        return this.f39527a;
    }

    public b b(String str) {
        return this.f39527a.get(str);
    }

    public void c(String str, b bVar) {
        this.f39527a.put(str, bVar);
    }
}
