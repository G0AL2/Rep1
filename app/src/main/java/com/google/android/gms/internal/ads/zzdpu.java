package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpu {
    private final zzfvm zza;
    private final zzdqh zzb;
    private final zzdqm zzc;

    public zzdpu(zzfvm zzfvmVar, zzdqh zzdqhVar, zzdqm zzdqmVar) {
        this.zza = zzfvmVar;
        this.zzb = zzdqhVar;
        this.zzc = zzdqmVar;
    }

    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar, final JSONObject jSONObject) {
        zzfvl zzn;
        final zzfvl zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdps
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfbx zzfbxVar2 = zzfbxVar;
                zzfbl zzfblVar2 = zzfblVar;
                JSONObject jSONObject2 = jSONObject;
                zzdnh zzdnhVar = new zzdnh();
                zzdnhVar.zzV(jSONObject2.optInt("template_id", -1));
                zzdnhVar.zzI(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdnhVar.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzfcd zzfcdVar = zzfbxVar2.zza.zza;
                if (zzfcdVar.zzg.contains(Integer.toString(zzdnhVar.zzc()))) {
                    if (zzdnhVar.zzc() == 3) {
                        if (zzdnhVar.zzy() != null) {
                            if (!zzfcdVar.zzh.contains(zzdnhVar.zzy())) {
                                throw new zzeit(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzeit(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzdnhVar.zzT(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzfblVar2.zzN) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        optString = com.google.android.gms.ads.internal.util.zzs.zzv() + " : " + optString;
                    }
                    zzdnhVar.zzU("headline", optString);
                    zzdnhVar.zzU("body", jSONObject2.optString("body", null));
                    zzdnhVar.zzU("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdnhVar.zzU("store", jSONObject2.optString("store", null));
                    zzdnhVar.zzU(InAppPurchaseMetaData.KEY_PRICE, jSONObject2.optString(InAppPurchaseMetaData.KEY_PRICE, null));
                    zzdnhVar.zzU("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdnhVar;
                }
                throw new zzeit(1, "Invalid template ID: " + zzdnhVar.zzc());
            }
        });
        final zzfvl zzf = this.zzb.zzf(jSONObject, "images");
        final zzfvl zzg = this.zzb.zzg(jSONObject, "images", zzfblVar, zzfbxVar.zzb.zzb);
        final zzfvl zze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfvl zze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfvl zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfvl zzh = this.zzb.zzh(jSONObject, zzfblVar, zzfbxVar.zzb.zzb);
        final zzdqh zzdqhVar = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzfvc.zzi(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfvc.zzi(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfvc.zzi(null);
                } else {
                    zzn = zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdpw
                        @Override // com.google.android.gms.internal.ads.zzfuj
                        public final zzfvl zza(Object obj) {
                            return zzdqh.this.zzc(optString, obj);
                        }
                    }, zzcfv.zze);
                }
            }
        }
        final zzfvl zzfvlVar = zzn;
        final zzfvl zza = this.zzc.zza(jSONObject, "custom_assets");
        return zzfvc.zzb(zzb, zzf, zzg, zze, zze2, zzd, zzh, zzfvlVar, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdpt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfvl zzfvlVar2 = zzb;
                zzfvl zzfvlVar3 = zzf;
                zzfvl zzfvlVar4 = zze2;
                zzfvl zzfvlVar5 = zze;
                zzfvl zzfvlVar6 = zzd;
                JSONObject jSONObject2 = jSONObject;
                zzfvl zzfvlVar7 = zzh;
                zzfvl zzfvlVar8 = zzg;
                zzfvl zzfvlVar9 = zzfvlVar;
                zzfvl zzfvlVar10 = zza;
                zzdnh zzdnhVar = (zzdnh) zzfvlVar2.get();
                zzdnhVar.zzN((List) zzfvlVar3.get());
                zzdnhVar.zzK((zzblb) zzfvlVar4.get());
                zzdnhVar.zzO((zzblb) zzfvlVar5.get());
                zzdnhVar.zzH((zzbkt) zzfvlVar6.get());
                zzdnhVar.zzQ(zzdqh.zzj(jSONObject2));
                zzdnhVar.zzJ(zzdqh.zzi(jSONObject2));
                zzcli zzcliVar = (zzcli) zzfvlVar7.get();
                if (zzcliVar != null) {
                    zzdnhVar.zzY(zzcliVar);
                    zzdnhVar.zzX(zzcliVar.zzH());
                    zzdnhVar.zzW(zzcliVar.zzs());
                }
                zzcli zzcliVar2 = (zzcli) zzfvlVar8.get();
                if (zzcliVar2 != null) {
                    zzdnhVar.zzM(zzcliVar2);
                    zzdnhVar.zzZ(zzcliVar2.zzH());
                }
                zzcli zzcliVar3 = (zzcli) zzfvlVar9.get();
                if (zzcliVar3 != null) {
                    zzdnhVar.zzR(zzcliVar3);
                }
                for (zzdql zzdqlVar : (List) zzfvlVar10.get()) {
                    if (zzdqlVar.zza != 1) {
                        zzdnhVar.zzL(zzdqlVar.zzb, zzdqlVar.zzd);
                    } else {
                        zzdnhVar.zzU(zzdqlVar.zzb, zzdqlVar.zzc);
                    }
                }
                return zzdnhVar;
            }
        }, this.zza);
    }
}
