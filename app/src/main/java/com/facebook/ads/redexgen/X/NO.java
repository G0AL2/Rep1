package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class NO {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (Lr.A00 * 200.0f);
    public static final int A03 = (int) (Lr.A00 * 200.0f);
    public static final int A02 = (int) (Lr.A00 * 50.0f);

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static NN A01(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i10 = A01;
        if (width >= i10 && height >= i10) {
            return new TG(c1400Xy, interfaceC1028Jh, str);
        }
        if (width < A03 || height < A02) {
            return null;
        }
        return new TH(c1400Xy, interfaceC1028Jh, str);
    }

    public static NN A02(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, String str, C1U c1u, InterfaceC1111Mr interfaceC1111Mr, InterfaceC1110Mq interfaceC1110Mq) {
        return new TI(c1400Xy, interfaceC1028Jh, str, c1u, interfaceC1111Mr, interfaceC1110Mq);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h10 = nativeAdLayout.getWidth();
        int w10 = nativeAdLayout.getHeight();
        int i10 = A01;
        if (h10 < i10 || w10 < i10) {
            if (h10 >= A03) {
                int i11 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (w10 < i11) {
                }
            }
            return true;
        }
        return false;
    }
}
