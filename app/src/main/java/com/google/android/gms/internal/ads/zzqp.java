package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzqp {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzqp(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzqp.class) {
            zzqp zzqpVar = (zzqp) obj;
            if (TextUtils.equals(this.zza, zzqpVar.zza) && this.zzb == zzqpVar.zzb && this.zzc == zzqpVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
