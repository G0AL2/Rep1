package com.google.android.gms.internal.ads;

import android.content.Context;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeat {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhs zzg;
    private final zzfcp zzh;
    private final zzdwc zzi;

    public zzeat(zzcnf zzcnfVar, Context context, zzcfo zzcfoVar, zzfcd zzfcdVar, Executor executor, String str, zzfhs zzfhsVar, zzdwc zzdwcVar) {
        this.zza = zzcnfVar;
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzd = zzfcdVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhsVar;
        this.zzh = zzcnfVar.zzv();
        this.zzi = zzdwcVar;
    }

    private final zzfvl zzc(final String str, final String str2) {
        zzfhh zza = zzfhg.zza(this.zzb, 11);
        zza.zzf();
        zzbta zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbsu zzbsuVar = zzbsx.zza;
        final zzbsq zza3 = zza2.zza("google.afma.response.normalize", zzbsuVar, zzbsuVar);
        zzfvl zzn = zzfvc.zzn(zzfvc.zzn(zzfvc.zzn(zzfvc.zzi(""), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfvc.zzi(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getMessage())));
                }
            }
        }, this.zze), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzbsq.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeat.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfhr.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            zzcfi.zzj("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfvl zza() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeat.zza():com.google.android.gms.internal.ads.zzfvl");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(JSONObject jSONObject) throws Exception {
        return zzfvc.zzi(new zzfbx(new zzfbu(this.zzd), zzfbw.zza(new StringReader(jSONObject.toString()))));
    }
}
