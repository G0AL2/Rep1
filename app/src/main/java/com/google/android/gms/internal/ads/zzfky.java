package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfky extends zzfkv {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zza(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zzb(boolean z10) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zzc(boolean z10) {
        this.zzb = z10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final zzfkw zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzfla(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
