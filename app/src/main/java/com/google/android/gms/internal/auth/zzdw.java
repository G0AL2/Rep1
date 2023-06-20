package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzdw extends zzdz {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdw(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzeb.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzdz
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    public final int zzd() {
        return this.zzc;
    }
}
