package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenw implements zzetg {
    private final zzfvl zza;
    private final Executor zzb;

    public zzenw(zzfvl zzfvlVar, Executor executor) {
        this.zza = zzfvlVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzn(this.zza, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                final String str = (String) obj;
                return zzfvc.zzi(new zzetf() { // from class: com.google.android.gms.internal.ads.zzenu
                    @Override // com.google.android.gms.internal.ads.zzetf
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
