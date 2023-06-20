package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfla extends zzfkw {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfla(String str, boolean z10, boolean z11, zzfkz zzfkzVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfkw) {
            zzfkw zzfkwVar = (zzfkw) obj;
            if (this.zza.equals(zzfkwVar.zzb()) && this.zzb == zzfkwVar.zzd() && this.zzc == zzfkwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.zza;
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z10 + ", isGooglePlayServicesAvailable=" + z11 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzd() {
        return this.zzb;
    }
}
