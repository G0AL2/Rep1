package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvf {
    public final zzck zza;
    public final int[] zzb;

    public zzvf(zzck zzckVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzdn.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzckVar;
        this.zzb = iArr;
    }
}
