package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapu implements Callable {
    private final zzapc zza;
    private final zzali zzb;

    public zzapu(zzapc zzapcVar, zzali zzaliVar) {
        this.zza = zzapcVar;
        this.zzb = zzaliVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaly zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzali zzaliVar = this.zzb;
                    byte[] zzaw = zzc.zzaw();
                    zzaliVar.zzak(zzaw, 0, zzaw.length, zzgkc.zza());
                }
                return null;
            } catch (zzglc | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
