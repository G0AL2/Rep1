package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzecm implements zzbst {
    @Override // com.google.android.gms.internal.ads.zzbst
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzecn zzecnVar = (zzecn) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzecnVar.zzd.zzb());
        jSONObject2.put("signals", zzecnVar.zzc);
        jSONObject3.put("body", zzecnVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(zzecnVar.zzb.zzb));
        jSONObject3.put("response_code", zzecnVar.zzb.zza);
        jSONObject3.put("latency", zzecnVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzecnVar.zzd.zzg());
        return jSONObject;
    }
}
