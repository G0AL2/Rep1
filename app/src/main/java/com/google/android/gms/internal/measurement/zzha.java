package com.google.android.gms.internal.measurement;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzha {
    private static volatile boolean zza = !zza();

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
