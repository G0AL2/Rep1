package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzch {
    public static final zzl zzb;
    private static final zzbb zzr;
    public Object zzc = zza;
    public zzbb zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    public zzau zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzq = new Object();

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("androidx.media3.common.Timeline");
        zzahVar.zzb(Uri.EMPTY);
        zzr = zzahVar.zzc();
        zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcg
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzch.class.equals(obj.getClass())) {
            zzch zzchVar = (zzch) obj;
            if (zzeg.zzS(this.zzc, zzchVar.zzc) && zzeg.zzS(this.zzd, zzchVar.zzd) && zzeg.zzS(null, null) && zzeg.zzS(this.zzk, zzchVar.zzk) && this.zze == zzchVar.zze && this.zzf == zzchVar.zzf && this.zzg == zzchVar.zzg && this.zzh == zzchVar.zzh && this.zzi == zzchVar.zzi && this.zzl == zzchVar.zzl && this.zzn == zzchVar.zzn && this.zzo == zzchVar.zzo && this.zzp == zzchVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode()) * 961;
        zzau zzauVar = this.zzk;
        int hashCode2 = zzauVar == null ? 0 : zzauVar.hashCode();
        long j10 = this.zze;
        long j11 = this.zzf;
        long j12 = this.zzg;
        boolean z10 = this.zzh;
        boolean z11 = this.zzi;
        boolean z12 = this.zzl;
        long j13 = this.zzn;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 961) + ((int) ((j13 >>> 32) ^ j13))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzch zza(Object obj, zzbb zzbbVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzau zzauVar, long j13, long j14, int i10, int i11, long j15) {
        this.zzc = obj;
        this.zzd = zzbbVar != null ? zzbbVar : zzr;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzauVar != null;
        this.zzk = zzauVar;
        this.zzm = 0L;
        this.zzn = j14;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzcw.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
