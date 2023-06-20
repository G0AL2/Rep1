package com.chartboost.sdk;

import android.app.Activity;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.b;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.f2;
import com.chartboost.sdk.impl.j1;
import com.chartboost.sdk.impl.j3;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.o1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    final m f13792a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f13793b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f13794c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f13795d;

    /* renamed from: e  reason: collision with root package name */
    f2 f13796e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f13797f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.chartboost.sdk.Model.c f13798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f13799b;

        a(com.chartboost.sdk.Model.c cVar, Activity activity) {
            this.f13798a = cVar;
            this.f13799b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.chartboost.sdk.Model.c cVar = this.f13798a;
            cVar.f13685b = 4;
            Integer a10 = m.a(cVar.f13699p.f13675p);
            int intValue = a10 != null ? a10.intValue() : 6;
            b bVar = this.f13798a.f13691h;
            Objects.requireNonNull(bVar);
            b.a aVar = new b.a(13);
            com.chartboost.sdk.Model.c cVar2 = this.f13798a;
            aVar.f13790c = cVar2;
            aVar.f13789b = this.f13799b;
            c.this.f13792a.a(intValue, cVar2, aVar);
        }
    }

    public c(m mVar, j1 j1Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, Handler handler) {
        this.f13792a = mVar;
        this.f13793b = j1Var;
        this.f13794c = atomicReference;
        this.f13795d = handler;
    }

    private void c(com.chartboost.sdk.Model.c cVar) {
        int i10;
        f2 f2Var = this.f13796e;
        if (f2Var != null && f2Var.c() != cVar) {
            m1.d(new com.chartboost.sdk.Tracking.a("show_ad_already_visible_error", "", cVar.e().a(), cVar.g()));
            CBLogging.b("CBViewController", "Impression already visible");
            cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
            return;
        }
        boolean z10 = cVar.f13685b != 2;
        cVar.f13685b = 2;
        Activity e10 = cVar.f13691h.e();
        CBError.CBImpressionError cBImpressionError = e10 == null ? CBError.CBImpressionError.NO_HOST_ACTIVITY : null;
        if (cBImpressionError == null) {
            cBImpressionError = cVar.a((RelativeLayout) null);
        }
        if (cBImpressionError != null) {
            CBLogging.b("CBViewController", "Unable to create the view while trying th display the impression");
            cVar.a(cBImpressionError);
            return;
        }
        if (this.f13796e == null) {
            f2 f2Var2 = (f2) o1.a().a(new f2(e10, cVar));
            this.f13796e = f2Var2;
            e10.addContentView(f2Var2, new FrameLayout.LayoutParams(-1, -1));
        }
        CBUtility.a(e10, this.f13794c.get());
        if (this.f13797f == -1 && ((i10 = cVar.f13684a) == 1 || i10 == 2)) {
            this.f13797f = e10.getWindow().getDecorView().getSystemUiVisibility();
            Chartboost.setActivityAttrs(e10);
        }
        this.f13796e.e();
        CBLogging.c("CBViewController", "Displaying the impression");
        cVar.f13706w = this.f13796e;
        if (z10) {
            Integer a10 = m.a(cVar.f13699p.f13675p);
            int intValue = a10 != null ? a10.intValue() : 6;
            cVar.n();
            b bVar = cVar.f13691h;
            Objects.requireNonNull(bVar);
            b.a aVar = new b.a(12);
            aVar.f13790c = cVar;
            this.f13792a.a(intValue, cVar, aVar, this);
            this.f13793b.a();
        }
    }

    public void a(com.chartboost.sdk.Model.c cVar) {
        CBLogging.c("CBViewController", "Dismissing impression");
        a aVar = new a(cVar, cVar.f13691h.e());
        if (cVar.A) {
            cVar.a(aVar);
        } else {
            aVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(com.chartboost.sdk.Model.c cVar) {
        if (cVar.f13685b != 0) {
            c(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(com.chartboost.sdk.Model.c cVar) {
        RelativeLayout f10 = cVar.f();
        CBError.CBImpressionError a10 = cVar.a(f10);
        j3 j10 = cVar.j();
        if (f10 == null || j10 == null) {
            cVar.a(CBError.CBImpressionError.ERROR_DISPLAYING_VIEW);
        } else if (a10 != null) {
            cVar.a(a10);
        } else {
            cVar.f13685b = 2;
            f10.addView(j10);
            this.f13793b.a();
        }
    }

    public void e(com.chartboost.sdk.Model.c cVar) {
        CBLogging.c("CBViewController", "Removing impression");
        cVar.f13685b = 5;
        cVar.b();
        this.f13796e = null;
        this.f13793b.c();
        com.chartboost.sdk.Model.a aVar = cVar.f13699p;
        String str = aVar != null ? aVar.f13666g : null;
        Handler handler = this.f13795d;
        com.chartboost.sdk.impl.c cVar2 = cVar.f13686c;
        Objects.requireNonNull(cVar2);
        handler.post(new c.a(3, cVar.f13695l, null, null, true, str));
        if (cVar.G()) {
            Handler handler2 = this.f13795d;
            com.chartboost.sdk.impl.c cVar3 = cVar.f13686c;
            Objects.requireNonNull(cVar3);
            handler2.post(new c.a(2, cVar.f13695l, null, null, true, str));
        }
        a(cVar.f13691h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.chartboost.sdk.Model.c cVar, Activity activity) {
        b bVar = cVar.f13691h;
        Objects.requireNonNull(bVar);
        b.a aVar = new b.a(14);
        aVar.f13790c = cVar;
        this.f13795d.post(aVar);
        cVar.s();
        CBUtility.b(activity, this.f13794c.get());
        if (this.f13797f != -1) {
            int i10 = cVar.f13684a;
            if (i10 == 1 || i10 == 2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(this.f13797f);
                this.f13797f = -1;
            }
        }
    }

    void a(b bVar) {
        CBLogging.c("CBViewController", "Attempting to close impression activity");
        Activity e10 = bVar.e();
        if (e10 == null || !(e10 instanceof CBImpressionActivity)) {
            return;
        }
        CBLogging.c("CBViewController", "Closing impression activity");
        bVar.a();
        e10.finish();
    }

    public f2 a() {
        return this.f13796e;
    }
}
