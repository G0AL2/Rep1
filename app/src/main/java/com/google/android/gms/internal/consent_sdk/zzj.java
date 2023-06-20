package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import hb.e;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzj extends Exception {
    private final int zza;

    public zzj(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public final e zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new e(this.zza, getMessage());
    }

    public zzj(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = i10;
    }
}
