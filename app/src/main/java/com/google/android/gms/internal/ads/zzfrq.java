package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfrq extends zzfpm {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfov zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrq(Iterator it, zzfov zzfovVar) {
        this.zza = it;
        this.zzb = zzfovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
