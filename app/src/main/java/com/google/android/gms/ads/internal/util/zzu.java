package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public class zzu extends zzt {
    static final boolean zzf(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdT)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            int zzw = zzcfb.zzw(activity, configuration.screenHeightDp);
            int zzw2 = zzcfb.zzw(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i10 = zzr.heightPixels;
            int i11 = zzr.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdP)).intValue();
            return (zzf(i10, zzw + dimensionPixelSize, round) && zzf(i11, zzw2, round)) ? false : true;
        }
        return false;
    }
}
