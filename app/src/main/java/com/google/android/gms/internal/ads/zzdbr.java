package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbr extends zzdhc implements com.google.android.gms.ads.internal.client.zza {
    public zzdbr(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdbq
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
