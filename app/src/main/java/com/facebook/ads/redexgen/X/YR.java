package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YR extends C07296m {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{15, 7, 14, 13, 4};
    }

    public YR(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 99));
    }

    public static int A01(CellInfo cellInfo) {
        if (cellInfo != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                if (cellInfo instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                }
                throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
            }
            throw new UnsupportedOperationException();
        }
        throw new NullPointerException();
    }

    public final InterfaceC07386v A0G() {
        return new C1403Yb(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC07386v A0H() {
        return new C1402Ya(this);
    }

    public final InterfaceC07386v A0I() {
        return new YW(this);
    }

    public final InterfaceC07386v A0J() {
        return new YV(this);
    }

    public final InterfaceC07386v A0K() {
        return new YX(this);
    }

    public final InterfaceC07386v A0L() {
        return new YY(this);
    }

    public final InterfaceC07386v A0M() {
        return new YS(this);
    }

    public final InterfaceC07386v A0N() {
        return new C1406Ye(this);
    }

    public final InterfaceC07386v A0O() {
        return new YU(this);
    }

    public final InterfaceC07386v A0P() {
        return new YT(this);
    }

    public final InterfaceC07386v A0Q() {
        return new C1405Yd(this);
    }

    public final InterfaceC07386v A0R() {
        return new C1404Yc(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC07386v A0S() {
        return new YZ(this);
    }
}
