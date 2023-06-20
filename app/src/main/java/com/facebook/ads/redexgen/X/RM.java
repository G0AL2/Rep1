package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class RM extends AsyncTask<String, Void, RN> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C8U A00;
    public R1 A01;
    public RL A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = RM.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public RM(C8U c8u) {
        this(c8u, null, null);
    }

    public RM(C8U c8u, Map<String, String> map) {
        this(c8u, map, null);
    }

    public RM(C8U c8u, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.A00 = c8u;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final RN A00(String... strArr) {
        if (L0.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String url = entry.getValue();
                        A02 = A03(A02, entry.getKey(), url);
                    }
                }
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new RN(this.A01);
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() != 31) {
                A06[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                L0.A00(th, this);
                return null;
            }
            throw new RuntimeException();
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C1091Lx.A01(this.A00.A02().A5i()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        return str + A01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A05(RN rn) {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ADO(rn);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        R1 ADA;
        R2 A00 = RK.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                ADA = A00.ADA(str, new RG());
            } else {
                RG rg = new RG();
                rg.A05(this.A04);
                ADA = A00.ADB(str, rg.A08());
            }
            this.A01 = ADA;
        } catch (Exception e10) {
            String str2 = A07;
            Log.e(str2, A01(4, 19, 62) + str, e10);
        }
        R1 r12 = this.A01;
        return r12 != null && r12.A7a() == 200;
    }

    public final void A07(RL rl) {
        this.A02 = rl;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ RN doInBackground(String[] strArr) {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        RL rl = this.A02;
        if (rl != null) {
            rl.ADM();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(RN rn) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A05(rn);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            L0.A00(th, this);
        }
    }
}
