package sd;

import java.util.HashMap;
import java.util.Map;

/* compiled from: SignalsStorage.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, b> f36983a = new HashMap();

    public Map<String, b> a() {
        return this.f36983a;
    }

    public b b(String str) {
        return this.f36983a.get(str);
    }

    public void c(String str, b bVar) {
        this.f36983a.put(str, bVar);
    }
}
