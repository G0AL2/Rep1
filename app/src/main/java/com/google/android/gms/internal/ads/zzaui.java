package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaui {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzauq zzc = new zzauq();
    private int zzd;
    private int zze;
    private long zzf;
    private zzaul zzg;

    private final long zzd(zzatv zzatvVar, int i10) throws IOException, InterruptedException {
        zzatvVar.zzh(this.zza, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.zza[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzaul zzaulVar) {
        this.zzg = zzaulVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzatv r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaui.zzc(com.google.android.gms.internal.ads.zzatv):boolean");
    }
}
