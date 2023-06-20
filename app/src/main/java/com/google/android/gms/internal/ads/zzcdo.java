package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcdo {
    @VisibleForTesting
    static zzcdo zza;

    public static synchronized zzcdo zzd(Context context) {
        synchronized (zzcdo.class) {
            zzcdo zzcdoVar = zza;
            if (zzcdoVar != null) {
                return zzcdoVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbhz.zzc(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzccs zzccsVar = new zzccs(null);
            zzccsVar.zzb(applicationContext);
            zzccsVar.zzc(com.google.android.gms.ads.internal.zzt.zzA());
            zzccsVar.zza(zzh);
            zzccsVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzcdo zze = zzccsVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzcds zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                String optString = optJSONArray.optString(i10);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        zzc.zzc(str);
                    }
                    zzc.zzd(new zzcdq(zzc, hashMap));
                } catch (JSONException e10) {
                    zzcfi.zzf("Failed to parse listening list", e10);
                }
            }
            return zza;
        }
    }

    abstract zzccl zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzccp zzb();

    abstract zzcds zzc();
}
