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
import com.bytedance.sdk.openadsdk.component.reward.g;
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

/* compiled from: RewardVideoLoadManager.java */
/* loaded from: classes.dex */
public class i {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f11630a;

    /* renamed from: b  reason: collision with root package name */
    private Context f11631b;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.f.g f11635f;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f11633d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private List<a> f11634e = Collections.synchronizedList(new ArrayList());

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f11636g = new BroadcastReceiver() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (i.this.f11635f == null) {
                    i iVar = i.this;
                    iVar.f11635f = new com.bytedance.sdk.openadsdk.component.reward.a("net connect task", iVar.f11634e);
                }
                com.bytedance.sdk.component.utils.h.a().post(i.this.f11635f);
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private final n f11632c = m.f();

    /* compiled from: RewardVideoLoadManager.java */
    /* loaded from: classes.dex */
    public static class a extends com.bytedance.sdk.component.f.g {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.openadsdk.core.e.n f11663a;

        /* renamed from: b  reason: collision with root package name */
        AdSlot f11664b;

        a(com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot) {
            super("Reward Task");
            this.f11663a = nVar;
            this.f11664b = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f11663a;
            if (nVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (nVar.J() != null) {
                    l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(this.f11663a.aD()).b(), this.f11663a);
                    a10.e("material_meta", this.f11663a);
                    a10.e("ad_slot", this.f11664b);
                    com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.a.1
                        @Override // n3.a.InterfaceC0454a
                        public void a(l3.c cVar, int i10) {
                            com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                            g a11 = g.a(m.a());
                            a aVar = a.this;
                            a11.a(aVar.f11664b, aVar.f11663a);
                        }

                        @Override // n3.a.InterfaceC0454a
                        public void a(l3.c cVar, int i10, String str) {
                            com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                    return;
                }
                return;
            }
            g.a(m.a()).a(this.f11663a, new g.a<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.a.2
                @Override // com.bytedance.sdk.openadsdk.component.reward.g.a
                public void a(boolean z10, Object obj) {
                    if (z10) {
                        com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                        g a11 = g.a(m.a());
                        a aVar = a.this;
                        a11.a(aVar.f11664b, aVar.f11663a);
                        return;
                    }
                    com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                }
            });
        }
    }

    private i(Context context) {
        this.f11631b = context == null ? m.a() : context.getApplicationContext();
        c();
    }

    private void d() {
        if (this.f11633d.get()) {
            this.f11633d.set(false);
            try {
                this.f11631b.unregisterReceiver(this.f11636g);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f11635f != null) {
            try {
                com.bytedance.sdk.component.utils.h.a().removeCallbacks(this.f11635f);
            } catch (Exception unused) {
            }
            this.f11635f = null;
        }
        d();
    }

    private void c() {
        if (this.f11633d.get()) {
            return;
        }
        this.f11633d.set(true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f11631b.registerReceiver(this.f11636g, intentFilter);
        } catch (Exception unused) {
        }
    }

    public void b() {
        try {
            g.a(this.f11631b).a();
        } catch (Throwable unused) {
        }
    }

    public void b(AdSlot adSlot) {
        if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.component.utils.l.b("bidding", "preload not request bidding：BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
            return;
        }
        com.bytedance.sdk.component.utils.l.b("RewardVideoLoadManager", "preload reward video: " + String.valueOf(adSlot));
        a(adSlot, true, null);
    }

    public static i a(Context context) {
        if (f11630a == null) {
            synchronized (i.class) {
                if (f11630a == null) {
                    f11630a = new i(context);
                }
            }
        }
        return f11630a;
    }

    public AdSlot b(String str) {
        return g.a(this.f11631b).b(str);
    }

    public void a() {
        AdSlot b10 = g.a(this.f11631b).b();
        if (b10 == null || TextUtils.isEmpty(b10.getCodeId()) || g.a(this.f11631b).c(b10.getCodeId()) != null) {
            return;
        }
        b(b10);
    }

    public void a(AdSlot adSlot) {
        g.a(this.f11631b).b(adSlot);
    }

    public void a(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        com.bytedance.sdk.component.utils.l.b("RewardVideoLoadManager", "load reward vide: " + String.valueOf(adSlot));
        com.bytedance.sdk.component.utils.l.b("bidding", "load reward vide: BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
        g.a(this.f11631b).a(adSlot);
        a(adSlot, false, rewardVideoAdListener);
    }

    private void a(final AdSlot adSlot, boolean z10, final TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (z10) {
            a(adSlot, true, rewardVideoAdListener, currentTimeMillis);
            return;
        }
        final com.bytedance.sdk.openadsdk.core.e.n c10 = g.a(this.f11631b).c(adSlot.getCodeId());
        if (c10 != null) {
            l lVar = new l(this.f11631b, c10, adSlot);
            if (!p.i(c10)) {
                lVar.a(g.a(this.f11631b).a(c10));
            }
            com.bytedance.sdk.openadsdk.b.e.a(c10);
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                if (!p.i(c10)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final l3.b J = c10.J();
                        l3.c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(c10.aD()).b(), c10);
                        a10.e("material_meta", c10);
                        a10.e("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.1
                            @Override // n3.a.InterfaceC0454a
                            public void a(l3.c cVar, int i10) {
                                if (rewardVideoAdListener != null) {
                                    com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                                    rewardVideoAdListener.onRewardVideoCached();
                                    com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onRewardVideoCached");
                                }
                            }

                            @Override // n3.a.InterfaceC0454a
                            public void a(l3.c cVar, int i10, String str) {
                                com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                                if (rewardVideoAdListener == null || !J.J()) {
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                                rewardVideoAdListener.onRewardVideoCached();
                                com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail and exec onRewardVideoCached");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.b.e.b(this.f11631b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.video.b.a.a().a(c10, new a.InterfaceC0175a() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.2
                @Override // com.bytedance.sdk.openadsdk.core.video.b.a.InterfaceC0175a
                public void a(boolean z11) {
                    if (rewardVideoAdListener == null || !p.i(c10)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, c10, u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                    rewardVideoAdListener.onRewardVideoCached();
                }
            });
            com.bytedance.sdk.component.utils.l.b("RewardVideoLoadManager", "get cache data success");
            com.bytedance.sdk.component.utils.l.b("bidding", "reward video get cache data success");
            return;
        }
        a(adSlot, false, rewardVideoAdListener, currentTimeMillis);
    }

    private void a(final AdSlot adSlot, final boolean z10, final TTAdNative.RewardVideoAdListener rewardVideoAdListener, final long j10) {
        com.bytedance.sdk.component.utils.l.b("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + o3.b.a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        o oVar = new o();
        oVar.f12200b = z10 ? 2 : 1;
        if (m.h().h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f12204f = 2;
        }
        this.f11632c.a(adSlot, oVar, 7, new n.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.3
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener2;
                if (z10 || (rewardVideoAdListener2 = rewardVideoAdListener) == null) {
                    return;
                }
                rewardVideoAdListener2.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener2;
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    com.bytedance.sdk.component.utils.l.b("RewardVideoLoadManager", "get material data success isPreload=" + z10);
                    final com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                    try {
                        if (nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
                            com.bytedance.sdk.openadsdk.i.b bVar2 = new com.bytedance.sdk.openadsdk.i.b(true);
                            bVar2.a(adSlot.getCodeId());
                            bVar2.a(7);
                            bVar2.c(nVar.Y());
                            bVar2.d(nVar.ac());
                            bVar2.b(u.h(nVar));
                            com.bytedance.sdk.openadsdk.d.a.a(nVar.M()).a(bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final l lVar = new l(i.this.f11631b, nVar, adSlot);
                    if (!z10 && rewardVideoAdListener != null) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.b.e.a(nVar, "rewarded_video", System.currentTimeMillis() - currentTimeMillis);
                        }
                        rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                    }
                    com.bytedance.sdk.openadsdk.core.video.b.a.a().a(nVar, new a.InterfaceC0175a() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.3.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.b.a.InterfaceC0175a
                        public void a(boolean z11) {
                            com.bytedance.sdk.openadsdk.core.e.n nVar2;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (z10 || rewardVideoAdListener == null || (nVar2 = nVar) == null || !p.i(nVar2)) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                            rewardVideoAdListener.onRewardVideoCached();
                        }
                    });
                    if (z10 && !p.i(nVar) && m.h().n(adSlot.getCodeId()).f12314d == 1 && !com.bytedance.sdk.component.utils.o.d(i.this.f11631b)) {
                        i.this.a(new a(nVar, adSlot));
                    } else if (p.i(nVar)) {
                        g.a(i.this.f11631b).a(adSlot, nVar);
                    } else if (Build.VERSION.SDK_INT < 23) {
                        g.a(i.this.f11631b).a(nVar, new g.a<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.3.3
                            @Override // com.bytedance.sdk.openadsdk.component.reward.g.a
                            public void a(boolean z11, Object obj) {
                                com.bytedance.sdk.component.utils.l.b("RewardVideoLoadManager", "download video file: " + z11 + ", preload: " + z10);
                                if (z11) {
                                    lVar.a(g.a(i.this.f11631b).a(nVar));
                                }
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                if (z10) {
                                    if (z11) {
                                        g.a(i.this.f11631b).a(adSlot, nVar);
                                        return;
                                    }
                                    return;
                                }
                                com.bytedance.sdk.openadsdk.b.e.a(nVar);
                                if (z11) {
                                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                    if (rewardVideoAdListener != null) {
                                        com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                        rewardVideoAdListener.onRewardVideoCached();
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
                            com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, new n3.b() { // from class: com.bytedance.sdk.openadsdk.component.reward.i.3.2
                                @Override // n3.a.InterfaceC0454a
                                public void a(l3.c cVar, int i10) {
                                    com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    if (z10) {
                                        g.a(i.this.f11631b).a(adSlot, nVar);
                                        com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                    } else if (rewardVideoAdListener != null) {
                                        com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                        rewardVideoAdListener.onRewardVideoCached();
                                        com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onRewardVideoCached");
                                    }
                                }

                                @Override // n3.a.InterfaceC0454a
                                public void a(l3.c cVar, int i10, String str) {
                                    com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                    if (rewardVideoAdListener == null || !J.J()) {
                                        return;
                                    }
                                    com.bytedance.sdk.openadsdk.b.e.b(i.this.f11631b, nVar, u.b(adSlot.getDurationSlotType()), j10);
                                    rewardVideoAdListener.onRewardVideoCached();
                                    com.bytedance.sdk.component.utils.l.c("RewardVideoLoadManager", "RewardVideoLog:  onVideoPreloadFail and exec onRewardVideoCached");
                                }
                            });
                        }
                    }
                } else if (z10 || (rewardVideoAdListener2 = rewardVideoAdListener) == null) {
                } else {
                    rewardVideoAdListener2.onError(-3, com.bytedance.sdk.openadsdk.core.g.a(-3));
                    bVar.a(-3);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                }
            }
        });
    }

    public void a(String str) {
        g.a(this.f11631b).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f11634e.size() >= 1) {
            this.f11634e.remove(0);
        }
        this.f11634e.add(aVar);
    }
}
