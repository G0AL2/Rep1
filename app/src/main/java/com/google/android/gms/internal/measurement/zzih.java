package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzih implements zzif {
    volatile zzif zza;
    volatile boolean zzb;
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzif zzifVar) {
        Objects.requireNonNull(zzifVar);
        this.zza = zzifVar;
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
        String obj2 = obj.toString();
        StringBuilder sb3 = new StringBuilder(obj2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(obj2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzif zzifVar = this.zza;
                    zzifVar.getClass();
                    Object zza = zzifVar.zza();
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
