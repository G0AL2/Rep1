package androidx.work.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: StartStopToken.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4693a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<o1.m, v> f4694b = new LinkedHashMap();

    public final boolean a(o1.m mVar) {
        boolean containsKey;
        qe.k.f(mVar, "id");
        synchronized (this.f4693a) {
            containsKey = this.f4694b.containsKey(mVar);
        }
        return containsKey;
    }

    public final v b(o1.m mVar) {
        v remove;
        qe.k.f(mVar, "id");
        synchronized (this.f4693a) {
            remove = this.f4694b.remove(mVar);
        }
        return remove;
    }

    public final List<v> c(String str) {
        List<v> N;
        qe.k.f(str, "workSpecId");
        synchronized (this.f4693a) {
            Map<o1.m, v> map = this.f4694b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<o1.m, v> entry : map.entrySet()) {
                if (qe.k.a(entry.getKey().b(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (o1.m mVar : linkedHashMap.keySet()) {
                this.f4694b.remove(mVar);
            }
            N = fe.x.N(linkedHashMap.values());
        }
        return N;
    }

    public final v d(o1.m mVar) {
        v vVar;
        qe.k.f(mVar, "id");
        synchronized (this.f4693a) {
            Map<o1.m, v> map = this.f4694b;
            v vVar2 = map.get(mVar);
            if (vVar2 == null) {
                vVar2 = new v(mVar);
                map.put(mVar, vVar2);
            }
            vVar = vVar2;
        }
        return vVar;
    }

    public final v e(o1.u uVar) {
        qe.k.f(uVar, "spec");
        return d(o1.x.a(uVar));
    }
}
