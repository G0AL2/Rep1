package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.b.b.a.a;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.HashMap;
import java.util.Map;
import m3.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static TTFullScreenVideoAd.FullScreenVideoAdInteractionListener S;
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener R;
    private boolean T;

    private void N() {
        if (!n.c(this.f10692c) && !i()) {
            this.f10700k.a((String) null, "X");
        } else {
            this.f10700k.a((String) null, f.f12351c);
        }
        this.f10700k.e(true);
    }

    private void O() {
        if (this.G) {
            return;
        }
        this.G = true;
        if (b.c()) {
            c("onAdClose");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdClose();
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
                    l.c("TTFullScreenVideoActivity", "initData MultiGlobalInfo throws ", e10);
                }
            }
        } else {
            this.f10692c = t.a().c();
            this.R = t.a().e();
        }
        if (!b.c()) {
            t.a().h();
        }
        if (bundle != null) {
            if (this.R == null) {
                this.R = S;
                S = null;
            }
            try {
                this.f10692c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(bundle.getString("material_meta")));
                this.f10712w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f10712w.get()) {
                    this.f10700k.d(true);
                    N();
                }
            } catch (Throwable unused) {
            }
        }
        n nVar = this.f10692c;
        if (nVar == null) {
            l.e("TTFullScreenVideoActivity", "mMaterialMeta is null , no data to display ,the TTFullScreenVideoActivity finished !!");
            finish();
            return false;
        }
        this.f10703n.a(nVar, this.f10684a);
        this.f10703n.a();
        n nVar2 = this.f10692c;
        nVar2.a(nVar2.g(), 8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        e.c(new g("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.a(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f10693d, str);
                } catch (Throwable th) {
                    l.c("TTFullScreenVideoActivity", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    private void g(int i10) {
        this.f10700k.a((String) null, new SpannableStringBuilder(String.format(com.bytedance.sdk.component.utils.t.a(m.a(), "tt_skip_ad_time_text"), Integer.valueOf(i10))));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void H() {
        View k10 = this.f10698i.k();
        if (k10 != null) {
            k10.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTFullScreenVideoActivity.this.f10704o.r();
                    TTFullScreenVideoActivity.this.s();
                    TTFullScreenVideoActivity.this.finish();
                }
            });
        }
        this.f10700k.a(new com.bytedance.sdk.openadsdk.component.reward.top.b() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void a(View view) {
                if (!p.i(TTFullScreenVideoActivity.this.f10692c) && (!com.bytedance.sdk.openadsdk.core.e.l.a(TTFullScreenVideoActivity.this.f10692c) || TTFullScreenVideoActivity.this.f10696g.get())) {
                    o.a aVar = new o.a();
                    aVar.a(TTFullScreenVideoActivity.this.f10702m.s());
                    aVar.c(TTFullScreenVideoActivity.this.f10702m.u());
                    aVar.b(TTFullScreenVideoActivity.this.f10702m.j());
                    aVar.e(3);
                    aVar.f(TTFullScreenVideoActivity.this.f10702m.r());
                    a.a(TTFullScreenVideoActivity.this.f10702m.c(), aVar, TTFullScreenVideoActivity.this.f10702m.a());
                    com.bytedance.sdk.openadsdk.core.p.c(TTFullScreenVideoActivity.this.f10709t);
                    TTFullScreenVideoActivity.this.f10702m.a("skip", (Map<String, Object>) null);
                    TTFullScreenVideoActivity.this.f10700k.d(false);
                    if (!b.c()) {
                        if (TTFullScreenVideoActivity.this.R != null) {
                            TTFullScreenVideoActivity.this.R.onSkippedVideo();
                        }
                    } else {
                        TTFullScreenVideoActivity.this.c("onSkippedVideo");
                    }
                    if (TTFullScreenVideoActivity.this.i()) {
                        TTFullScreenVideoActivity.this.a(true);
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                    }
                    n nVar = TTFullScreenVideoActivity.this.f10692c;
                    if (nVar == null || nVar.ax() == null) {
                        return;
                    }
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    if (tTFullScreenVideoActivity.f10702m != null) {
                        tTFullScreenVideoActivity.f10692c.ax().a().f(TTFullScreenVideoActivity.this.f10702m.s());
                        TTFullScreenVideoActivity.this.f10692c.ax().a().e(TTFullScreenVideoActivity.this.f10702m.s());
                        return;
                    }
                    return;
                }
                if (!b.c()) {
                    if (TTFullScreenVideoActivity.this.R != null) {
                        TTFullScreenVideoActivity.this.R.onSkippedVideo();
                    }
                } else {
                    TTFullScreenVideoActivity.this.c("onSkippedVideo");
                }
                TTFullScreenVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void b(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f10707r = !tTFullScreenVideoActivity.f10707r;
                com.bytedance.sdk.openadsdk.component.reward.b.a aVar = tTFullScreenVideoActivity.L;
                if (aVar != null && aVar.a() != null) {
                    TTFullScreenVideoActivity.this.L.a().a(TTFullScreenVideoActivity.this.f10707r);
                }
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity2.f10702m.b(tTFullScreenVideoActivity2.f10707r);
                if (!p.j(TTFullScreenVideoActivity.this.f10692c) || TTFullScreenVideoActivity.this.f10711v.get()) {
                    if (p.a(TTFullScreenVideoActivity.this.f10692c)) {
                        TTFullScreenVideoActivity tTFullScreenVideoActivity3 = TTFullScreenVideoActivity.this;
                        tTFullScreenVideoActivity3.E.a(tTFullScreenVideoActivity3.f10707r, true);
                    }
                    TTFullScreenVideoActivity tTFullScreenVideoActivity4 = TTFullScreenVideoActivity.this;
                    tTFullScreenVideoActivity4.f10704o.d(tTFullScreenVideoActivity4.f10707r);
                    n nVar = TTFullScreenVideoActivity.this.f10692c;
                    if (nVar == null || nVar.ax() == null || TTFullScreenVideoActivity.this.f10692c.ax().a() == null) {
                        return;
                    }
                    TTFullScreenVideoActivity tTFullScreenVideoActivity5 = TTFullScreenVideoActivity.this;
                    if (tTFullScreenVideoActivity5.f10702m != null) {
                        if (tTFullScreenVideoActivity5.f10707r) {
                            tTFullScreenVideoActivity5.f10692c.ax().a().h(TTFullScreenVideoActivity.this.f10702m.s());
                        } else {
                            tTFullScreenVideoActivity5.f10692c.ax().a().i(TTFullScreenVideoActivity.this.f10702m.s());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.b
            public void c(View view) {
                TTFullScreenVideoActivity.this.G();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean I() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void K() {
        if (b.c()) {
            c("onAdShow");
        } else {
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdShow();
            }
        }
        if (J()) {
            this.f10701l.j();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void L() {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M() {
        if (b.c()) {
            c("onVideoComplete");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onVideoComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(int i10) {
        int e10 = m.h().e(this.f10709t);
        if (e10 < 0) {
            e10 = 5;
        }
        if (!m.h().c(String.valueOf(this.f10709t)) || (!n.c(this.f10692c) && !i())) {
            if (i10 >= e10) {
                if (!this.f10712w.getAndSet(true)) {
                    this.f10700k.d(true);
                }
                N();
                return;
            }
            return;
        }
        if (!this.f10712w.getAndSet(true)) {
            this.f10700k.d(true);
        }
        if (i10 <= e10) {
            g(e10 - i10);
            this.f10700k.e(false);
            return;
        }
        N();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void f(int i10) {
        if (i10 == 10002) {
            M();
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        S = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void finish() {
        this.f10705p.b(this.F);
        try {
            O();
        } catch (Exception unused) {
        }
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
        O();
        if (b.c()) {
            c("recycleRes");
        }
        this.R = null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.c.b
    public void onRewardBarClick(View view) {
        n nVar = this.f10692c;
        if (nVar != null && nVar.an() != 100.0f) {
            this.T = true;
        }
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        S = this.R;
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (!b(this.f10692c) || a(this.f10692c)) {
            return;
        }
        if (this.T) {
            this.T = false;
            finish();
        } else if (this.f10704o.x()) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void a(Intent intent) {
        super.a(intent);
        if (intent == null) {
            return;
        }
        this.F = intent.getBooleanExtra("is_verity_playable", false);
    }

    public boolean a(long j10, boolean z10) {
        j jVar = new j();
        jVar.a(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null && (aVar instanceof c)) {
            this.f10702m.a(((c) aVar).d(), this.f10692c, this.f10684a, I(), jVar);
        } else {
            this.f10702m.a(this.f10698i.h(), this.f10692c, this.f10684a, I(), jVar);
        }
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(this.D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.D);
        }
        this.f10702m.a(hashMap);
        c.a aVar2 = new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // m3.c.a
            public void a(long j11, int i10) {
                TTFullScreenVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.E();
                TTFullScreenVideoActivity.this.M();
                if (com.bytedance.sdk.openadsdk.core.e.l.b(TTFullScreenVideoActivity.this.f10692c)) {
                    TTFullScreenVideoActivity.this.n();
                    TTFullScreenVideoActivity.this.N.set(true);
                } else if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(false);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // m3.c.a
            public void b(long j11, int i10) {
                TTFullScreenVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.D();
                if (TTFullScreenVideoActivity.this.f10702m.b()) {
                    return;
                }
                TTFullScreenVideoActivity.this.E();
                TTFullScreenVideoActivity.this.f10702m.m();
                l.e("TTFullScreenVideoActivity", "onError、、、、、、、、");
                if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(false, true);
                    com.bytedance.sdk.openadsdk.component.reward.a.e eVar = TTFullScreenVideoActivity.this.f10702m;
                    eVar.a(!eVar.B(), 2);
                    return;
                }
                TTFullScreenVideoActivity.this.finish();
            }

            @Override // m3.c.a
            public void a() {
                TTFullScreenVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.E();
                l.b("TTFullScreenVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(false, true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.a.e eVar = TTFullScreenVideoActivity.this.f10702m;
                eVar.a(!eVar.B(), 1 ^ TTFullScreenVideoActivity.this.f10702m.B());
                TTFullScreenVideoActivity.this.f10702m.m();
            }

            @Override // m3.c.a
            public void a(long j11, long j12) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (!tTFullScreenVideoActivity.H && tTFullScreenVideoActivity.f10702m.b()) {
                    TTFullScreenVideoActivity.this.f10702m.o();
                }
                if (TTFullScreenVideoActivity.this.f10711v.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (j11 != TTFullScreenVideoActivity.this.f10702m.f()) {
                    TTFullScreenVideoActivity.this.E();
                }
                TTFullScreenVideoActivity.this.f10702m.a(j11);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                long j13 = j11 / 1000;
                tTFullScreenVideoActivity2.f10708s = (int) (tTFullScreenVideoActivity2.f10702m.C() - j13);
                int i10 = (int) j13;
                if ((TTFullScreenVideoActivity.this.A.get() || TTFullScreenVideoActivity.this.f10714y.get()) && TTFullScreenVideoActivity.this.f10702m.b()) {
                    TTFullScreenVideoActivity.this.f10702m.o();
                }
                TTFullScreenVideoActivity.this.e(i10);
                TTFullScreenVideoActivity tTFullScreenVideoActivity3 = TTFullScreenVideoActivity.this;
                int i11 = tTFullScreenVideoActivity3.f10708s;
                if (i11 >= 0) {
                    tTFullScreenVideoActivity3.f10700k.a(String.valueOf(i11), (CharSequence) null);
                }
                TTFullScreenVideoActivity tTFullScreenVideoActivity4 = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity4.f10708s <= 0) {
                    tTFullScreenVideoActivity4.N.set(true);
                    l.b("TTFullScreenVideoActivity", "onProgressUpdate、、、、、、、、");
                    if (TTFullScreenVideoActivity.this.i()) {
                        TTFullScreenVideoActivity.this.a(false);
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                    }
                }
            }
        };
        this.f10702m.a(aVar2);
        com.bytedance.sdk.openadsdk.core.e.l lVar = this.f10698i.f11782x;
        if (lVar != null) {
            lVar.a(aVar2);
        }
        return a(j10, z10, hashMap);
    }

    private boolean a(n nVar) {
        return nVar == null || nVar.an() == 100.0f;
    }

    private boolean b(n nVar) {
        if (nVar == null) {
            return false;
        }
        return m.h().g(this.f10709t);
    }
}
