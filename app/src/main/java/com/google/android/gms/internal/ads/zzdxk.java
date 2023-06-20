package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdxk(String str, zzdxj zzdxjVar) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ String zza(zzdxk zzdxkVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhV);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdxkVar.zza);
            jSONObject.put("eventCategory", zzdxkVar.zzb);
            jSONObject.putOpt("event", zzdxkVar.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, zzdxkVar.zzd);
            jSONObject.putOpt("rewardType", zzdxkVar.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdxkVar.zzf);
        } catch (JSONException unused) {
            zzcfi.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
