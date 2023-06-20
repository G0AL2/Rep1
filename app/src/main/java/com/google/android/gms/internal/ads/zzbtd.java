package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbtd implements zzboz {
    final /* synthetic */ zzbte zza;
    private final zzbsg zzb;
    private final zzcga zzc;

    public zzbtd(zzbte zzbteVar, zzbsg zzbsgVar, zzcga zzcgaVar) {
        this.zza = zzbteVar;
        this.zzb = zzbsgVar;
        this.zzc = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zza(String str) {
        zzbsg zzbsgVar;
        try {
            if (str == null) {
                this.zzc.zze(new zzbsp());
            } else {
                this.zzc.zze(new zzbsp(str));
            }
            zzbsgVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbsgVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbsgVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject) {
        zzbsg zzbsgVar;
        zzbss zzbssVar;
        try {
            try {
                zzcga zzcgaVar = this.zzc;
                zzbssVar = this.zza.zza;
                zzcgaVar.zzd(zzbssVar.zza(jSONObject));
                zzbsgVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbsgVar = this.zzb;
            } catch (JSONException e10) {
                this.zzc.zze(e10);
                zzbsgVar = this.zzb;
            }
            zzbsgVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
