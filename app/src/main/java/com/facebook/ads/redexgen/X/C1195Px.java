package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Px */
/* loaded from: assets/audience_network.dex */
public final class C1195Px {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C1400Xy A00;
    public final InterfaceC1028Jh A01;
    public final QK A02;
    public final SF A06;
    public final String A07;
    @Nullable
    public final Map<String, String> A08;
    public final N3 A04 = new N3() { // from class: com.facebook.ads.redexgen.X.8I
        public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass86 anonymousClass86) {
            SG sg = new SG(C1195Px.A06(C1195Px.this), anonymousClass86.A03(), anonymousClass86.A01(), anonymousClass86.A02());
            if (anonymousClass86.A00() >= 0.05d) {
                sg.A05(anonymousClass86.A01());
            }
            C1195Px.A04(C1195Px.this).A0B(sg);
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
            strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
        }
    };
    public final AbstractC1093Lz A05 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.8G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass85 anonymousClass85) {
            C1195Px.this.A09();
        }
    };
    public final N6 A03 = new N6() { // from class: com.facebook.ads.redexgen.X.8F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass88 anonymousClass88) {
            C1195Px.this.A09();
        }
    };

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public C1195Px(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, QK qk, String str, @Nullable Map<String, String> map) {
        this.A00 = c1400Xy;
        this.A01 = interfaceC1028Jh;
        this.A07 = str;
        this.A08 = map;
        this.A02 = qk;
        this.A06 = new SF(this.A07);
        this.A02.getEventBus().A03(this.A04, this.A05, this.A03);
    }

    public static /* synthetic */ SF A04(C1195Px c1195Px) {
        return c1195Px.A06;
    }

    public static /* synthetic */ String A06(C1195Px c1195Px) {
        return c1195Px.A07;
    }

    private Map<String, String> A07(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A08;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A05(0, 6, 56), str);
        return hashMap;
    }

    public final void A09() {
        String A04 = SF.A04(this.A06.A0A());
        if (A04 != null) {
            InterfaceC1028Jh interfaceC1028Jh = this.A01;
            String encodedFrameData = A0A[4];
            if (encodedFrameData.length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            interfaceC1028Jh.A9H(this.A07, A07(A04));
        }
    }

    public final void A0A() {
        C1239Rp c1239Rp = new C1239Rp(this);
        if (this.A02.A0l()) {
            MM.A00(c1239Rp);
        } else {
            this.A02.getStateHandler().post(c1239Rp);
        }
    }
}
