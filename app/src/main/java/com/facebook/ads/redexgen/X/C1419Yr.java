package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1419Yr extends C07296m {
    public static byte[] A01;
    public final PowerManager A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{101, 122, 98, 112, 103};
    }

    public C1419Yr(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (PowerManager) context.getSystemService(A02(0, 5, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DeprecatedMethod"})
    public boolean A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            this.A00.isInteractive();
        }
        return this.A00.isScreenOn();
    }

    public final InterfaceC07386v A0G() {
        return new C1421Yt(this);
    }

    @TargetApi(20)
    public final InterfaceC07386v A0H() {
        return new C1422Yu(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1420Ys(this);
    }
}
