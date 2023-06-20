package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerc implements zzetg {
    private final zzfvm zza;
    private final zzfbk zzb;

    public zzerc(zzfvm zzfvmVar, zzfbk zzfbkVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerc.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzerd zzc() throws Exception {
        return new zzerd(this.zzb);
    }
}
