package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.at  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1509at extends C07296m {
    public static byte[] A04;
    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{13, 15, 24, 5, 26, 5, 24, 21};
    }

    public C1509at(Context context, C6C c6c) {
        super(context, c6c);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC07386v A0G() {
        return new C1512aw(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1511av(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1516b0(this);
    }

    public final InterfaceC07386v A0J() {
        return new C1515az(this);
    }

    public final InterfaceC07386v A0K() {
        return new C1514ay(this);
    }

    public final InterfaceC07386v A0L() {
        return new C1517b1(this);
    }

    public final InterfaceC07386v A0M() {
        return new C1513ax(this);
    }

    public final InterfaceC07386v A0N() {
        return new C1518b2(this);
    }

    public final InterfaceC07386v A0O() {
        return new C1510au(this);
    }

    public final InterfaceC07386v A0P() {
        return new C1520b4(this);
    }

    public final InterfaceC07386v A0Q() {
        return new C1519b3(this);
    }
}
