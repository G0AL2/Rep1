package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbyq extends zzbyj {
    final /* synthetic */ List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyq(zzbys zzbysVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String str) {
        zzcfi.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list) {
        zzcfi.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
