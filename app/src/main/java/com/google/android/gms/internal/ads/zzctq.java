package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzctq implements zzfuy {
    final /* synthetic */ zzcts zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctq(zzcts zzctsVar) {
        this.zza = zzctsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcm zzfcmVar;
        zzfie zzfieVar;
        zzfbx zzfbxVar;
        zzfbl zzfblVar;
        zzfbl zzfblVar2;
        Context context;
        String str = (String) obj;
        zzcts zzctsVar = this.zza;
        zzfcmVar = zzctsVar.zzh;
        zzfieVar = zzctsVar.zzg;
        zzfbxVar = zzctsVar.zze;
        zzfblVar = zzctsVar.zzf;
        zzfblVar2 = zzctsVar.zzf;
        List zzb = zzfieVar.zzb(zzfbxVar, zzfblVar, false, "", str, zzfblVar2.zzc);
        zzcer zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        zzfcmVar.zzc(zzb, true == zzo.zzv(context) ? 2 : 1);
    }
}
