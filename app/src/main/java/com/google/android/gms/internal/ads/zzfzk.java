package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzk implements zzfwl {
    private final zzfxc zza;

    public zzfzk(zzfxc zzfxcVar) {
        this.zza = zzfxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwl) this.zza.zzb().zza()).zza(bArr, bArr2));
    }
}
