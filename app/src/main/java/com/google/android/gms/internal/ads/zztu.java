package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztu extends zzci {
    private static final Object zzc = new Object();
    private static final zzbb zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbb zzh;
    private final zzau zzi;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("SinglePeriodTimeline");
        zzahVar.zzb(Uri.EMPTY);
        zzd = zzahVar.zzc();
    }

    public zztu(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbb zzbbVar, zzau zzauVar) {
        this.zze = j13;
        this.zzf = j14;
        this.zzg = z10;
        this.zzh = zzbbVar;
        this.zzi = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i10, zzcf zzcfVar, boolean z10) {
        zzcw.zza(i10, 0, 1);
        zzcfVar.zzk(null, z10 ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i10, zzch zzchVar, long j10) {
        zzcw.zza(i10, 0, 1);
        zzchVar.zza(zzch.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i10) {
        zzcw.zza(i10, 0, 1);
        return zzc;
    }
}
