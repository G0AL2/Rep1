package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f27524a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Integer> f27525b = new HashMap();

    /* loaded from: classes3.dex */
    public interface a {
        int j();

        String k();
    }

    public n(List<a> list) {
        for (a aVar : list) {
            this.f27524a.put(aVar.k(), 0);
            this.f27525b.put(aVar.k(), Integer.valueOf(aVar.j()));
        }
    }

    public final void a(a aVar) {
        synchronized (this) {
            String k10 = aVar.k();
            if (this.f27524a.containsKey(k10)) {
                Map<String, Integer> map = this.f27524a;
                map.put(k10, Integer.valueOf(map.get(k10).intValue() + 1));
            }
        }
    }

    public final boolean a() {
        for (String str : this.f27525b.keySet()) {
            if (this.f27524a.get(str).intValue() < this.f27525b.get(str).intValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(a aVar) {
        synchronized (this) {
            String k10 = aVar.k();
            if (this.f27524a.containsKey(k10)) {
                return this.f27524a.get(k10).intValue() >= aVar.j();
            }
            return false;
        }
    }
}
