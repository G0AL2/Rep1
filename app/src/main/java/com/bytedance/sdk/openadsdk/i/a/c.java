package com.bytedance.sdk.openadsdk.i.a;

import com.bytedance.sdk.component.d.g;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.q;
import com.bytedance.sdk.openadsdk.i.a.a;

/* compiled from: SplashGifLoader.java */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f13337a;

    /* renamed from: b  reason: collision with root package name */
    private q f13338b;

    private void a(j jVar) {
        g e10 = jVar.e();
        if (e10 == null || !c()) {
            return;
        }
        if (jVar.d()) {
            l.b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
            f13337a = 1;
            a(true);
        } else {
            l.b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
            f13337a = 2;
            a(false);
        }
        a(e10.a());
    }

    private boolean c() {
        q qVar = this.f13338b;
        return qVar != null && qVar.c();
    }

    private void d() {
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            q qVar = this.f13338b;
            qVar.a(currentTimeMillis - qVar.a());
            this.f13338b.c(currentTimeMillis);
        }
    }

    private void a(long j10) {
        this.f13338b.d(j10);
        q qVar = this.f13338b;
        qVar.b(j10 - qVar.b());
    }

    private void a(boolean z10) {
        if (c()) {
            this.f13338b.a(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.i.a.a
    public void a(j jVar, a.b bVar) {
        a(jVar);
        super.a(jVar, bVar);
    }

    @Override // com.bytedance.sdk.openadsdk.i.a.a
    protected void a() {
        d();
    }
}
