package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcx {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            zzcfi.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        String zzx = zzcfb.zzx(context);
        zzcfi.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzx + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th, String str) {
        zzcfi.zzi("Ad failed to load : " + i10);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzs(th, str);
    }
}
