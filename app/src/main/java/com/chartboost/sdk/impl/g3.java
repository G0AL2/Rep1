package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Handler;
import android.view.SurfaceView;
import com.chartboost.sdk.Libraries.CBLogging;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class g3 extends com.chartboost.sdk.d implements j {
    private final h3 V;
    private final String W;
    private int X;
    private long Y;
    private long Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f14027a0;

    /* renamed from: b0  reason: collision with root package name */
    private SurfaceView f14028b0;

    /* renamed from: c0  reason: collision with root package name */
    private c3 f14029c0;

    /* renamed from: d0  reason: collision with root package name */
    private e3 f14030d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(Context context, com.chartboost.sdk.Model.c cVar, Handler handler, com.chartboost.sdk.b bVar, com.chartboost.sdk.c cVar2, p1 p1Var, u0 u0Var, h3 h3Var, String str) {
        super(context, cVar, handler, bVar, p1Var, cVar2, h3Var.c(), u0Var);
        qe.k.f(context, "context");
        qe.k.f(cVar, "impression");
        qe.k.f(handler, "uiHandler");
        qe.k.f(bVar, "uiManager");
        qe.k.f(cVar2, "viewController");
        qe.k.f(p1Var, "fileCache");
        qe.k.f(u0Var, "templateProxy");
        qe.k.f(h3Var, "videoRepository");
        qe.k.f(str, "videoFilename");
        this.V = h3Var;
        this.W = str;
        this.f14028b0 = new SurfaceView(context);
    }

    private final void M() {
        e3 e3Var = this.f14030d0;
        if (e3Var != null) {
            e3Var.a();
        }
        c3 c3Var = this.f14029c0;
        if (c3Var != null) {
            c3Var.c();
        }
        this.f14030d0 = null;
        this.f14029c0 = null;
    }

    private final y0 O() {
        c3 c3Var = this.f14029c0;
        if (c3Var == null) {
            return null;
        }
        return c3Var.f14097b;
    }

    private final void Q() {
        this.S.c(O());
    }

    private final void R() {
        this.S.b(O(), this.X / 1000.0f);
    }

    @Override // com.chartboost.sdk.d
    public void B() {
        CBLogging.c("VideoProtocol", "Video onBackground");
        e3 e3Var = this.f14030d0;
        if (e3Var != null) {
            e3Var.c();
        }
        super.B();
    }

    @Override // com.chartboost.sdk.d
    public void C() {
        CBLogging.c("VideoProtocol", "Video onForeground");
        this.V.a((String) null, 1, false);
        e3 e3Var = this.f14030d0;
        if (e3Var != null) {
            e3Var.a(true);
        }
        super.C();
    }

    public final void L() {
        M();
    }

    public final int N() {
        b3 c10 = this.V.c(this.W);
        if (c10 == null) {
            return 0;
        }
        return this.V.d(c10);
    }

    public final void P() {
        e3 e3Var = this.f14030d0;
        if (e3Var == null) {
            return;
        }
        e3Var.b();
    }

    public final void S() {
        e3 e3Var = this.f14030d0;
        if (e3Var == null) {
            return;
        }
        e3Var.c();
    }

    public final void T() {
        this.Y = System.currentTimeMillis();
        e3 e3Var = this.f14030d0;
        if (e3Var == null) {
            return;
        }
        e3Var.a(false);
    }

    public final void U() {
        e3 e3Var = this.f14030d0;
        if (e3Var == null) {
            return;
        }
        e3Var.d();
    }

    @Override // com.chartboost.sdk.d
    public j3 a(Context context, e3 e3Var) {
        RandomAccessFile a10;
        e3 e3Var2;
        qe.k.f(context, "context");
        b3 c10 = this.V.c(this.W);
        try {
            String str = this.f13806f;
            h1 h1Var = this.T;
            qe.k.e(h1Var, "customWebViewInterface");
            k3 k3Var = this.U;
            qe.k.e(k3Var, "viewBaseInterface");
            Handler handler = this.f13801a;
            qe.k.e(handler, "uiHandler");
            this.f14029c0 = new c3(context, str, h1Var, k3Var, this, handler, this.f13807g, this.f14028b0, null, 256, null);
        } catch (Exception e10) {
            c(qe.k.l("Can't instantiate VideoBase: ", e10));
        }
        SurfaceView surfaceView = this.f14028b0;
        Handler handler2 = this.f13801a;
        qe.k.e(handler2, "uiHandler");
        i iVar = new i(null, surfaceView, this, handler2, 1, null);
        this.f14030d0 = e3Var;
        if (e3Var == null) {
            this.f14030d0 = new e3(iVar);
        }
        if (c10 != null && (a10 = this.V.a(this.W)) != null && (e3Var2 = this.f14030d0) != null) {
            e3Var2.a(a10, c10.c());
        }
        return this.f14029c0;
    }

    @Override // com.chartboost.sdk.impl.j
    public void b(int i10) {
        CBLogging.c("VideoProtocol", "onVideoDisplayPrepared ready to receive signal from template");
        this.f14027a0 = N();
        this.X = i10;
        A();
    }

    @Override // com.chartboost.sdk.d
    public void g() {
        M();
        super.g();
    }

    @Override // com.chartboost.sdk.d
    public void z() {
        c3 c3Var = this.f14029c0;
        int width = c3Var == null ? 0 : c3Var.getWidth();
        c3 c3Var2 = this.f14029c0;
        int height = c3Var2 != null ? c3Var2.getHeight() : 0;
        e3 e3Var = this.f14030d0;
        if (e3Var == null) {
            return;
        }
        e3Var.a(width, height);
    }

    @Override // com.chartboost.sdk.impl.j
    public void b() {
        CBLogging.c("VideoProtocol", "onVideoDisplayCompleted");
        a(true);
        Q();
    }

    @Override // com.chartboost.sdk.impl.j
    public void a() {
        R();
        this.Z = System.currentTimeMillis();
    }

    @Override // com.chartboost.sdk.impl.j
    public void a(int i10) {
        float f10 = i10 / 1000.0f;
        if (m2.f14204a) {
            CBLogging.c("VideoProtocol", "onVideoDisplayProgress: " + f10 + '.');
        }
        this.S.a(O(), f10);
    }

    @Override // com.chartboost.sdk.impl.j
    public void a(String str) {
        qe.k.f(str, "error");
        a(false);
        u0 u0Var = this.S;
        if (u0Var != null) {
            u0Var.d(O());
        }
        M();
        b(str);
    }

    private final void a(boolean z10) {
        com.chartboost.sdk.Tracking.d bVar;
        long currentTimeMillis;
        long j10;
        String str;
        c cVar;
        com.chartboost.sdk.Model.c cVar2 = this.C;
        String str2 = "";
        String str3 = (cVar2 == null || (cVar = cVar2.f13686c) == null || (str3 = cVar.f13935b) == null) ? "" : "";
        if (cVar2 != null && (str = cVar2.f13695l) != null) {
            str2 = str;
        }
        String valueOf = String.valueOf(this.f14027a0);
        if (z10) {
            bVar = new com.chartboost.sdk.Tracking.c("video_finish_success", valueOf, str3, str2);
            bVar.a((float) (this.Z - this.Y));
        } else {
            bVar = new com.chartboost.sdk.Tracking.b("video_finish_failure", valueOf, str3, str2);
            if (this.Z == 0) {
                currentTimeMillis = this.Y;
                j10 = System.currentTimeMillis();
            } else {
                currentTimeMillis = System.currentTimeMillis();
                j10 = this.Z;
            }
            bVar.a((float) (currentTimeMillis - j10));
        }
        m1.d(bVar);
    }
}
