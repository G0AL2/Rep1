package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PL {
    public static byte[] A08;
    public WeakReference<PA> A00;
    public WeakReference<SW> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1400Xy A03;
    public final C1169Ox A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC1028Jh> A07;

    static {
        A09();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PL(C1400Xy c1400Xy, PA pa2, InterfaceC1028Jh interfaceC1028Jh, C1169Ox c1169Ox, String str, String str2) {
        this.A03 = c1400Xy;
        this.A00 = new WeakReference<>(pa2);
        this.A07 = new WeakReference<>(interfaceC1028Jh);
        this.A04 = c1169Ox;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.close();
    }

    private void A05() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.A81();
    }

    private void A06() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.A8h();
    }

    private void A07() {
        this.A03.A0D().A4u();
        this.A02 = true;
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.AF2();
        if (JR.A1I(this.A03)) {
            this.A03.A09().AAT();
        }
    }

    private void A08() {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        sw.AAr();
    }

    private void A0A(PA pa2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C1063Kt.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        StringBuilder sb2 = new StringBuilder();
        String key = A01(14, 4, 103);
        sb2.append(key);
        sb2.append(opId);
        String key2 = sb2.toString();
        String key3 = A00.getString(key2, A01);
        if (key3 != null) {
            A01 = key3;
        }
        pa2.A0g(optString, A01);
    }

    private void A0B(PA pa2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        SharedPreferences.Editor edit = C1063Kt.A00(this.A03).edit();
        edit.putString(A01(14, 4, 103) + optString3, optString).apply();
        pa2.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PJ pj, String str) throws JSONException {
        switch (pj) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A56(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(pj, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        PA pa2 = this.A00.get();
        if (pa2 == null) {
            return;
        }
        switch (pj) {
            case A06:
                pa2.A0S();
                return;
            case A05:
                pa2.A0R();
                return;
            case A0P:
                A0B(pa2, str);
                return;
            case A0L:
                A0A(pa2, str);
                return;
            case A0F:
                pa2.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(PJ pj, String str) throws JSONException {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        switch (pj) {
            case A0C:
                sw.AAv();
                return;
            case A0N:
                sw.ACK();
                return;
            case A0K:
                A0G(sw, str);
                return;
            case A0J:
                A0F(sw, str);
                return;
            case A0G:
                A0E(sw, str);
                return;
            default:
                return;
        }
    }

    private void A0E(SW sw, String str) throws JSONException {
        sw.ABZ(new JSONObject(str).optBoolean(A01(87, 5, 108), false));
    }

    private void A0F(SW sw, String str) throws JSONException {
        sw.ACn(new JSONObject(str).optBoolean(A01(62, 12, 118), false));
    }

    private void A0G(SW sw, String str) throws JSONException {
        sw.ACp(new JSONObject(str).optBoolean(A01(74, 13, 82), false));
    }

    private void A0I(JSONObject jSONObject) {
        SW sw = this.A01.get();
        if (sw == null) {
            return;
        }
        String optString = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(optString)) {
            sw.A7w();
        } else {
            sw.A7x(optString);
        }
    }

    private void A0J(JSONObject jSONObject) {
        if (this.A01.get() == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC1028Jh interfaceC1028Jh = this.A07.get();
        if (interfaceC1028Jh == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C1036Jp(this.A06, interfaceC1028Jh).A03(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0D().A8w(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        SW sw = this.A01.get();
        if (sw == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        sw.AD2(optString);
    }

    public final void A0N(SW sw) {
        this.A01 = new WeakReference<>(sw);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        MM.A00(new PH(this, str));
    }
}
