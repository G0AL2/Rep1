package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zze extends zzcfi {
    public static void zza(String str) {
        if (zzc()) {
            if (str != null && str.length() > 4000) {
                boolean z10 = true;
                for (String str2 : zzcfi.zza.zzd(str)) {
                    if (z10) {
                        Log.v("Ads", str2);
                    } else {
                        Log.v("Ads-cont", str2);
                    }
                    z10 = false;
                }
                return;
            }
            Log.v("Ads", str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzcfi.zzm(2) && ((Boolean) zzbjs.zza.zze()).booleanValue();
    }
}
