package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05800p {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C1400Xy A01;
    public final AbstractC05810q A02;
    public final C1220Qw A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC05800p(C1400Xy c1400Xy, AbstractC05810q abstractC05810q, C1220Qw c1220Qw) {
        this.A01 = c1400Xy;
        this.A02 = abstractC05810q;
        this.A03 = c1220Qw;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC05810q abstractC05810q = this.A02;
        if (abstractC05810q != null) {
            abstractC05810q.A00();
        }
        A06(new OG().A03(this.A03).A05());
        this.A00 = true;
        C1076Lg.A02(this.A01, A00(0, 17, 20));
        AbstractC05810q abstractC05810q2 = this.A02;
    }
}
