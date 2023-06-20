package vd;

import java.util.HashMap;
import java.util.Map;

/* compiled from: SignalsStorage.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, b> f38078a = new HashMap();

    public Map<String, b> a() {
        return this.f38078a;
    }

    public b b(String str) {
        return this.f38078a.get(str);
    }

    public void c(String str, b bVar) {
        this.f38078a.put(str, bVar);
    }
}
