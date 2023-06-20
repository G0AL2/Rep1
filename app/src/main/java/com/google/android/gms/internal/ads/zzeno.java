package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeno implements zzetf {
    final zzfcd zza;
    private final long zzb;

    public zzeno(zzfcd zzfcdVar, long j10) {
        Preconditions.checkNotNull(zzfcdVar, "the targeting must not be null");
        this.zza = zzfcdVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i11 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfco.zzg(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
            zzfco.zzb(bundle, "extras", zzlVar.zzc);
            zzfco.zzf(bundle, "cust_gender", Integer.valueOf(zzlVar.zzd), zzlVar.zzd != -1);
            zzfco.zzd(bundle, "kw", zzlVar.zze);
            zzfco.zzf(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzlVar.zzg), zzlVar.zzg != -1);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            zzfco.zzf(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
            String str = zzlVar.zzi;
            zzfco.zzg(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzlVar.zzk;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", valueOf.floatValue());
                bundle2.putLong("lat", valueOf3.longValue());
                bundle2.putLong("long", valueOf4.longValue());
                bundle2.putLong("time", valueOf2.longValue());
                bundle.putBundle("uule", bundle2);
            }
            zzfco.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
            zzfco.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfco.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfco.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfco.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfco.zzc(bundle, "request_pkg", zzlVar.zzq);
            zzfco.zze(bundle, "is_designed_for_families", Boolean.valueOf(zzlVar.zzr), zzlVar.zza >= 7);
            if (zzlVar.zza >= 8) {
                zzfco.zzf(bundle, "tag_for_under_age_of_consent", Integer.valueOf(zzlVar.zzt), zzlVar.zzt != -1);
                zzfco.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}
