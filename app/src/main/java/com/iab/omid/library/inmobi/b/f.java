package com.iab.omid.library.inmobi.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.b.b;
import com.iab.omid.library.inmobi.walking.TreeWalker;

/* loaded from: classes3.dex */
public class f implements com.iab.omid.library.inmobi.a.c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f24172a;

    /* renamed from: b  reason: collision with root package name */
    private float f24173b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.a.e f24174c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.a.b f24175d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.inmobi.a.d f24176e;

    /* renamed from: f  reason: collision with root package name */
    private a f24177f;

    public f(com.iab.omid.library.inmobi.a.e eVar, com.iab.omid.library.inmobi.a.b bVar) {
        this.f24174c = eVar;
        this.f24175d = bVar;
    }

    public static f a() {
        if (f24172a == null) {
            f24172a = new f(new com.iab.omid.library.inmobi.a.e(), new com.iab.omid.library.inmobi.a.b());
        }
        return f24172a;
    }

    private a e() {
        if (this.f24177f == null) {
            this.f24177f = a.a();
        }
        return this.f24177f;
    }

    @Override // com.iab.omid.library.inmobi.a.c
    public void a(float f10) {
        this.f24173b = f10;
        for (com.iab.omid.library.inmobi.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24176e = this.f24174c.a(new Handler(), context, this.f24175d.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.b.b.a
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
        this.f24176e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f24176e.b();
    }

    public float d() {
        return this.f24173b;
    }
}
