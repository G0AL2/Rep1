package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcsn {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsn(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbx zzfbxVar) throws Exception {
        for (zzfbv zzfbvVar : zzfbxVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbvVar.zza)) {
                ((zzcsq) this.zza.get(zzfbvVar.zza)).zza(zzfbvVar.zzb);
            } else if (this.zzb.containsKey(zzfbvVar.zza)) {
                zzcsp zzcspVar = (zzcsp) this.zzb.get(zzfbvVar.zza);
                JSONObject jSONObject = zzfbvVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcspVar.zza(hashMap);
            }
        }
    }
}
