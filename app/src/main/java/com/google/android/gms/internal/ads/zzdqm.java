package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdqm {
    private final Executor zza;
    private final zzdqh zzb;

    public zzdqm(Executor executor, zzdqh zzdqhVar) {
        this.zza = executor;
        this.zzb = zzdqhVar;
    }

    public final zzfvl zza(JSONObject jSONObject, String str) {
        zzfvl zzi;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfvc.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzi = zzfvc.zzi(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzi = zzfvc.zzi(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzi = zzfvc.zzi(new zzdql(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzi = zzfvc.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdqj
                            @Override // com.google.android.gms.internal.ads.zzfok
                            public final Object apply(Object obj) {
                                return new zzdql(optString, (zzbkn) obj);
                            }
                        }, this.zza);
                    } else {
                        zzi = zzfvc.zzi(null);
                    }
                }
            }
            arrayList.add(zzi);
        }
        return zzfvc.zzm(zzfvc.zze(arrayList), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdql zzdqlVar : (List) obj) {
                    if (zzdqlVar != null) {
                        arrayList2.add(zzdqlVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
