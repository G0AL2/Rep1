package b9;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import b9.v;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.n0;
import j8.p1;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f4950a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4951b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4952c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f4953d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4954e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4955f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4956g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4957h;

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f4950a = (String) ea.a.e(str);
        this.f4951b = str2;
        this.f4952c = str3;
        this.f4953d = codecCapabilities;
        this.f4956g = z10;
        this.f4954e = z13;
        this.f4955f = z15;
        this.f4957h = ea.v.t(str2);
    }

    private static final boolean A(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(n0.f29710b)) ? false : true;
    }

    public static n B(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((n0.f29709a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || AudioTrackTranscoder.MIMETYPE_AUDIO_AAC.equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("AssumedMaxChannelAdjustment: ");
        sb2.append(str);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(" to ");
        sb2.append(i11);
        sb2.append("]");
        ea.r.h("MediaCodecInfo", sb2.toString());
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n0.l(i10, widthAlignment) * widthAlignment, n0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES : intValue >= 120000000 ? AdRequest.MAX_CONTENT_URL_LENGTH : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f29709a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(p1 p1Var) {
        Pair<Integer, Integer> q10;
        if (p1Var.f32706i == null || (q10 = v.q(p1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(p1Var.f32709l)) {
            if ("video/avc".equals(this.f4951b)) {
                intValue = 8;
            } else {
                intValue = "video/hevc".equals(this.f4951b) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (this.f4957h || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] g10 = g();
            if (n0.f29709a <= 23 && "video/x-vnd.on2.vp9".equals(this.f4951b) && g10.length == 0) {
                g10 = f(this.f4953d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            String str = p1Var.f32706i;
            String str2 = this.f4952c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length());
            sb2.append("codec.profileLevel, ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            w(sb2.toString());
            return false;
        }
        return true;
    }

    private boolean o(p1 p1Var) {
        return this.f4951b.equals(p1Var.f32709l) || this.f4951b.equals(v.m(p1Var));
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f29709a >= 21 && r(codecCapabilities);
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f29709a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        String str2 = this.f4950a;
        String str3 = this.f4951b;
        String str4 = n0.f29713e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("AssumedSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        ea.r.b("MediaCodecInfo", sb2.toString());
    }

    private void w(String str) {
        String str2 = this.f4950a;
        String str3 = this.f4951b;
        String str4 = n0.f29713e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        ea.r.b("MediaCodecInfo", sb2.toString());
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return n0.f29712d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z(String str) {
        if (n0.f29709a <= 22) {
            String str2 = n0.f29712d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4953d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public m8.i e(p1 p1Var, p1 p1Var2) {
        int i10 = !n0.c(p1Var.f32709l, p1Var2.f32709l) ? 8 : 0;
        if (this.f4957h) {
            if (p1Var.f32717t != p1Var2.f32717t) {
                i10 |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            }
            if (!this.f4954e && (p1Var.f32714q != p1Var2.f32714q || p1Var.f32715r != p1Var2.f32715r)) {
                i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!n0.c(p1Var.f32721x, p1Var2.f32721x)) {
                i10 |= 2048;
            }
            if (y(this.f4950a) && !p1Var.g(p1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new m8.i(this.f4950a, p1Var, p1Var2, p1Var.g(p1Var2) ? 3 : 2, 0);
            }
        } else {
            if (p1Var.f32722y != p1Var2.f32722y) {
                i10 |= 4096;
            }
            if (p1Var.f32723z != p1Var2.f32723z) {
                i10 |= Constants.BUFFER_SIZE;
            }
            if (p1Var.A != p1Var2.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && AudioTrackTranscoder.MIMETYPE_AUDIO_AAC.equals(this.f4951b)) {
                Pair<Integer, Integer> q10 = v.q(p1Var);
                Pair<Integer, Integer> q11 = v.q(p1Var2);
                if (q10 != null && q11 != null) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new m8.i(this.f4950a, p1Var, p1Var2, 3, 0);
                    }
                }
            }
            if (!p1Var.g(p1Var2)) {
                i10 |= 32;
            }
            if (x(this.f4951b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new m8.i(this.f4950a, p1Var, p1Var2, 1, 0);
            }
        }
        return new m8.i(this.f4950a, p1Var, p1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4953d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4953d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        } else if (a(this.f4950a, this.f4951b, audioCapabilities.getMaxInputChannelCount()) < i10) {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("channelCount.support, ");
            sb2.append(i10);
            w(sb2.toString());
            return false;
        } else {
            return true;
        }
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4953d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("sampleRate.support, ");
            sb2.append(i10);
            w(sb2.toString());
            return false;
        }
    }

    public boolean m(p1 p1Var) throws v.c {
        int i10;
        if (o(p1Var) && l(p1Var)) {
            if (this.f4957h) {
                int i11 = p1Var.f32714q;
                if (i11 <= 0 || (i10 = p1Var.f32715r) <= 0) {
                    return true;
                }
                if (n0.f29709a >= 21) {
                    return u(i11, i10, p1Var.f32716s);
                }
                boolean z10 = i11 * i10 <= v.N();
                if (!z10) {
                    int i12 = p1Var.f32714q;
                    int i13 = p1Var.f32715r;
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append("legacyFrameSize, ");
                    sb2.append(i12);
                    sb2.append("x");
                    sb2.append(i13);
                    w(sb2.toString());
                }
                return z10;
            }
            if (n0.f29709a >= 21) {
                int i14 = p1Var.f32723z;
                if (i14 != -1 && !k(i14)) {
                    return false;
                }
                int i15 = p1Var.f32722y;
                if (i15 != -1 && !j(i15)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean n() {
        if (n0.f29709a >= 29 && "video/x-vnd.on2.vp9".equals(this.f4951b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(p1 p1Var) {
        if (this.f4957h) {
            return this.f4954e;
        }
        Pair<Integer, Integer> q10 = v.q(p1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f4950a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4953d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        } else if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 < i11 && A(this.f4950a) && d(videoCapabilities, i11, i10, d10)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.rotated, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d10);
                v(sb2.toString());
                return true;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i10);
            sb3.append("x");
            sb3.append(i11);
            sb3.append("x");
            sb3.append(d10);
            w(sb3.toString());
            return false;
        }
    }
}
