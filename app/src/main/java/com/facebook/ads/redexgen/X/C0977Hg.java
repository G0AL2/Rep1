package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.ads.redexgen.X.Hg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0977Hg implements R2 {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC07818y A00;
    public Executor A01;
    public boolean A02;
    public R7 A03;
    public final RC A04 = new C0993Hy();
    public final RH A05;
    public final RI A06;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    static {
        A0A();
        A09 = R2.class.getSimpleName();
    }

    public C0977Hg(R7 r72, InterfaceC07818y interfaceC07818y, Executor executor) {
        A0B();
        this.A03 = r72;
        this.A06 = new HN(r72.A04());
        this.A05 = new AbstractC0990Hv(this.A06) { // from class: com.facebook.ads.redexgen.X.4M
        };
        this.A01 = executor;
        this.A00 = interfaceC07818y;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AD1(httpURLConnection);
            if (outputStream != null) {
                this.A05.AFk(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final R1 A01(RE re2) throws RF {
        R1 c0978Hh;
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        R1 r12 = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                boolean isE2E = C1072Lc.A04();
                HttpURLConnection A082 = A08(re2.A05(), isE2E ? A09() : null);
                A0H(A082, re2);
                A0G(A082, re2);
                boolean isE2E2 = this.A06.A8Z();
                if (isE2E2) {
                    this.A06.A9E(A082, re2.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean pinKeys = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z10 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (pinKeys || z10)) {
                    try {
                        RJ.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e10) {
                        this.A00.A9I(A072, C07828z.A1y, new AnonymousClass90(e10));
                    } catch (Exception e11) {
                        this.A00.A9I(A072, C07828z.A1x, new AnonymousClass90(e11));
                    }
                }
                if (A082.getDoOutput() && re2.A06() != null) {
                    A00(A082, re2.A06());
                }
                if (A082.getDoInput()) {
                    c0978Hh = A06(A082);
                } else {
                    c0978Hh = new C0978Hh(A082, null);
                }
                if (this.A06.A8Z()) {
                    this.A06.A9F(c0978Hh);
                }
                A082.disconnect();
                return c0978Hh;
            } catch (Exception e12) {
                try {
                    r12 = A05(null);
                    if (r12 == null || r12.A7a() <= 0) {
                        throw new RF(e12, r12);
                    }
                    if (this.A06.A8Z()) {
                        this.A06.A9F(r12);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return r12;
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e12);
                    if (r12 != null && r12.A7a() > 0) {
                        if (this.A06.A8Z()) {
                            this.A06.A9F(r12);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return r12;
                    }
                    throw new RF(e12, r12);
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8Z()) {
                this.A06.A9F(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Nullable
    private final R1 A02(RE re2) {
        if (this.A03.A04()) {
            A0C(re2);
        }
        R1 r12 = null;
        try {
            r12 = A01(re2);
            return r12;
        } catch (RF e10) {
            this.A05.AAl(e10);
            return r12;
        } catch (Exception e11) {
            this.A05.AAl(new RF(e11, r12));
            return r12;
        }
    }

    @Nullable
    private final R1 A03(String str, RG rg, RA ra2) {
        return A02(new Hm(str, rg, ra2));
    }

    @Nullable
    private final R1 A04(String str, String str2, byte[] bArr, RA ra2) {
        return A02(new C0980Hk(str, null, str2, bArr, ra2));
    }

    private final R1 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                bArr = this.A05.ADe(inputStream);
            }
            C0978Hh c0978Hh = new C0978Hh(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0978Hh;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final R1 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = this.A05.AD0(httpURLConnection);
            if (inputStream != null) {
                bArr = this.A05.ADe(inputStream);
            }
            C0978Hh c0978Hh = new C0978Hh(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c0978Hh;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, @Nullable Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ACz(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(DownloadResource.STATUS_RUNNING, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i10 = -1;
        if (property2 != null) {
            try {
                i10 = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        String proxyAddress = strArr[2];
        if (portStr.charAt(28) != proxyAddress.charAt(28)) {
            String[] strArr2 = A08;
            strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
            strArr2[6] = "26yRDH09B";
            if (!isEmpty && i10 > 0 && i10 <= 65535) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i10));
            }
            return proxy;
        }
        throw new RuntimeException();
    }

    public static synchronized void A0B() {
        synchronized (C0977Hg.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(RE re2) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 17));
        boolean equals = re2.A03().equals(RD.A06);
        String A072 = A07(41, 1, 33);
        if (equals && re2.A06() != null) {
            sb2.append(A07(7, 5, 55));
            sb2.append(new String(re2.A06(), Charset.forName(A07(130, 5, 42))));
            sb2.append(A072);
        }
        Map<String, String> A06 = re2.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb2.append(A07(2, 5, 74));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 118));
            sb2.append(entry.getValue());
            sb2.append(A072);
        }
        sb2.append(A07(0, 2, 109));
        sb2.append(re2.A05());
        sb2.append(A072);
        String sb3 = sb2.toString();
        A0E(sb3, 1, (sb3.length() / TTAdSdk.INIT_LOCAL_FAIL_CODE) + 1);
    }

    private void A0D(RE re2, R3 r32) {
        this.A04.A5k(this, r32, this.A01).A5H(re2);
        if (this.A03.A04()) {
            A0C(re2);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 114) + i10 + A07(65, 1, 35) + i11;
        if (str.length() > 4000) {
            str.substring(0, TTAdSdk.INIT_LOCAL_FAIL_CODE);
            A0E(str.substring(TTAdSdk.INIT_LOCAL_FAIL_CODE), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, R3 r32, RA ra2) {
        A0D(new C0980Hk(str, null, str2, bArr, ra2), r32);
    }

    private void A0G(HttpURLConnection httpURLConnection, RE re2) {
        Map<String, String> A06 = re2.A02().A06();
        R0 A05 = re2.A02().A05();
        for (String str : A06.keySet()) {
            String name = A06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (A05 != null) {
            Map<String, String> A5W = A05.A5W(this.A03.A03());
            for (String str2 : A5W.keySet()) {
                String value = A5W.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, RE re2) throws IOException {
        RA A02 = re2.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADI(httpURLConnection, re2.A03(), re2.A04());
    }

    private final boolean A0I(Throwable th, long j10, RE re2) {
        RA A02 = re2.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.A8Z()) {
            String str = A07(67, 15, 35) + currentTimeMillis + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return currentTimeMillis >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return currentTimeMillis >= A00;
    }

    public final R1 A0J(RE re2) throws RF {
        long j10;
        long j11;
        long endTimeMillis;
        R1 A01;
        long startTime = System.currentTimeMillis();
        int A012 = re2.A02().A01();
        long A03 = re2.A02().A03();
        long currentTimeMillis = System.currentTimeMillis() + re2.A02().A04();
        for (int i10 = 0; i10 < A012; i10++) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "w7CndVwumsN";
            strArr[7] = "Wx3tR5uVNB4";
            if (currentTimeMillis <= currentTimeMillis2) {
                break;
            }
            try {
                if (this.A06.A8Z()) {
                    String str = (i10 + 1) + A07(37, 4, 115) + A012 + A07(56, 9, 70) + re2.A05();
                }
                startTime = System.currentTimeMillis();
            } catch (RF e10) {
                e = e10;
                if (A08[4].length() == 10) {
                    throw new RuntimeException();
                }
                A08[5] = "aIX15CFtbyRTCgSwX4E1qAS9DeUF";
            }
            try {
                A01 = A01(re2);
            } catch (RF e11) {
                e = e11;
                if (!A0I(e, startTime, re2) || i10 >= A012 - 1) {
                    boolean isRecoverable = this.A05.AAl(e);
                    if (isRecoverable && i10 < A012 - 1) {
                        long j12 = 0;
                        if (A03 > 0) {
                            try {
                                Thread.sleep(A03);
                            } catch (InterruptedException e12) {
                                InterfaceC07818y interfaceC07818y = this.A00;
                                long currentTimeMillis3 = System.currentTimeMillis() - startTime;
                                if (re2.A04 != null) {
                                    int numTries = re2.A04.length;
                                    j12 = numTries;
                                }
                                interfaceC07818y.A98(startTime, currentTimeMillis3, 0L, j12, 0, e12);
                                throw e;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        R1 A00 = e.A00();
                        InterfaceC07818y interfaceC07818y2 = this.A00;
                        long currentTimeMillis4 = System.currentTimeMillis() - startTime;
                        if (A00 == null || A00.A5o() == null) {
                            j11 = 0;
                        } else {
                            j11 = A00.A5o().length;
                        }
                        if (re2.A04 == null) {
                            endTimeMillis = 0;
                        } else {
                            int numTries2 = re2.A04.length;
                            endTimeMillis = numTries2;
                        }
                        long startTime2 = j11;
                        interfaceC07818y2.A98(startTime, currentTimeMillis4, startTime2, endTimeMillis, A00 == null ? 0 : A00.A7a(), e);
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.A98(startTime, System.currentTimeMillis() - startTime, A01.A5o().length, re2.A04 == null ? 0L : re2.A04.length, A01.A7a(), null);
                return A01;
            }
            continue;
        }
        InterfaceC07818y interfaceC07818y3 = this.A00;
        long currentTimeMillis5 = System.currentTimeMillis() - startTime;
        if (re2.A04 == null) {
            j10 = 0;
        } else {
            int numTries3 = re2.A04.length;
            j10 = numTries3;
        }
        interfaceC07818y3.A98(startTime, currentTimeMillis5, 0L, j10, 0, new TimeoutException(A07(82, 35, 27)));
        return null;
    }

    public final R7 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.R2
    @Nullable
    @Deprecated
    public final R1 ADA(String str, Map<String, String> map) {
        return A03(str, new RG(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.R2
    @Nullable
    @Deprecated
    public final R1 ADB(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.R2
    public final void ADC(String str, byte[] bArr, R3 r32) {
        A0F(str, A07(135, 47, 70), bArr, r32, this.A03.A00());
    }
}
