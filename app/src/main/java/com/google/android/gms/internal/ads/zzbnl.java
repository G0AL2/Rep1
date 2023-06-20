package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnl implements zzbom {
    private final zzbnm zza;

    public zzbnl(zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            zzcfi.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbu.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                zzcfi.zzh("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundle == null) {
            zzcfi.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
