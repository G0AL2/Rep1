package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.ads.redexgen.X.Iy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC1019Iy implements ThreadFactory {
    public final /* synthetic */ String A00;

    public ThreadFactoryC1019Iy(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
