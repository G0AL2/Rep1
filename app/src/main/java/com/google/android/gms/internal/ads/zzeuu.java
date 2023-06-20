package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeuu implements zzetf {
    private final JSONObject zza;

    public zzeuu(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Unable to get cache_state");
        }
    }
}
