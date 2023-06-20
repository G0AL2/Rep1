package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejw implements zzeff {
    private final zzela zza;

    public zzejw(zzela zzelaVar) {
        this.zza = zzelaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        zzbvt zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzefg(zza, new zzegz(), str);
    }
}
