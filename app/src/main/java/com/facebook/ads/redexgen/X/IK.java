package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: assets/audience_network.dex */
public final class IK {
    public static int A00(int i10, int i11, int i12) {
        if (i10 >= i11 && i10 < i12) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    public static <T> T A01(@Nullable T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    @EnsuresNonNull({"#1"})
    public static String A02(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void A03(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void A04(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void A05(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void A06(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
