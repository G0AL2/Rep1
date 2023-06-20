package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgo {
    private final HashMap zza;
    private final zzfgu zzb;

    private zzfgo() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfgu(com.google.android.gms.ads.internal.zzt.zzA());
        hashMap.put("new_csi", "1");
    }

    public static zzfgo zzb(String str) {
        zzfgo zzfgoVar = new zzfgo();
        zzfgoVar.zza.put("action", str);
        return zzfgoVar;
    }

    public static zzfgo zzc(String str) {
        zzfgo zzfgoVar = new zzfgo();
        zzfgoVar.zza.put("request_id", str);
        return zzfgoVar;
    }

    public final zzfgo zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgo zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgo zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgo zzf(zzfbl zzfblVar) {
        this.zza.put("aai", zzfblVar.zzx);
        return this;
    }

    public final zzfgo zzg(zzfbo zzfboVar) {
        if (!TextUtils.isEmpty(zzfboVar.zzb)) {
            this.zza.put("gqi", zzfboVar.zzb);
        }
        return this;
    }

    public final zzfgo zzh(zzfbx zzfbxVar, zzcev zzcevVar) {
        zzfbw zzfbwVar = zzfbxVar.zzb;
        zzg(zzfbwVar.zzb);
        if (!zzfbwVar.zza.isEmpty()) {
            switch (((zzfbl) zzfbwVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", AdView.AdType.BANNER);
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", RNAdsEvents.EVENT_REWARDED);
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzcevVar != null) {
                        this.zza.put("as", true != zzcevVar.zzj() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzfgo zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgt zzfgtVar : this.zzb.zza()) {
            hashMap.put(zzfgtVar.zza, zzfgtVar.zzb);
        }
        return hashMap;
    }
}
