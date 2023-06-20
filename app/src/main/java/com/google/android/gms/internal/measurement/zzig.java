package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzig implements Serializable, zzif {
    final zzif zza;
    volatile transient boolean zzb;
    transient Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzig(zzif zzifVar) {
        Objects.requireNonNull(zzifVar);
        this.zza = zzifVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
