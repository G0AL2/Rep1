package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfvq extends zzftt.zzi implements Runnable {
    private final Runnable zza;

    public zzfvq(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e10) {
            zze(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzftt
    public final String zza() {
        return "task=[" + this.zza + "]";
    }
}
