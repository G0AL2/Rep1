package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeer implements zzfuy {
    final /* synthetic */ zzffi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeer(zzees zzeesVar, zzffi zzffiVar) {
        this.zza = zzffiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            zzcfi.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
