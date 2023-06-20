package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjc {
    private static final zzfjc zza = new zzfjc();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfjc() {
    }

    public static zzfjc zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfir zzfirVar) {
        this.zzb.add(zzfirVar);
    }

    public final void zze(zzfir zzfirVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzfirVar);
        this.zzc.remove(zzfirVar);
        if (!zzg || zzg()) {
            return;
        }
        zzfjj.zzb().zzf();
    }

    public final void zzf(zzfir zzfirVar) {
        boolean zzg = zzg();
        this.zzc.add(zzfirVar);
        if (zzg) {
            return;
        }
        zzfjj.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
