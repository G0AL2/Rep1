package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaag implements zzyr {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzyu zzp;
    private zzzy zzq;
    private zzzu zzr;
    private boolean zzs;
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzaaf
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzaag.zza;
            return new zzyr[]{new zzaag(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzeg.zzZ("#!AMR\n");
    private static final byte[] zze = zzeg.zzZ("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzaag() {
        this(0);
    }

    public zzaag(int i10) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zze(com.google.android.gms.internal.ads.zzys r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L91
            r12.zzj()     // Catch: java.io.EOFException -> L90
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L90
            r4 = r12
            com.google.android.gms.internal.ads.zzyl r4 = (com.google.android.gms.internal.ads.zzyl) r4     // Catch: java.io.EOFException -> L90
            r4.zzm(r0, r3, r2, r3)     // Catch: java.io.EOFException -> L90
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> L90
            r0 = r0[r3]     // Catch: java.io.EOFException -> L90
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L7a
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.zzh     // Catch: java.io.EOFException -> L90
            if (r4 == 0) goto L2c
            r6 = 10
            if (r0 < r6) goto L37
            r6 = 13
            if (r0 <= r6) goto L2c
            goto L37
        L2c:
            if (r4 != 0) goto L55
            r6 = 12
            if (r0 < r6) goto L37
            r6 = 14
            if (r0 > r6) goto L37
            goto L55
        L37:
            if (r4 == 0) goto L3e
            int[] r4 = com.google.android.gms.internal.ads.zzaag.zzc     // Catch: java.io.EOFException -> L90
            r0 = r4[r0]     // Catch: java.io.EOFException -> L90
            goto L42
        L3e:
            int[] r4 = com.google.android.gms.internal.ads.zzaag.zzb     // Catch: java.io.EOFException -> L90
            r0 = r4[r0]     // Catch: java.io.EOFException -> L90
        L42:
            r11.zzj = r0     // Catch: java.io.EOFException -> L90
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L4d
            r11.zzm = r0
            r4 = r0
        L4d:
            if (r4 != r0) goto L91
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
            goto L91
        L55:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L5c
            r12 = r3
        L5c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L90
            r2.<init>()     // Catch: java.io.EOFException -> L90
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> L90
            r2.append(r12)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L90
            r2.append(r0)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L90
            com.google.android.gms.internal.ads.zzbp r12 = com.google.android.gms.internal.ads.zzbp.zza(r12, r5)     // Catch: java.io.EOFException -> L90
            throw r12     // Catch: java.io.EOFException -> L90
        L7a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L90
            r12.<init>()     // Catch: java.io.EOFException -> L90
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L90
            r12.append(r0)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L90
            com.google.android.gms.internal.ads.zzbp r12 = com.google.android.gms.internal.ads.zzbp.zza(r12, r5)     // Catch: java.io.EOFException -> L90
            throw r12     // Catch: java.io.EOFException -> L90
        L90:
            return r1
        L91:
            com.google.android.gms.internal.ads.zzzy r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzzw.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L9a
            return r1
        L9a:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto La2
            return r3
        La2:
            com.google.android.gms.internal.ads.zzzy r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaag.zze(com.google.android.gms.internal.ads.zzys):int");
    }

    private static boolean zzf(zzys zzysVar, byte[] bArr) throws IOException {
        zzysVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzyl) zzysVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzys zzysVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzysVar, bArr)) {
            this.zzh = false;
            ((zzyl) zzysVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (zzf(zzysVar, bArr2)) {
            this.zzh = true;
            ((zzyl) zzysVar).zzo(bArr2.length, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzq);
        int i10 = zzeg.zza;
        if (zzysVar.zzf() == 0 && !zzg(zzysVar)) {
            throw zzbp.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzh;
            String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            zzzy zzzyVar = this.zzq;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzL(zzf);
            zzabVar.zzw(1);
            zzabVar.zzT(i11);
            zzzyVar.zzk(zzabVar.zzY());
        }
        int zze2 = zze(zzysVar);
        if (this.zzl) {
            return zze2;
        }
        zzzt zzztVar = new zzzt(-9223372036854775807L, 0L);
        this.zzr = zzztVar;
        this.zzp.zzL(zzztVar);
        this.zzl = true;
        return zze2;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzp = zzyuVar;
        this.zzq = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzg(zzysVar);
    }
}
