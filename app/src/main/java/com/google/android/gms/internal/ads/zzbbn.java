package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzbbn(float f10, float f11, float f12, float f13, int i10) {
        this.zza = f10;
        this.zzb = f11;
        this.zzc = f10 + f12;
        this.zzd = f11 + f13;
        this.zze = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return this.zze;
    }
}
