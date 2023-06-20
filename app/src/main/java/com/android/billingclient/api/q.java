package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6094a;

    /* renamed from: b  reason: collision with root package name */
    private final p f6095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context, o2.o oVar) {
        this.f6094a = context;
        this.f6095b = new p(this, (o2.o) null, (o2.u) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o2.o b() {
        p.a(this.f6095b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o2.h c() {
        return p.b(this.f6095b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f6095b.d(this.f6094a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.f6095b.c(this.f6094a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context, o2.h hVar) {
        this.f6094a = context;
        this.f6095b = new p(this, hVar, (o2.u) null);
    }
}
