package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagl implements zzaga {
    private final zzahb zza;
    private String zzb;
    private zzzy zzc;
    private zzagk zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzg = new zzagp(32, 128);
    private final zzagp zzh = new zzagp(33, 128);
    private final zzagp zzi = new zzagp(34, 128);
    private final zzagp zzj = new zzagp(39, 128);
    private final zzagp zzk = new zzagp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzdy zzn = new zzdy();

    public zzagl(zzahb zzahbVar) {
        this.zza = zzahbVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzb(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c3  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzdy r38) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagl.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzagk(zzv);
        this.zza.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzm = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzzo.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzagk zzagkVar = this.zzd;
        if (zzagkVar != null) {
            zzagkVar.zzc();
        }
    }
}
