package com.bytedance.sdk.openadsdk.b;

/* compiled from: LastShowAdManager.java */
/* loaded from: classes.dex */
public class o {
    public static void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, final String str) {
        if (nVar != null) {
            com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.o.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.utils.p.a(com.bytedance.sdk.openadsdk.core.e.n.this.ar().toString(), str);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
