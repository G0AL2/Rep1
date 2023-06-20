package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfta extends zzfsr implements Serializable {
    final zzfsr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfta(zzfsr zzfsrVar) {
        this.zza = zzfsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfta) {
            return this.zza.equals(((zzfta) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        zzfsr zzfsrVar = this.zza;
        Objects.toString(zzfsrVar);
        return zzfsrVar.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final zzfsr zza() {
        return this.zza;
    }
}
