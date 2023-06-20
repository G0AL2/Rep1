package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmw {
    public static final zzmw zza = new zzmw(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzmw(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzeg.zzU(i12) ? zzeg.zzo(i12, i11) : -1;
    }

    public final String toString() {
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        return "AudioFormat[sampleRate=" + i10 + ", channelCount=" + i11 + ", encoding=" + i12 + "]";
    }
}
