package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzv implements zzfwn {
    final zzfxc zza;

    public zzfzv(zzfxc zzfxcVar) {
        this.zza = zzfxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfxc zzfxcVar = this.zza;
        if (zzfxcVar.zzb() != null) {
            return zzghh.zzc(zzfxcVar.zzb().zzb(), ((zzfwn) this.zza.zzb().zza()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
