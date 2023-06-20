package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzawb {
    private static final SparseIntArray zzd;
    private static final SparseIntArray zze;
    private static final Map zzf;
    private static final zzavp zza = zzavp.zzb("OMX.google.raw.decoder");
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzg = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzd = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zze = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, Constants.BUFFER_SIZE);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, Constants.MIN_PROGRESS_STEP);
        HashMap hashMap = new HashMap();
        zzf = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES));
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", Integer.valueOf((int) Constants.MIN_PROGRESS_STEP));
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH));
        hashMap.put("H120", 2048);
        hashMap.put("H123", Integer.valueOf((int) Constants.BUFFER_SIZE));
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int zza() throws zzavw {
        int i10 = zzg;
        if (i10 == -1) {
            zzavp zzc2 = zzc("video/avc", false);
            if (zzc2 != null) {
                int i11 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzg()) {
                    int i12 = codecProfileLevel.level;
                    int i13 = 9437184;
                    if (i12 == 1 || i12 == 2) {
                        i13 = 25344;
                    } else {
                        switch (i12) {
                            case 8:
                            case 16:
                            case 32:
                                i13 = 101376;
                                continue;
                            case 64:
                                i13 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i13 = 414720;
                                continue;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i13 = 921600;
                                continue;
                            case IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES /* 1024 */:
                                i13 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i13 = 2097152;
                                continue;
                            case Constants.BUFFER_SIZE /* 8192 */:
                                i13 = 2228224;
                                continue;
                            case 16384:
                                i13 = 5652480;
                                continue;
                            case 32768:
                            case Constants.MIN_PROGRESS_STEP /* 65536 */:
                                break;
                            default:
                                i13 = -1;
                                continue;
                        }
                    }
                    i11 = Math.max(i13, i11);
                }
                i10 = Math.max(i11, zzazo.zza >= 21 ? 345600 : 172800);
            } else {
                i10 = 0;
            }
            zzg = i10;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair zzb(String str) {
        char c10;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i10 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            if (split.length < 4) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzb.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            if ("1".equals(group)) {
                i10 = 1;
            } else if (!"2".equals(group)) {
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            Integer num = (Integer) zzf.get(split[3]);
            if (num == null) {
                Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1))));
                return null;
            }
            return new Pair(Integer.valueOf(i10), num);
        } else if (c10 == 2 || c10 == 3) {
            int length = split.length;
            if (length < 2) {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                return null;
            }
            try {
                if (split[1].length() == 6) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                } else if (length >= 3) {
                    valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                    valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                return new Pair(Integer.valueOf(zzd.get(valueOf.intValue())), Integer.valueOf(zze.get(valueOf2.intValue())));
            } catch (NumberFormatException unused) {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                return null;
            }
        } else {
            return null;
        }
    }

    public static zzavp zzc(String str, boolean z10) throws zzavw {
        List zzd2 = zzd(str, z10);
        if (zzd2.isEmpty()) {
            return null;
        }
        return (zzavp) zzd2.get(0);
    }

    public static synchronized List zzd(String str, boolean z10) throws zzavw {
        zzavx zzavzVar;
        synchronized (zzawb.class) {
            zzavu zzavuVar = new zzavu(str, z10);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzavuVar);
            if (list != null) {
                return list;
            }
            int i10 = zzazo.zza;
            if (i10 >= 21) {
                zzavzVar = new zzawa(z10);
            } else {
                zzavzVar = new zzavz(null);
            }
            List zze2 = zze(zzavuVar, zzavzVar);
            if (z10 && zze2.isEmpty() && i10 >= 21 && i10 <= 23) {
                zze2 = zze(zzavuVar, new zzavz(null));
                if (!zze2.isEmpty()) {
                    String str2 = ((zzavp) zze2.get(0)).zza;
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(zze2);
            hashMap.put(zzavuVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #1 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:151:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List zze(com.google.android.gms.internal.ads.zzavu r18, com.google.android.gms.internal.ads.zzavx r19) throws com.google.android.gms.internal.ads.zzavw {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawb.zze(com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavx):java.util.List");
    }
}
