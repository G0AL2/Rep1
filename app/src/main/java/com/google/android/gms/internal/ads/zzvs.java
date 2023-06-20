package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzvt zzvtVar) {
        zzc(zzvtVar);
        this.zza.add(new zzvr(handler, zzvtVar));
    }

    public final void zzb(final int i10, final long j10, final long j11) {
        boolean z10;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzvr zzvrVar = (zzvr) it.next();
            z10 = zzvrVar.zzc;
            if (!z10) {
                handler = zzvrVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzvt zzvtVar;
                        zzvr zzvrVar2 = zzvr.this;
                        int i11 = i10;
                        long j12 = j10;
                        long j13 = j11;
                        zzvtVar = zzvrVar2.zzb;
                        zzvtVar.zzY(i11, j12, j13);
                    }
                });
            }
        }
    }

    public final void zzc(zzvt zzvtVar) {
        zzvt zzvtVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvr zzvrVar = (zzvr) it.next();
            zzvtVar2 = zzvrVar.zzb;
            if (zzvtVar2 == zzvtVar) {
                zzvrVar.zzc();
                this.zza.remove(zzvrVar);
            }
        }
    }
}
