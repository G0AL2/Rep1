package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnl extends zzdnm {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdnl(zzfbl zzfblVar, JSONObject jSONObject) {
        super(zzfblVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbu.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzef)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final zzfcg zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfcg(jSONObject) : this.zza.zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzA);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzg() {
        return this.zzf;
    }
}
