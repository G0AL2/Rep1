package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewRenderInterceptor.java */
/* loaded from: classes.dex */
public class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f9444a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.d.a f9445b;

    /* renamed from: c  reason: collision with root package name */
    private g f9446c;

    /* renamed from: d  reason: collision with root package name */
    private l f9447d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture<?> f9448e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f9449f = new AtomicBoolean(false);

    /* compiled from: WebViewRenderInterceptor.java */
    /* loaded from: classes.dex */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        i.a f9452a;

        /* renamed from: c  reason: collision with root package name */
        private int f9454c;

        public a(int i10, i.a aVar) {
            this.f9454c = i10;
            this.f9452a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9454c == 1) {
                com.bytedance.sdk.component.utils.l.b("RenderInterceptor", "WebView Render timeout");
                o.this.f9445b.a(true);
                o.this.a(this.f9452a, 107);
            }
        }
    }

    public o(Context context, l lVar, com.bytedance.sdk.component.adexpress.d.a aVar, g gVar) {
        this.f9444a = context;
        this.f9447d = lVar;
        this.f9446c = gVar;
        this.f9445b = aVar;
        aVar.a(this.f9446c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f9448e;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f9448e.cancel(false);
                this.f9448e = null;
            }
            com.bytedance.sdk.component.utils.l.b("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void c() {
        this.f9445b.i();
    }

    public com.bytedance.sdk.component.adexpress.d.a d() {
        return this.f9445b;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void b() {
        this.f9445b.h();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public boolean a(final i.a aVar) {
        int d10 = this.f9447d.d();
        if (d10 < 0) {
            a(aVar, 107);
        } else {
            this.f9448e = com.bytedance.sdk.component.f.e.d().schedule(new a(1, aVar), d10, TimeUnit.MILLISECONDS);
            this.f9445b.a(new f() { // from class: com.bytedance.sdk.component.adexpress.b.o.1
                @Override // com.bytedance.sdk.component.adexpress.b.f
                public void a(View view, m mVar) {
                    n b10;
                    o.this.e();
                    if (aVar.c() || (b10 = aVar.b()) == null) {
                        return;
                    }
                    b10.a(o.this.f9445b, mVar);
                    aVar.a(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.b.f
                public void a(int i10) {
                    o.this.a(aVar, i10);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void a() {
        this.f9445b.d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i.a aVar, int i10) {
        if (aVar.c() || this.f9449f.get()) {
            return;
        }
        e();
        this.f9447d.c().a(i10);
        if (aVar.b(this)) {
            aVar.a(this);
        } else {
            n b10 = aVar.b();
            if (b10 == null) {
                return;
            }
            b10.a_(i10);
        }
        this.f9449f.getAndSet(true);
    }
}
