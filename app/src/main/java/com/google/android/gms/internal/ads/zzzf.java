package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzzf implements zzys {
    private final zzys zza;

    public zzzf(zzys zzysVar) {
        this.zza = zzysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        return this.zza.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zzb(byte[] bArr, int i10, int i11) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zzc(int i10) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzg(int i10) throws IOException {
        ((zzyl) this.zza).zzl(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzh(byte[] bArr, int i10, int i11) throws IOException {
        ((zzyl) this.zza).zzm(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        ((zzyl) this.zza).zzn(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzk(int i10) throws IOException {
        ((zzyl) this.zza).zzo(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzm(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzn(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
