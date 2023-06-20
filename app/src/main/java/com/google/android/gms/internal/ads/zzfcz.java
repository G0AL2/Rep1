package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcz {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfvm zzc;

    public zzfcz(Callable callable, zzfvm zzfvmVar) {
        this.zzb = callable;
        this.zzc = zzfvmVar;
    }

    public final synchronized zzfvl zza() {
        zzc(1);
        return (zzfvl) this.zza.poll();
    }

    public final synchronized void zzb(zzfvl zzfvlVar) {
        this.zza.addFirst(zzfvlVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
