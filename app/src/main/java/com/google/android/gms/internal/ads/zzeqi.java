package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqi implements zzetg {
    private final zzfvm zza;

    public zzeqi(zzfvm zzfvmVar) {
        this.zza = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqj(com.google.android.gms.ads.internal.zzt.zzs().zzb(), com.google.android.gms.ads.internal.zzt.zzs().zzm());
            }
        });
    }
}
