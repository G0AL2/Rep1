package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExpressAdLoadManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: j  reason: collision with root package name */
    private static Set<d> f12623j = Collections.synchronizedSet(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    private AdSlot f12624a;

    /* renamed from: c  reason: collision with root package name */
    private Context f12626c;

    /* renamed from: d  reason: collision with root package name */
    private TTAdNative.NativeExpressAdListener f12627d;

    /* renamed from: f  reason: collision with root package name */
    private List<com.bytedance.sdk.openadsdk.core.e.n> f12629f;

    /* renamed from: g  reason: collision with root package name */
    private List<com.bytedance.sdk.openadsdk.core.e.n> f12630g;

    /* renamed from: h  reason: collision with root package name */
    private a f12631h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f12628e = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private int f12632i = 5;

    /* renamed from: k  reason: collision with root package name */
    private ScheduledFuture<?> f12633k = null;

    /* renamed from: l  reason: collision with root package name */
    private ScheduledFuture<?> f12634l = null;

    /* renamed from: m  reason: collision with root package name */
    private ScheduledFuture<?> f12635m = null;

    /* renamed from: n  reason: collision with root package name */
    private long f12636n = 0;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.n f12625b = com.bytedance.sdk.openadsdk.core.m.f();

    /* compiled from: ExpressAdLoadManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(List<com.bytedance.sdk.openadsdk.core.e.n> list);
    }

    private d(Context context) {
        if (context != null) {
            this.f12626c = context.getApplicationContext();
        } else {
            this.f12626c = com.bytedance.sdk.openadsdk.core.m.a();
        }
        f12623j.add(this);
    }

    private void c(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.f12633k;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            boolean cancel = this.f12633k.cancel(z10);
            com.bytedance.sdk.component.utils.l.e("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=" + cancel);
        } catch (Throwable unused) {
        }
    }

    private void b(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.f12635m;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            boolean cancel = this.f12635m.cancel(z10);
            com.bytedance.sdk.component.utils.l.b("ExpressAdLoadManager", "CheckValidDoneFutureTask-->cancel.....success=" + cancel);
        } catch (Throwable unused) {
        }
    }

    private void b() {
        f12623j.remove(this);
    }

    public static d a(Context context) {
        return new d(context);
    }

    public void a(AdSlot adSlot, int i10, TTAdNative.NativeExpressAdListener nativeExpressAdListener, int i11) {
        a(adSlot, i10, nativeExpressAdListener, null, i11);
    }

    public void a(AdSlot adSlot, int i10, TTAdNative.NativeExpressAdListener nativeExpressAdListener, a aVar, int i11) {
        this.f12636n = System.currentTimeMillis();
        if (this.f12628e.get()) {
            com.bytedance.sdk.component.utils.l.e("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.f12632i = i10;
        this.f12628e.set(true);
        this.f12624a = adSlot;
        this.f12627d = nativeExpressAdListener;
        this.f12631h = aVar;
        a(adSlot, nativeExpressAdListener);
    }

    private void a(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.e.o oVar = new com.bytedance.sdk.openadsdk.core.e.o();
        oVar.f12204f = 2;
        this.f12625b.a(adSlot, oVar, this.f12632i, new n.a() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.d.1
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                d.this.a(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    d.this.f12629f = aVar.b();
                    d.this.f12630g = aVar.b();
                    d.this.a(adSlot);
                    d dVar = d.this;
                    dVar.a(dVar.f12636n);
                    return;
                }
                d.this.a(-3, com.bytedance.sdk.openadsdk.core.g.a(-3));
                bVar.a(-3);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f12629f;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.e.n nVar : list) {
            if (nVar.ao() && nVar.P() != null && !nVar.P().isEmpty()) {
                for (com.bytedance.sdk.openadsdk.core.e.k kVar : nVar.P()) {
                    if (!TextUtils.isEmpty(kVar.a())) {
                        com.bytedance.sdk.openadsdk.i.d.a().c().a(new com.bytedance.sdk.openadsdk.i.a(kVar.a(), kVar.g()), com.bytedance.sdk.openadsdk.i.a.a.b(), kVar.b(), kVar.c(), null);
                    }
                }
            }
            if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar) && nVar.J() != null && nVar.J().y() != null) {
                if (com.bytedance.sdk.openadsdk.core.m.h().b(String.valueOf(u.f(nVar))) && com.bytedance.sdk.openadsdk.core.m.h().G()) {
                    l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(nVar.aD()).a(), nVar);
                    a10.e("material_meta", nVar);
                    a10.e("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j10) {
        if (this.f12628e.getAndSet(false)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.f12630g == null || d.this.f12630g.size() <= 0) {
                        if (d.this.f12627d != null) {
                            d.this.f12627d.onError(108, com.bytedance.sdk.openadsdk.core.g.a(108));
                            d.this.a(108);
                        }
                        if (d.this.f12631h != null) {
                            d.this.f12631h.a();
                        }
                    } else {
                        if (d.this.f12627d != null) {
                            ArrayList arrayList = new ArrayList(d.this.f12630g.size());
                            for (com.bytedance.sdk.openadsdk.core.e.n nVar : d.this.f12630g) {
                                arrayList.add(d.this.a(nVar));
                            }
                            if (!arrayList.isEmpty()) {
                                if (!TextUtils.isEmpty(d.this.f12624a.getBidAdm())) {
                                    com.bytedance.sdk.openadsdk.b.e.a((com.bytedance.sdk.openadsdk.core.e.n) d.this.f12630g.get(0), u.b(d.this.f12632i), System.currentTimeMillis() - d.this.f12636n);
                                } else {
                                    com.bytedance.sdk.openadsdk.b.e.b(d.this.f12626c, (com.bytedance.sdk.openadsdk.core.e.n) d.this.f12630g.get(0), u.b(d.this.f12624a.getDurationSlotType()), j10);
                                }
                                d.this.f12627d.onNativeExpressAdLoad(arrayList);
                            } else {
                                d.this.f12627d.onError(103, com.bytedance.sdk.openadsdk.core.g.a(103));
                                d.this.a(103);
                            }
                        }
                        if (d.this.f12631h != null) {
                            d.this.f12631h.a(d.this.f12630g);
                        }
                    }
                    d.this.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f12629f;
        com.bytedance.sdk.openadsdk.h.a.b e10 = com.bytedance.sdk.openadsdk.h.a.b.b().a(this.f12632i).c(this.f12624a.getCodeId()).e((list == null || list.size() <= 0) ? "" : u.h(this.f12629f.get(0)));
        e10.b(i10).f(com.bytedance.sdk.openadsdk.core.g.a(i10));
        com.bytedance.sdk.openadsdk.h.b.a().b(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        if (this.f12628e.getAndSet(false)) {
            TTAdNative.NativeExpressAdListener nativeExpressAdListener = this.f12627d;
            if (nativeExpressAdListener != null) {
                nativeExpressAdListener.onError(i10, str);
            }
            a aVar = this.f12631h;
            if (aVar != null) {
                aVar.a();
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TTNativeExpressAd a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (this.f12632i != 1) {
            return null;
        }
        if (nVar.J() != null) {
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.b(this.f12626c, nVar, this.f12624a);
        }
        return new com.bytedance.sdk.openadsdk.core.bannerexpress.a(this.f12626c, nVar, this.f12624a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.f12629f;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.e.n> list2 = this.f12630g;
        if (list2 != null) {
            list2.clear();
        }
        a(true);
        b(true);
        c(true);
        b();
    }

    private void a(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.f12634l;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            boolean cancel = this.f12634l.cancel(z10);
            com.bytedance.sdk.component.utils.l.e("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=" + cancel);
        } catch (Throwable unused) {
        }
    }
}
