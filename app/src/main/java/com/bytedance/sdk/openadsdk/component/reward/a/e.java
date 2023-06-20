package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.h;
import com.bytedance.sdk.openadsdk.component.reward.i;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.util.Map;
import m3.c;

/* compiled from: RewardFullVideoPlayerManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    long f11463a;

    /* renamed from: d  reason: collision with root package name */
    String f11466d;

    /* renamed from: e  reason: collision with root package name */
    boolean f11467e;

    /* renamed from: g  reason: collision with root package name */
    m3.c f11469g;

    /* renamed from: h  reason: collision with root package name */
    long f11470h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f11471i;

    /* renamed from: j  reason: collision with root package name */
    private n f11472j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f11473k;

    /* renamed from: l  reason: collision with root package name */
    private String f11474l;

    /* renamed from: n  reason: collision with root package name */
    private j f11476n;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f11464b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f11465c = false;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f11468f = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11475m = false;

    public e(Activity activity) {
        this.f11471i = activity;
    }

    private void F() {
        m3.c cVar = this.f11469g;
        if (cVar == null || cVar.n() == null) {
            return;
        }
        this.f11463a = this.f11469g.g();
        if (this.f11469g.n().i() || !this.f11469g.n().h()) {
            this.f11469g.b();
            this.f11469g.e();
            this.f11464b = true;
        }
    }

    public void A() {
        try {
            if (b()) {
                this.f11468f = true;
                o();
            }
        } catch (Throwable th) {
            l.e("TTBaseVideoActivity", "onPause throw Exception :" + th.getMessage());
        }
    }

    public boolean B() {
        m3.c cVar = this.f11469g;
        if (cVar == null || cVar.n() == null) {
            return false;
        }
        return this.f11469g.n().e();
    }

    public double C() {
        if (com.bytedance.sdk.openadsdk.core.e.l.c(this.f11472j) && this.f11472j.a() != null) {
            return this.f11472j.a().b();
        }
        n nVar = this.f11472j;
        if (nVar == null || nVar.J() == null) {
            return 0.0d;
        }
        return this.f11472j.J().r();
    }

    public void D() {
        m3.c cVar = this.f11469g;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.video.c.a) {
            ((com.bytedance.sdk.openadsdk.core.video.c.a) cVar).H();
        }
    }

    public View E() {
        m3.c cVar = this.f11469g;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.video.c.a) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.c.a) cVar).J();
        }
        return null;
    }

    public j a() {
        return this.f11476n;
    }

    public boolean b() {
        m3.c cVar = this.f11469g;
        return (cVar == null || cVar.n() == null || !this.f11469g.n().l()) ? false : true;
    }

    public k3.a c() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.o();
        }
        return null;
    }

    public boolean d() {
        m3.c cVar = this.f11469g;
        return (cVar == null || cVar.n() == null || !this.f11469g.n().m()) ? false : true;
    }

    public boolean e() {
        m3.c cVar = this.f11469g;
        return cVar != null && cVar.r();
    }

    public long f() {
        return this.f11470h;
    }

    public boolean g() {
        return this.f11464b;
    }

    public long h() {
        return this.f11463a;
    }

    public void i() {
        try {
            if (b()) {
                this.f11469g.b();
            }
        } catch (Throwable th) {
            l.b("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public long j() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.h();
        }
        return 0L;
    }

    public void k() {
        m3.c cVar = this.f11469g;
        if (cVar == null) {
            return;
        }
        cVar.e();
        this.f11469g = null;
    }

    public void l() {
        m3.c cVar = this.f11469g;
        if (cVar == null) {
            return;
        }
        cVar.c();
        this.f11469g.f();
    }

    public void m() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void n() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void o() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.b();
        }
    }

    public long p() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.j();
        }
        return 0L;
    }

    public int q() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.l();
        }
        return 0;
    }

    public int r() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.i();
        }
        return 0;
    }

    public long s() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.g();
        }
        return this.f11463a;
    }

    public void t() {
        m3.c cVar = this.f11469g;
        if (cVar == null || cVar.n() == null) {
            return;
        }
        this.f11469g.n().c();
    }

    public long u() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.j() + this.f11469g.h();
        }
        return 0L;
    }

    public long v() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            return cVar.j();
        }
        return 0L;
    }

    public boolean w() {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            if (cVar.n() != null) {
                i3.a n10 = this.f11469g.n();
                if (n10.m() || n10.n()) {
                    ((com.bytedance.sdk.openadsdk.core.video.c.a) this.f11469g).I();
                    return true;
                }
            } else if (g()) {
                a(false);
                ((com.bytedance.sdk.openadsdk.core.video.c.a) this.f11469g).I();
                return true;
            }
        }
        return false;
    }

    public boolean x() {
        return this.f11469g != null;
    }

    public boolean y() {
        m3.c cVar = this.f11469g;
        return cVar != null && cVar.n() == null;
    }

    public String z() {
        return this.f11466d;
    }

    public void a(FrameLayout frameLayout, n nVar, String str, boolean z10, j jVar) {
        if (this.f11475m) {
            return;
        }
        this.f11475m = true;
        this.f11472j = nVar;
        this.f11473k = frameLayout;
        this.f11474l = str;
        this.f11467e = z10;
        this.f11476n = jVar;
        if (z10) {
            this.f11469g = new h(this.f11471i, frameLayout, nVar, jVar);
        } else {
            this.f11469g = new com.bytedance.sdk.openadsdk.component.reward.c(this.f11471i, frameLayout, nVar, jVar);
        }
    }

    public void b(long j10) {
        this.f11463a = j10;
    }

    public void b(boolean z10) {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.b(z10);
        }
    }

    public void c(boolean z10) {
        k();
        if (TextUtils.isEmpty(this.f11466d)) {
            if (z10) {
                i.a(m.a()).a();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.d.a(m.a()).b();
            }
        }
    }

    public void a(long j10) {
        this.f11470h = j10;
    }

    public void a(boolean z10) {
        this.f11464b = z10;
    }

    public void a(int i10, int i11) {
        if (this.f11469g != null) {
            o.a aVar = new o.a();
            aVar.b(j());
            aVar.c(u());
            aVar.a(s());
            aVar.c(i10);
            aVar.d(i11);
            com.bytedance.sdk.openadsdk.b.b.a.a.d(this.f11469g.o(), aVar);
        }
    }

    public void a(Map<String, Object> map) {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.a(map);
        }
    }

    public void a(c.a aVar) {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public void a(String str, Map<String, Object> map) {
        m3.c cVar = this.f11469g;
        if (cVar != null) {
            Map<String, Object> a10 = u.a(this.f11472j, cVar.h(), this.f11469g.n());
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    a10.put(entry.getKey(), entry.getValue());
                }
            }
            com.bytedance.sdk.openadsdk.b.e.a(this.f11471i, this.f11472j, this.f11474l, str, u(), q(), a10, this.f11476n);
            l.b("TTBaseVideoActivity", "event tag:" + this.f11474l + ", TotalPlayDuration=" + u() + ",mBasevideoController.getPct()=" + q());
        }
    }

    public boolean a(long j10, boolean z10) {
        l.b("TTBaseVideoActivity", "playVideo start");
        if (this.f11469g != null && this.f11472j.J() != null) {
            File file = new File(CacheDirFactory.getICacheDir(this.f11472j.aD()).b(), this.f11472j.J().C());
            if (file.exists() && file.length() > 0) {
                this.f11465c = true;
            }
            l3.c a10 = n.a(CacheDirFactory.getICacheDir(this.f11472j.aD()).b(), this.f11472j);
            a10.j(this.f11472j.Y());
            a10.b(this.f11473k.getWidth());
            a10.i(this.f11473k.getHeight());
            a10.m(this.f11472j.ac());
            a10.c(j10);
            a10.g(z10);
            return this.f11469g.a(a10);
        }
        l.b("TTBaseVideoActivity", "playVideo controller is Empty");
        return false;
    }

    public void a(String str) {
        this.f11466d = str;
    }

    public void a(boolean z10, com.bytedance.sdk.openadsdk.core.video.c.b bVar) {
        try {
            this.f11468f = false;
            if (g()) {
                F();
                a(bVar);
            } else if (d()) {
                n();
            }
        } catch (Throwable th) {
            l.e("TTBaseVideoActivity", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void a(boolean z10, com.bytedance.sdk.openadsdk.core.video.c.b bVar, boolean z11) {
        if (!z11 || z10 || this.f11468f) {
            return;
        }
        if (d()) {
            n();
            Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: continue play");
            return;
        }
        F();
        a(bVar);
        Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: recreate video player & exec play");
    }

    protected void a(com.bytedance.sdk.openadsdk.core.video.c.b bVar) {
        if (!w() || bVar == null) {
            return;
        }
        bVar.a(h(), true);
    }
}
