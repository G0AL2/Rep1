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
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTRewardVideoAdImpl.java */
/* loaded from: classes.dex */
class l implements TTRewardVideoAd {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11687a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11688b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSlot f11689c;

    /* renamed from: d  reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f11690d;

    /* renamed from: e  reason: collision with root package name */
    private r3.c f11691e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11693g;

    /* renamed from: h  reason: collision with root package name */
    private String f11694h;

    /* renamed from: i  reason: collision with root package name */
    private String f11695i;

    /* renamed from: k  reason: collision with root package name */
    private String f11697k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11698l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11699m;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11692f = true;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f11696j = new AtomicBoolean(false);

    /* renamed from: n  reason: collision with root package name */
    private Double f11700n = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, n nVar, AdSlot adSlot) {
        this.f11687a = context;
        this.f11688b = nVar;
        this.f11689c = adSlot;
        if (getInteractionType() == 4) {
            this.f11691e = r3.d.a(context, nVar, "rewarded_video");
        }
        this.f11693g = false;
        this.f11697k = com.bytedance.sdk.openadsdk.utils.l.a();
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public String getAdCreativeToken() {
        return this.f11688b.n();
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getInteractionType() {
        n nVar = this.f11688b;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f11688b;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getRewardVideoAdType() {
        n nVar = this.f11688b;
        if (nVar == null) {
            return -1;
        }
        if (p.i(nVar)) {
            return 2;
        }
        return p.j(this.f11688b) ? 1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.f11699m) {
            return;
        }
        q.a(this.f11688b, d10, str, str2);
        this.f11699m = true;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d10) {
        this.f11700n = d10;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f11690d = rewardAdInteractionListener;
        a(0);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setShowDownLoadBar(boolean z10) {
        this.f11692f = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.f11696j.get()) {
                return;
            }
            this.f11696j.set(true);
            n nVar = this.f11688b;
            if (nVar != null && nVar.J() != null) {
                Context context = activity == null ? this.f11687a : activity;
                if (context == null) {
                    context = m.a();
                }
                if (this.f11688b.l() == 2 && this.f11688b.f() != 5 && this.f11688b.f() != 6) {
                    intent = new Intent(context, TTRewardExpressVideoActivity.class);
                } else {
                    intent = new Intent(context, TTRewardVideoActivity.class);
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
                intent.putExtra("reward_name", this.f11688b.j());
                intent.putExtra("reward_amount", this.f11688b.k());
                intent.putExtra("media_extra", this.f11689c.getMediaExtra());
                intent.putExtra("user_id", this.f11689c.getUserID());
                intent.putExtra("show_download_bar", this.f11692f);
                Double d10 = this.f11700n;
                intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d10 == null ? "" : String.valueOf(d10));
                if (!TextUtils.isEmpty(this.f11695i)) {
                    intent.putExtra("rit_scene", this.f11695i);
                }
                if (this.f11693g) {
                    intent.putExtra("video_cache_url", this.f11694h);
                }
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f11688b.ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f11697k);
                } else {
                    t.a().h();
                    t.a().a(this.f11688b);
                    t.a().a(this.f11690d);
                    t.a().a(this.f11691e);
                    this.f11690d = null;
                }
                com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.l.1
                    @Override // com.bytedance.sdk.component.utils.b.a
                    public void a() {
                    }

                    @Override // com.bytedance.sdk.component.utils.b.a
                    public void a(Throwable th) {
                        com.bytedance.sdk.component.utils.l.c("TTRewardVideoAdImpl", "show reward video error: ", th);
                        com.bytedance.sdk.openadsdk.b.e.a(l.this.f11688b, "fullscreen_interstitial_ad", "activity start  fail ");
                    }
                });
                String a10 = u.a(this.f11688b, (String) null);
                if (a10 != null) {
                    try {
                        AdSlot b10 = i.a(this.f11687a).b(a10);
                        i.a(this.f11687a).a(a10);
                        if (b10 != null) {
                            if (this.f11693g && !TextUtils.isEmpty(this.f11694h)) {
                                i.a(this.f11687a).b(b10);
                            } else {
                                i.a(this.f11687a).a(b10);
                            }
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            }
            com.bytedance.sdk.openadsdk.b.e.a(this.f11688b, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        com.bytedance.sdk.openadsdk.b.e.a(this.f11688b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
        com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        if (this.f11698l) {
            return;
        }
        q.a(this.f11688b, d10);
        this.f11698l = true;
    }

    public void a(String str) {
        if (this.f11696j.get()) {
            return;
        }
        this.f11693g = true;
        this.f11694h = str;
    }

    private void a(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.component.f.e.c(new com.bytedance.sdk.component.f.g("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.l.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a10 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(l.this.f11687a);
                    if (i10 == 0 && l.this.f11690d != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerRewardVideoListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.b.d dVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.d(l.this.f11690d);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(a10.a(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(l.this.f11697k, dVar);
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerRewardVideoListener ! ");
                            } catch (RemoteException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f11695i = str;
        } else {
            this.f11695i = ritScenes.getScenesName();
        }
        showRewardVideoAd(activity);
    }
}
