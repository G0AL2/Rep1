package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyc  reason: invalid package */
/* loaded from: classes2.dex */
final class zzyc extends zzyf {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyc(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzyi.zzl(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyf, com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyf, com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyf
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyf, com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyf, com.google.android.gms.internal.p002firebaseauthapi.zzyi
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
