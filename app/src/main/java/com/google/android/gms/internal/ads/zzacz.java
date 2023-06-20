package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzacz implements zzadb {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzadi zzc = new zzadi();
    private zzada zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzys zzysVar, int i10) throws IOException {
        ((zzyl) zzysVar).zzn(this.zza, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.zza[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zza(zzada zzadaVar) {
        this.zzd = zzadaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzys r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacz.zzc(com.google.android.gms.internal.ads.zzys):boolean");
    }
}
