package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.a.e;
import com.bytedance.sdk.openadsdk.component.reward.b.a;
import com.bytedance.sdk.openadsdk.component.reward.b.c;
import com.bytedance.sdk.openadsdk.component.reward.view.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import java.util.HashMap;
import m3.c;

/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean J() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.video.c.b
    public boolean a(long j10, boolean z10) {
        j jVar;
        b bVar = this.f10701l;
        if (bVar != null && bVar.a() != null) {
            jVar = this.f10701l.a().getAdShowTime();
        } else {
            jVar = new j();
        }
        j jVar2 = jVar;
        a aVar = this.L;
        if (aVar != null && (aVar instanceof c) && !this.M) {
            this.f10702m.a(((c) aVar).d(), this.f10692c, this.f10684a, I(), jVar2);
        } else {
            this.f10702m.a(this.f10701l.b(), this.f10692c, this.f10684a, I(), jVar2);
        }
        HashMap hashMap = new HashMap();
        b bVar2 = this.f10701l;
        if (bVar2 != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(bVar2.i()));
        }
        if (!TextUtils.isEmpty(this.D)) {
            hashMap.put("rit_scene", this.D);
        }
        this.f10702m.a(hashMap);
        this.f10702m.a(new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            @Override // m3.c.a
            public void a(long j11, int i10) {
                TTFullScreenExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.E();
                TTFullScreenExpressVideoActivity.this.f10701l.b(true);
                TTFullScreenExpressVideoActivity.this.M();
                if (TTFullScreenExpressVideoActivity.this.i()) {
                    TTFullScreenExpressVideoActivity.this.a(false);
                } else if (n.c(TTFullScreenExpressVideoActivity.this.f10692c)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                } else {
                    b bVar3 = TTFullScreenExpressVideoActivity.this.f10701l;
                    if (bVar3 == null || bVar3.a() == null) {
                        return;
                    }
                    TTFullScreenExpressVideoActivity.this.f10701l.a().a("0", 0, 0);
                    if (TTFullScreenExpressVideoActivity.this.f10701l.h()) {
                        TTFullScreenExpressVideoActivity.this.f10700k.a("0", "X");
                        TTFullScreenExpressVideoActivity.this.f10700k.e(true);
                    }
                }
            }

            @Override // m3.c.a
            public void b(long j11, int i10) {
                TTFullScreenExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.D();
                if (TTFullScreenExpressVideoActivity.this.f10702m.b()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.E();
                TTFullScreenExpressVideoActivity.this.f10702m.m();
                l.e("TTFullScreenExpressVideoActivity", "onError、、、、、、、、");
                TTFullScreenExpressVideoActivity.this.f10701l.a(true);
                if (TTFullScreenExpressVideoActivity.this.i()) {
                    TTFullScreenExpressVideoActivity.this.a(false);
                    e eVar = TTFullScreenExpressVideoActivity.this.f10702m;
                    eVar.a(1 ^ eVar.B(), 2);
                    return;
                }
                TTFullScreenExpressVideoActivity.this.finish();
            }

            @Override // m3.c.a
            public void a() {
                TTFullScreenExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.E();
                l.b("TTFullScreenExpressVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenExpressVideoActivity.this.i()) {
                    TTFullScreenExpressVideoActivity.this.a(false);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                e eVar = TTFullScreenExpressVideoActivity.this.f10702m;
                eVar.a(!eVar.B(), !TTFullScreenExpressVideoActivity.this.f10702m.B());
                TTFullScreenExpressVideoActivity.this.f10702m.m();
            }

            @Override // m3.c.a
            public void a(long j11, long j12) {
                TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                if (!tTFullScreenExpressVideoActivity.H && tTFullScreenExpressVideoActivity.f10702m.b()) {
                    TTFullScreenExpressVideoActivity.this.f10702m.o();
                }
                if (TTFullScreenExpressVideoActivity.this.f10711v.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.f10706q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (j11 != TTFullScreenExpressVideoActivity.this.f10702m.f()) {
                    TTFullScreenExpressVideoActivity.this.E();
                }
                if (TTFullScreenExpressVideoActivity.this.f10702m.b()) {
                    TTFullScreenExpressVideoActivity.this.f10702m.a(j11);
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity2 = TTFullScreenExpressVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTFullScreenExpressVideoActivity2.f10708s = (int) (tTFullScreenExpressVideoActivity2.f10702m.C() - j13);
                    int i10 = (int) j13;
                    if ((TTFullScreenExpressVideoActivity.this.A.get() || TTFullScreenExpressVideoActivity.this.f10714y.get()) && TTFullScreenExpressVideoActivity.this.f10702m.b()) {
                        TTFullScreenExpressVideoActivity.this.f10702m.o();
                    }
                    b bVar3 = TTFullScreenExpressVideoActivity.this.f10701l;
                    if (bVar3 != null && bVar3.a() != null) {
                        TTFullScreenExpressVideoActivity.this.f10701l.a().a(String.valueOf(TTFullScreenExpressVideoActivity.this.f10708s), i10, 0);
                    }
                    if (TTFullScreenExpressVideoActivity.this.f10701l.h()) {
                        TTFullScreenExpressVideoActivity.this.e(i10);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity3 = TTFullScreenExpressVideoActivity.this;
                        if (tTFullScreenExpressVideoActivity3.f10708s >= 0) {
                            tTFullScreenExpressVideoActivity3.f10700k.d(true);
                            TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity4 = TTFullScreenExpressVideoActivity.this;
                            tTFullScreenExpressVideoActivity4.f10700k.a(String.valueOf(tTFullScreenExpressVideoActivity4.f10708s), (CharSequence) null);
                        }
                    }
                    if (TTFullScreenExpressVideoActivity.this.f10708s <= 0) {
                        l.b("TTFullScreenExpressVideoActivity", "onProgressUpdate、、、、、、、、");
                        if (TTFullScreenExpressVideoActivity.this.i()) {
                            TTFullScreenExpressVideoActivity.this.a(false);
                        } else if (n.c(TTFullScreenExpressVideoActivity.this.f10692c)) {
                            TTFullScreenExpressVideoActivity.this.finish();
                        }
                    }
                }
            }
        });
        return a(j10, z10, hashMap);
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
