package com.iab.omid.library.ironsrc.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f24268a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f24269b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f24270c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f24268a;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f24269b.add(aVar);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24269b);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f24270c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f24270c);
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f24269b.remove(aVar);
        this.f24270c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f24270c.size() > 0;
    }
}
