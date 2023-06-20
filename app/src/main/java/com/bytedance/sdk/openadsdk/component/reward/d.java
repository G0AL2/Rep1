package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.b;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.video.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FullScreenVideoLoadManager.java */
/* loaded from: classes.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f11568a;

    /* renamed from: b  reason: collision with root package name */
    private Context f11569b;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.f.g f11573f;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f11571d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private List<a> f11572e = Collections.synchronizedList(new ArrayList());

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f11574g = new BroadcastReceiver() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (d.this.f11573f == null) {
                    d dVar = d.this;
                    dVar.f11573f = new com.bytedance.sdk.openadsdk.component.reward.a("fsv net connect task", dVar.f11572e);
                }
                com.bytedance.sdk.component.utils.h.a().post(d.this.f11573f);
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private final n f11570c = m.f();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FullScreenVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class a extends com.bytedance.sdk.component.f.g {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.e.n f11601a;

        /* renamed from: b  reason: collision with root package name */
        AdSlot f11602b;

        a(com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.f11601a = nVar;
            this.f11602b = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f11601a;
            if (nVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (nVar.J() != null) {
                    l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(this.f11601a.aD()).b(), this.f11601a);
                    a10.e("material_meta", this.f11601a);
                    a10.e("ad_slot", this.f11602b);
                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                    com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.a.1
                        @Override // n3.a.InterfaceC0454a
                        public void a(l3.c cVar, int i10) {
                            b a11 = b.a(m.a());
                            a aVar = a.this;
                            a11.a(aVar.f11602b, aVar.f11601a);
                            com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        }

                        @Override // n3.a.InterfaceC0454a
                        public void a(l3.c cVar, int i10, String str) {
                            com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail with net change ");
                        }
                    });
                    return;
                }
                return;
            }
            b.a(m.a()).a(this.f11601a, new b.a<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.a.2
                @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
                public void a(boolean z10, Object obj) {
                    if (z10) {
                        b a11 = b.a(m.a());
                        a aVar = a.this;
                        a11.a(aVar.f11602b, aVar.f11601a);
                        com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        return;
                    }
                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail ");
                }
            });
        }
    }

    private d(Context context) {
        this.f11569b = context == null ? m.a() : context.getApplicationContext();
        c();
    }

    private void d() {
        if (this.f11571d.get()) {
            this.f11571d.set(false);
            try {
                this.f11569b.unregisterReceiver(this.f11574g);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f11573f != null) {
            try {
                com.bytedance.sdk.component.utils.h.a().removeCallbacks(this.f11573f);
            } catch (Exception unused) {
            }
            this.f11573f = null;
        }
        d();
    }

    private void c() {
        if (this.f11571d.get()) {
            return;
        }
        this.f11571d.set(true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f11569b.registerReceiver(this.f11574g, intentFilter);
        } catch (Exception unused) {
        }
    }

    public void b() {
        AdSlot b10 = b.a(this.f11569b).b();
        if (b10 == null || TextUtils.isEmpty(b10.getCodeId()) || b.a(this.f11569b).c(b10.getCodeId()) != null) {
            return;
        }
        b(b10);
    }

    public static d a(Context context) {
        if (f11568a == null) {
            synchronized (d.class) {
                if (f11568a == null) {
                    f11568a = new d(context);
                }
            }
        }
        return f11568a;
    }

    public void b(AdSlot adSlot) {
        if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.component.utils.l.b("bidding", "preload not request bidding ：BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
            return;
        }
        com.bytedance.sdk.component.utils.l.b("FullScreenVideoLoadManager", "preload full screen video: " + String.valueOf(adSlot));
        a(adSlot, true, null);
    }

    public void a() {
        try {
            b.a(this.f11569b).a();
        } catch (Throwable unused) {
        }
    }

    public AdSlot b(String str) {
        return b.a(this.f11569b).b(str);
    }

    public void a(AdSlot adSlot) {
        b.a(this.f11569b).b(adSlot);
    }

    public void a(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        com.bytedance.sdk.component.utils.l.b("FullScreenVideoLoadManager", "load full screen video: " + String.valueOf(adSlot));
        com.bytedance.sdk.component.utils.l.b("bidding", "load full video: BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
        b.a(this.f11569b).a(adSlot);
        a(adSlot, false, fullScreenVideoAdListener);
    }

    private void a(final AdSlot adSlot, boolean z10, final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (z10) {
            a(adSlot, true, fullScreenVideoAdListener, currentTimeMillis);
            return;
        }
        final com.bytedance.sdk.openadsdk.core.e.n c10 = b.a(this.f11569b).c(adSlot.getCodeId());
        if (c10 != null) {
            k kVar = new k(this.f11569b, c10, adSlot);
            if (!p.i(c10)) {
                kVar.a(b.a(this.f11569b).a(c10));
            }
            com.bytedance.sdk.openadsdk.b.e.a(c10);
            if (fullScreenVideoAdListener != null) {
                fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                if (!p.i(c10)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final l3.b J = c10.J();
                        l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(c10.aD()).b(), c10);
                        a10.e("material_meta", c10);
                        a10.e("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.1
                            @Override // n3.a.InterfaceC0454a
                            public void a(l3.c cVar, int i10) {
                                if (fullScreenVideoAdListener != null) {
                                    com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                                    fullScreenVideoAdListener.onFullScreenVideoCached();
                                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onFullScreenVideoCached");
                                }
                            }

                            @Override // n3.a.InterfaceC0454a
                            public void a(l3.c cVar, int i10, String str) {
                                com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail");
                                if (fullScreenVideoAdListener == null || !J.J()) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                                fullScreenVideoAdListener.onFullScreenVideoCached();
                                com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail and exec onFullScreenVideoCached");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.b.e.b(this.f11569b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.video.b.a.a().a(c10, new a.InterfaceC0175a() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.2
                @Override // com.bytedance.sdk.openadsdk.core.video.b.a.InterfaceC0175a
                public void a(boolean z11) {
                    if (fullScreenVideoAdListener == null || !p.i(c10)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                    fullScreenVideoAdListener.onFullScreenVideoCached();
                }
            });
            com.bytedance.sdk.component.utils.l.b("FullScreenVideoLoadManager", "get cache data success");
            com.bytedance.sdk.component.utils.l.b("bidding", "full video get cache data success");
            return;
        }
        a(adSlot, false, fullScreenVideoAdListener, currentTimeMillis);
    }

    private void a(final AdSlot adSlot, final boolean z10, final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener, final long j10) {
        com.bytedance.sdk.component.utils.l.b("bidding", "full video doNetwork , get new materials:BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        o oVar = new o();
        oVar.f12201c = z10 ? 2 : 1;
        if (m.h().h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f12204f = 2;
        }
        this.f11570c.a(adSlot, oVar, 8, new n.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.3
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2;
                if (z10 || (fullScreenVideoAdListener2 = fullScreenVideoAdListener) == null) {
                    return;
                }
                fullScreenVideoAdListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2;
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    com.bytedance.sdk.component.utils.l.b("FullScreenVideoLoadManager", "get material data success isPreload=" + z10);
                    final com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                    try {
                        if (nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
                            com.bytedance.sdk.openadsdk.i.b bVar2 = new com.bytedance.sdk.openadsdk.i.b(true);
                            bVar2.a(adSlot.getCodeId());
                            bVar2.a(8);
                            bVar2.c(nVar.Y());
                            bVar2.d(nVar.ac());
                            bVar2.b(u.h(nVar));
                            com.bytedance.sdk.openadsdk.d.a.a(nVar.M()).a(bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final k kVar = new k(d.this.f11569b, nVar, adSlot);
                    if (!z10 && fullScreenVideoAdListener != null) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.b.e.a(nVar, "fullscreen_interstitial_ad", System.currentTimeMillis() - currentTimeMillis);
                        }
                        fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                    }
                    com.bytedance.sdk.openadsdk.core.video.b.a.a().a(nVar, new a.InterfaceC0175a() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.3.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.b.a.InterfaceC0175a
                        public void a(boolean z11) {
                            com.bytedance.sdk.openadsdk.core.e.n nVar2;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (z10 || fullScreenVideoAdListener == null || (nVar2 = nVar) == null || !p.i(nVar2)) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                            fullScreenVideoAdListener.onFullScreenVideoCached();
                        }
                    });
                    if (z10 && !p.i(nVar) && m.h().n(adSlot.getCodeId()).f12314d == 1 && !com.bytedance.sdk.component.utils.o.d(d.this.f11569b)) {
                        d.this.a(new a(nVar, adSlot));
                    } else if (p.i(nVar)) {
                        b.a(d.this.f11569b).a(adSlot, nVar);
                    } else if (Build.VERSION.SDK_INT < 23) {
                        b.a(d.this.f11569b).a(nVar, new b.a<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.3.3
                            @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
                            public void a(boolean z11, Object obj) {
                                com.bytedance.sdk.component.utils.l.b("FullScreenVideoLoadManager", "download video file: " + z11 + ", preload: " + z10);
                                if (z11) {
                                    kVar.a(b.a(d.this.f11569b).a(nVar));
                                }
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                if (z10) {
                                    if (z11) {
                                        b.a(d.this.f11569b).a(adSlot, nVar);
                                        return;
                                    }
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.b.e.a(nVar);
                                if (z11) {
                                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                    if (fullScreenVideoAdListener != null) {
                                        com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                        fullScreenVideoAdListener.onFullScreenVideoCached();
                                    }
                                }
                            }
                        });
                    } else {
                        final l3.b J = nVar.J();
                        if (J != null) {
                            l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(nVar.aD()).b(), nVar);
                            a10.e("material_meta", nVar);
                            a10.e("ad_slot", adSlot);
                            SystemClock.elapsedRealtime();
                            com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                            com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.d.3.2
                                @Override // n3.a.InterfaceC0454a
                                public void a(l3.c cVar, int i10) {
                                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadSuccess");
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    if (z10) {
                                        b.a(d.this.f11569b).a(adSlot, nVar);
                                        com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog:  ad json save");
                                        return;
                                    }
                                    if (fullScreenVideoAdListener != null) {
                                        com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                        fullScreenVideoAdListener.onFullScreenVideoCached();
                                    }
                                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog: onFullScreenVideoCached");
                                }

                                @Override // n3.a.InterfaceC0454a
                                public void a(l3.c cVar, int i10, String str) {
                                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail");
                                    if (fullScreenVideoAdListener == null || !J.J()) {
                                        return;
                                    }
                                    com.bytedance.sdk.openadsdk.b.e.b(d.this.f11569b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                    fullScreenVideoAdListener.onFullScreenVideoCached();
                                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail and exec onFullScreenVideoCached");
                                }
                            });
                        }
                    }
                } else if (z10 || (fullScreenVideoAdListener2 = fullScreenVideoAdListener) == null) {
                } else {
                    fullScreenVideoAdListener2.onError(-3, com.bytedance.sdk.openadsdk.core.g.a(-3));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                }
            }
        });
    }

    public void a(String str) {
        b.a(this.f11569b).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f11572e.size() >= 1) {
            this.f11572e.remove(0);
        }
        this.f11572e.add(aVar);
    }
}
