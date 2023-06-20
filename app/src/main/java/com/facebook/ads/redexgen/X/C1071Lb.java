package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Lb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1071Lb {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{121, 123, 110, 111, -120, 119, 126, 118, -120, 106, 109, 124, -120, 119, 120, -120, 108, 113, 106, 114, 119, -71, -73, -55, -71, -73, -70, -69, -70, -75, -73, -70, -25, -6, -10, -12, -29, -31, -26, -29, -10, -29, -82, -81, -76, -70, -71, -58, -57, -58, -69, -64, -71, -63, -58, -67, -68, -73, -71, -68, -53, -8, -6};
    }

    public static int A00(C1400Xy c1400Xy, int i10) {
        SharedPreferences sharedPreferences = C1063Kt.A00(c1400Xy);
        return sharedPreferences.getInt(A01(0, 21, 2), i10);
    }

    @Nullable
    public static String A02(C1400Xy c1400Xy, @Nullable String str) {
        int A002 = A00(c1400Xy, -1);
        if (A002 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 49), Integer.valueOf(A002))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static String A03(@Nullable String extraData, String str, Object obj) throws JSONException {
        String A01 = A01(61, 2, 86);
        if (extraData != null) {
            A01 = new JSONObject(extraData).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01);
        }
        JSONObject jSONObject = new JSONObject(A01);
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static boolean A05(@Nullable String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01(61, 2, 86))).optBoolean(A01(21, 11, 47), false);
    }

    public final InterstitialAd A06(C1400Xy c1400Xy, String str, @Nullable String str2) {
        if (c1400Xy == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1400Xy, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C1400Xy c1400Xy, String str, @Nullable String str2) {
        if (c1400Xy == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c1400Xy, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C1400Xy c1400Xy, boolean z10) {
        int i10 = 0;
        String A01 = A01(0, 21, 2);
        if (!z10) {
            i10 = C1063Kt.A00(c1400Xy).getInt(A01, 0) + 1;
        }
        C1063Kt.A00(c1400Xy).edit().putInt(A01, i10).apply();
    }

    public final boolean A09(C1400Xy c1400Xy, @Nullable String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                return A00(c1400Xy, i10 + (-1)) >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
