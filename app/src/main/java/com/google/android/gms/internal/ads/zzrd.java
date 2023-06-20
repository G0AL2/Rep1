package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzrd implements zzst {
    private final zzyy zza;
    private zzyr zzb;
    private zzys zzc;

    public zzrd(zzyy zzyyVar) {
        this.zza = zzyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza(zzzr zzzrVar) throws IOException {
        zzyr zzyrVar = this.zzb;
        Objects.requireNonNull(zzyrVar);
        zzys zzysVar = this.zzc;
        Objects.requireNonNull(zzysVar);
        return zzyrVar.zza(zzysVar, zzzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final long zzb() {
        zzys zzysVar = this.zzc;
        if (zzysVar != null) {
            return zzysVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzc() {
        zzyr zzyrVar = this.zzb;
        if (zzyrVar instanceof zzado) {
            ((zzado) zzyrVar).zze();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzyu r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzyl r6 = new com.google.android.gms.internal.ads.zzyl
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzyr r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzyy r8 = r7.zza
            com.google.android.gms.internal.ads.zzyr[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.zzb = r8
            goto L74
        L20:
            r0 = 0
        L21:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r2 == 0) goto L34
            r7.zzb = r1     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            com.google.android.gms.internal.ads.zzcw.zzf(r14)
            r6.zzj()
            goto L70
        L34:
            com.google.android.gms.internal.ads.zzyr r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L41:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzyr r9 = r7.zzb
            if (r9 != 0) goto L4e
            long r9 = r6.zzf()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L4f
        L4e:
            r13 = 1
        L4f:
            com.google.android.gms.internal.ads.zzcw.zzf(r13)
            r6.zzj()
            throw r8
        L56:
            com.google.android.gms.internal.ads.zzyr r1 = r7.zzb
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L64:
            r1 = 0
            goto L67
        L66:
            r1 = 1
        L67:
            com.google.android.gms.internal.ads.zzcw.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L21
        L70:
            com.google.android.gms.internal.ads.zzyr r10 = r7.zzb
            if (r10 == 0) goto L7a
        L74:
            com.google.android.gms.internal.ads.zzyr r8 = r7.zzb
            r8.zzb(r15)
            return
        L7a:
            com.google.android.gms.internal.ads.zztz r10 = new com.google.android.gms.internal.ads.zztz
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzJ(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zzd(com.google.android.gms.internal.ads.zzp, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzyu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzf(long j10, long j11) {
        zzyr zzyrVar = this.zzb;
        Objects.requireNonNull(zzyrVar);
        zzyrVar.zzc(j10, j11);
    }
}
