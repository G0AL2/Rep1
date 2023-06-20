package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbrx implements zzbom {
    final /* synthetic */ zzbsl zza;
    final /* synthetic */ zzbrh zzb;
    final /* synthetic */ zzbsm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrx(zzbsm zzbsmVar, zzbsl zzbslVar, zzbrh zzbrhVar) {
        this.zzc = zzbsmVar;
        this.zza = zzbslVar;
        this.zzb = zzbrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        zzbsn zzbsnVar = (zzbsn) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zzc.zzi = 0;
                zzbrh zzbrhVar = this.zzb;
                zzbrhVar.zzq("/log", zzbol.zzg);
                zzbrhVar.zzq("/result", zzbol.zzo);
                this.zza.zzh(this.zzb);
                this.zzc.zzh = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
