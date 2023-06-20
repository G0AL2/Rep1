package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyp implements zzdbw, zzdeo, zzddl {
    private final zzdzb zza;
    private final String zzb;
    private int zzc = 0;
    private zzdyo zzd = zzdyo.AD_REQUESTED;
    private zzdbm zze;
    private com.google.android.gms.ads.internal.client.zze zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyp(zzdzb zzdzbVar, zzfcd zzfcdVar) {
        this.zza = zzdzbVar;
        this.zzb = zzfcdVar.zzf;
    }

    private static JSONObject zze(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zze(zzeVar2));
        return jSONObject;
    }

    private static JSONObject zzf(zzdbm zzdbmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdbmVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzdbmVar.zzc());
        jSONObject.put("responseId", zzdbmVar.zzh());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhM)).booleanValue()) {
            String zzd = zzdbmVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzcfi.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzdbmVar.zzi()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhN)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zze(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd = zzdyo.AD_LOAD_FAILED;
        this.zzf = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
        if (zzfbxVar.zzb.zza.isEmpty()) {
            return;
        }
        this.zzc = ((zzfbl) zzfbxVar.zzb.zza.get(0)).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
        this.zza.zze(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzbH(zzcxx zzcxxVar) {
        this.zze = zzcxxVar.zzl();
        this.zzd = zzdyo.AD_LOADED;
    }

    public final JSONObject zzc() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zzd);
        jSONObject.put("format", zzfbl.zza(this.zzc));
        zzdbm zzdbmVar = this.zze;
        JSONObject jSONObject2 = null;
        if (zzdbmVar != null) {
            jSONObject2 = zzf(zzdbmVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzdbm zzdbmVar2 = (zzdbm) iBinder;
                jSONObject2 = zzf(zzdbmVar2);
                if (zzdbmVar2.zzi().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zze(this.zzf));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final boolean zzd() {
        return this.zzd != zzdyo.AD_REQUESTED;
    }
}
