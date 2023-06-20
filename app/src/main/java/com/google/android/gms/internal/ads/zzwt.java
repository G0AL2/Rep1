package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwt extends zzqi {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzcv zzG;
    private int zzH;
    private zzwx zzI;
    private final Context zze;
    private final zzxe zzf;
    private final zzxp zzg;
    private final boolean zzh;
    private zzws zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzww zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzwt(Context context, zzqc zzqcVar, zzqk zzqkVar, long j10, boolean z10, Handler handler, zzxq zzxqVar, int i10, float f10) {
        super(2, zzqcVar, zzqkVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzxe(applicationContext);
        this.zzg = new zzxp(handler, zzxqVar);
        this.zzh = "NVIDIA".equals(zzeg.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r3.equals("video/mp4v-es") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzT(com.google.android.gms.internal.ads.zzqf r10, com.google.android.gms.internal.ads.zzad r11) {
        /*
            int r0 = r11.zzr
            int r1 = r11.zzs
            r2 = -1
            if (r0 == r2) goto Lc7
            if (r1 != r2) goto Lb
            goto Lc7
        Lb:
            java.lang.String r3 = r11.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 1
            java.lang.String r6 = "video/avc"
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = com.google.android.gms.internal.ads.zzqx.zzb(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r5) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r6
            goto L34
        L33:
            r3 = r7
        L34:
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L75;
                case -1662735862: goto L6b;
                case -1662541442: goto L63;
                case 1187890754: goto L5a;
                case 1331836730: goto L52;
                case 1599127256: goto L48;
                case 1599127257: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L7f
        L3e:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L7f
            r5 = 6
            goto L80
        L48:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L7f
            r5 = 4
            goto L80
        L52:
            boolean r11 = r3.equals(r6)
            if (r11 == 0) goto L7f
            r5 = 2
            goto L80
        L5a:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L7f
            goto L80
        L63:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L7f
            r5 = 5
            goto L80
        L6b:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L7f
            r5 = 3
            goto L80
        L75:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L7f
            r5 = 0
            goto L80
        L7f:
            r5 = -1
        L80:
            switch(r5) {
                case 0: goto Lc0;
                case 1: goto Lc0;
                case 2: goto L88;
                case 3: goto Lc0;
                case 4: goto Lc0;
                case 5: goto L84;
                case 6: goto L84;
                default: goto L83;
            }
        L83:
            return r2
        L84:
            int r0 = r0 * r1
            r8 = 4
            goto Lc2
        L88:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbf
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lb0
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbf
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lb0
            boolean r10 = r10.zzf
            if (r10 != 0) goto Lbf
        Lb0:
            r10 = 16
            int r11 = com.google.android.gms.internal.ads.zzeg.zze(r0, r10)
            int r10 = com.google.android.gms.internal.ads.zzeg.zze(r1, r10)
            int r11 = r11 * r10
            int r0 = r11 * 256
            goto Lc2
        Lbf:
            return r2
        Lc0:
            int r0 = r0 * r1
        Lc2:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwt.zzT(com.google.android.gms.internal.ads.zzqf, com.google.android.gms.internal.ads.zzad):int");
    }

    protected static int zzU(zzqf zzqfVar, zzad zzadVar) {
        if (zzadVar.zzn != -1) {
            int size = zzadVar.zzo.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) zzadVar.zzo.get(i11)).length;
            }
            return zzadVar.zzn + i10;
        }
        return zzT(zzqfVar, zzadVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05f6, code lost:
        if (r1.equals("A10-70F") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0758, code lost:
        if (r8 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean zzaB(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 2794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwt.zzaB(java.lang.String):boolean");
    }

    private static List zzaC(zzqk zzqkVar, zzad zzadVar, boolean z10, boolean z11) throws zzqr {
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrj.zzo();
        }
        List zzf = zzqx.zzf(str, z10, z11);
        String zze = zzqx.zze(zzadVar);
        if (zze == null) {
            return zzfrj.zzm(zzf);
        }
        List zzf2 = zzqx.zzf(zze, z10, z11);
        zzfrg zzi = zzfrj.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzaD() {
        int i10 = this.zzC;
        if (i10 == -1) {
            if (this.zzD == -1) {
                return;
            }
            i10 = -1;
        }
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null && zzcvVar.zzc == i10 && zzcvVar.zzd == this.zzD && zzcvVar.zze == this.zzE && zzcvVar.zzf == this.zzF) {
            return;
        }
        zzcv zzcvVar2 = new zzcv(i10, this.zzD, this.zzE, this.zzF);
        this.zzG = zzcvVar2;
        this.zzg.zzt(zzcvVar2);
    }

    private final void zzaE() {
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null) {
            this.zzg.zzt(zzcvVar);
        }
    }

    private final void zzaF() {
        Surface surface = this.zzl;
        zzww zzwwVar = this.zzm;
        if (surface == zzwwVar) {
            this.zzl = null;
        }
        zzwwVar.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j10) {
        return j10 < -30000;
    }

    private final boolean zzaH(zzqf zzqfVar) {
        return zzeg.zza >= 23 && !zzaB(zzqfVar.zza) && (!zzqfVar.zzf || zzww.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    public final void zzD(float f10, float f11) throws zzgt {
        super.zzD(f10, f11);
        this.zzf.zze(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzN() {
        zzww zzwwVar;
        if (super.zzN() && (this.zzp || (((zzwwVar = this.zzm) != null && this.zzl == zzwwVar) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final float zzP(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        float f11 = -1.0f;
        for (zzad zzadVar2 : zzadVarArr) {
            float f12 = zzadVar2.zzt;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr {
        boolean z10;
        if (zzbo.zzh(zzadVar.zzm)) {
            int i10 = 0;
            boolean z11 = zzadVar.zzp != null;
            List zzaC = zzaC(zzqkVar, zzadVar, z11, false);
            if (z11 && zzaC.isEmpty()) {
                zzaC = zzaC(zzqkVar, zzadVar, false, false);
            }
            if (zzaC.isEmpty()) {
                return 129;
            }
            if (zzqi.zzav(zzadVar)) {
                zzqf zzqfVar = (zzqf) zzaC.get(0);
                boolean zzd2 = zzqfVar.zzd(zzadVar);
                if (!zzd2) {
                    for (int i11 = 1; i11 < zzaC.size(); i11++) {
                        zzqf zzqfVar2 = (zzqf) zzaC.get(i11);
                        if (zzqfVar2.zzd(zzadVar)) {
                            zzqfVar = zzqfVar2;
                            z10 = false;
                            zzd2 = true;
                            break;
                        }
                    }
                }
                z10 = true;
                int i12 = true != zzd2 ? 3 : 4;
                int i13 = true != zzqfVar.zze(zzadVar) ? 8 : 16;
                int i14 = true != zzqfVar.zzg ? 0 : 64;
                int i15 = true != z10 ? 0 : 128;
                if (zzd2) {
                    List zzaC2 = zzaC(zzqkVar, zzadVar, z11, true);
                    if (!zzaC2.isEmpty()) {
                        zzqf zzqfVar3 = (zzqf) zzqx.zzg(zzaC2, zzadVar).get(0);
                        if (zzqfVar3.zzd(zzadVar) && zzqfVar3.zze(zzadVar)) {
                            i10 = 32;
                        }
                    }
                }
                return i12 | i13 | i10 | i14 | i15;
            }
            return 130;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        int i10;
        int i11;
        zzgm zzb2 = zzqfVar.zzb(zzadVar, zzadVar2);
        int i12 = zzb2.zze;
        int i13 = zzadVar2.zzr;
        zzws zzwsVar = this.zzi;
        if (i13 > zzwsVar.zza || zzadVar2.zzs > zzwsVar.zzb) {
            i12 |= 256;
        }
        if (zzU(zzqfVar, zzadVar2) > this.zzi.zzc) {
            i12 |= 64;
        }
        String str = zzqfVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzgm(str, zzadVar, zzadVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzgm zzS(zziz zzizVar) throws zzgt {
        zzgm zzS = super.zzS(zzizVar);
        this.zzg.zzf(zzizVar.zza, zzS);
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @TargetApi(17)
    protected final zzqb zzV(zzqf zzqfVar, zzad zzadVar, MediaCrypto mediaCrypto, float f10) {
        String str;
        zzws zzwsVar;
        String str2;
        String str3;
        Point point;
        Pair zzb2;
        int zzT;
        zzww zzwwVar = this.zzm;
        if (zzwwVar != null && zzwwVar.zza != zzqfVar.zzf) {
            zzaF();
        }
        String str4 = zzqfVar.zzc;
        zzad[] zzJ = zzJ();
        int i10 = zzadVar.zzr;
        int i11 = zzadVar.zzs;
        int zzU = zzU(zzqfVar, zzadVar);
        int length = zzJ.length;
        if (length == 1) {
            if (zzU != -1 && (zzT = zzT(zzqfVar, zzadVar)) != -1) {
                zzU = Math.min((int) (zzU * 1.5f), zzT);
            }
            zzwsVar = new zzws(i10, i11, zzU);
            str = str4;
        } else {
            boolean z10 = false;
            for (int i12 = 0; i12 < length; i12++) {
                zzad zzadVar2 = zzJ[i12];
                if (zzadVar.zzy != null && zzadVar2.zzy == null) {
                    zzab zzb3 = zzadVar2.zzb();
                    zzb3.zzy(zzadVar.zzy);
                    zzadVar2 = zzb3.zzY();
                }
                if (zzqfVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    int i13 = zzadVar2.zzr;
                    z10 |= i13 == -1 || zzadVar2.zzs == -1;
                    i10 = Math.max(i10, i13);
                    i11 = Math.max(i11, zzadVar2.zzs);
                    zzU = Math.max(zzU, zzU(zzqfVar, zzadVar2));
                }
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(i10);
                String str5 = "x";
                sb2.append("x");
                sb2.append(i11);
                String str6 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb2.toString());
                int i14 = zzadVar.zzs;
                int i15 = zzadVar.zzr;
                int i16 = i14 > i15 ? i14 : i15;
                int i17 = i14 <= i15 ? i14 : i15;
                float f11 = i17 / i16;
                int[] iArr = zzb;
                str = str4;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int[] iArr2 = iArr;
                    int i20 = (int) (i19 * f11);
                    if (i19 <= i16 || i20 <= i17) {
                        break;
                    }
                    int i21 = i16;
                    int i22 = i17;
                    if (zzeg.zza >= 21) {
                        int i23 = i14 <= i15 ? i19 : i20;
                        if (i14 <= i15) {
                            i19 = i20;
                        }
                        point = zzqfVar.zza(i23, i19);
                        str2 = str5;
                        str3 = str6;
                        if (zzqfVar.zzf(point.x, point.y, zzadVar.zzt)) {
                            break;
                        }
                        i18++;
                        iArr = iArr2;
                        i16 = i21;
                        i17 = i22;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int zze = zzeg.zze(i19, 16) * 16;
                            int zze2 = zzeg.zze(i20, 16) * 16;
                            if (zze * zze2 <= zzqx.zza()) {
                                int i24 = i14 <= i15 ? zze : zze2;
                                if (i14 <= i15) {
                                    zze = zze2;
                                }
                                point = new Point(i24, zze);
                            } else {
                                i18++;
                                iArr = iArr2;
                                i16 = i21;
                                i17 = i22;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (zzqr unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i10 = Math.max(i10, point.x);
                    i11 = Math.max(i11, point.y);
                    zzab zzb4 = zzadVar.zzb();
                    zzb4.zzX(i10);
                    zzb4.zzF(i11);
                    zzU = Math.max(zzU, zzT(zzqfVar, zzb4.zzY()));
                    Log.w(str3, "Codec max resolution adjusted to: " + i10 + str2 + i11);
                }
            } else {
                str = str4;
            }
            zzwsVar = new zzws(i10, i11, zzU);
        }
        this.zzi = zzwsVar;
        boolean z11 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzadVar.zzr);
        mediaFormat.setInteger("height", zzadVar.zzs);
        zzdp.zzb(mediaFormat, zzadVar.zzo);
        float f12 = zzadVar.zzt;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        zzdp.zza(mediaFormat, "rotation-degrees", zzadVar.zzu);
        zzo zzoVar = zzadVar.zzy;
        if (zzoVar != null) {
            zzdp.zza(mediaFormat, "color-transfer", zzoVar.zzd);
            zzdp.zza(mediaFormat, "color-standard", zzoVar.zzb);
            zzdp.zza(mediaFormat, "color-range", zzoVar.zzc);
            byte[] bArr = zzoVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzadVar.zzm) && (zzb2 = zzqx.zzb(zzadVar)) != null) {
            zzdp.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzwsVar.zza);
        mediaFormat.setInteger("max-height", zzwsVar.zzb);
        zzdp.zza(mediaFormat, "max-input-size", zzwsVar.zzc);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (zzaH(zzqfVar)) {
                if (this.zzm == null) {
                    this.zzm = zzww.zza(this.zze, zzqfVar.zzf);
                }
                this.zzl = this.zzm;
            } else {
                throw new IllegalStateException();
            }
        }
        return zzqb.zzb(zzqfVar, mediaFormat, zzadVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final List zzW(zzqk zzqkVar, zzad zzadVar, boolean z10) throws zzqr {
        return zzqx.zzg(zzaC(zzqkVar, zzadVar, false, false), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzX(Exception exc) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzY(String str, zzqb zzqbVar, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzj = zzaB(str);
        zzqf zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z10 = false;
        if (zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzg = zzal.zzg();
            int length = zzg.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (zzg[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzk = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    protected final void zzaA(long j10) {
        zzgl zzglVar = ((zzqi) this).zza;
        zzglVar.zzk += j10;
        zzglVar.zzl++;
        this.zzA += j10;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzaa(zzad zzadVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzqd zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z10 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzC = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzD = integer2;
        float f10 = zzadVar.zzv;
        this.zzF = f10;
        if (zzeg.zza >= 21) {
            int i10 = zzadVar.zzu;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.zzC;
                this.zzC = integer2;
                this.zzD = i11;
                this.zzF = 1.0f / f10;
            }
        } else {
            this.zzE = zzadVar.zzu;
        }
        this.zzf.zzc(zzadVar.zzt);
    }

    final void zzab() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzq(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzac() {
        this.zzp = false;
        int i10 = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzad(zzgb zzgbVar) throws zzgt {
        this.zzx++;
        int i10 = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final boolean zzaf(long j10, long j11, zzqd zzqdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzad zzadVar) throws zzgt {
        boolean z12;
        int zzd2;
        Objects.requireNonNull(zzqdVar);
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j10;
        }
        if (j12 != this.zzy) {
            this.zzf.zzd(j12);
            this.zzy = j12;
        }
        long zzai = zzai();
        long j13 = j12 - zzai;
        if (z10 && !z11) {
            zzay(zzqdVar, i10, j13);
            return true;
        }
        float zzah = zzah();
        int zzbe = zzbe();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j12 - j10) / zzah);
        if (zzbe == 2) {
            j14 -= elapsedRealtime - j11;
        }
        if (this.zzl == this.zzm) {
            if (zzaG(j14)) {
                zzay(zzqdVar, i10, j13);
                zzaA(j14);
                return true;
            }
            return false;
        }
        long j15 = elapsedRealtime - this.zzz;
        boolean z13 = this.zzr ? !this.zzp : zzbe == 2 || this.zzq;
        if (this.zzt == -9223372036854775807L && j10 >= zzai && (z13 || (zzbe == 2 && zzaG(j14) && j15 > 100000))) {
            long nanoTime = System.nanoTime();
            if (zzeg.zza >= 21) {
                zzax(zzqdVar, i10, j13, nanoTime);
            } else {
                zzaw(zzqdVar, i10, j13);
            }
            zzaA(j14);
            return true;
        } else if (zzbe != 2 || j10 == this.zzs) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long zza = this.zzf.zza((j14 * 1000) + nanoTime2);
            long j16 = (zza - nanoTime2) / 1000;
            long j17 = this.zzt;
            if (j16 < -500000 && !z11 && (zzd2 = zzd(j10)) != 0) {
                if (j17 != -9223372036854775807L) {
                    zzgl zzglVar = ((zzqi) this).zza;
                    zzglVar.zzd += zzd2;
                    zzglVar.zzf += this.zzx;
                } else {
                    ((zzqi) this).zza.zzj++;
                    zzaz(zzd2, this.zzx);
                }
                zzas();
                return false;
            } else if (zzaG(j16) && !z11) {
                if (j17 != -9223372036854775807L) {
                    zzay(zzqdVar, i10, j13);
                    z12 = true;
                } else {
                    int i13 = zzeg.zza;
                    Trace.beginSection("dropVideoBuffer");
                    zzqdVar.zzn(i10, false);
                    Trace.endSection();
                    z12 = true;
                    zzaz(0, 1);
                }
                zzaA(j16);
                return z12;
            } else if (zzeg.zza >= 21) {
                if (j16 < 50000) {
                    zzax(zzqdVar, i10, j13, zza);
                    zzaA(j16);
                    return true;
                }
                return false;
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j16) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzaw(zzqdVar, i10, j13);
                zzaA(j16);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final zzqe zzak(Throwable th, zzqf zzqfVar) {
        return new zzwr(th, zzqfVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    @TargetApi(29)
    protected final void zzam(zzgb zzgbVar) throws zzgt {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgbVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqd zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzao(long j10) {
        super.zzao(j10);
        this.zzx--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi
    public final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final boolean zzau(zzqf zzqfVar) {
        return this.zzl != null || zzaH(zzqfVar);
    }

    protected final void zzaw(zzqd zzqdVar, int i10, long j10) {
        zzaD();
        int i11 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqdVar.zzn(i10, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqi) this).zza.zze++;
        this.zzw = 0;
        zzab();
    }

    protected final void zzax(zzqd zzqdVar, int i10, long j10, long j11) {
        zzaD();
        int i11 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqdVar.zzm(i10, j11);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqi) this).zza.zze++;
        this.zzw = 0;
        zzab();
    }

    protected final void zzay(zzqd zzqdVar, int i10, long j10) {
        int i11 = zzeg.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqdVar.zzn(i10, false);
        Trace.endSection();
        ((zzqi) this).zza.zzf++;
    }

    protected final void zzaz(int i10, int i11) {
        zzgl zzglVar = ((zzqi) this).zza;
        zzglVar.zzh += i10;
        int i12 = i10 + i11;
        zzglVar.zzg += i12;
        this.zzv += i12;
        int i13 = this.zzw + i12;
        this.zzw = i13;
        zzglVar.zzi = Math.max(i13, zzglVar.zzi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjp
    public final void zzp(int i10, Object obj) throws zzgt {
        if (i10 != 1) {
            if (i10 == 7) {
                this.zzI = (zzwx) obj;
                return;
            } else if (i10 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            } else if (i10 != 4) {
                if (i10 != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.zzo = intValue2;
                zzqd zzaj = zzaj();
                if (zzaj != null) {
                    zzaj.zzq(intValue2);
                    return;
                }
                return;
            }
        }
        zzww zzwwVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzwwVar == null) {
            zzww zzwwVar2 = this.zzm;
            if (zzwwVar2 != null) {
                zzwwVar = zzwwVar2;
            } else {
                zzqf zzal = zzal();
                if (zzal != null && zzaH(zzal)) {
                    zzwwVar = zzww.zza(this.zze, zzal.zzf);
                    this.zzm = zzwwVar;
                }
            }
        }
        if (this.zzl != zzwwVar) {
            this.zzl = zzwwVar;
            this.zzf.zzi(zzwwVar);
            this.zzn = false;
            int zzbe = zzbe();
            zzqd zzaj2 = zzaj();
            if (zzaj2 != null) {
                if (zzeg.zza >= 23 && zzwwVar != null && !this.zzj) {
                    zzaj2.zzo(zzwwVar);
                } else {
                    zzap();
                    zzan();
                }
            }
            if (zzwwVar != null && zzwwVar != this.zzm) {
                zzaE();
                this.zzp = false;
                int i11 = zzeg.zza;
                if (zzbe == 2) {
                    this.zzt = -9223372036854775807L;
                    return;
                }
                return;
            }
            this.zzG = null;
            this.zzp = false;
            int i12 = zzeg.zza;
        } else if (zzwwVar == null || zzwwVar == this.zzm) {
        } else {
            zzaE();
            if (this.zzn) {
                this.zzg.zzq(this.zzl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i10 = zzeg.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(((zzqi) this).zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzt(boolean z10, boolean z11) throws zzgt {
        super.zzt(z10, z11);
        zzk();
        this.zzg.zze(((zzqi) this).zza);
        this.zzq = z11;
        this.zzr = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzu(long j10, boolean z10) throws zzgt {
        super.zzu(j10, z10);
        this.zzp = false;
        int i10 = zzeg.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    @TargetApi(17)
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i10 = this.zzB;
        if (i10 != 0) {
            this.zzg.zzr(this.zzA, i10);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }
}
