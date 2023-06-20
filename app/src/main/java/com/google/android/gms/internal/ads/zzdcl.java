package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdcl extends zzdhc {
    private boolean zzb;

    public zzdcl(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdck
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdcn) obj).zzl();
            }
        });
        this.zzb = true;
    }
}
