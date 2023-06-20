package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzhb extends zzhw {
    private final Context zza;
    private final zzif zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(Context context, zzif zzifVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzifVar;
    }

    public final boolean equals(Object obj) {
        zzif zzifVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhw) {
            zzhw zzhwVar = (zzhw) obj;
            if (this.zza.equals(zzhwVar.zza()) && ((zzifVar = this.zzb) != null ? zzifVar.equals(zzhwVar.zzb()) : zzhwVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzif zzifVar = this.zzb;
        return hashCode ^ (zzifVar == null ? 0 : zzifVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhw
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhw
    public final zzif zzb() {
        return this.zzb;
    }
}
