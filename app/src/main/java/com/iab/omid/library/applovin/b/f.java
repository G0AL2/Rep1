package com.iab.omid.library.applovin.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.b.b;
import com.iab.omid.library.applovin.walking.TreeWalker;

/* loaded from: classes3.dex */
public class f implements com.iab.omid.library.applovin.a.c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f23938a;

    /* renamed from: b  reason: collision with root package name */
    private float f23939b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.applovin.a.e f23940c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.applovin.a.b f23941d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.a.d f23942e;

    /* renamed from: f  reason: collision with root package name */
    private a f23943f;

    public f(com.iab.omid.library.applovin.a.e eVar, com.iab.omid.library.applovin.a.b bVar) {
        this.f23940c = eVar;
        this.f23941d = bVar;
    }

    public static f a() {
        if (f23938a == null) {
            f23938a = new f(new com.iab.omid.library.applovin.a.e(), new com.iab.omid.library.applovin.a.b());
        }
        return f23938a;
    }

    private a e() {
        if (this.f23943f == null) {
            this.f23943f = a.a();
        }
        return this.f23943f;
    }

    @Override // com.iab.omid.library.applovin.a.c
    public void a(float f10) {
        this.f23939b = f10;
        for (com.iab.omid.library.applovin.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f23942e = this.f23940c.a(new Handler(), context, this.f23941d.a(), this);
    }

    @Override // com.iab.omid.library.applovin.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f23942e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f23942e.b();
    }

    public float d() {
        return this.f23939b;
    }
}
