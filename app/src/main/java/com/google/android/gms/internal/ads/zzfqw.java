package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfqw extends zzfqy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqw() {
        super(null);
    }

    static final zzfqy zzf(int i10) {
        zzfqy zzfqyVar;
        zzfqy zzfqyVar2;
        zzfqy zzfqyVar3;
        if (i10 < 0) {
            zzfqyVar3 = zzfqy.zzb;
            return zzfqyVar3;
        } else if (i10 > 0) {
            zzfqyVar2 = zzfqy.zzc;
            return zzfqyVar2;
        } else {
            zzfqyVar = zzfqy.zza;
            return zzfqyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzb(int i10, int i11) {
        return zzf(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzd(boolean z10, boolean z11) {
        return zzf(zzftn.zza(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zze(boolean z10, boolean z11) {
        return zzf(zzftn.zza(false, false));
    }
}
