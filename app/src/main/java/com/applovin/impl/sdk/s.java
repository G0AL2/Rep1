package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final m f8785a;

    /* renamed from: c  reason: collision with root package name */
    private long f8787c;

    /* renamed from: f  reason: collision with root package name */
    private long f8790f;

    /* renamed from: g  reason: collision with root package name */
    private Object f8791g;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8786b = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final Object f8788d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8789e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(m mVar) {
        this.f8785a = mVar;
    }

    public void a(final Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f8786b.compareAndSet(false, true)) {
            this.f8791g = obj;
            this.f8787c = System.currentTimeMillis();
            if (v.a()) {
                v A = this.f8785a.A();
                A.b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f8787c);
            }
            this.f8785a.aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f8785a.a(com.applovin.impl.sdk.c.b.cg)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (s.this.f8786b.get() && System.currentTimeMillis() - s.this.f8787c >= longValue) {
                            if (v.a()) {
                                s.this.f8785a.A().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            s.this.b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    public void a(boolean z10) {
        synchronized (this.f8788d) {
            this.f8789e.set(z10);
            if (z10) {
                this.f8790f = System.currentTimeMillis();
                if (v.a()) {
                    v A = this.f8785a.A();
                    A.b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f8790f);
                }
                final long longValue = ((Long) this.f8785a.a(com.applovin.impl.sdk.c.b.f8210cf)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.s.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (s.this.a() && System.currentTimeMillis() - s.this.f8790f >= longValue) {
                                if (v.a()) {
                                    s.this.f8785a.A().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                s.this.f8789e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f8790f = 0L;
                if (v.a()) {
                    v A2 = this.f8785a.A();
                    A2.b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public boolean a() {
        return this.f8789e.get();
    }

    public void b(Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f8786b.compareAndSet(true, false)) {
            this.f8791g = null;
            if (v.a()) {
                v A = this.f8785a.A();
                A.b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            this.f8785a.aj().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public boolean b() {
        return this.f8786b.get();
    }

    public Object c() {
        return this.f8791g;
    }
}
