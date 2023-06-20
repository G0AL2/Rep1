package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o f14241a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14242b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14243c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14244d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(o oVar, boolean z10, int i10, int i11) {
        this.f14241a = oVar;
        this.f14242b = z10;
        this.f14243c = i10;
        this.f14244d = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14241a.a(this.f14242b, this.f14243c, this.f14244d);
    }
}
