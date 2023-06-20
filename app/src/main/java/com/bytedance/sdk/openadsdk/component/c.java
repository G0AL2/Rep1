package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.a;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.r;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTAppOpenAdLoadManager.java */
/* loaded from: classes.dex */
public class c implements x.a {

    /* renamed from: b  reason: collision with root package name */
    private AdSlot f11365b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11366c;

    /* renamed from: d  reason: collision with root package name */
    private final n<com.bytedance.sdk.openadsdk.b.a> f11367d;

    /* renamed from: e  reason: collision with root package name */
    private TTAdNative.AppOpenAdListener f11368e;

    /* renamed from: f  reason: collision with root package name */
    private x f11369f;

    /* renamed from: g  reason: collision with root package name */
    private a f11370g;

    /* renamed from: h  reason: collision with root package name */
    private int f11371h;

    /* renamed from: k  reason: collision with root package name */
    private r f11374k;

    /* renamed from: a  reason: collision with root package name */
    private int f11364a = 0;

    /* renamed from: i  reason: collision with root package name */
    private volatile int f11372i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f11373j = new AtomicBoolean(false);

    public c(Context context) {
        if (context != null) {
            this.f11366c = context.getApplicationContext();
        } else {
            this.f11366c = m.a();
        }
        this.f11367d = m.f();
        this.f11370g = a.a(this.f11366c);
    }

    private void c(AdSlot adSlot) {
        e.a(new g("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f11370g.e(c.this.f11364a)) {
                    if (c.this.f11370g.b(c.this.f11364a) || c.this.f11370g.d(c.this.f11364a)) {
                        com.bytedance.sdk.openadsdk.core.e.n f10 = c.this.f11370g.f(c.this.f11364a);
                        c.this.f11370g.g(c.this.f11364a);
                        if (f10 == null) {
                            l.b("TTAppOpenAdLoadManager", "Cached material resolution failed");
                            return;
                        }
                        l.b("TTAppOpenAdLoadManager", "Cached material resolution success");
                        if (!com.bytedance.sdk.openadsdk.core.e.n.c(f10)) {
                            if (c.this.f11370g.b(f10)) {
                                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(1, 101, f10));
                                return;
                            }
                            l.b("TTAppOpenAdLoadManager", "Image cache path not found");
                            com.bytedance.sdk.openadsdk.component.c.a.b(f10);
                            return;
                        } else if (!TextUtils.isEmpty(c.this.f11370g.a(f10)) || Build.VERSION.SDK_INT < 23) {
                            c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(1, 101, f10));
                            return;
                        } else {
                            l.b("TTAppOpenAdLoadManager", "Video cache path not found");
                            com.bytedance.sdk.openadsdk.component.c.a.b(f10);
                            return;
                        }
                    }
                    c.this.f11370g.g(c.this.f11364a);
                }
            }
        }, 10);
    }

    private void b(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = new r();
        this.f11374k = rVar;
        rVar.a(currentTimeMillis);
        this.f11372i = 1;
        o oVar = new o();
        oVar.f12205g = currentTimeMillis;
        oVar.f12207i = this.f11374k;
        oVar.f12202d = 1;
        this.f11367d.a(adSlot, oVar, 3, new n.a() { // from class: com.bytedance.sdk.openadsdk.component.c.1
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                c.this.f11372i = 3;
                l.b("TTAppOpenAdLoadManager", "try load app open ad from network fail");
                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                c.this.f11372i = 2;
                l.b("TTAppOpenAdLoadManager", "try load app open ad from network success");
                if (aVar == null || aVar.b() == null || aVar.b().size() == 0) {
                    c.this.f11372i = 3;
                    c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(2, 100, 20001, com.bytedance.sdk.openadsdk.core.g.a(20001)));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                if (!com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                    c.this.a(nVar);
                } else {
                    c.this.a(nVar, adSlot);
                }
            }
        });
    }

    public static c a(Context context) {
        return new c(context);
    }

    public void a(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i10) {
        if (appOpenAdListener == null) {
            return;
        }
        if (i10 <= 0) {
            l.b("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
            i10 = IronSourceConstants.BN_AUCTION_REQUEST;
        }
        this.f11365b = adSlot;
        this.f11368e = appOpenAdListener;
        this.f11364a = a(adSlot);
        this.f11371h = i10;
        x xVar = new x(k.c().getLooper(), this);
        this.f11369f = xVar;
        xVar.sendEmptyMessageDelayed(1, i10);
        b(this.f11365b);
        c(this.f11365b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
        this.f11370g.a(nVar, adSlot, this.f11374k, new a.c() { // from class: com.bytedance.sdk.openadsdk.component.c.3
            @Override // com.bytedance.sdk.openadsdk.component.a.c
            public void a() {
                c.this.f11372i = 4;
                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(1, 100, nVar));
            }

            @Override // com.bytedance.sdk.openadsdk.component.a.c
            public void a(int i10, String str) {
                c.this.f11372i = 5;
                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(2, 100, 10003, com.bytedance.sdk.openadsdk.core.g.a(10003)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f11370g.a(nVar, this.f11374k, new a.b() { // from class: com.bytedance.sdk.openadsdk.component.c.4
            @Override // com.bytedance.sdk.openadsdk.component.a.b
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                c.this.f11372i = 4;
                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(1, 100, nVar));
            }

            @Override // com.bytedance.sdk.openadsdk.component.a.b
            public void a() {
                c.this.f11372i = 5;
                c.this.a(new com.bytedance.sdk.openadsdk.component.d.b(2, 100, 10003, com.bytedance.sdk.openadsdk.core.g.a(10003)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.bytedance.sdk.openadsdk.component.d.b bVar) {
        int a10 = bVar.a();
        int b10 = bVar.b();
        if (this.f11373j.get()) {
            if (a10 == 1 && b10 == 100) {
                a.a(m.a()).a(new com.bytedance.sdk.openadsdk.component.d.a(this.f11364a, bVar.c()));
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), 1, this.f11374k);
            }
        } else if (a10 != 1) {
            if (a10 == 2 || a10 == 3) {
                TTAdNative.AppOpenAdListener appOpenAdListener = this.f11368e;
                if (appOpenAdListener != null) {
                    appOpenAdListener.onError(bVar.d(), bVar.e());
                }
                this.f11373j.set(true);
                if (a10 == 3) {
                    com.bytedance.sdk.openadsdk.component.c.a.a(this.f11372i, this.f11371h);
                }
            }
        } else {
            b bVar2 = new b(this.f11366c, bVar.c(), b10 == 101);
            TTAdNative.AppOpenAdListener appOpenAdListener2 = this.f11368e;
            if (appOpenAdListener2 != null) {
                appOpenAdListener2.onAppOpenAdLoaded(bVar2);
            }
            this.f11373j.set(true);
            if (b10 == 101) {
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), System.currentTimeMillis() - this.f11374k.a());
            } else if (b10 == 100) {
                com.bytedance.sdk.openadsdk.component.c.a.a(bVar.c(), 0, this.f11374k);
                this.f11370g.a(this.f11365b);
            }
        }
    }

    public int a(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            a(new com.bytedance.sdk.openadsdk.component.d.b(2, 102, 40006, com.bytedance.sdk.openadsdk.core.g.a(40006)));
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what != 1 || this.f11373j.get()) {
            return;
        }
        a(new com.bytedance.sdk.openadsdk.component.d.b(3, 102, 10002, com.bytedance.sdk.openadsdk.core.g.a(10002)));
    }
}
