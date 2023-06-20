package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhr {
    public static void zza(zzfvl zzfvlVar, zzfhs zzfhsVar, zzfhh zzfhhVar) {
        zzg(zzfvlVar, zzfhsVar, zzfhhVar, false);
    }

    public static void zzb(zzfvl zzfvlVar, zzfhs zzfhsVar, zzfhh zzfhhVar) {
        zzg(zzfvlVar, zzfhsVar, zzfhhVar, true);
    }

    public static void zzc(zzfvl zzfvlVar, zzfhs zzfhsVar, zzfhh zzfhhVar) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvlVar), new zzfhq(zzfhsVar, zzfhhVar), zzcfv.zzf);
        }
    }

    public static void zzd(zzfvl zzfvlVar, zzfhh zzfhhVar) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvlVar), new zzfho(zzfhhVar), zzcfv.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhr), str);
    }

    public static int zzf(zzfcd zzfcdVar) {
        int zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(zzfcdVar) - 1;
        return (zzd == 0 || zzd == 1) ? 7 : 23;
    }

    private static void zzg(zzfvl zzfvlVar, zzfhs zzfhsVar, zzfhh zzfhhVar, boolean z10) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvlVar), new zzfhp(zzfhsVar, zzfhhVar, z10), zzcfv.zzf);
        }
    }
}
