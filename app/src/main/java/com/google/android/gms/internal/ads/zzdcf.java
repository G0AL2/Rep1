package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzdcf extends zzdhc implements zzdbx {
    @VisibleForTesting
    public zzdcf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdcj) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdcj) obj).zzk(zzfdc.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zze(final zzdlf zzdlfVar) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdce
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((zzdcj) obj).zzk(zzfdc.zzd(12, zzdlf.this.getMessage(), null));
            }
        });
    }
}
