package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzglm extends zzglo {
    private zzglm() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglm(zzgll zzgllVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final List zza(Object obj, long j10) {
        zzgkz zzgkzVar = (zzgkz) zzgnu.zzh(obj, j10);
        if (zzgkzVar.zzc()) {
            return zzgkzVar;
        }
        int size = zzgkzVar.size();
        zzgkz zzd = zzgkzVar.zzd(size == 0 ? 10 : size + size);
        zzgnu.zzv(obj, j10, zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzb(Object obj, long j10) {
        ((zzgkz) zzgnu.zzh(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgkz zzgkzVar = (zzgkz) zzgnu.zzh(obj, j10);
        zzgkz zzgkzVar2 = (zzgkz) zzgnu.zzh(obj2, j10);
        int size = zzgkzVar.size();
        int size2 = zzgkzVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkzVar.zzc()) {
                zzgkzVar = zzgkzVar.zzd(size2 + size);
            }
            zzgkzVar.addAll(zzgkzVar2);
        }
        if (size > 0) {
            zzgkzVar2 = zzgkzVar;
        }
        zzgnu.zzv(obj, j10, zzgkzVar2);
    }
}
