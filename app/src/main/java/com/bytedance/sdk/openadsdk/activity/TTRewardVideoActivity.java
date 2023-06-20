package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.o;
import com.bytedance.sdk.openadsdk.core.widget.a;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.u;
import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static final String U = t.a(m.a(), "tt_reward_msg");
    private static final String V = t.a(m.a(), "tt_msgPlayable");
    private static final String W = t.a(m.a(), "tt_negtiveBtnBtnText");
    private static final String X = t.a(m.a(), "tt_postiveBtnText");
    private static final String Y = t.a(m.a(), "tt_postiveBtnTextPlayable");

    /* renamed from: ad  reason: collision with root package name */
    private static TTRewardVideoAd.RewardAdInteractionListener f10841ad;
    protected int R;
    protected int S;
    protected TTRewardVideoAd.RewardAdInteractionListener T;
    private String Z;

    /* renamed from: aa  reason: collision with root package name */
    private int f10842aa;

    /* renamed from: ab  reason: collision with root package name */
    private String f10843ab;

    /* renamed from: ac  reason: collision with root package name */
    private String f10844ac;

    /* renamed from: ae  reason: collision with root package name */
    private AtomicBoolean f10845ae = new AtomicBoolean(false);

    /* renamed from: af  reason: collision with root package name */
    private int f10846af = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0066, code lost:
        if (r3.f10696g.get() == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.b.b.b.o$a r0 = new com.bytedance.sdk.openadsdk.b.b.b.o$a
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            long r1 = r1.s()
            r0.a(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            long r1 = r1.u()
            r0.c(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            long r1 = r1.j()
            r0.b(r1)
            r1 = 3
            r0.e(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            int r1 = r1.r()
            r0.f(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            k3.a r1 = r1.c()
            com.bytedance.sdk.openadsdk.component.reward.a.e r2 = r3.f10702m
            com.bytedance.sdk.openadsdk.b.j r2 = r2.a()
            com.bytedance.sdk.openadsdk.b.b.a.a.a(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f10702m
            r0.m()
            int r0 = r3.f10709t
            com.bytedance.sdk.openadsdk.core.p.c(r0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f10702m
            java.lang.String r1 = "skip"
            r2 = 0
            r0.a(r1, r2)
            boolean r0 = r3.i()
            if (r0 == 0) goto L68
            r0 = 1
            r3.a(r0)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f10692c
            boolean r0 = com.bytedance.sdk.openadsdk.core.e.l.a(r0)
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f10696g
            boolean r0 = r0.get()
            if (r0 != 0) goto L6b
        L68:
            r3.finish()
        L6b:
            boolean r0 = com.bytedance.sdk.openadsdk.multipro.b.c()
            if (r0 == 0) goto L77
            java.lang.String r0 = "onSkippedVideo"
            r3.c(r0)
            goto L7e
        L77:
            com.bytedance.sdk.openadsdk.TTRewardVideoAd$RewardAdInteractionListener r0 = r3.T
            if (r0 == 0) goto L7e
            r0.onSkippedVideo()
        L7e:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f10692c
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f10702m
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f10692c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            long r1 = r1.s()
            r0.f(r1)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f10692c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f10702m
            long r1 = r1.s()
            r0.e(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.O():void");
    }

    private JSONObject P() {
        JSONObject jSONObject = new JSONObject();
        int v10 = (int) this.f10702m.v();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.Z);
            jSONObject.put("reward_amount", this.f10842aa);
            jSONObject.put("network", o.c(this.f10691b));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int F = this.f10692c.F();
            String str = "unKnow";
            if (F == 2) {
                str = u.a();
            } else if (F == 1) {
                str = u.b();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f10692c.aH());
            jSONObject.put("media_extra", this.f10843ab);
            jSONObject.put("video_duration", this.f10692c.J().r());
            jSONObject.put("play_start_ts", this.R);
            jSONObject.put("play_end_ts", this.S);
            jSONObject.put("duration", v10);
            jSONObject.put("user_id", this.f10844ac);
            jSONObject.put("trans_id", l.a().replace(Constants.FILENAME_SEQUENCE_SEPARATOR, ""));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void Q() {
        if (this.G) {
            return;
        }
        this.G = true;
        if (b.c()) {
            c("onAdClose");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        e.c(new g("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.a(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f10693d, str, z10, i10, str2, i11, str3);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.c("TTRewardVideoActivity", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z10, final boolean z11) {
        a a10;
        String str;
        if (!m.h().d(String.valueOf(this.f10709t))) {
            if (!z10) {
                O();
                return;
            }
            if (!z11) {
                if (b.c()) {
                    c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
                    if (rewardAdInteractionListener != null) {
                        rewardAdInteractionListener.onSkippedVideo();
                    }
                }
            }
            finish();
        } else if (this.f10845ae.get()) {
            if (!z10) {
                O();
                return;
            }
            if (!z11) {
                if (b.c()) {
                    c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener2 = this.T;
                    if (rewardAdInteractionListener2 != null) {
                        rewardAdInteractionListener2.onSkippedVideo();
                    }
                }
            }
            finish();
        } else {
            this.A.set(true);
            this.f10702m.o();
            if (z10) {
                y();
            }
            final a aVar = new a(this);
            this.B = aVar;
            if (z10) {
                a10 = aVar.a(V);
                str = Y;
            } else {
                a10 = aVar.a(U);
                str = X;
            }
            a10.b(str).c(W);
            this.B.a(new a.InterfaceC0178a() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.InterfaceC0178a
                public void a() {
                    TTRewardVideoActivity.this.f10702m.n();
                    if (z10) {
                        TTRewardVideoActivity.this.z();
                    }
                    aVar.dismiss();
                    TTRewardVideoActivity.this.A.set(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.InterfaceC0178a
                public void b() {
                    aVar.dismiss();
                    TTRewardVideoActivity.this.A.set(false);
                    TTRewardVideoActivity.this.f10705p.d(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    if (z10) {
                        TTRewardVideoActivity.this.s();
                        if (!z11) {
                            if (b.c()) {
                                TTRewardVideoActivity.this.c("onSkippedVideo");
                            } else {
                                TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener3 = TTRewardVideoActivity.this.T;
                                if (rewardAdInteractionListener3 != null) {
                                    rewardAdInteractionListener3.onSkippedVideo();
                                }
                            }
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    TTRewardVideoActivity.this.O();
                }
            }).show();
        }
    }

    private boolean b(Bundle bundle) {
        String stringExtra;
        if (b.c()) {
            Intent intent = getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) != null) {
                try {
                    this.f10692c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.l.c("TTRewardVideoActivity", "TTRewardVideoActivity MultiGlobalInfo throw ", e10);
                }
            }
        } else {
            this.f10692c = com.bytedance.sdk.openadsdk.core.t.a().c();
            this.T = com.bytedance.sdk.openadsdk.core.t.a().d();
        }
        if (!b.c()) {
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        if (bundle != null) {
            if (this.T == null) {
                this.T = f10841ad;
                f10841ad = null;
            }
            try {
                this.f10692c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(bundle.getString("material_meta")));
                this.f10712w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f10712w.get()) {
                    this.f10700k.d(true);
                    this.f10700k.a((String) null, f.f12351c);
                    this.f10700k.e(true);
                }
            } catch (Throwable unused) {
            }
        }
        n nVar = this.f10692c;
        if (nVar == null) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoActivity", "mMaterialMeta is null , no data to display ,the TTRewardVideoActivity finished !!");
            finish();
            return false;
        }
        this.f10703n.a(nVar, this.f10684a);
        this.f10703n.a();
        n nVar2 = this.f10692c;
        nVar2.a(nVar2.g(), 7);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r12.f10704o.e().e() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (((1.0d - (r12.f10708s / r12.f10702m.C())) * 100.0d) >= r0) goto L6;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void A() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.m.h()
            int r1 = r12.f10709t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.i.a r0 = r0.n(r1)
            int r0 = r0.f12316f
            com.bytedance.sdk.openadsdk.core.e.n r1 = r12.f10692c
            boolean r1 = com.bytedance.sdk.openadsdk.core.e.p.j(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r12.f10702m
            double r8 = r1.C()
            int r1 = r12.f10708s
            double r10 = (double) r1
            double r10 = r10 / r8
            double r6 = r6 - r10
            double r6 = r6 * r4
            double r0 = (double) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            r3 = r2
            goto L74
        L34:
            r1 = 1120403456(0x42c80000, float:100.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r12.f10692c
            int r5 = r5.at()
            float r5 = (float) r5
            com.bytedance.sdk.openadsdk.component.reward.a.b r6 = r12.f10705p
            int r6 = r6.k()
            float r6 = (float) r6
            float r6 = r6 / r5
            float r4 = r4 - r6
            float r4 = r4 * r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L51
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.m.h()
            int r4 = r12.f10709t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.a(r4)
            if (r1 != 0) goto L71
            if (r0 == 0) goto L31
            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = r12.f10704o
            com.bytedance.sdk.openadsdk.core.w r0 = r0.e()
            boolean r0 = r0.e()
            if (r0 == 0) goto L31
            goto L32
        L71:
            if (r1 != r2) goto L74
            r3 = r0
        L74:
            if (r3 == 0) goto L7b
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.f(r0)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.A():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void H() {
        View k10 = this.f10698i.k();
        if (k10 != null) {
            k10.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTRewardVideoActivity.this.f10704o.r();
                    TTRewardVideoActivity.this.s();
                    if (p.i(TTRewardVideoActivity.this.f10692c)) {
                        TTRewardVideoActivity.this.b(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            });
        }
        this.f10700k.a(new com.bytedance.sdk.openadsdk.component.reward.top.b() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void a(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.b(p.i(tTRewardVideoActivity.f10692c), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void b(View view) {
                com.bytedance.sdk.openadsdk.component.reward.b.a aVar = TTRewardVideoActivity.this.L;
                if (aVar != null && aVar.a() != null) {
                    TTRewardVideoActivity.this.L.a().a(TTRewardVideoActivity.this.f10707r);
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f10707r = !tTRewardVideoActivity.f10707r;
                com.bytedance.sdk.component.utils.l.b("TTRewardVideoActivity", "will set is Mute " + TTRewardVideoActivity.this.f10707r + " mLastVolume=" + TTRewardVideoActivity.this.E.b());
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                tTRewardVideoActivity2.f10702m.b(tTRewardVideoActivity2.f10707r);
                if (!p.j(TTRewardVideoActivity.this.f10692c) || TTRewardVideoActivity.this.f10711v.get()) {
                    if (p.a(TTRewardVideoActivity.this.f10692c)) {
                        TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity3.E.a(tTRewardVideoActivity3.f10707r, true);
                    }
                    TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity4.f10704o.d(tTRewardVideoActivity4.f10707r);
                    n nVar = TTRewardVideoActivity.this.f10692c;
                    if (nVar == null || nVar.ax() == null || TTRewardVideoActivity.this.f10692c.ax().a() == null) {
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                    if (tTRewardVideoActivity5.f10702m != null) {
                        if (tTRewardVideoActivity5.f10707r) {
                            tTRewardVideoActivity5.f10692c.ax().a().h(TTRewardVideoActivity.this.f10702m.s());
                        } else {
                            tTRewardVideoActivity5.f10692c.ax().a().i(TTRewardVideoActivity.this.f10702m.s());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void c(View view) {
                TTRewardVideoActivity.this.G();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean I() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void K() {
        if (b.c()) {
            c("onAdShow");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdShow();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void L() {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M() {
        if (this.f10845ae.get()) {
            return;
        }
        this.f10845ae.set(true);
        if (!m.h().l(String.valueOf(this.f10709t))) {
            m.f().a(P(), new n.b() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // com.bytedance.sdk.openadsdk.core.n.b
                public void a(int i10, String str) {
                    if (b.c()) {
                        TTRewardVideoActivity.this.a("onRewardVerify", false, 0, "", i10, str);
                        return;
                    }
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = TTRewardVideoActivity.this.T;
                    if (rewardAdInteractionListener != null) {
                        rewardAdInteractionListener.onRewardVerify(false, 0, "", i10, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.n.b
                public void a(final o.b bVar) {
                    final int a10 = bVar.f12729c.a();
                    final String b10 = bVar.f12729c.b();
                    if (b.c()) {
                        TTRewardVideoActivity.this.a("onRewardVerify", bVar.f12728b, a10, b10, 0, "");
                    } else {
                        TTRewardVideoActivity.this.f10706q.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = TTRewardVideoActivity.this.T;
                                if (rewardAdInteractionListener != null) {
                                    rewardAdInteractionListener.onRewardVerify(bVar.f12728b, a10, b10, 0, "");
                                }
                            }
                        });
                    }
                }
            });
        } else if (b.c()) {
            a("onRewardVerify", true, this.f10842aa, this.Z, 0, "");
        } else {
            this.f10706q.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = tTRewardVideoActivity.T;
                    if (rewardAdInteractionListener != null) {
                        rewardAdInteractionListener.onRewardVerify(true, tTRewardVideoActivity.f10842aa, TTRewardVideoActivity.this.Z, 0, "");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N() {
        if (b.c()) {
            c("onVideoComplete");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onVideoComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j10, long j11) {
        long j12 = j10 + (this.O * 1000);
        if (this.f10846af == -1) {
            this.f10846af = m.h().n(String.valueOf(this.f10709t)).f12316f;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= 30000 && j12 >= 27000) {
            M();
        } else if (((float) (j12 * 100)) / ((float) j11) >= this.f10846af) {
            M();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void a(Intent intent) {
        super.a(intent);
        if (intent == null) {
            return;
        }
        this.Z = intent.getStringExtra("reward_name");
        this.f10842aa = intent.getIntExtra("reward_amount", 0);
        this.f10843ab = intent.getStringExtra("media_extra");
        this.f10844ac = intent.getStringExtra("user_id");
    }

    public boolean a(long j10, boolean z10) {
        HashMap hashMap;
        j jVar = new j();
        jVar.a(System.currentTimeMillis(), 1.0f);
        this.f10702m.a(this.f10698i.h(), this.f10692c, this.f10684a, I(), jVar);
        if (TextUtils.isEmpty(this.D)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.D);
        }
        this.f10702m.a(hashMap);
        c.a aVar = new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // m3.c.a
            public void a(long j11, int i10) {
                TTRewardVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.E();
                TTRewardVideoActivity.this.N();
                TTRewardVideoActivity.this.N.set(true);
                if (TTRewardVideoActivity.this.i()) {
                    TTRewardVideoActivity.this.a(false);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.S = (int) (System.currentTimeMillis() / 1000);
                TTRewardVideoActivity.this.M();
            }

            @Override // m3.c.a
            public void b(long j11, int i10) {
                TTRewardVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (b.c()) {
                    TTRewardVideoActivity.this.c("onVideoError");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = TTRewardVideoActivity.this.T;
                    if (rewardAdInteractionListener != null) {
                        rewardAdInteractionListener.onVideoError();
                    }
                }
                TTRewardVideoActivity.this.D();
                if (TTRewardVideoActivity.this.f10702m.b()) {
                    return;
                }
                TTRewardVideoActivity.this.E();
                TTRewardVideoActivity.this.f10702m.m();
                TTRewardVideoActivity.this.M();
                if (TTRewardVideoActivity.this.i()) {
                    TTRewardVideoActivity.this.a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.a.e eVar = TTRewardVideoActivity.this.f10702m;
                eVar.a(1 ^ eVar.B(), 2);
            }

            @Override // m3.c.a
            public void a() {
                TTRewardVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.E();
                if (TTRewardVideoActivity.this.i()) {
                    TTRewardVideoActivity.this.a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.a.e eVar = TTRewardVideoActivity.this.f10702m;
                eVar.a(!eVar.B(), 1 ^ TTRewardVideoActivity.this.f10702m.B());
                TTRewardVideoActivity.this.f10702m.m();
            }

            @Override // m3.c.a
            public void a(long j11, long j12) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (!tTRewardVideoActivity.H && tTRewardVideoActivity.f10702m.b()) {
                    TTRewardVideoActivity.this.f10702m.o();
                }
                if (TTRewardVideoActivity.this.f10711v.get()) {
                    return;
                }
                TTRewardVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (j11 != TTRewardVideoActivity.this.f10702m.f()) {
                    TTRewardVideoActivity.this.E();
                }
                TTRewardVideoActivity.this.f10702m.a(j11);
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                long j13 = j11 / 1000;
                double d10 = j13;
                tTRewardVideoActivity2.f10708s = (int) (tTRewardVideoActivity2.f10702m.C() - d10);
                TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                int i10 = tTRewardVideoActivity3.f10708s;
                if (i10 >= 0) {
                    tTRewardVideoActivity3.f10700k.a(String.valueOf(i10), (CharSequence) null);
                }
                TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                tTRewardVideoActivity4.f10708s = (int) (tTRewardVideoActivity4.f10702m.C() - d10);
                int i11 = (int) j13;
                int f10 = m.h().f(String.valueOf(TTRewardVideoActivity.this.f10709t));
                boolean z11 = f10 >= 0;
                if ((TTRewardVideoActivity.this.A.get() || TTRewardVideoActivity.this.f10714y.get()) && TTRewardVideoActivity.this.f10702m.b()) {
                    TTRewardVideoActivity.this.f10702m.o();
                }
                TTRewardVideoActivity.this.f10698i.c(i11);
                TTRewardVideoActivity.this.a(j11, j12);
                TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity5.f10708s > 0) {
                    tTRewardVideoActivity5.f10700k.d(true);
                    if (z11 && i11 >= f10) {
                        TTRewardVideoActivity.this.f10712w.getAndSet(true);
                        TTRewardVideoActivity tTRewardVideoActivity6 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity6.f10700k.a(String.valueOf(tTRewardVideoActivity6.f10708s), f.f12351c);
                        TTRewardVideoActivity.this.f10700k.e(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity7 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity7.f10700k.a(String.valueOf(tTRewardVideoActivity7.f10708s), (CharSequence) null);
                } else if (!com.bytedance.sdk.openadsdk.core.e.l.c(tTRewardVideoActivity5.f10692c) && !com.bytedance.sdk.openadsdk.core.e.l.b(TTRewardVideoActivity.this.f10692c)) {
                    if (com.bytedance.sdk.openadsdk.core.e.l.a(TTRewardVideoActivity.this.f10692c) && !TTRewardVideoActivity.this.f10696g.get()) {
                        TTRewardVideoActivity.this.f10712w.getAndSet(true);
                        TTRewardVideoActivity.this.f10700k.d(true);
                        TTRewardVideoActivity.this.f10700k.e(true);
                    } else if (TTRewardVideoActivity.this.i()) {
                        TTRewardVideoActivity.this.a(false);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                } else {
                    TTRewardVideoActivity.this.a(false);
                }
            }
        };
        this.f10702m.a(aVar);
        this.f10702m.a(aVar);
        com.bytedance.sdk.openadsdk.core.e.l lVar = this.f10698i.f11782x;
        if (lVar != null) {
            lVar.a(aVar);
        }
        boolean a10 = a(j10, z10, hashMap);
        if (a10 && !z10) {
            this.R = (int) (System.currentTimeMillis() / 1000);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        a(str, false, 0, "", 0, "");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.c.c
    public void e() {
        M();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void f(int i10) {
        if (i10 == 10000) {
            M();
        } else if (i10 == 10001) {
            N();
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        f10841ad = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void finish() {
        Q();
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b(bundle)) {
            t();
            u();
            d();
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar = this.f10701l;
        if (bVar != null) {
            bVar.f();
        }
        Q();
        if (b.c()) {
            c("recycleRes");
        }
        this.T = null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void onRewardBarClick(View view) {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f10841ad = this.T;
        super.onSaveInstanceState(bundle);
    }
}
