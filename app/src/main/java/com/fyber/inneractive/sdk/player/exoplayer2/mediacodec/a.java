package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f19145a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19146b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19147c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19148d;

    /* renamed from: e  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f19149e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10) {
        this.f19145a = (String) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
        this.f19148d = str2;
        this.f19149e = codecCapabilities;
        boolean z11 = true;
        this.f19146b = (z10 || codecCapabilities == null || !a(codecCapabilities)) ? false : true;
        this.f19147c = (codecCapabilities == null || !b(codecCapabilities)) ? false : false;
    }

    public static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u.f19606a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @TargetApi(21)
    public boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19149e;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 < i11 && a(videoCapabilities, i11, i10, d10)) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10) + "] [" + this.f19145a + ", " + this.f19148d + "] [" + u.f19610e + "]");
                return true;
            }
            a("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
            return false;
        }
    }

    public final void a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f19145a + ", " + this.f19148d + "] [" + u.f19610e + "]");
    }

    public static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u.f19606a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 != -1.0d && d10 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        }
        return videoCapabilities.isSizeSupported(i10, i11);
    }
}
