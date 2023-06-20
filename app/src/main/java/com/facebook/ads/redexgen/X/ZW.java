package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class ZW implements AnonymousClass72<String> {
    public static byte[] A04;
    public static String[] A05 = {"6T4TfN9d93smpapPC7NPEvQWDZz", "wz9NXVQZVQaYwwlRa3NaAZc6LHoNdU30", "fnx8tXb47HvWFCwW5yhjIfQFoxtnUIQc", "G4THVOFWMbp9mJ5nlEieSYvLtIDTgl3R", "sX64T2TxVGN65WmSTioWL8lV1Wvmr5np", "uUcAhhBnqDd9NemnY1mmV8635HbWIwRZ", "chycLI4p4miw8vWmnJIeDCkDmR2uSv62", "9rtomFcZ9dWi2vFWEMHGPAm9jgP"};
    public final int A00;
    public final long A01;
    public final long A02;
    @Nullable
    public final File A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{8, 29, 29, 78, 71, 76, 42, 43, 50};
    }

    static {
        A03();
    }

    public ZW(@Nullable File file) {
        this.A03 = file;
        this.A01 = file != null ? file.lastModified() : 0L;
        this.A02 = file != null ? file.length() : 0L;
        this.A00 = A00(file);
    }

    public static int A00(@Nullable File file) {
        if (file == null || !file.exists()) {
            String[] strArr = A05;
            if (strArr[2].charAt(30) != strArr[4].charAt(30)) {
                String[] strArr2 = A05;
                strArr2[2] = "wc3nNJS5ppnny67u8HKUvYRr0GzlmmqW";
                strArr2[4] = "Z8l5li3UiIjyuK8KpEFCaPnNGNbl1bLY";
                return 0;
            }
            throw new RuntimeException();
        }
        int i10 = 0;
        if (file.isFile()) {
            i10 = 0 | 1;
        }
        if (file.isDirectory()) {
            i10 |= 2;
        }
        if (file.isAbsolute()) {
            i10 |= 4;
        }
        if (file.isHidden()) {
            return i10 | 8;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A02 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(0, 3, 62), this.A00);
        jSONObject2.put(A01(3, 3, 117), this.A02);
        jSONObject2.put(A01(6, 3, 17), this.A01);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    @SuppressLint({"BadMethodUse-java.io.File.getAbsolutePath"})
    public final boolean A8S(Object obj) {
        ZW zw = (ZW) obj;
        File file = this.A03;
        if (file == null || zw.A03 == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = zw.A03.getAbsolutePath();
        String[] strArr = A05;
        if (strArr[5].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[2] = "X3kNBIX1Z99NiqyAprs9ibiSMdwBku8V";
        strArr2[4] = "CI6kXko00kdVwKTWWoZ5nL7fIste75nZ";
        if (absolutePath.equals(absolutePath2) && this.A00 == zw.A00) {
            long j10 = this.A02;
            long j11 = zw.A02;
            String[] strArr3 = A05;
            if (strArr3[5].charAt(25) != strArr3[1].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A05;
            strArr4[7] = "GYoIXwPodsztMnAFw2JgL9coQaW";
            strArr4[0] = "dJwXRm7Lc7INOyvryqQLdueNOGl";
            return j10 == j11 && this.A01 == zw.A01;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return A01(0, 3, 62).getBytes().length + A01(3, 3, 117).getBytes().length + A01(6, 3, 17).getBytes().length + 4 + 16;
    }
}
