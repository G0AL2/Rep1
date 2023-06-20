package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbry implements zzbom {
    final /* synthetic */ zzbrh zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzbsm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbry(zzbsm zzbsmVar, zzaoc zzaocVar, zzbrh zzbrhVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbsmVar;
        this.zza = zzbrhVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbom, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        zzbsn zzbsnVar = (zzbsn) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzcfi.zzi("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                zzcfi.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
