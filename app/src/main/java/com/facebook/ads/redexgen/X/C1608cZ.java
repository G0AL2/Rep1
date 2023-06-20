package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1608cZ implements MB<Bundle> {
    public static byte[] A03;
    public final C2C A00;
    public final Q4 A01;
    public final List<C1607cY> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C1608cZ(List<C2A> list, Bundle bundle, Q4 q42) {
        this.A02 = new ArrayList(list.size());
        this.A01 = q42;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new C1607cY(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C2C) M5.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C1608cZ(List<C2A> list, Q4 q42) {
        this.A02 = new ArrayList(list.size());
        this.A01 = q42;
        for (C2A c2a : list) {
            this.A02.add(new C1607cY(c2a));
        }
        this.A00 = new C2C();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), M5.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (C1607cY c1607cY : this.A02) {
            arrayList.add(c1607cY.A05());
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2C A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C1607cY test : this.A02) {
            test.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double A7p = this.A01.A7p();
        this.A00.A04(d10, A7p);
        for (C1607cY c1607cY : this.A02) {
            c1607cY.A07(d10, A7p);
        }
    }
}
