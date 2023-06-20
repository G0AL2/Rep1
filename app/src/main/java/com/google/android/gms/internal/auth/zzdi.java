package com.google.android.gms.internal.auth;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzdi<T> implements zzdg<T> {
    volatile zzdg<T> zza;
    volatile boolean zzb;
    T zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(zzdg<T> zzdgVar) {
        Objects.requireNonNull(zzdgVar);
        this.zza = zzdgVar;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzdg
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzdg<T> zzdgVar = this.zza;
                    zzdgVar.getClass();
                    T zza = zzdgVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
