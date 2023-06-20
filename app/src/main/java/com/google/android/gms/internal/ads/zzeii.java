package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzeii implements zzefd {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbxVar, zzfbl zzfblVar) {
        String optString = zzfblVar.zzw.optString("pubid", "");
        zzfcd zzfcdVar = zzfbxVar.zza.zza;
        zzfcb zzfcbVar = new zzfcb();
        zzfcbVar.zzp(zzfcdVar);
        zzfcbVar.zzs(optString);
        Bundle zzd = zzd(zzfcdVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle(AdUnit.GOOGLE_ADAPTER_CLASS));
        zzd2.putInt("gw", 1);
        String optString2 = zzfblVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfblVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfblVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfblVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle(AdUnit.GOOGLE_ADAPTER_CLASS, zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfcdVar.zzd;
        zzfcbVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfcd zzG = zzfcbVar.zzG();
        Bundle bundle = new Bundle();
        zzfbo zzfboVar = zzfbxVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfboVar.zza));
        bundle2.putInt("refresh_interval", zzfboVar.zzc);
        bundle2.putString("gws_query_id", zzfboVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfbxVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfblVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfblVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfblVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfblVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfblVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfblVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfblVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfblVar.zzj));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfblVar.zzk);
        bundle3.putString("valid_from_timestamp", zzfblVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfblVar.zzQ);
        if (zzfblVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfblVar.zzm.zzb);
            bundle4.putString("rb_type", zzfblVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        return !TextUtils.isEmpty(zzfblVar.zzw.optString("pubid", ""));
    }

    protected abstract zzfvl zzc(zzfcd zzfcdVar, Bundle bundle);
}
