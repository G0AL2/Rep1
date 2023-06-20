package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbbe implements Runnable {
    final /* synthetic */ zzbbf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbe(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List<zzbbg> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbbf zzbbfVar = this.zza;
            z10 = zzbbfVar.zzd;
            if (z10) {
                z11 = zzbbfVar.zze;
                if (z11) {
                    zzbbfVar.zzd = false;
                    zzcfi.zze("App went background");
                    list = this.zza.zzf;
                    for (zzbbg zzbbgVar : list) {
                        try {
                            zzbbgVar.zza(false);
                        } catch (Exception e10) {
                            zzcfi.zzh("", e10);
                        }
                    }
                }
            }
            zzcfi.zze("App is still foreground");
        }
    }
}
