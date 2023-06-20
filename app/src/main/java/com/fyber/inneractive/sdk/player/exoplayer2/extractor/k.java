package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f18397h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f18398i = {44100, 48000, 32000};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f18399j = {32, 64, 96, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 288, 320, 352, 384, DownloadConnection.HTTP_REQUESTED_RANGE_NOT_SATISFIABLE, 448};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f18400k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, DownloadResource.STATUS_RUNNING, 224, 256};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f18401l = {32, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320, 384};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f18402m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f18403n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a  reason: collision with root package name */
    public int f18404a;

    /* renamed from: b  reason: collision with root package name */
    public String f18405b;

    /* renamed from: c  reason: collision with root package name */
    public int f18406c;

    /* renamed from: d  reason: collision with root package name */
    public int f18407d;

    /* renamed from: e  reason: collision with root package name */
    public int f18408e;

    /* renamed from: f  reason: collision with root package name */
    public int f18409f;

    /* renamed from: g  reason: collision with root package name */
    public int f18410g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f18398i[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18399j[i13 - 1] : f18400k[i13 - 1]) * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f18401l[i13 - 1] : f18402m[i13 - 1];
        } else {
            i15 = f18403n[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144000) / i16) + i17;
        }
        return (((i12 == 1 ? 72000 : 144000) * i15) / i16) + i17;
    }

    public static boolean a(int i10, k kVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = f18398i[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? f18399j[i13 - 1] : f18400k[i13 - 1];
            i17 = (((i15 * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i18) + i19) * 4;
            r8 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? f18401l[i13 - 1] : f18402m[i13 - 1];
                i16 = (144000 * i15) / i18;
            } else {
                i15 = f18403n[i13 - 1];
                r8 = i12 == 1 ? 576 : 1152;
                i16 = ((i12 == 1 ? 72000 : 144000) * i15) / i18;
            }
            i17 = i19 + i16;
        }
        String str = f18397h[3 - i12];
        int i20 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        kVar.f18404a = i11;
        kVar.f18405b = str;
        kVar.f18406c = i17;
        kVar.f18407d = i18;
        kVar.f18408e = i20;
        kVar.f18409f = i15 * 1000;
        kVar.f18410g = r8;
        return true;
    }
}
