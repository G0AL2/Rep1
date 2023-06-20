package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdaw implements zzddh, zzdco {
    private final Context zza;
    private final zzfbl zzb;
    private final zzbya zzc;

    public zzdaw(Context context, zzfbl zzfblVar, zzbya zzbyaVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfblVar;
        this.zzc = zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzbyb zzbybVar = this.zzb.zzae;
        if (zzbybVar == null || !zzbybVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
