package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1481aR extends C07296m {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public C1481aR(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<Integer, C1482aS> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A06);
    }

    public final InterfaceC07386v A0G() {
        return new C1484aU(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1487aX(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1486aW(this);
    }

    public final InterfaceC07386v A0J() {
        return new C1485aV(this);
    }

    public final InterfaceC07386v A0K(List<C07376u> list) {
        return new C1483aT(this, list);
    }
}
