package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfr implements zzeq {
    private final zzeq zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzfr(zzeq zzeqVar) {
        Objects.requireNonNull(zzeqVar);
        this.zza = zzeqVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zza = this.zza.zza(bArr, i10, i11);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        this.zzc = zzevVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzevVar);
        Uri zzc = zzc();
        Objects.requireNonNull(zzc);
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        this.zza.zzf(zzfsVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
