package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgm {
    private final Executor zza;
    private final zzcfn zzb;

    public zzfgm(Executor executor, zzcfn zzcfnVar) {
        this.zza = executor;
        this.zzb = zzcfnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgl
            @Override // java.lang.Runnable
            public final void run() {
                zzfgm.this.zza(str);
            }
        });
    }
}
