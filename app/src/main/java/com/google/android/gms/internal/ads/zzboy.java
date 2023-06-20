package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzboy implements zzboz {
    final /* synthetic */ zzcga zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboy(zzbpa zzbpaVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza(String str) {
        this.zza.zze(new zzbsp(str));
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
