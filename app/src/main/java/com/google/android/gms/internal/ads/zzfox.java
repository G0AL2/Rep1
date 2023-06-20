package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfox implements Serializable, zzfov {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfox) {
            return this.zza.equals(((zzfox) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfov) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
