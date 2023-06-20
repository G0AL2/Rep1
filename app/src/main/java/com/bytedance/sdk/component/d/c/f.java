package com.bytedance.sdk.component.d.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.k;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.o;
import com.bytedance.sdk.component.d.p;
import com.bytedance.sdk.component.d.q;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadFactory.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private final l f10259b;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.d.d f10263f;

    /* renamed from: g  reason: collision with root package name */
    private k f10264g;

    /* renamed from: h  reason: collision with root package name */
    private ExecutorService f10265h;

    /* renamed from: i  reason: collision with root package name */
    private o f10266i;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<c>> f10258a = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, p> f10260c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, q> f10261d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<String, com.bytedance.sdk.component.d.c> f10262e = new HashMap();

    public f(Context context, l lVar) {
        this.f10259b = (l) h.a(lVar);
        com.bytedance.sdk.component.d.c.a.a.a(context, lVar.h());
    }

    private p d(com.bytedance.sdk.component.d.b bVar) {
        p d10 = this.f10259b.d();
        if (d10 != null) {
            return com.bytedance.sdk.component.d.c.a.b.a.a(d10);
        }
        return com.bytedance.sdk.component.d.c.a.b.a.a(bVar.b());
    }

    private q e(com.bytedance.sdk.component.d.b bVar) {
        q e10 = this.f10259b.e();
        return e10 != null ? e10 : com.bytedance.sdk.component.d.c.a.b.e.a(bVar.b());
    }

    private com.bytedance.sdk.component.d.c f(com.bytedance.sdk.component.d.b bVar) {
        com.bytedance.sdk.component.d.c f10 = this.f10259b.f();
        return f10 != null ? f10 : new com.bytedance.sdk.component.d.c.a.a.b(bVar.e(), bVar.a(), e());
    }

    private com.bytedance.sdk.component.d.d h() {
        com.bytedance.sdk.component.d.d c10 = this.f10259b.c();
        return c10 == null ? com.bytedance.sdk.component.d.b.b.a() : c10;
    }

    private k i() {
        k a10 = this.f10259b.a();
        return a10 != null ? a10 : com.bytedance.sdk.component.d.a.b.a();
    }

    private ExecutorService j() {
        ExecutorService b10 = this.f10259b.b();
        return b10 != null ? b10 : com.bytedance.sdk.component.d.a.c.a();
    }

    private o k() {
        o g10 = this.f10259b.g();
        return g10 == null ? new g() : g10;
    }

    public Collection<q> a() {
        return this.f10261d.values();
    }

    public Collection<com.bytedance.sdk.component.d.c> b() {
        return this.f10262e.values();
    }

    public com.bytedance.sdk.component.d.c c(com.bytedance.sdk.component.d.b bVar) {
        if (bVar == null) {
            bVar = com.bytedance.sdk.component.d.c.a.a.f();
        }
        String file = bVar.e().toString();
        com.bytedance.sdk.component.d.c cVar = this.f10262e.get(file);
        if (cVar == null) {
            com.bytedance.sdk.component.d.c f10 = f(bVar);
            this.f10262e.put(file, f10);
            return f10;
        }
        return cVar;
    }

    public o g() {
        if (this.f10266i == null) {
            this.f10266i = k();
        }
        return this.f10266i;
    }

    public p a(com.bytedance.sdk.component.d.b bVar) {
        if (bVar == null) {
            bVar = com.bytedance.sdk.component.d.c.a.a.f();
        }
        String file = bVar.e().toString();
        p pVar = this.f10260c.get(file);
        if (pVar == null) {
            p d10 = d(bVar);
            this.f10260c.put(file, d10);
            return d10;
        }
        return pVar;
    }

    public q b(com.bytedance.sdk.component.d.b bVar) {
        if (bVar == null) {
            bVar = com.bytedance.sdk.component.d.c.a.a.f();
        }
        String file = bVar.e().toString();
        q qVar = this.f10261d.get(file);
        if (qVar == null) {
            q e10 = e(bVar);
            this.f10261d.put(file, e10);
            return e10;
        }
        return qVar;
    }

    public ExecutorService e() {
        if (this.f10265h == null) {
            this.f10265h = j();
        }
        return this.f10265h;
    }

    public Map<String, List<c>> f() {
        return this.f10258a;
    }

    public k d() {
        if (this.f10264g == null) {
            this.f10264g = i();
        }
        return this.f10264g;
    }

    public com.bytedance.sdk.component.d.d c() {
        if (this.f10263f == null) {
            this.f10263f = h();
        }
        return this.f10263f;
    }

    public com.bytedance.sdk.component.d.c a(String str) {
        return c(com.bytedance.sdk.component.d.c.a.a.a(new File(str)));
    }

    public com.bytedance.sdk.component.d.c.b.a a(c cVar) {
        ImageView.ScaleType d10 = cVar.d();
        if (d10 == null) {
            d10 = com.bytedance.sdk.component.d.c.b.a.f10173a;
        }
        Bitmap.Config h10 = cVar.h();
        if (h10 == null) {
            h10 = com.bytedance.sdk.component.d.c.b.a.f10174b;
        }
        return new com.bytedance.sdk.component.d.c.b.a(cVar.b(), cVar.c(), d10, h10);
    }
}
