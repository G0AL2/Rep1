package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzejg implements zzeff {
    private final Map zza = new HashMap();
    private final zzduc zzb;

    public zzejg(zzduc zzducVar) {
        this.zzb = zzducVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzefg zza(String str, JSONObject jSONObject) throws zzfci {
        zzefg zzefgVar;
        synchronized (this) {
            zzefgVar = (zzefg) this.zza.get(str);
            if (zzefgVar == null) {
                zzefgVar = new zzefg(this.zzb.zzc(str, jSONObject), new zzeha(), str);
                this.zza.put(str, zzefgVar);
            }
        }
        return zzefgVar;
    }
}
