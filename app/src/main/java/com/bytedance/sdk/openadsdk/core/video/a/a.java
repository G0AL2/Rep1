package com.bytedance.sdk.openadsdk.core.video.a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.d;
import com.bytedance.sdk.openadsdk.utils.m;
import com.bytedance.sdk.openadsdk.utils.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.b;
import m3.c;

/* compiled from: BaseController.java */
/* loaded from: classes.dex */
public abstract class a implements c, x.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a {

    /* renamed from: a  reason: collision with root package name */
    protected SurfaceHolder f12787a;

    /* renamed from: b  reason: collision with root package name */
    protected SurfaceTexture f12788b;

    /* renamed from: c  reason: collision with root package name */
    protected i3.a f12789c;

    /* renamed from: d  reason: collision with root package name */
    protected d f12790d;

    /* renamed from: e  reason: collision with root package name */
    protected n f12791e;

    /* renamed from: h  reason: collision with root package name */
    protected WeakReference<Context> f12794h;

    /* renamed from: i  reason: collision with root package name */
    protected List<Runnable> f12795i;

    /* renamed from: q  reason: collision with root package name */
    protected long f12803q;

    /* renamed from: f  reason: collision with root package name */
    protected long f12792f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected long f12793g = 0;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f12796j = false;

    /* renamed from: k  reason: collision with root package name */
    protected final x f12797k = new x(Looper.getMainLooper(), this);

    /* renamed from: l  reason: collision with root package name */
    protected boolean f12798l = false;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f12799m = true;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f12800n = false;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f12801o = false;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f12802p = false;

    /* renamed from: s  reason: collision with root package name */
    private long f12805s = 0;

