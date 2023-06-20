package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmc implements zzat {
    private final zzme zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzma zzd;

    public zzmc(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, zzma zzmaVar) throws GeneralSecurityException {
        zzmf.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzme(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzmaVar;
    }
}
