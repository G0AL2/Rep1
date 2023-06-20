package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghl implements zzfwm {
    private final ECPrivateKey zza;
    private final zzghn zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzghk zze;

    public zzghl(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, zzghk zzghkVar) throws GeneralSecurityException {
        this.zza = eCPrivateKey;
        this.zzb = new zzghn(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzghkVar;
    }
}
