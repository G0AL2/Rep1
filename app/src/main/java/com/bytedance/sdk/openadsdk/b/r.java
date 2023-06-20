package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.openadsdk.h.c.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StatsDispatcher4MultiProcess.java */
/* loaded from: classes.dex */
public class r extends c<c.a> {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f11165a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private boolean f11166b;

    public r(boolean z10) {
        this.f11166b = true;
        this.f11166b = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void a() {
        if (this.f11165a.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.c.a.a(this.f11166b);
    }

    @Override // com.bytedance.sdk.openadsdk.b.c
    public void a(c.a aVar) {
        if (!this.f11165a.get()) {
            a();
        }
        if (this.f11165a.get()) {
            com.bytedance.sdk.openadsdk.multipro.c.a.a(aVar.a(), this.f11166b);
        }
    }
}
