package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.a8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1462a8 extends C07296m {
    public static byte[] A01;
    @Nullable
    public final BluetoothAdapter A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-4, 9, -1, 13, 10, 4, -1, -55, 11, 0, 13, 8, 4, 14, 14, 4, 10, 9, -55, -35, -25, -16, -32, -17, -22, -22, -17, -29};
    }

    public C1462a8(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = A04(context) ? BluetoothAdapter.getDefaultAdapter() : null;
    }

    public static boolean A04(Context context) {
        return context.checkPermission(A02(0, 28, 49), Process.myPid(), Process.myUid()) == 0;
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC07386v A0G() {
        return new C1466aC(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC07386v A0H() {
        return new C1465aB(this);
    }

    @SuppressLint({"MissingPermission"})
    public final InterfaceC07386v A0I() {
        return new C1464aA(this);
    }
}
