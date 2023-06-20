package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzddn extends zzdhc implements zzbnm {
    private final Bundle zzb;

    public zzddn(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzddm
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzfko) obj).zzv();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
