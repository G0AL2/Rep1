package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrv extends zzrj {
    private final zzsc zza;
    private final boolean zzb;
    private final zzch zzc;
    private final zzcf zzd;
    private zzrt zze;
    private zzrs zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzrv(zzsc zzscVar, boolean z10) {
        boolean z11;
        this.zza = zzscVar;
        if (z10) {
            zzscVar.zzu();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        zzscVar.zzG();
        this.zze = zzrt.zzq(zzscVar.zzz());
    }

    private final Object zzE(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzrt.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    private final void zzF(long j10) {
        zzrs zzrsVar = this.zzf;
        int zza = this.zze.zza(zzrsVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzrt zzrtVar = this.zze;
        zzcf zzcfVar = this.zzd;
        zzrtVar.zzd(zza, zzcfVar, false);
        long j11 = zzcfVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzrsVar.zzs(j10);
    }

    public final zzci zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        ((zzrs) zzryVar).zzt();
        if (zzryVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    /* renamed from: zzC */
    public final zzrs zzD(zzsa zzsaVar, zzvv zzvvVar, long j10) {
        zzrs zzrsVar = new zzrs(zzsaVar, zzvvVar, j10, null);
        zzrsVar.zzu(this.zza);
        if (this.zzh) {
            zzrsVar.zzr(zzsaVar.zzc(zzE(zzsaVar.zza)));
        } else {
            this.zzf = zzrsVar;
            if (!this.zzg) {
                this.zzg = true;
                zzy(null, this.zza);
            }
        }
        return zzrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzn(zzfs zzfsVar) {
        super.zzn(zzfsVar);
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzy(null, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzrj
    public final /* bridge */ /* synthetic */ zzsa zzv(Object obj, zzsa zzsaVar) {
        Object obj2;
        Object obj3;
        Void r22 = (Void) obj;
        Object obj4 = zzsaVar.zza;
        obj2 = this.zze.zzf;
        if (obj2 != null) {
            obj3 = this.zze.zzf;
            if (obj3.equals(obj4)) {
                obj4 = zzrt.zzd;
            }
        }
        return zzsaVar.zzc(obj4);
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzsc
    public final void zzw() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzx(java.lang.Object r13, com.google.android.gms.internal.ads.zzsc r14, com.google.android.gms.internal.ads.zzci r15) {
        /*
            r12 = this;
            java.lang.Void r13 = (java.lang.Void) r13
            boolean r13 = r12.zzh
            r14 = 0
            if (r13 == 0) goto L1c
            com.google.android.gms.internal.ads.zzrt r13 = r12.zze
            com.google.android.gms.internal.ads.zzrt r13 = r13.zzp(r15)
            r12.zze = r13
            com.google.android.gms.internal.ads.zzrs r13 = r12.zzf
            if (r13 == 0) goto L9d
            long r0 = r13.zzn()
            r12.zzF(r0)
            goto L9d
        L1c:
            boolean r13 = r15.zzo()
            if (r13 == 0) goto L38
            boolean r13 = r12.zzi
            if (r13 == 0) goto L2d
            com.google.android.gms.internal.ads.zzrt r13 = r12.zze
            com.google.android.gms.internal.ads.zzrt r13 = r13.zzp(r15)
            goto L35
        L2d:
            java.lang.Object r13 = com.google.android.gms.internal.ads.zzch.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrt.zzd
            com.google.android.gms.internal.ads.zzrt r13 = com.google.android.gms.internal.ads.zzrt.zzr(r15, r13, r0)
        L35:
            r12.zze = r13
            goto L9d
        L38:
            com.google.android.gms.internal.ads.zzch r13 = r12.zzc
            r0 = 0
            r1 = 0
            r15.zze(r0, r13, r1)
            com.google.android.gms.internal.ads.zzch r13 = r12.zzc
            java.lang.Object r13 = r13.zzc
            com.google.android.gms.internal.ads.zzrs r3 = r12.zzf
            if (r3 == 0) goto L64
            long r4 = r3.zzq()
            com.google.android.gms.internal.ads.zzrt r6 = r12.zze
            com.google.android.gms.internal.ads.zzsa r3 = r3.zza
            java.lang.Object r3 = r3.zza
            com.google.android.gms.internal.ads.zzcf r7 = r12.zzd
            r6.zzn(r3, r7)
            com.google.android.gms.internal.ads.zzrt r3 = r12.zze
            com.google.android.gms.internal.ads.zzch r6 = r12.zzc
            r3.zze(r0, r6, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L64
            r10 = r4
            goto L65
        L64:
            r10 = r1
        L65:
            com.google.android.gms.internal.ads.zzch r7 = r12.zzc
            com.google.android.gms.internal.ads.zzcf r8 = r12.zzd
            r9 = 0
            r6 = r15
            android.util.Pair r0 = r6.zzl(r7, r8, r9, r10)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r12.zzi
            if (r0 == 0) goto L84
            com.google.android.gms.internal.ads.zzrt r13 = r12.zze
            com.google.android.gms.internal.ads.zzrt r13 = r13.zzp(r15)
            goto L88
        L84:
            com.google.android.gms.internal.ads.zzrt r13 = com.google.android.gms.internal.ads.zzrt.zzr(r15, r13, r1)
        L88:
            r12.zze = r13
            com.google.android.gms.internal.ads.zzrs r13 = r12.zzf
            if (r13 == 0) goto L9d
            r12.zzF(r2)
            com.google.android.gms.internal.ads.zzsa r13 = r13.zza
            java.lang.Object r14 = r13.zza
            java.lang.Object r14 = r12.zzE(r14)
            com.google.android.gms.internal.ads.zzsa r14 = r13.zzc(r14)
        L9d:
            r13 = 1
            r12.zzi = r13
            r12.zzh = r13
            com.google.android.gms.internal.ads.zzrt r13 = r12.zze
            r12.zzo(r13)
            if (r14 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzrs r13 = r12.zzf
            java.util.Objects.requireNonNull(r13)
            r13.zzr(r14)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrv.zzx(java.lang.Object, com.google.android.gms.internal.ads.zzsc, com.google.android.gms.internal.ads.zzci):void");
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.zza.zzz();
    }
}
