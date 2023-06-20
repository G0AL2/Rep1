package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PO {
    public static byte[] A00;
    public static String[] A01 = {"qzld4Qy39Azn7KYrj1sXbPZPr2qv6GgB", "1yyYiWnNu", "Zg1voNH89a01plQdKkVOTIE3hJJ00If9", "AO", "oO", "LhD7lTYtuMCYkgD1PnemOg5ERT23PX0", "YB3LukNHUN2DaV56yaS9yy46zwl6QYin", "pfYbPlfLNAe5pcAyURRpn9lPUi7k7Z7a"};
    public static final String A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {21, 51, 53, 58, 55, -14, 63, 59, 69, 69, -14, 56, 65, 68, -14, 56, 59, 62, 55, -14, 71, 68, 62, 12, -14, -61, -31, -29, -24, -27, -96, -19, -23, -13, -13, -96, -26, -17, -14, -96, -23, -19, -31, -25, -27, -96, -11, -14, -20, -70, -96, 33, 37, 48, -46, -1, -1, -4, -1, -83, -4, -3, -14, -5, -10, -5, -12, -83, -16, -18, -16, -11, -14, -15, -83, -13, -10, -7, -14, -83, -13, -4, -1, -83, 2, -1, -7, -57, -83, -26, -30, -31, 21, 4, 9, 5, 14, 3, 5, -18, 5, 20, 23, 15, 18, 11, -61, -65, -56, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -34, -31, -28, -35, -104, -19, -22, -28, -78, -104, -2, 32, 29, 17, 19, 33, 33, 23, 28, 21, -50, 23, 27, 15, 21, 19, -50, 35, 32, 26, -24, -50, -7, 27, 24, 12, 14, 28, 28, 18, 23, 16, -55, 31, 18, 13, 14, 24, -55, 30, 27, 21, -29, -55, 73, 88, 81, -16, -5, -6, -9, -15};
        String[] strArr = A01;
        if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        A01[1] = "7l6kM9ADseoG9RLfCJpKjz7J";
        A00 = bArr;
    }

    static {
        A04();
        A02 = PO.class.getSimpleName();
    }

    @Nullable
    @RequiresApi(api = 21)
    public static WebResourceResponse A00(C1400Xy c1400Xy, C7U c7u, WebResourceRequest webResourceRequest, PM pm, boolean z10) {
        String uri = webResourceRequest.getUrl().toString();
        if (pm.A06) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(uri);
            if (pm.A02.contains(uri)) {
                String str = A03(108, 21, 15) + uri;
                File A0O = c7u.A0O(uri);
                if (A0O != null) {
                    if (z10 && (uri.equals(pm.A01) || uri.equals(pm.A00))) {
                        return A02(hashMap, guessContentTypeFromName, new PG(c1400Xy.A00(), new FileInputStream(A0O), new SV(c1400Xy, uri)));
                    }
                    return A01(hashMap, guessContentTypeFromName, A0O);
                }
                r0 = A03(0, 25, 105) + uri;
            }
            if (pm.A03.contains(uri)) {
                String str2 = A03(129, 22, 69) + uri;
                File A0P = c7u.A0P(uri);
                if (A0P != null) {
                    return A01(hashMap, guessContentTypeFromName, A0P);
                }
                String str3 = A03(25, 26, 23) + uri;
            }
            if (pm.A04.contains(uri)) {
                String str4 = A03(151, 22, 64) + uri;
                return PD.A00(c1400Xy, webResourceRequest, webResourceRequest.getUrl(), guessContentTypeFromName, hashMap);
            }
        } catch (IOException e10) {
            Log.e(A03(89, 17, 55), A03(54, 35, 36) + uri, e10);
        }
        return null;
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse A01(HashMap<String, String> hashMap, String str, File file) throws FileNotFoundException {
        return A02(hashMap, str, new FileInputStream(file));
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse A02(HashMap<String, String> hashMap, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 11), hashMap, inputStream);
    }

    public static void A05(C8U c8u, String str, String str2) {
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A03(51, 3, 116));
        anonymousClass90.A03(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 31), str);
            jSONObject.put(A03(178, 3, 28), str2);
            anonymousClass90.A05(jSONObject);
        } catch (JSONException unused) {
        }
        c8u.A06().A8z(A03(173, 3, 124), C07828z.A12, anonymousClass90);
    }
}
