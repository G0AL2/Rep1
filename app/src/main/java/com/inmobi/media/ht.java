package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* compiled from: InMobiThreadFactory.java */
/* loaded from: classes3.dex */
public final class ht implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private String f25704a;

    public ht(String str) {
        this.f25704a = "TIM-".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f25704a);
    }
}
