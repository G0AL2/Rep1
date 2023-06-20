package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevv implements zzetf {
    private final String zza;

    public zzevv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e10) {
            zzcfi.zzk("Failed putting trustless token.", e10);
        }
    }
}
