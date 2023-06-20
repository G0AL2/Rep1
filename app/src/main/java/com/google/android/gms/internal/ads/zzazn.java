package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzazn implements ThreadFactory {
    final /* synthetic */ String zza = "Loader:ExtractorMediaPeriod";

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazn(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
