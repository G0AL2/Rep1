package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzcd extends zzcy {
    private final Context zza;
    private final zzdg<zzde<zzco>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(Context context, zzdg<zzde<zzco>> zzdgVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzdgVar;
    }

    public final boolean equals(Object obj) {
        zzdg<zzde<zzco>> zzdgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcy) {
            zzcy zzcyVar = (zzcy) obj;
            if (this.zza.equals(zzcyVar.zza()) && ((zzdgVar = this.zzb) != null ? zzdgVar.equals(zzcyVar.zzb()) : zzcyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdg<zzde<zzco>> zzdgVar = this.zzb;
        return hashCode ^ (zzdgVar == null ? 0 : zzdgVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb2.append("FlagsContext{context=");
        sb2.append(valueOf);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzcy
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzcy
    public final zzdg<zzde<zzco>> zzb() {
        return this.zzb;
    }
}
