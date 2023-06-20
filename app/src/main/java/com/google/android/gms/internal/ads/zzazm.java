package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazm {
    public static void zza(String str) {
        if (zzazo.zza >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void zzb() {
        if (zzazo.zza >= 18) {
            Trace.endSection();
        }
    }
}
