package com.iab.omid.library.inmobi.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f24155a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f24156b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f24157c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f24155a;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f24156b.add(aVar);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f24156b);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean d10 = d();
        this.f24157c.add(aVar);
        if (d10) {
            return;
        }
        f.a().b();
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f24157c);
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean d10 = d();
        this.f24156b.remove(aVar);
        this.f24157c.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        f.a().c();
    }

    public boolean d() {
        return this.f24157c.size() > 0;
    }
}
