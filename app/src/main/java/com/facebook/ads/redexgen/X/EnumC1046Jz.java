package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1046Jz {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);
    
    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC1046Jz(long j10, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j10;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC1046Jz A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC1046Jz[] values;
        for (EnumC1046Jz enumC1046Jz : values()) {
            if (enumC1046Jz.A01 == mediaCacheFlag) {
                return enumC1046Jz;
            }
        }
        return null;
    }
}
