package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzgnk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i10, int i11);

    abstract void zzi(Object obj, int i10, long j10);

    abstract void zzj(Object obj, int i10, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i10, zzgji zzgjiVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(Object obj, zzgml zzgmlVar) throws IOException {
        int zzd = zzgmlVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzgmlVar.zzl());
            return true;
        } else if (i11 == 1) {
            zzi(obj, i10, zzgmlVar.zzk());
            return true;
        } else if (i11 == 2) {
            zzk(obj, i10, zzgmlVar.zzp());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    zzh(obj, i10, zzgmlVar.zzf());
                    return true;
                }
                throw zzglc.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i12 = 4 | (i10 << 3);
            while (zzgmlVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgmlVar)) {
            }
            if (i12 == zzgmlVar.zzd()) {
                zzg(zzf);
                zzj(obj, i10, zzf);
                return true;
            }
            throw zzglc.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzgml zzgmlVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(Object obj, zzgjy zzgjyVar) throws IOException;
}
