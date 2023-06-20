package com.bytedance.sdk.openadsdk.b;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AdEventDispatcher4MultiProcess.java */
/* loaded from: classes.dex */
public class d extends c<a> {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f11083a = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void a() {
        if (this.f11083a.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.c.a.c();
    }

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void a(a aVar) {
        if (!this.f11083a.get()) {
            a();
        }
        if (this.f11083a.get()) {
            try {
                com.bytedance.sdk.openadsdk.multipro.c.a.a(aVar.a());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
