package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzie extends zzid {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            return this.zza.equals(((zzie) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzid
    public final boolean zzb() {
        return true;
    }
}
