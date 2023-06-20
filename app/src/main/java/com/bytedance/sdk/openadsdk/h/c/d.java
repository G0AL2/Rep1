package com.bytedance.sdk.openadsdk.h.c;

import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.t;

/* compiled from: LogUploaderImpl4MultiProcess.java */
/* loaded from: classes.dex */
public class d implements a {
    /* JADX INFO: Access modifiers changed from: private */
    public String b(com.bytedance.sdk.openadsdk.h.a aVar) throws Exception {
        return new c.a(l.a(), aVar.a().a()).a();
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a() {
        com.bytedance.sdk.openadsdk.multipro.c.a.e();
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a(final com.bytedance.sdk.openadsdk.h.a aVar) {
        try {
            t.b(new g("uploadEvent") { // from class: com.bytedance.sdk.openadsdk.h.c.d.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.multipro.c.a.b(aVar.a().a().toString());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a(final com.bytedance.sdk.openadsdk.h.a aVar, final boolean z10) {
        try {
            t.b(new g("uploadEvent") { // from class: com.bytedance.sdk.openadsdk.h.c.d.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.multipro.c.a.a(d.this.b(aVar), z10);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
