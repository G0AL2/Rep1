package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbf {
    private final Object zza;
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbf(Object obj, byte[] bArr, int i10, int i11, int i12) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final Object zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
