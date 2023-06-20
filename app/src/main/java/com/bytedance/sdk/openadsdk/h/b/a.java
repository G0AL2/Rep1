package com.bytedance.sdk.openadsdk.h.b;

import com.bytedance.sdk.component.f.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.b;

/* compiled from: ReportThreadLogServiceImp.java */
/* loaded from: classes.dex */
public class a implements c {
    @Override // com.bytedance.sdk.component.f.c
    public void a(final com.bytedance.sdk.component.f.a.a aVar) {
        if (!m.h().F() || aVar == null || aVar.a() == null) {
            return;
        }
        e.a(new g("ReportThreadLogServiceImp") { // from class: com.bytedance.sdk.openadsdk.h.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                b.a().a("stats_sdk_thread_num", aVar.a());
            }
        }, 5);
    }
}
