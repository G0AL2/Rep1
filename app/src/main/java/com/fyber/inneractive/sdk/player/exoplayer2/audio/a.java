package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.google.android.gms.ads.AdRequest;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f17997a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f17998b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f17999c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f18000d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18001e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f18002f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f17998b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f18002f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = f18001e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }
}