    /* renamed from: r  reason: collision with root package name */
    protected Runnable f12804r = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.a.a.1
        @Override // java.lang.Runnable
        public void run() {
            l.a("CSJ_VIDEO_Controller", "resumeVideo: run ", Boolean.valueOf(a.this.f12796j));
            a.this.E();
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    public void A() {
        if (this.f12789c == null) {
            return;
        }
        if (B()) {
            SurfaceTexture surfaceTexture = this.f12788b;
            if (surfaceTexture == null || surfaceTexture == this.f12789c.g()) {
                return;
            }
            this.f12789c.a(this.f12788b);
            return;
        }
        SurfaceHolder surfaceHolder = this.f12787a;
        if (surfaceHolder == null || surfaceHolder == this.f12789c.f()) {
            return;
        }
        this.f12789c.a(this.f12787a);
    }

    protected boolean B() {
        d dVar = this.f12790d;
        if (dVar != null) {
            return dVar.q() instanceof SSRenderTextureView;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C() {
        WeakReference<Context> weakReference = this.f12794h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    protected void D() {
        l.c("CSJ_VIDEO_Controller", "execPendingActions: before ");
        List<Runnable> list = this.f12795i;
        if (list == null || list.isEmpty()) {
            return;
        }
        l.c("CSJ_VIDEO_Controller", "execPendingActions:  exec");
        Iterator it = new ArrayList(this.f12795i).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f12795i.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E() {
        this.f12797k.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                if (aVar.f12789c != null) {
                    l.a("CSJ_VIDEO_Controller", "resumeVideo: execResumePlay", Boolean.valueOf(aVar.f12796j));
                    a.this.f12789c.a();
                }
            }
        });
    }

    @Override // m3.c
    /* renamed from: F */
    public d o() {
        return this.f12790d;
    }

    public boolean G() {
        return this.f12799m;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public abstract /* synthetic */ void a();

    @Override // m3.c
    public void a(long j10) {
        this.f12792f = j10;
        long j11 = this.f12793g;
        if (j11 > j10) {
            j10 = j11;
        }
        this.f12793g = j10;
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
    }

    @Override // m3.c
    public abstract /* synthetic */ void a(Map<String, Object> map);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void a(b bVar, int i10);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void a(b bVar, int i10, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(b bVar, SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void a(b bVar, View view);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void a(b bVar, View view, boolean z10, boolean z11);

    @Override // m3.c
    public abstract /* synthetic */ void a(c.a aVar);

    @Override // m3.c
    public abstract /* synthetic */ void a(c.b bVar);

    @Override // m3.c
    public abstract /* synthetic */ void a(c.d dVar);

    @Override // m3.c
    public abstract /* synthetic */ void a(boolean z10, int i10);

    @Override // m3.c
    public abstract /* synthetic */ boolean a(l3.c cVar);

    @Override // m3.c
    public abstract /* synthetic */ void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Runnable runnable) {
        if (this.f12795i == null) {
            this.f12795i = new ArrayList();
        }
        this.f12795i.add(runnable);
    }

    @Override // m3.c
    public abstract /* synthetic */ void b(l3.c cVar);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void b(b bVar, int i10);

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void b(b bVar, View view);

    @Override // m3.c
    public void c(long j10) {
        this.f12803q = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void c(b bVar, View view);

    @Override // m3.c
    public abstract /* synthetic */ void d();

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public abstract /* synthetic */ void d(b bVar, View view);

    @Override // m3.c
    public abstract /* synthetic */ void d(boolean z10);

    @Override // m3.c
    public abstract /* synthetic */ void e();

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a, m3.a
    public abstract /* synthetic */ void e(b bVar, View view);

    @Override // m3.c
    public abstract /* synthetic */ void e(boolean z10);

    @Override // m3.c
    public abstract /* synthetic */ void f();

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void f(b bVar, View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(boolean z10) {
        this.f12802p = z10;
    }

    @Override // m3.c
    public long g() {
        return this.f12792f;
    }

    @Override // m3.c
    public long h() {
        if (n() == null) {
            return 0L;
        }
        return n().o();
    }

    @Override // m3.c
    public int i() {
        i3.a aVar = this.f12789c;
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    @Override // m3.c
    public long j() {
        i3.a aVar = this.f12789c;
        if (aVar == null) {
            return 0L;
        }
        return aVar.q();
    }

    @Override // m3.c
    public abstract /* synthetic */ long k();

    @Override // m3.c
    public abstract /* synthetic */ int l();

    @Override // m3.c
    public boolean m() {
        return this.f12801o;
    }

    @Override // m3.c
    public i3.a n() {
        return this.f12789c;
    }

    @Override // m3.c
    public boolean p() {
        return this.f12800n;
    }

    @Override // m3.c
    public boolean q() {
        return this.f12798l;
    }

    @Override // m3.c
    public abstract /* synthetic */ boolean r();

    @Override // m3.c
    public boolean s() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 14) {
            return false;
        }
        n nVar = this.f12791e;
        if (nVar == null || nVar.aD() != 1 || i10 >= 23) {
            if ((!m.e() || i10 < 30) && !o.a(this.f12791e)) {
                return h.d().q();
            }
            return true;
        }
        return true;
    }

    @Override // m3.c
    public void c(boolean z10) {
        this.f12798l = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f12790d.m() && this.f12796j) {
            runnable.run();
        } else {
            b(runnable);
        }
    }

    @Override // m3.c
    public void c() {
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(b bVar, SurfaceHolder surfaceHolder) {
        this.f12796j = false;
        this.f12787a = null;
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(b bVar, SurfaceHolder surfaceHolder) {
        this.f12796j = true;
        this.f12787a = surfaceHolder;
        i3.a aVar = this.f12789c;
        if (aVar == null) {
            return;
        }
        if (aVar != null) {
            aVar.a(surfaceHolder);
        }
        l.c("CSJ_VIDEO_Controller", "surfaceCreated: ");
        D();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void b(b bVar, SurfaceTexture surfaceTexture) {
        this.f12796j = false;
        l.c("CSJ_VIDEO_Controller", "surfaceTextureDestroyed: ");
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.b(false);
        }
        this.f12788b = null;
        D();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.a
    public void a(b bVar, SurfaceTexture surfaceTexture) {
        this.f12796j = true;
        this.f12788b = surfaceTexture;
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.a(surfaceTexture);
            this.f12789c.b(this.f12796j);
        }
        l.c("CSJ_VIDEO_Controller", "surfaceTextureCreated: ");
        D();
    }

    @Override // m3.c
    public void b(long j10) {
        this.f12805s = j10;
    }

    @Override // m3.c
    public void b(boolean z10) {
        this.f12800n = z10;
        i3.a aVar = this.f12789c;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    @Override // m3.c
    public void a(boolean z10) {
        this.f12799m = z10;
        d dVar = this.f12790d;
        if (dVar != null) {
            dVar.d(z10);
        }
    }
}
