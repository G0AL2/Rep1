package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzev  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzev {
    private final zzan zza;
    private final zzar zzb;

    public zzev(zzan zzanVar) {
        this.zza = zzanVar;
        this.zzb = null;
    }

    public zzev(zzar zzarVar) {
        this.zza = null;
        this.zzb = zzarVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzan zzanVar = this.zza;
        return zzanVar != null ? zzanVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
