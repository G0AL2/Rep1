package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdec extends zzdhc implements zzdcn, zzdds {
    private final zzfbl zzb;
    private final AtomicBoolean zzc;

    public zzdec(Set set, zzfbl zzfblVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfblVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgA)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzag) != null && zzsVar.zza == 3) {
            zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdeb
                @Override // com.google.android.gms.internal.ads.zzdhb
                public final void zza(Object obj) {
                    zzdec.this.zza((zzdee) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdee zzdeeVar) throws Exception {
        zzdeeVar.zzg(this.zzb.zzag);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
