package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    @KeepForSdk
    protected static boolean canUnparcelSafely(String str) {
        synchronized (zza) {
        }
        return true;
    }

    @KeepForSdk
    protected static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    protected abstract boolean prepareForClientVersion(int i10);

    @KeepForSdk
    public void setShouldDowngrade(boolean z10) {
        this.zzb = z10;
    }

    @KeepForSdk
    protected boolean shouldDowngrade() {
        return this.zzb;
    }
}
