package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfcd;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdwm zzdwmVar, final zzdwc zzdwcVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwm zzdwmVar2 = zzdwm.this;
                    zzdwc zzdwcVar2 = zzdwcVar;
                    String str2 = str;
                    Pair[] pairArr2 = pairArr;
                    Map zzc = zzdwcVar2 == null ? zzdwmVar2.zzc() : zzdwcVar2.zza();
                    zzc.put("action", str2);
                    for (Pair pair : pairArr2) {
                        zzc.put((String) pair.first, (String) pair.second);
                    }
                    zzdwmVar2.zze(zzc);
                }
            });
        }
    }

    public static int zzd(zzfcd zzfcdVar) {
        if (zzfcdVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfcdVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
