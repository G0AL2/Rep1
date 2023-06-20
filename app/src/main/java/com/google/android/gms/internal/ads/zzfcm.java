package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcm {
    private final zzfbl zza;
    private final zzfbo zzb;
    private final zzees zzc;
    private final zzfii zzd;
    private final zzfhs zze;

    @VisibleForTesting
    public zzfcm(zzees zzeesVar, zzfii zzfiiVar, zzfbl zzfblVar, zzfbo zzfboVar, zzfhs zzfhsVar) {
        this.zza = zzfblVar;
        this.zzb = zzfboVar;
        this.zzc = zzeesVar;
        this.zzd = zzfiiVar;
        this.zze = zzfhsVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzb.zzb, str, i10));
    }

    public final void zzc(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i10);
        }
    }
}
