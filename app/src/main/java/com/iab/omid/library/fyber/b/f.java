package com.iab.omid.library.fyber.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.b.b;
import com.iab.omid.library.fyber.walking.TreeWalker;

/* loaded from: classes3.dex */
public class f implements com.iab.omid.library.fyber.a.c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f24056a;

    /* renamed from: b  reason: collision with root package name */
    private float f24057b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.fyber.a.e f24058c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.fyber.a.b f24059d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.fyber.a.d f24060e;

    /* renamed from: f  reason: collision with root package name */
    private a f24061f;

    public f(com.iab.omid.library.fyber.a.e eVar, com.iab.omid.library.fyber.a.b bVar) {
        this.f24058c = eVar;
        this.f24059d = bVar;
    }

    public static f a() {
        if (f24056a == null) {
            f24056a = new f(new com.iab.omid.library.fyber.a.e(), new com.iab.omid.library.fyber.a.b());
        }
        return f24056a;
    }

    private a e() {
        if (this.f24061f == null) {
            this.f24061f = a.a();
        }
        return this.f24061f;
    }

    @Override // com.iab.omid.library.fyber.a.c
    public void a(float f10) {
        this.f24057b = f10;
        for (com.iab.omid.library.fyber.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24060e = this.f24058c.a(new Handler(), context, this.f24059d.a(), this);
    }

    @Override // com.iab.omid.library.fyber.b.b.a
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
        this.f24060e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f24060e.b();
    }

    public float d() {
        return this.f24057b;
    }
}
