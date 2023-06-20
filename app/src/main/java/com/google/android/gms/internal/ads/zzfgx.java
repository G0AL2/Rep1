package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgx {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgx(Context context, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcfoVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzq());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(this.zza) ? "0" : "1");
        List zzb = zzbhz.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfR)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzix)).booleanValue()) {
            map.put("is_bstar", true == DeviceProperties.isBstar(this.zza) ? "1" : "0");
        }
    }
}
