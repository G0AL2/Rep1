package com.iab.omid.library.fyber.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f24039a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f24040b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f24041c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f24039a;
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f24040b.add(aVar);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24040b);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean d10 = d();
        this.f24041c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f24041c);
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean d10 = d();
        this.f24040b.remove(aVar);
        this.f24041c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f24041c.size() > 0;
    }
}
