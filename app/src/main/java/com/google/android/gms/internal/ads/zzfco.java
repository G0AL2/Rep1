package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfco {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzc(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzd(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zze(Bundle bundle, String str, Boolean bool, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static void zzf(Bundle bundle, String str, Integer num, boolean z10) {
        if (z10) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static void zzg(Bundle bundle, String str, String str2, boolean z10) {
        if (z10) {
            bundle.putString(str, str2);
        }
    }
}
