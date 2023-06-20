package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaez implements zzafg {
    private final zzaff zza;
    private final long zzb;
    private final long zzc;
    private final zzafl zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaez(zzafl zzaflVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzcw.zzd(j10 >= 0 && j11 > j10);
        this.zzd = zzaflVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 != j11 - j10 && !z10) {
            this.zze = 0;
        } else {
            this.zzf = j13;
            this.zze = 4;
        }
        this.zza = new zzaff();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzafg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzys r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaez.zzd(com.google.android.gms.internal.ads.zzys):long");
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final /* bridge */ /* synthetic */ zzzu zze() {
        if (this.zzf != 0) {
            return new zzaey(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j10) {
        this.zzh = zzeg.zzr(j10, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
