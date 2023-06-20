package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctr implements zzfuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcts zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctr(zzcts zzctsVar, String str) {
        this.zzb = zzctsVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzfcm zzfcmVar;
        zzfie zzfieVar;
        zzfbx zzfbxVar;
        zzfbl zzfblVar;
        zzfbl zzfblVar2;
        zzcts zzctsVar = this.zzb;
        zzfcmVar = zzctsVar.zzh;
        zzfieVar = zzctsVar.zzg;
        zzfbxVar = zzctsVar.zze;
        zzfblVar = zzctsVar.zzf;
        String str = this.zza;
        zzfblVar2 = zzctsVar.zzf;
        zzfcmVar.zza(zzfieVar.zzb(zzfbxVar, zzfblVar, false, str, null, zzfblVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcm zzfcmVar;
        zzfie zzfieVar;
        zzfbx zzfbxVar;
        zzfbl zzfblVar;
        zzfbl zzfblVar2;
        String str = (String) obj;
        zzcts zzctsVar = this.zzb;
        zzfcmVar = zzctsVar.zzh;
        zzfieVar = zzctsVar.zzg;
        zzfbxVar = zzctsVar.zze;
        zzfblVar = zzctsVar.zzf;
        String str2 = this.zza;
        zzfblVar2 = zzctsVar.zzf;
        zzfcmVar.zza(zzfieVar.zzb(zzfbxVar, zzfblVar, false, str2, str, zzfblVar2.zzd));
    }
}
