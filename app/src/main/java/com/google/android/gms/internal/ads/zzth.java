package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzth extends zzrb implements zzsy {
    private final zzbb zza;
    private final zzaw zzb;
    private final zzep zzc;
    private final zzpi zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzfs zzj;
    private final zzte zzk;
    private final zzvz zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzth(zzbb zzbbVar, zzep zzepVar, zzte zzteVar, zzpi zzpiVar, zzvz zzvzVar, int i10, zztg zztgVar, byte[] bArr) {
        zzaw zzawVar = zzbbVar.zzd;
        Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
        this.zza = zzbbVar;
        this.zzc = zzepVar;
        this.zzk = zzteVar;
        this.zzd = zzpiVar;
        this.zzl = zzvzVar;
        this.zze = i10;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j10 = this.zzg;
        boolean z10 = this.zzh;
        boolean z11 = this.zzi;
        zzbb zzbbVar = this.zza;
        zztu zztuVar = new zztu(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzbbVar, z11 ? zzbbVar.zzf : null);
        zzo(this.zzf ? new zztd(this, zztuVar) : zztuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        ((zztc) zzryVar).zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsaVar, zzvv zzvvVar, long j10) {
        zzeq zza = this.zzc.zza();
        zzfs zzfsVar = this.zzj;
        if (zzfsVar != null) {
            zza.zzf(zzfsVar);
        }
        Uri uri = this.zzb.zza;
        zzte zzteVar = this.zzk;
        zzb();
        zzrd zzrdVar = new zzrd(zzteVar.zza);
        zzpi zzpiVar = this.zzd;
        zzpc zzc = zzc(zzsaVar);
        zzvz zzvzVar = this.zzl;
        zzsj zze = zze(zzsaVar);
        String str = this.zzb.zzf;
        return new zztc(uri, zza, zzrdVar, zzpiVar, zzc, zzvzVar, zze, this, zzvvVar, null, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zzg;
        }
        if (!this.zzf && this.zzg == j10 && this.zzh == z10 && this.zzi == z11) {
            return;
        }
        this.zzg = j10;
        this.zzh = z10;
        this.zzi = z11;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    protected final void zzn(zzfs zzfsVar) {
        this.zzj = zzfsVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.zza;
    }
}
