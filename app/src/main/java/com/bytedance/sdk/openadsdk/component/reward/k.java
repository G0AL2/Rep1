package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTFullScreenVideoAdImpl.java */
/* loaded from: classes.dex */
class k implements TTFullScreenVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11669a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11670b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSlot f11671c;

    /* renamed from: d  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f11672d;

    /* renamed from: e  reason: collision with root package name */
    private r3.c f11673e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11675g;

    /* renamed from: h  reason: collision with root package name */
    private String f11676h;

    /* renamed from: i  reason: collision with root package name */
    private String f11677i;

    /* renamed from: l  reason: collision with root package name */
    private String f11680l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11681m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11682n;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11674f = true;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f11678j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    private boolean f11679k = false;

    /* renamed from: o  reason: collision with root package name */
    private Double f11683o = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, n nVar, AdSlot adSlot) {
        this.f11669a = context;
        this.f11670b = nVar;
        this.f11671c = adSlot;
        if (getInteractionType() == 4) {
            this.f11673e = r3.d.a(context, nVar, "fullscreen_interstitial_ad");
        }
        this.f11675g = false;
        this.f11680l = com.bytedance.sdk.openadsdk.utils.l.a();
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public String getAdCreativeToken() {
        return this.f11670b.n();
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getFullVideoAdType() {
        n nVar = this.f11670b;
        if (nVar == null) {
            return -1;
        }
        if (p.i(nVar)) {
            return 2;
        }
        return p.j(this.f11670b) ? 1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getInteractionType() {
        n nVar = this.f11670b;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f11670b;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.f11682n) {
            return;
        }
        q.a(this.f11670b, d10, str, str2);
        this.f11682n = true;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f11672d = fullScreenVideoAdInteractionListener;
        a(1);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d10) {
        this.f11683o = d10;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setShowDownLoadBar(boolean z10) {
        this.f11674f = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.f11678j.get()) {
                return;
            }
            this.f11678j.set(true);
            n nVar = this.f11670b;
            if (nVar != null && (nVar.J() != null || this.f11670b.P() != null)) {
                Context context = activity == null ? this.f11669a : activity;
                if (context == null) {
                    context = m.a();
                }
                if (this.f11670b.l() == 2 && this.f11670b.f() != 5 && this.f11670b.f() != 6) {
                    if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f11670b)) {
                        intent = new Intent(context, TTInterstitialExpressActivity.class);
                    } else {
                        intent = new Intent(context, TTFullScreenExpressVideoActivity.class);
                    }
                } else if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f11670b)) {
                    intent = new Intent(context, TTInterstitialActivity.class);
                } else {
                    intent = new Intent(context, TTFullScreenVideoActivity.class);
                }
                if (activity == null) {
                    intent.addFlags(268435456);
                }
                int i10 = 0;
                try {
                    i10 = activity.getWindowManager().getDefaultDisplay().getRotation();
                } catch (Exception unused) {
                }
                intent.putExtra("orientation_angle", i10);
                intent.putExtra("show_download_bar", this.f11674f);
                intent.putExtra("is_verity_playable", this.f11679k);
                Double d10 = this.f11683o;
                intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d10 == null ? "" : String.valueOf(d10));
                if (!TextUtils.isEmpty(this.f11677i)) {
                    intent.putExtra("rit_scene", this.f11677i);
                }
                if (this.f11675g) {
                    intent.putExtra("video_cache_url", this.f11676h);
                }
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f11670b.ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f11680l);
                } else {
                    t.a().h();
                    t.a().a(this.f11670b);
                    t.a().a(this.f11672d);
                    t.a().a(this.f11673e);
                    this.f11672d = null;
                }
                com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.k.1
                    @Override // com.bytedance.sdk.component.utils.b.a
                    public void a() {
                        if (k.this.f11679k) {
                            try {
                                com.bytedance.sdk.openadsdk.h.b.a().a(k.this.f11670b.J().A());
                            } catch (Throwable unused2) {
                            }
                        }
                    }

                    @Override // com.bytedance.sdk.component.utils.b.a
                    public void a(Throwable th) {
                        com.bytedance.sdk.component.utils.l.c("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                        if (k.this.f11679k) {
                            try {
                                com.bytedance.sdk.openadsdk.h.b.a().a(k.this.f11670b.J().A(), -1, th != null ? th.getMessage() : "playable tool error open");
                            } catch (Throwable unused2) {
                            }
                        }
                        com.bytedance.sdk.openadsdk.b.e.a(k.this.f11670b, "fullscreen_interstitial_ad", "activity start  fail ");
                    }
                });
                String a10 = u.a(this.f11670b, (String) null);
                if (a10 != null) {
                    try {
                        AdSlot b10 = d.a(this.f11669a).b(a10);
                        d.a(this.f11669a).a(a10);
                        if (b10 != null) {
                            if (this.f11675g && !TextUtils.isEmpty(this.f11676h)) {
                                d.a(this.f11669a).b(b10);
                            } else {
                                d.a(this.f11669a).a(b10);
                            }
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            }
            com.bytedance.sdk.openadsdk.b.e.a(this.f11670b, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        com.bytedance.sdk.openadsdk.b.e.a(this.f11670b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
        com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        if (this.f11681m) {
            return;
        }
        q.a(this.f11670b, d10);
        this.f11681m = true;
    }

    public void a(boolean z10) {
        this.f11679k = z10;
    }

    public void a(String str) {
        if (this.f11678j.get()) {
            return;
        }
        this.f11675g = true;
        this.f11676h = str;
    }

    private void a(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new com.bytedance.sdk.component.f.g("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.k.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a10 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(k.this.f11669a);
                    if (i10 == 1 && k.this.f11672d != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerFullScreenVideoListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.b.c cVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.c(k.this.f11672d);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(a10.a(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(k.this.f11680l, cVar);
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerFullScreenVideoListener ! ");
                            } catch (RemoteException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            com.bytedance.sdk.component.utils.l.e("TTFullScreenVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f11677i = str;
        } else {
            this.f11677i = ritScenes.getScenesName();
        }
        showFullScreenVideoAd(activity);
    }
}
