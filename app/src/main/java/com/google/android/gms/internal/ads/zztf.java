package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztf implements zzsm {
    private final zzep zzc;
    private int zzd;
    private final zzte zze;
    private final zzvz zzf;
    private final zzoz zzg;

    public zztf(zzep zzepVar, zzte zzteVar, byte[] bArr) {
        zzoz zzozVar = new zzoz();
        zzvz zzvzVar = new zzvz(-1);
        this.zzc = zzepVar;
        this.zze = zzteVar;
        this.zzg = zzozVar;
        this.zzf = zzvzVar;
        this.zzd = 1048576;
    }

    public final zztf zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzth zzb(zzbb zzbbVar) {
        Objects.requireNonNull(zzbbVar.zzd);
        return new zzth(zzbbVar, this.zzc, this.zze, zzpi.zza, this.zzf, this.zzd, null, null);
    }
}
