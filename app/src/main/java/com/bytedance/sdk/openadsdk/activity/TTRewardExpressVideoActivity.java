package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.a.e;
import com.bytedance.sdk.openadsdk.component.reward.view.b;
import com.bytedance.sdk.openadsdk.core.e.l;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.HashMap;
import m3.c;

/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean J() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.video.c.b
    public boolean a(long j10, boolean z10) {
        j jVar;
        b bVar = this.f10701l;
        if (bVar != null && bVar.a() != null) {
            jVar = this.f10701l.a().getAdShowTime();
        } else {
            jVar = new j();
        }
        this.f10702m.a(this.f10701l.b(), this.f10692c, this.f10684a, I(), jVar);
        HashMap hashMap = new HashMap();
        b bVar2 = this.f10701l;
        if (bVar2 != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(bVar2.i()));
        }
        if (!TextUtils.isEmpty(this.D)) {
            hashMap.put("rit_scene", this.D);
        }
        this.f10702m.a(hashMap);
        this.f10702m.a(new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            @Override // m3.c.a
            public void a(long j11, int i10) {
                TTRewardExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.E();
                TTRewardExpressVideoActivity.this.f10701l.b(true);
                TTRewardExpressVideoActivity.this.N();
                if (!l.b(TTRewardExpressVideoActivity.this.f10692c)) {
                    if (TTRewardExpressVideoActivity.this.i()) {
                        TTRewardExpressVideoActivity.this.a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                } else {
                    TTRewardExpressVideoActivity.this.N.set(true);
                    TTRewardExpressVideoActivity.this.n();
                }
                ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).S = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.M();
            }

            @Override // m3.c.a
            public void b(long j11, int i10) {
                TTRewardExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    TTRewardExpressVideoActivity.this.c("onVideoError");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).T;
                    if (rewardAdInteractionListener != null) {
                        rewardAdInteractionListener.onVideoError();
                    }
                }
                TTRewardExpressVideoActivity.this.D();
                if (TTRewardExpressVideoActivity.this.f10702m.b()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.E();
                TTRewardExpressVideoActivity.this.M();
                TTRewardExpressVideoActivity.this.f10702m.m();
                if (TTRewardExpressVideoActivity.this.i()) {
                    TTRewardExpressVideoActivity.this.a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f10701l.a(true);
                e eVar = TTRewardExpressVideoActivity.this.f10702m;
                eVar.a(1 ^ eVar.B(), 2);
            }

            @Override // m3.c.a
            public void a() {
                TTRewardExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.E();
                if (TTRewardExpressVideoActivity.this.i()) {
                    TTRewardExpressVideoActivity.this.a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                e eVar = TTRewardExpressVideoActivity.this.f10702m;
                eVar.a(!eVar.B(), !TTRewardExpressVideoActivity.this.f10702m.B());
                TTRewardExpressVideoActivity.this.f10702m.m();
            }

            @Override // m3.c.a
            public void a(long j11, long j12) {
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (!tTRewardExpressVideoActivity.H && tTRewardExpressVideoActivity.f10702m.b()) {
                    TTRewardExpressVideoActivity.this.f10702m.o();
                }
                if (TTRewardExpressVideoActivity.this.f10711v.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (j11 != TTRewardExpressVideoActivity.this.f10702m.f()) {
                    TTRewardExpressVideoActivity.this.E();
                }
                if (TTRewardExpressVideoActivity.this.f10702m.b()) {
                    TTRewardExpressVideoActivity.this.f10702m.a(j11);
                    int f10 = m.h().f(String.valueOf(TTRewardExpressVideoActivity.this.f10709t));
                    boolean z11 = TTRewardExpressVideoActivity.this.f10701l.h() && f10 != -1 && f10 >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity2 = TTRewardExpressVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTRewardExpressVideoActivity2.f10708s = (int) (tTRewardExpressVideoActivity2.f10702m.C() - j13);
                    int i10 = (int) j13;
                    if ((TTRewardExpressVideoActivity.this.A.get() || TTRewardExpressVideoActivity.this.f10714y.get()) && TTRewardExpressVideoActivity.this.f10702m.b()) {
                        TTRewardExpressVideoActivity.this.f10702m.o();
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity3 = TTRewardExpressVideoActivity.this;
                    int i11 = tTRewardExpressVideoActivity3.f10708s;
                    if (i11 >= 0) {
                        tTRewardExpressVideoActivity3.f10700k.a(String.valueOf(i11), (CharSequence) null);
                    }
                    TTRewardExpressVideoActivity.this.f10698i.c(i10);
                    TTRewardExpressVideoActivity.this.a(j11, j12);
                    b bVar3 = TTRewardExpressVideoActivity.this.f10701l;
                    if (bVar3 != null && bVar3.a() != null) {
                        TTRewardExpressVideoActivity.this.f10701l.a().a(String.valueOf(TTRewardExpressVideoActivity.this.f10708s), i10, 0);
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity4 = TTRewardExpressVideoActivity.this;
                    if (tTRewardExpressVideoActivity4.f10708s > 0) {
                        if (z11 && i10 >= f10 && tTRewardExpressVideoActivity4.f10692c.f() != 5) {
                            TTRewardExpressVideoActivity.this.f10712w.getAndSet(true);
                            TTRewardExpressVideoActivity.this.f10700k.d(true);
                            TTRewardExpressVideoActivity tTRewardExpressVideoActivity5 = TTRewardExpressVideoActivity.this;
                            tTRewardExpressVideoActivity5.f10700k.a(String.valueOf(tTRewardExpressVideoActivity5.f10708s), f.f12351c);
                            TTRewardExpressVideoActivity.this.f10700k.e(true);
                            return;
                        }
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity6 = TTRewardExpressVideoActivity.this;
                        tTRewardExpressVideoActivity6.f10700k.a(String.valueOf(tTRewardExpressVideoActivity6.f10708s), (CharSequence) null);
                    } else if (tTRewardExpressVideoActivity4.i()) {
                        TTRewardExpressVideoActivity.this.a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                }
            }
        });
        boolean a10 = a(j10, z10, hashMap);
        if (a10 && !z10) {
            ((TTRewardVideoActivity) this).R = (int) (System.currentTimeMillis() / 1000);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void d() {
        super.d();
        if (p.i(this.f10692c)) {
            this.f10704o.a(true);
            this.f10704o.b();
            a(false);
            return;
        }
        d(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void o() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void u() {
        if (this.f10692c == null) {
            finish();
            return;
        }
        this.f10704o.a(false);
        super.u();
    }
}
