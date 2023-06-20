package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(Context context) {
    }

    public static final boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
