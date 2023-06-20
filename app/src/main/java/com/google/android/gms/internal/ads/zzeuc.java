package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeuc implements zzetf {
    private final String zza;

    public zzeuc(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
