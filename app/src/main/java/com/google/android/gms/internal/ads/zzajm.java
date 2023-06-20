package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzajm {
    public static final boolean zza = zzajn.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzajn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzajl(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        List list;
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((zzajl) this.zzb.get(list.size() - 1)).zzc - ((zzajl) this.zzb.get(0)).zzc;
        }
        if (j10 <= 0) {
            return;
        }
        long j11 = ((zzajl) this.zzb.get(0)).zzc;
        zzajn.zza("(%-4d ms) %s", Long.valueOf(j10), str);
        for (zzajl zzajlVar : this.zzb) {
            long j12 = zzajlVar.zzc;
            zzajn.zza("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzajlVar.zzb), zzajlVar.zza);
            j11 = j12;
        }
    }
}
