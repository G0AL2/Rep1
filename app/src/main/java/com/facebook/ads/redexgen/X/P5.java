package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class P5 extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ PA A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public P5(PA pa2) {
        this.A00 = pa2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C1036Jp c1036Jp;
        C1169Ox c1169Ox;
        C1400Xy c1400Xy;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c1036Jp = this.A00.A0D;
            c1036Jp.A02(EnumC1035Jo.A0N, null);
            c1169Ox = this.A00.A0E;
            c1169Ox.A04(C07828z.A14, jSONObject2);
            c1400Xy = this.A00.A0B;
            c1400Xy.A0D().A4z(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
