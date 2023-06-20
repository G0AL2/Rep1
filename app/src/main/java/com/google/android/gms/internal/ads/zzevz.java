package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevz implements zzetf {
    private final Map zza;

    public zzevz(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(this.zza));
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
