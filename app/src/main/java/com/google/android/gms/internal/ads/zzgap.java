package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgap {
    private final zzfwf zza;
    private final zzfwl zzb;

    public zzgap(zzfwf zzfwfVar) {
        this.zza = zzfwfVar;
        this.zzb = null;
    }

    public zzgap(zzfwl zzfwlVar) {
        this.zza = null;
        this.zzb = zzfwlVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfwf zzfwfVar = this.zza;
        return zzfwfVar != null ? zzfwfVar.zzb(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
