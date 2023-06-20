package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzawk implements zzawd {
    public final String zze;

    public zzawk(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
