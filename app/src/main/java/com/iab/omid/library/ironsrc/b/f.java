package com.iab.omid.library.ironsrc.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.b.b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* loaded from: classes3.dex */
public class f implements com.iab.omid.library.ironsrc.a.c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f24286a;

    /* renamed from: b  reason: collision with root package name */
    private float f24287b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.a.e f24288c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.a.b f24289d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.a.d f24290e;

    /* renamed from: f  reason: collision with root package name */
    private a f24291f;

    public f(com.iab.omid.library.ironsrc.a.e eVar, com.iab.omid.library.ironsrc.a.b bVar) {
        this.f24288c = eVar;
        this.f24289d = bVar;
    }

    public static f a() {
        if (f24286a == null) {
            f24286a = new f(new com.iab.omid.library.ironsrc.a.e(), new com.iab.omid.library.ironsrc.a.b());
        }
        return f24286a;
    }

    private a e() {
        if (this.f24291f == null) {
            this.f24291f = a.a();
        }
        return this.f24291f;
    }

    @Override // com.iab.omid.library.ironsrc.a.c
    public void a(float f10) {
        this.f24287b = f10;
        for (com.iab.omid.library.ironsrc.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24290e = this.f24288c.a(new Handler(), context, this.f24289d.a(), this);
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f24290e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f24290e.b();
    }

    public float d() {
        return this.f24287b;
    }
}
