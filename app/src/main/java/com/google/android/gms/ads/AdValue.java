package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i10, String str, long j10) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = j10;
    }

    public static AdValue zza(int i10, String str, long j10) {
        return new AdValue(i10, str, j10);
    }

    public String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}
