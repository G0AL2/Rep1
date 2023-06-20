package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabt  reason: invalid package */
/* loaded from: classes2.dex */
abstract class zzabt {
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
    public abstract void zzk(Object obj, int i10, zzyi zzyiVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(Object obj, zzabb zzabbVar) throws IOException {
        int zzd = zzabbVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzabbVar.zzl());
            return true;
        } else if (i11 == 1) {
            zzi(obj, i10, zzabbVar.zzk());
            return true;
        } else if (i11 == 2) {
            zzk(obj, i10, zzabbVar.zzp());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    zzh(obj, i10, zzabbVar.zzf());
                    return true;
                }
                throw zzzt.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i12 = 4 | (i10 << 3);
            while (zzabbVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzabbVar)) {
            }
            if (i12 == zzabbVar.zzd()) {
                zzg(zzf);
                zzj(obj, i10, zzf);
                return true;
            }
            throw zzzt.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzabb zzabbVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(Object obj, zzyu zzyuVar) throws IOException;
}
