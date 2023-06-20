package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzqx {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzqr {
        int i10;
        int i11 = zzd;
        if (i11 == -1) {
            zzqf zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i12 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i13 = codecProfileLevel.level;
                    if (i13 == 1 || i13 == 2) {
                        i10 = 25344;
                    } else {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case 64:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i10 = 921600;
                                continue;
                            case IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES /* 1024 */:
                                i10 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                continue;
                            case Constants.BUFFER_SIZE /* 8192 */:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case Constants.MIN_PROGRESS_STEP /* 65536 */:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    }
                    i12 = Math.max(i10, i12);
                }
                i11 = Math.max(i12, zzeg.zza >= 21 ? 345600 : 172800);
            } else {
                i11 = 0;
            }
            zzd = i11;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c5 A[Catch: NumberFormatException -> 0x02d5, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02d5, blocks: (B:148:0x026a, B:150:0x027c, B:161:0x0298, B:177:0x02c5), top: B:488:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzad r17) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzb(com.google.android.gms.internal.ads.zzad):android.util.Pair");
    }

    public static zzqf zzc(String str, boolean z10, boolean z11) throws zzqr {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqf) zzf.get(0);
    }

    public static zzqf zzd() throws zzqr {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzad zzadVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzadVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzadVar.zzm) || (zzb2 = zzb(zzadVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z10, boolean z11) throws zzqr {
        zzqs zzquVar;
        synchronized (zzqx.class) {
            zzqp zzqpVar = new zzqp(str, z10, z11);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzqpVar);
            if (list != null) {
                return list;
            }
            int i10 = zzeg.zza;
            if (i10 >= 21) {
                zzquVar = new zzqv(z10, z11);
            } else {
                zzquVar = new zzqu(null);
            }
            ArrayList zzh = zzh(zzqpVar, zzquVar);
            if (z10 && zzh.isEmpty() && i10 >= 21 && i10 <= 23) {
                zzh = zzh(zzqpVar, new zzqu(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzqf) zzh.get(0)).zza;
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i10 < 26 && zzeg.zzb.equals("R9") && zzh.size() == 1 && ((zzqf) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqf.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zzqw() { // from class: com.google.android.gms.internal.ads.zzqn
                    @Override // com.google.android.gms.internal.ads.zzqw
                    public final int zza(Object obj) {
                        int i11 = zzqx.zza;
                        String str3 = ((zzqf) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzeg.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i10 < 21 && zzh.size() > 1) {
                String str3 = ((zzqf) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    zzi(zzh, new zzqw() { // from class: com.google.android.gms.internal.ads.zzqo
                        @Override // com.google.android.gms.internal.ads.zzqw
                        public final int zza(Object obj) {
                            int i11 = zzqx.zza;
                            return ((zzqf) obj).zza.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i10 < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqf) zzh.get(0)).zza)) {
                zzh.add((zzqf) zzh.remove(0));
            }
            zzfrj zzm = zzfrj.zzm(zzh);
            hashMap.put(zzqpVar, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, final zzad zzadVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzqw() { // from class: com.google.android.gms.internal.ads.zzql
            @Override // com.google.android.gms.internal.ads.zzqw
            public final int zza(Object obj) {
                zzad zzadVar2 = zzad.this;
                zzqf zzqfVar = (zzqf) obj;
                int i10 = zzqx.zza;
                try {
                    return !zzqfVar.zzd(zzadVar2) ? 0 : 1;
                } catch (zzqr unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:
        if (r1.zzb == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if ("SCV31".equals(r10) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:187:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0 A[Catch: Exception -> 0x02ff, TRY_ENTER, TryCatch #0 {Exception -> 0x02ff, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0074, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c4, B:50:0x00cc, B:52:0x00d4, B:56:0x00e2, B:58:0x00ea, B:60:0x00f2, B:62:0x00fc, B:64:0x0104, B:66:0x010a, B:68:0x0112, B:71:0x011c, B:73:0x0124, B:77:0x0130, B:79:0x0138, B:81:0x0140, B:83:0x0148, B:172:0x02a8, B:175:0x02b0, B:177:0x02b6, B:178:0x02d0, B:179:0x02f3, B:86:0x0151, B:87:0x0154, B:89:0x015c, B:92:0x0167, B:94:0x016f, B:97:0x017a, B:99:0x0182, B:102:0x018d, B:104:0x0195, B:107:0x01a0, B:109:0x01a8), top: B:185:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzqp r27, com.google.android.gms.internal.ads.zzqs r28) throws com.google.android.gms.internal.ads.zzqr {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzh(com.google.android.gms.internal.ads.zzqp, com.google.android.gms.internal.ads.zzqs):java.util.ArrayList");
    }

    private static void zzi(List list, final zzqw zzqwVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzqm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                zzqw zzqwVar2 = zzqw.this;
                int i10 = zzqx.zza;
                return zzqwVar2.zza(obj2) - zzqwVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeg.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbo.zzg(str)) {
            return true;
        }
        String zza2 = zzfoc.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
