package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzmn {
    final /* synthetic */ zzmo zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzsa zze;
    private boolean zzf;
    private boolean zzg;

    public zzmn(zzmo zzmoVar, String str, int i10, zzsa zzsaVar) {
        this.zza = zzmoVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzsaVar == null ? -1L : zzsaVar.zzd;
        if (zzsaVar == null || !zzsaVar.zzb()) {
            return;
        }
        this.zze = zzsaVar;
    }

    public final void zzg(int i10, zzsa zzsaVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzsaVar != null) {
            this.zzd = zzsaVar.zzd;
        }
    }

    public final boolean zzj(int i10, zzsa zzsaVar) {
        if (zzsaVar == null) {
            return i10 == this.zzc;
        }
        zzsa zzsaVar2 = this.zze;
        return zzsaVar2 == null ? !zzsaVar.zzb() && zzsaVar.zzd == this.zzd : zzsaVar.zzd == zzsaVar2.zzd && zzsaVar.zzb == zzsaVar2.zzb && zzsaVar.zzc == zzsaVar2.zzc;
    }

    public final boolean zzk(zzki zzkiVar) {
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null) {
            return this.zzc != zzkiVar.zzc;
        } else if (zzsaVar.zzd > j10) {
            return true;
        } else {
            if (this.zze == null) {
                return false;
            }
            int zza = zzkiVar.zzb.zza(zzsaVar.zza);
            int zza2 = zzkiVar.zzb.zza(this.zze.zza);
            zzsa zzsaVar2 = zzkiVar.zzd;
            if (zzsaVar2.zzd < this.zze.zzd || zza < zza2) {
                return false;
            }
            if (zza > zza2) {
                return true;
            }
            if (zzsaVar2.zzb()) {
                zzsa zzsaVar3 = zzkiVar.zzd;
                int i10 = zzsaVar3.zzb;
                int i11 = zzsaVar3.zzc;
                zzsa zzsaVar4 = this.zze;
                int i12 = zzsaVar4.zzb;
                return i10 > i12 || (i10 == i12 && i11 > zzsaVar4.zzc);
            }
            int i13 = zzkiVar.zzd.zze;
            return i13 == -1 || i13 > this.zze.zzb;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzci r7, com.google.android.gms.internal.ads.zzci r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzmo r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = com.google.android.gms.internal.ads.zzmo.zzb(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmo r0 = r6.zza
            com.google.android.gms.internal.ads.zzch r0 = com.google.android.gms.internal.ads.zzmo.zzb(r0)
            int r0 = r0.zzo
        L26:
            com.google.android.gms.internal.ads.zzmo r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = com.google.android.gms.internal.ads.zzmo.zzb(r1)
            int r1 = r1.zzp
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzmo r7 = r6.zza
            com.google.android.gms.internal.ads.zzcf r7 = com.google.android.gms.internal.ads.zzmo.zza(r7)
            com.google.android.gms.internal.ads.zzcf r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzsa r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmn.zzl(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzci):boolean");
    }
}
