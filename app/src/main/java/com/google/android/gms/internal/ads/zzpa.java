package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpa extends IOException {
    public final int zza;

    public zzpa(Throwable th, int i10) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
