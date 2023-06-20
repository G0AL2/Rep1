package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqh extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqf zzc;
    public final String zzd;
    public final zzqh zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzqh(com.google.android.gms.internal.ads.zzad r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r5 = r11.zzm
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r0.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqh.<init>(com.google.android.gms.internal.ads.zzad, java.lang.Throwable, boolean, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzqh zza(zzqh zzqhVar, zzqh zzqhVar2) {
        return new zzqh(zzqhVar.getMessage(), zzqhVar.getCause(), zzqhVar.zza, false, zzqhVar.zzc, zzqhVar.zzd, zzqhVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzqh(com.google.android.gms.internal.ads.zzad r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzqf r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzm
            int r11 = com.google.android.gms.internal.ads.zzeg.zza
            r13 = 0
            r0 = 21
            if (r11 < r0) goto L35
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L35
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            r8 = r11
            goto L36
        L35:
            r8 = r13
        L36:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqh.<init>(com.google.android.gms.internal.ads.zzad, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzqf):void");
    }

    private zzqh(String str, Throwable th, String str2, boolean z10, zzqf zzqfVar, String str3, zzqh zzqhVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqfVar;
        this.zzd = str3;
        this.zze = zzqhVar;
    }
}
