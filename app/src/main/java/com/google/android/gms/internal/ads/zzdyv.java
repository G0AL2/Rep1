package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdyv {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final String zzd;
    private final int zze;

    public zzdyv(String str, String str2, int i10, String str3, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = str3;
        this.zze = i11;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put(MediationMetaData.KEY_VERSION, this.zzb);
        jSONObject.put("status", this.zzc);
        jSONObject.put("description", this.zzd);
        jSONObject.put("initializationLatencyMillis", this.zze);
        return jSONObject;
    }
}
