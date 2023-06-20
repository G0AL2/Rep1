package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzdj<T> implements Serializable, zzdg {
    final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdj(T t10) {
        this.zza = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdj) {
            T t10 = this.zza;
            T t11 = ((zzdj) obj).zza;
            return t10 == t11 || t10.equals(t11);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzdg
    public final T zza() {
        return this.zza;
    }
}
