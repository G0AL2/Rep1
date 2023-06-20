package com.bytedance.sdk.openadsdk.component.g;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import l3.c;
import m3.c;

/* compiled from: TTAppOpenVideoManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f11406a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f11407b;

    /* renamed from: c  reason: collision with root package name */
    private n f11408c;

    /* renamed from: d  reason: collision with root package name */
    private a f11409d;

    public b(Context context) {
        this.f11406a = context.getApplicationContext();
    }

    public void a(FrameLayout frameLayout, n nVar) {
        this.f11407b = frameLayout;
        this.f11408c = nVar;
        this.f11409d = new a(this.f11406a, frameLayout, nVar);
    }

    public boolean b() {
        a aVar = this.f11409d;
        return (aVar == null || aVar.n() == null || !this.f11409d.n().l()) ? false : true;
    }

    public boolean c() {
        a aVar = this.f11409d;
        return (aVar == null || aVar.n() == null || !this.f11409d.n().m()) ? false : true;
    }

    public void d() {
        try {
            if (b()) {
                this.f11409d.b();
            }
        } catch (Throwable th) {
            l.b("AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void e() {
        a aVar = this.f11409d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void f() {
        a aVar = this.f11409d;
        if (aVar == null) {
            return;
        }
        this.f11406a = null;
        aVar.e();
        this.f11409d = null;
    }

    public long g() {
        a aVar = this.f11409d;
        if (aVar != null) {
            return aVar.g();
        }
        return 0L;
    }

    public long h() {
        a aVar = this.f11409d;
        if (aVar != null) {
            return aVar.h();
        }
        return 0L;
    }

    public long i() {
        a aVar = this.f11409d;
        if (aVar != null) {
            return aVar.j() + this.f11409d.h();
        }
        return 0L;
    }

    public boolean a() {
        String str;
        int f10 = u.f(this.f11408c);
        if (Build.VERSION.SDK_INT >= 23) {
            str = com.bytedance.sdk.openadsdk.component.f.a.a(m.a(), f10);
        } else {
            try {
                str = com.bytedance.sdk.openadsdk.component.f.a.a();
            } catch (Throwable unused) {
                str = "";
            }
        }
        c a10 = n.a(str, this.f11408c);
        a10.j(this.f11408c.Y());
        a10.b(this.f11407b.getWidth());
        a10.i(this.f11407b.getHeight());
        a10.m(this.f11408c.ac());
        a10.c(0L);
        a10.g(true);
        return this.f11409d.a(a10);
    }

    public void a(c.a aVar) {
        a aVar2 = this.f11409d;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public void a(int i10) {
        if (this.f11409d != null) {
            o.a aVar = new o.a();
            aVar.a(g());
            aVar.c(i());
            aVar.b(h());
            aVar.e(i10);
            aVar.f(this.f11409d.i());
            this.f11409d.a(aVar);
        }
    }
}
