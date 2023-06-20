package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeve implements zzetg {
    final zzfvm zza;
    final List zzb;
    final zzbhk zzc;

    public zzeve(zzbhk zzbhkVar, zzfvm zzfvmVar, List list, byte[] bArr) {
        this.zzc = zzbhkVar;
        this.zza = zzfvmVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevf(zzeve.this.zzb);
            }
        });
    }
}
