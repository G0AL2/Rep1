package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfea implements zzfdy {
    private final String zza;

    public zzfea(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final boolean equals(Object obj) {
        if (obj instanceof zzfea) {
            return this.zza.equals(((zzfea) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
