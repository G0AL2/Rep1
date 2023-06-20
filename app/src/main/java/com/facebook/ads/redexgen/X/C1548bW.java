package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1548bW implements InterfaceC06091s {
    public static byte[] A03;
    public C5Q A00;
    public C1400Xy A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public C1548bW(C5Q c5q, C1400Xy c1400Xy, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5q;
        this.A01 = c1400Xy;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06091s
    public final void AAi(KH kh) {
        C1069Kz.A00(new C1551bZ(this, kh));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06091s
    public final void ABd(List<C1670da> list) {
        C7U c7u = new C7U(this.A01);
        String A02 = A02(6, 7, 70);
        for (C1670da c1670da : list) {
            if (A02(6, 7, 70).equals(A02)) {
                A02 = c1670da.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1670da.A0E().A0G() != null) {
                    c7u.A0b(new C7S(c1670da.A0E().A0G().getUrl(), c1670da.A0E().A0G().getHeight(), c1670da.A0E().A0G().getWidth(), c1670da.A0G(), A02(0, 6, 2)));
                }
                if (c1670da.A0E().A0F() != null) {
                    c7u.A0b(new C7S(c1670da.A0E().A0F().getUrl(), c1670da.A0E().A0F().getHeight(), c1670da.A0E().A0F().getWidth(), c1670da.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1670da.A0E().A0d())) {
                    c7u.A0a(new C7Q(c1670da.A0E().A0d(), c1670da.A0G(), A02(0, 6, 2), c1670da.A0E().A0A()));
                }
            }
        }
        c7u.A0W(new C1549bX(this, list), new C7N(A02, A02(0, 6, 2)));
    }
}
