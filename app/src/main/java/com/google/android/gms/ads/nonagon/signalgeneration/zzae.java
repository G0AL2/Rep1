package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbdw;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzae {
    private final String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzae(zzac zzacVar, zzad zzadVar) {
        String str;
        str = zzacVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbdw zza() {
        char c10;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        return zzbdw.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbdw.REWARD_BASED_VIDEO_AD;
                }
                return zzbdw.AD_LOADER;
            }
            return zzbdw.INTERSTITIAL;
        }
        return zzbdw.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
