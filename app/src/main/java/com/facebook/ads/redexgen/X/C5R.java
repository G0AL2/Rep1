package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5R extends AsyncTask<C5T, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final C5S A00;
    public final C1400Xy A01;
    public final boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public C5R(C1400Xy c1400Xy, C5S c5s, boolean z10) {
        this.A01 = c1400Xy;
        this.A00 = c5s;
        this.A02 = z10;
    }

    public /* synthetic */ C5R(C1400Xy c1400Xy, C5S c5s, boolean z10, C1547bV c1547bV) {
        this(c1400Xy, c5s, z10);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5T... c5tArr) {
        if (!L0.A02(this) && c5tArr != null) {
            try {
                if (c5tArr.length >= 1) {
                    String str = c5tArr[0].A01;
                    String str2 = c5tArr[0].A00;
                    Bitmap A0N = new C7U(this.A01).A0N(str, -1, -1);
                    if (A0N != null) {
                        return UB.A05(this.A01, A0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th) {
                L0.A00(th, this);
                return null;
            }
        }
        return null;
    }

    private final void A03(Drawable drawable) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.AAy(drawable);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5T[] c5tArr) {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A00(c5tArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            L0.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
