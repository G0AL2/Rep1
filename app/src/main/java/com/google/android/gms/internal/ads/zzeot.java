package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeot implements zzetg {
    private final Executor zza;
    private final zzcer zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeot(Executor executor, zzcer zzcerVar) {
        this.zza = executor;
        this.zzb = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
            return zzfvc.zzi(null);
        }
        return zzfvc.zzm(this.zzb.zzj(), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzetf() { // from class: com.google.android.gms.internal.ads.zzeos
                    @Override // com.google.android.gms.internal.ads.zzetf
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
