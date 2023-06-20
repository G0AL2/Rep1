package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzc {
    private final zzdwm zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzay.zzc().zzb(zzbhz.zzfV)).intValue();
    private final long zzb = ((Long) zzay.zzc().zzb(zzbhz.zzfW)).longValue();
    private final boolean zzc = ((Boolean) zzay.zzc().zzb(zzbhz.zzgb)).booleanValue();
    private final boolean zzd = ((Boolean) zzay.zzc().zzb(zzbhz.zzfZ)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdwm zzdwmVar) {
        this.zzh = zzdwmVar;
    }

    private final synchronized void zzg(final zzdwc zzdwcVar) {
        if (this.zzc) {
            final ArrayDeque clone = this.zzg.clone();
            this.zzg.clear();
            final ArrayDeque clone2 = this.zzf.clone();
            this.zzf.clear();
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc.this.zze(zzdwcVar, clone, clone2);
                }
            });
        }
    }

    private final void zzh(zzdwc zzdwcVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwcVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzdwc zzdwcVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdwcVar.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdwcVar.zza().put("mhit", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            return str2;
        }
        zzdwcVar.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdwc zzdwcVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()), str2));
        zzi();
        zzg(zzdwcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdwc zzdwcVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdwcVar, arrayDeque, "to");
        zzh(zzdwcVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
