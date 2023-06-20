package com.iab.omid.library.applovin.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f23921a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f23922b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f23923c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f23921a;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f23922b.add(aVar);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f23922b);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f23923c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f23923c);
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d10 = d();
        this.f23922b.remove(aVar);
        this.f23923c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f23923c.size() > 0;
    }
}
