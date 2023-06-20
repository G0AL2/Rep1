package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f19172d;

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f19173e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Integer> f19174f;

    /* renamed from: a  reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a f19169a = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a("OMX.google.raw.decoder", null, null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f19170b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<a, List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a>> f19171c = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static int f19175g = -1;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19176a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19177b;

        public a(String str, boolean z10) {
            this.f19176a = str;
            this.f19177b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f19176a, aVar.f19176a) && this.f19177b == aVar.f19177b;
        }

        public int hashCode() {
            String str = this.f19176a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f19177b ? 1231 : 1237);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Exception {
        public b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0256d implements c {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* loaded from: classes2.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final int f19178a;

        /* renamed from: b  reason: collision with root package name */
        public MediaCodecInfo[] f19179b;

        public e(boolean z10) {
            this.f19178a = z10 ? 1 : 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean b() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public int a() {
            if (this.f19179b == null) {
                this.f19179b = new MediaCodecList(this.f19178a).getCodecInfos();
            }
            return this.f19179b.length;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public MediaCodecInfo a(int i10) {
            if (this.f19179b == null) {
                this.f19179b = new MediaCodecList(this.f19178a).getCodecInfos();
            }
            return this.f19179b[i10];
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19172d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f19173e = sparseIntArray2;
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
        f19174f = hashMap;
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

    public static com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(String str, boolean z10) throws b {
        List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> list;
        c c0256d;
        synchronized (d.class) {
            a aVar = new a(str, z10);
            list = f19171c.get(aVar);
            if (list == null) {
                int i10 = u.f19606a;
                if (i10 >= 21) {
                    c0256d = new e(z10);
                } else {
                    c0256d = new C0256d();
                }
                List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> a10 = a(aVar, c0256d);
                if (z10 && ((ArrayList) a10).isEmpty() && 21 <= i10 && i10 <= 23) {
                    a10 = a(aVar, new C0256d());
                    ArrayList arrayList = (ArrayList) a10;
                    if (!arrayList.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) arrayList.get(0)).f19145a);
                    }
                }
                if (i10 < 26) {
                    int i11 = 1;
                    if (a10.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(a10.get(0).f19145a)) {
                        while (true) {
                            if (i11 >= a10.size()) {
                                break;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar2 = a10.get(i11);
                            if ("OMX.google.raw.decoder".equals(aVar2.f19145a)) {
                                a10.remove(i11);
                                a10.add(0, aVar2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                list = Collections.unmodifiableList(a10);
                f19171c.put(aVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int a() throws b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f19175g == -1) {
            int i11 = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a10 = a("video/avc", false);
            if (a10 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = a10.f19149e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
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
                            default:
                                i10 = -1;
                                continue;
                        }
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, u.f19606a >= 21 ? 345600 : 172800);
            }
            f19175g = i11;
        }
        return f19175g;
    }

    public static List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> a(a aVar, c cVar) throws b {
        boolean z10;
        c cVar2 = cVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = aVar.f19176a;
            int a10 = cVar.a();
            boolean b10 = cVar.b();
            int i10 = 0;
            while (i10 < a10) {
                MediaCodecInfo a11 = cVar2.a(i10);
                String name = a11.getName();
                if (a(a11, name, b10)) {
                    String[] supportedTypes = a11.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i11 = 0;
                    while (i11 < length) {
                        String str2 = supportedTypes[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = a11.getCapabilitiesForType(str2);
                                boolean a12 = cVar2.a(str, capabilitiesForType);
                                if (u.f19606a <= 22) {
                                    String str3 = u.f19609d;
                                    if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z10 = true;
                                        if ((!b10 && aVar.f19177b == a12) || (!b10 && !aVar.f19177b)) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name, str, capabilitiesForType, z10));
                                        } else if (!b10 && a12) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z10));
                                            return arrayList;
                                        }
                                    }
                                }
                                z10 = false;
                                if (!b10) {
                                }
                                if (!b10) {
                                    arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z10));
                                    return arrayList;
                                }
                                continue;
                            } catch (Exception e10) {
                                if (u.f19606a <= 23 && !arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e10;
                                }
                            }
                        }
                        i11++;
                        cVar2 = cVar;
                    }
                    continue;
                }
                i10++;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new b(e11);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = u.f19606a;
        if (i10 >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i10 >= 18 || !"OMX.SEC.MP3.Decoder".equals(str)) {
                if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(u.f19607b)) {
                    return false;
                }
                if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str2 = u.f19607b;
                    if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                        return false;
                    }
                }
                if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str3 = u.f19607b;
                    if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                        return false;
                    }
                }
                if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(u.f19608c)) {
                    String str4 = u.f19607b;
                    if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                        return false;
                    }
                }
                return (i10 <= 19 && u.f19607b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }
}
