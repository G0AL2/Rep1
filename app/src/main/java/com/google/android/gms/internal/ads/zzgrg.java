package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgrg implements zzgrh {
    private static final Object zza = new Object();
    private volatile zzgrh zzb;
    private volatile Object zzc = zza;

    private zzgrg(zzgrh zzgrhVar) {
        this.zzb = zzgrhVar;
    }

    public static zzgrh zza(zzgrh zzgrhVar) {
        if ((zzgrhVar instanceof zzgrg) || (zzgrhVar instanceof zzgqt)) {
            return zzgrhVar;
        }
        Objects.requireNonNull(zzgrhVar);
        return new zzgrg(zzgrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzgrh zzgrhVar = this.zzb;
            if (zzgrhVar == null) {
                return this.zzc;
            }
            Object zzb = zzgrhVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
