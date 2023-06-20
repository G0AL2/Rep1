package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzfum extends zzfuc {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfum(zzfre zzfreVar, boolean z10) {
        super(zzfreVar, true, true);
        List zza;
        if (zzfreVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfrx.zza(zzfreVar.size());
        }
        for (int i10 = 0; i10 < zzfreVar.size(); i10++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzg(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzful(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzz(int i10) {
        super.zzz(i10);
        this.zza = null;
    }
}
