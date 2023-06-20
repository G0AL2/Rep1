package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class OK implements DialogInterface.OnClickListener {
    public static byte[] A04;
    public final /* synthetic */ ON A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-84, -74, -94, -73, -70, -78, -94, -74, -73, -88, -77, -7, -9, -6, -22};
    }

    public OK(ON on, Map map, String str, String str2) {
        this.A00 = on;
        this.A03 = map;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A03.put(A00(0, 11, 0), A00(11, 4, 66));
        this.A00.A06(this.A01, this.A02, this.A03);
    }
}
