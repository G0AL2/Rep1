package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;

@SuppressLint({"StringFormatUse", "SharedPreferencesUse"})
/* renamed from: com.facebook.ads.redexgen.X.7F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7F {
    public static C7F A01;
    public static byte[] A02;
    public static String[] A03 = {"rLDjBgKz63Bn2bjdq5T9imrieVp5PIBM", "m8wp0Vw9GL6Om21Qq8m8Tj5zfu0l", "YgqNWwRBt3ccTC8L8vt9EnrOaTNX", "Ji4mlDElrKKLO0fU8k8hI0n9H2FXwyxW", "wf5MYK5ehGzLy7SkBsWbSYGwiXhb8bxZ", "VWIuBm7xkqaJ1AqGCIKfvhlqUEnKMMIs", "Q1uyQO5SpdafJkDIvdpZDIFmVDRWB0Ou", "30w5jfTvH5e90EUSXrOKs1RMT2PDXB24"};
    public final HashMap<Integer, String> A00 = new HashMap<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{103, 114, 116, -70};
    }

    static {
        A03();
    }

    @SuppressLint({"CatchGeneralException"})
    public C7F(Context context, EnumC07426z enumC07426z, @Nullable String str) {
        try {
            A04(context);
            if (enumC07426z.A04() == EnumC07426z.A0G.A04()) {
                A05(context, str);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    public static C7F A00(Context context, EnumC07426z enumC07426z, @Nullable String str) {
        if (A01 == null) {
            A01 = new C7F(context, enumC07426z, str);
        }
        return A01;
    }

    public static String A02(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(String.format(A01(0, 4, 62), Byte.valueOf(bArr[i10])));
        }
        String sb3 = sb2.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(8) != strArr[6].charAt(8)) {
            A03[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
            return sb3;
        }
        throw new RuntimeException();
    }

    private void A04(Context context) throws Exception {
        int read;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            MessageDigest messageDigest = MessageDigest.getInstance(C7I.A04.A02());
            MessageDigest messageDigest2 = MessageDigest.getInstance(C7I.A05.A02());
            MessageDigest messageDigest3 = MessageDigest.getInstance(C7I.A06.A02());
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                    messageDigest2.update(bArr, 0, read);
                    messageDigest3.update(bArr, 0, read);
                }
                if (A03[7].charAt(26) != 'P') {
                    throw new RuntimeException();
                }
                A03[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
            } while (read != -1);
            this.A00.put(10003, A02(messageDigest.digest()));
            this.A00.put(10004, A02(messageDigest2.digest()));
            this.A00.put(10005, A02(messageDigest3.digest()));
            bufferedInputStream.close();
        } catch (Throwable th) {
            String[] strArr = A03;
            if (strArr[4].charAt(30) != strArr[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "XS9zpWe4kggJPLQjl3jzxSvjjqaK1CvG";
            strArr2[6] = "1gkHVsehFegipbXpJD0YhFUDmEZYz3Bw";
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private void A05(Context context, @Nullable String str) throws Throwable {
        int read;
        if (str == null || str.isEmpty()) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7I.A04.A02());
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            this.A00.put(10010, A02(messageDigest.digest()));
            bufferedInputStream.close();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Nullable
    public final String A06(int i10) {
        String str = this.A00.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        return null;
    }
}
