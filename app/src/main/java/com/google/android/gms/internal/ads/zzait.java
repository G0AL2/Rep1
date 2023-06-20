package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzait {
    private final String zza;
    private final String zzb;

    public zzait(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzait.class == obj.getClass()) {
            zzait zzaitVar = (zzait) obj;
            if (TextUtils.equals(this.zza, zzaitVar.zza) && TextUtils.equals(this.zzb, zzaitVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
