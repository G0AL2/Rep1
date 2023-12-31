package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zziv extends zziy {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzjb.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
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
    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final int zzd() {
        return this.zzc;
    }
}
