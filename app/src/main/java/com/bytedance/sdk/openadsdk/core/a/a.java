package com.bytedance.sdk.openadsdk.core.a;

import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.n;

/* compiled from: AdCallBackAdapter.java */
/* loaded from: classes.dex */
public class a implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private n.a f11822a;

    public a(n.a aVar) {
        this.f11822a = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.n.a
    public void a(int i10, String str) {
        n.a aVar = this.f11822a;
        if (aVar != null) {
            aVar.a(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.n.a
    public void a(final com.bytedance.sdk.openadsdk.core.e.a aVar, final com.bytedance.sdk.openadsdk.core.e.b bVar) {
        if (this.f11822a != null) {
            if (f3.a.w()) {
                this.f11822a.a(aVar, bVar);
            } else {
                k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f11822a.a(aVar, bVar);
                    }
                });
            }
        }
    }
}
