package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.4L  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4L extends C0969Gy implements GV {
    public static byte[] A01;
    public boolean A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{70, 113, 106, 96, 104, 97, 36, 106, 107, 112, 36, 118, 97, 101, 96, 125};
    }

    public final synchronized void A06() {
        this.A00 = true;
    }

    public final synchronized boolean A07(AtomicReference<JSONObject> atomicReference, AtomicReference<JSONObject> atomicReference2) {
        if (A8c()) {
            if (!this.A00) {
                atomicReference2.set(A6g());
                return false;
            }
            atomicReference.set(A6J());
            atomicReference2.set(A6g());
            this.A00 = false;
            return true;
        }
        throw new IllegalStateException(A00(0, 16, 62));
    }
}
