package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznp extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznp(int i10, zzad zzadVar, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzadVar;
    }
}
