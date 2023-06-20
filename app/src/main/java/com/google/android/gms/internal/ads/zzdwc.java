package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdwc {
    private final ConcurrentHashMap zza;
    private final zzcev zzb;
    private final zzfcd zzc;
    private final String zzd;

    public zzdwc(zzdwm zzdwmVar, zzcev zzcevVar, zzfcd zzfcdVar, String str) {
        ConcurrentHashMap zzc = zzdwmVar.zzc();
        this.zza = zzc;
        this.zzb = zzcevVar;
        this.zzc = zzfcdVar;
        this.zzd = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            int zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(zzfcdVar);
            int i10 = zzd - 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    zzc.put("se", "query_g");
                } else if (i10 == 2) {
                    zzc.put("se", "r_adinfo");
                } else if (i10 != 3) {
                    zzc.put("se", "r_both");
                } else {
                    zzc.put("se", "r_adstring");
                }
                zzc.put("scar", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                if (zzd == 2) {
                    zzc.put("rid", str);
                }
                zzd("ragent", zzfcdVar.zzd.zzp);
                zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfcdVar.zzd)));
                return;
            }
            zzc.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbx zzfbxVar) {
        if (zzfbxVar.zzb.zza.size() > 0) {
            switch (((zzfbl) zzfbxVar.zzb.zza.get(0)).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzj() ? "0" : "1");
                    break;
                default:
                    this.zza.put("ad_format", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
                    break;
            }
        }
        zzd("gqi", zzfbxVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
