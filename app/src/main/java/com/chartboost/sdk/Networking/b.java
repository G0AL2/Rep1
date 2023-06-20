package com.chartboost.sdk.Networking;

import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.o0;
import com.chartboost.sdk.impl.r0;
import com.chartboost.sdk.impl.u2;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f13739a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f13740b;

    /* renamed from: c  reason: collision with root package name */
    private final d f13741c;

    /* renamed from: d  reason: collision with root package name */
    private final r0 f13742d;

    /* renamed from: e  reason: collision with root package name */
    private final u2 f13743e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f13744f;

    public b(Executor executor, d dVar, r0 r0Var, u2 u2Var, Handler handler, Executor executor2) {
        this.f13739a = executor2;
        this.f13740b = executor;
        this.f13741c = dVar;
        this.f13742d = r0Var;
        this.f13743e = u2Var;
        this.f13744f = handler;
    }

    public <T> void a(o0<T> o0Var) {
        CBLogging.d("CBRequest", "Execute request: " + o0Var.f14230b);
        this.f13739a.execute(new c(this.f13740b, this.f13741c, this.f13742d, this.f13743e, this.f13744f, o0Var));
    }
}
