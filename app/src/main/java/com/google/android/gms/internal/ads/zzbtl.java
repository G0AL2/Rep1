package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtl implements zzboz {
    final /* synthetic */ zzbtm zza;
    private final zzcga zzb;

    public zzbtl(zzbtm zzbtmVar, zzcga zzcgaVar) {
        this.zza = zzbtmVar;
        this.zzb = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzbsp());
            } else {
                this.zzb.zze(new zzbsp(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zzb.zze(e10);
        }
    }
}
