package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FO extends d2 {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public FO(C1400Xy c1400Xy, C06061p c06061p) {
        super(c1400Xy, c06061p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j10));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new RM(this.A0B, map).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        C1670da c1670da = (C1670da) this.A01;
        if (c1670da.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(c1670da);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC05780n interfaceC05780n, C9H c9h, C9F c9f, C06071q c06071q) {
        C1670da c1670da = (C1670da) interfaceC05780n;
        long currentTimeMillis = System.currentTimeMillis();
        C1634cz c1634cz = new C1634cz(this, c06071q, c1670da, currentTimeMillis, c9f);
        A0C().postDelayed(c1634cz, c9h.A05().A05());
        c1670da.A0L(this.A0B, new C1633cy(this, c1634cz, currentTimeMillis, c9f), this.A08, c06071q, UB.A0K());
    }
}
