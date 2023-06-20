package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdgm extends zzdhc implements zzbno {
    public zzdgm(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final synchronized void zzbD(final String str, final String str2) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdgl
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzarc) obj).zzbu(str, str2);
            }
        });
    }
}
