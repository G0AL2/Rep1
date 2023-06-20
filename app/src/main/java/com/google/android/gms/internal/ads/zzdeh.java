package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdeh implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdei zzdeiVar = (zzdei) this.zza.get();
        if (zzdeiVar != null) {
            zzdeiVar.zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdef
                @Override // com.google.android.gms.internal.ads.zzdhb
                public final void zza(Object obj) {
                    ((zzdej) obj).zza();
                }
            });
        }
    }
}
