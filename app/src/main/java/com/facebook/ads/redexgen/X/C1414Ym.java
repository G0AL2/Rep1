package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1414Ym implements AnonymousClass72<String> {
    public static String[] A02 = {"RYi9iRGIRLFgmHyLCTFL79e8HRjDnFrb", "vSh82J56btqitzV2K8vhhpmd8nuWc73Q", "zIHtrJzxIsbAX2RcAusdDGuQeAmEyx5S", "rSB1T329BncZ8PoGprLRF5BkUgeBLg1f", "Ia7f", "MvVPUyTuCHBxSL2xIpKuAgdBDgeXTXtl", "79Ouy72hXQ07YEkZUE4DpCR0vQs9qv4f", "z8weDZlyW5ITWcD9B316mWOXeL9UDLe6"};
    public final String A00;
    @Nullable
    public final String A01;

    public C1414Ym(Context context, String str, EnumC07346r enumC07346r) {
        this.A00 = str;
        this.A01 = A03(context, str, enumC07346r);
    }

    @Nullable
    public static String A00(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        String string = Settings.Global.getString(context.getContentResolver(), str);
        if (A02[4].length() != 29) {
            String[] strArr = A02;
            strArr[1] = "HfuCmMeEYPJ981gewRafdBFBSwX7gAX2";
            strArr[3] = "FHRlwpAt7jGi9NpBTepxh5ZgXrGMSq7S";
            return string;
        }
        throw new RuntimeException();
    }

    @Nullable
    public static String A01(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        return Settings.Secure.getString(context.getContentResolver(), str);
    }

    @Nullable
    public static String A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        return Settings.System.getString(context.getContentResolver(), str);
    }

    @Nullable
    public static String A03(Context context, String str, EnumC07346r enumC07346r) {
        int i10 = C07336q.A00[enumC07346r.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (A02[5].charAt(13) != 'L') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[1] = "VMjILmm1VxijboR6qKsQ5ogEzhQ6S6Q6";
                    strArr[3] = "9JH3tSpEeErHlVJFJtGetom3XKrYweEy";
                    return "";
                }
                return A02(context, str);
            }
            return A01(context, str);
        }
        return A00(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A04 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        String str;
        String str2;
        C1414Ym c1414Ym = (C1414Ym) obj;
        boolean z10 = this.A00 == null && c1414Ym.A00 == null;
        boolean z11 = this.A01 == null && c1414Ym.A01 == null;
        String str3 = this.A00;
        if (str3 != null && (str2 = c1414Ym.A00) != null) {
            z10 = str3.equals(str2);
        }
        String str4 = this.A01;
        if (str4 != null && (str = c1414Ym.A01) != null) {
            z11 = str4.equals(str);
        }
        return z10 && z11;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        String str = this.A00;
        if (str != null && this.A01 != null) {
            return str.getBytes().length + this.A01.getBytes().length;
        }
        return 0;
    }
}
