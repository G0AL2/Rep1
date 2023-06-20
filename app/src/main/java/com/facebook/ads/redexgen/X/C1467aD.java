package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.facebook.ads.redexgen.X.aD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1467aD extends C07296m {
    public static byte[] A01;
    public static String[] A02 = {"bPMdIRdGv", "GS1RiQ0Fe2OXcQcIkCuEDku7WILZ5IDY", "TsFhxeN3ooiOzKyGYimy4dCB8t9rX6Qk", "tDBwPFCmRryD0Q4apJFJlrgk6DNKamUD", "oUUA5cBoIxHqACzkd5Y2T9kUvSWODdEm", "FnX3lwsUZnwMMkDv8sp6DIbywwAIHXWj", "YZLb9o623eUfyZOuivTCDkgv5wbAGsEp", "CfH0aVj4RQl6Eoew8HOriE9Hjjy"};
    public final BatteryManager A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, 19, 18, 37, 37, 22, 35, 42, 30, 18, 31, 18, 24, 22, 35, 42, -11, -18, -1, -18, -11, 60, 81, 0, -16, -18, -7, -14};
    }

    static {
        A02();
    }

    public C1467aD(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (BatteryManager) context.getSystemService(A01(1, 14, 53));
    }

    public final InterfaceC07386v A0G() {
        return new C1475aL(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1469aF(this);
    }

    public final InterfaceC07386v A0I() {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(21, 1, 82), 2);
        hashMap.put(A01(0, 1, 28), 3);
        return new C1470aG(this, hashMap);
    }

    public final InterfaceC07386v A0J() {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(15, 1, 66), A01(16, 5, 13));
        hashMap.put(A01(22, 1, 98), A01(23, 5, 17));
        return new C1480aQ(this, hashMap);
    }

    public final InterfaceC07386v A0K() {
        return new C1472aI(this);
    }

    public final InterfaceC07386v A0L() {
        return new C1477aN(this);
    }

    public final InterfaceC07386v A0M() {
        return new C1474aK(this);
    }

    public final InterfaceC07386v A0N() {
        return new C1468aE(this);
    }

    public final InterfaceC07386v A0O() {
        return new C1476aM(this);
    }

    public final InterfaceC07386v A0P() {
        return new C1479aP(this);
    }

    public final InterfaceC07386v A0Q() {
        return new C1473aJ(this);
    }

    public final InterfaceC07386v A0R() {
        return new C1478aO(this);
    }

    public final InterfaceC07386v A0S() {
        return new C1471aH(this);
    }

    public final C7A A0T(int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            return A07(AnonymousClass76.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "Z0BpikLZimvh7GQ0e0YfQZg6u7WmYRcx";
        strArr[6] = "N2CtCcOuXuTLuGr2kU7dW0gd7w3dfDGl";
        if (batteryManager != null) {
            return A04(batteryManager.getIntProperty(i10));
        }
        return A07(AnonymousClass76.A07);
    }

    @SuppressLint({"Nullable Dereference"})
    public final C7A A0U(HashMap<String, Integer> resultMap) {
        if (Build.VERSION.SDK_INT < 21) {
            return A07(AnonymousClass76.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "VX9OpHMsf9E36khSHc5jiQggPTjCMNcl";
        strArr[6] = "9ZxqnrvyvCCPPfnmtmMIQlgDqEWsMyB8";
        if (batteryManager != null) {
            Set<String> keySet = resultMap.keySet();
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String str : keySet) {
                hashMap.put(str, Integer.valueOf(this.A00.getIntProperty(resultMap.get(str).intValue())));
            }
            return A0C(hashMap);
        }
        return A07(AnonymousClass76.A07);
    }
}
