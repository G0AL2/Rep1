package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        String zzd = zzd();
        StringBuilder sb2 = new StringBuilder(zzd.length() + 53);
        sb2.append(zzc);
        sb2.append("\t");
        sb2.append(zza);
        sb2.append("\t");
        sb2.append(zzb);
        sb2.append(zzd);
        return sb2.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    public abstract String zzd();
}
