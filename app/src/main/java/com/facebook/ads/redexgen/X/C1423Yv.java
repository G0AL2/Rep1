package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1423Yv extends C07296m {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;
    @Nullable
    public final PackageInfo A01;
    @Nullable
    public final PackageManager A02;
    public final C6C A03;
    @Nullable
    public final ActivityInfo[] A04;
    @Nullable
    public final ServiceInfo[] A05;
    @Nullable
    public final String[] A06;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{29, 57, 35, 35, 57, 62, 55, 112, 0, 49, 51, 59, 49, 55, 53, 112, 0, 53, 34, 61, 57, 35, 35, 57, 63, 62, 35};
    }

    static {
        A07();
        A08 = C1423Yv.class.getSimpleName();
    }

    public C1423Yv(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = context;
        this.A03 = c6c;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(A08, A06(0, 27, 39), e10);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(A08, A06(0, 27, 39), e10);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(A08, A06(0, 27, 39), e10);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(A08, A06(0, 27, 39), e10);
            return null;
        }
    }

    public final InterfaceC07386v A0G() {
        return new C1425Yx(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1426Yy(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1424Yw(this);
    }

    public final InterfaceC07386v A0J() {
        return new C1427Yz(this);
    }

    public final InterfaceC07386v A0K() {
        return new Z4(this);
    }

    public final InterfaceC07386v A0L() {
        return new Z8(this);
    }

    public final InterfaceC07386v A0M() {
        return new Z3(this);
    }

    public final InterfaceC07386v A0N() {
        return new Z0(this);
    }

    public final InterfaceC07386v A0O() {
        return new Z2(this);
    }

    public final InterfaceC07386v A0P() {
        return new Z1(this);
    }

    public final InterfaceC07386v A0Q() {
        return new Z5(this);
    }

    public final InterfaceC07386v A0R() {
        return new Z6(this);
    }

    public final InterfaceC07386v A0S() {
        return new Z7(this);
    }

    public final InterfaceC07386v A0T() {
        return new ZA(this);
    }

    public final InterfaceC07386v A0U() {
        return new ZB(this);
    }

    public final InterfaceC07386v A0V() {
        return new Z9(this);
    }

    public final InterfaceC07386v A0W() {
        return new ZD(this);
    }

    public final InterfaceC07386v A0X() {
        return new ZE(this);
    }

    public final InterfaceC07386v A0Y() {
        return new ZC(this);
    }
}
