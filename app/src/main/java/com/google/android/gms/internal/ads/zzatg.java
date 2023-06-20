package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzatg implements zzasi {
    private int zzb = -1;
    private int zzc = -1;
    private int zzd = 0;
    private ByteBuffer zze;
    private ByteBuffer zzf;
    private boolean zzg;

    public zzatg() {
        ByteBuffer byteBuffer = zzasi.zza;
        this.zze = byteBuffer;
        this.zzf = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzf;
        this.zzf = zzasi.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzd() {
        this.zzf = zzasi.zza;
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zze() {
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzasi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.zzd
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L22
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 + r2
        L22:
            java.nio.ByteBuffer r3 = r7.zze
            int r3 = r3.capacity()
            if (r3 >= r2) goto L39
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.zze = r2
            goto L3e
        L39:
            java.nio.ByteBuffer r2 = r7.zze
            r2.clear()
        L3e:
            int r2 = r7.zzd
            if (r2 == r5) goto L80
            if (r2 == r6) goto L67
            if (r2 != r4) goto L61
        L46:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.zze
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.zze
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L46
        L61:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L67:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.zze
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.zze
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L67
        L80:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.zze
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.zze
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L80
        L9b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.zze
            r8.flip()
            java.nio.ByteBuffer r8 = r7.zze
            r7.zzf = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatg.zzf(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        zzd();
        this.zze = zzasi.zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzh(int i10, int i11, int i12) throws zzash {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.zzb == i10 && this.zzc == i11 && this.zzd == i12) {
                return false;
            }
            this.zzb = i10;
            this.zzc = i11;
            this.zzd = i12;
            if (i12 == 2) {
                this.zze = zzasi.zza;
                return true;
            }
            return true;
        }
        throw new zzash(i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzi() {
        int i10 = this.zzd;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzj() {
        return this.zzg && this.zzf == zzasi.zza;
    }
}
