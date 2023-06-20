package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7Y {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.graphics.BitmapFactory.Options r3, int r4, int r5) {
        /*
            int r1 = r3.outHeight
            int r0 = r3.outWidth
            r3 = 1
            if (r1 > r5) goto L9
            if (r0 <= r4) goto L18
        L9:
            int r2 = r1 / 2
            int r1 = r0 / 2
        Ld:
            int r0 = r2 / r3
            if (r0 < r5) goto L18
            int r0 = r1 / r3
            if (r0 < r4) goto L18
            int r3 = r3 * 2
            goto Ld
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7Y.A00(android.graphics.BitmapFactory$Options, int, int):int");
    }

    @Nullable
    public static Bitmap A01(InputStream inputStream, int i10, int i11) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(Constants.BUFFER_SIZE);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i10, int i11, C8U c8u) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            c8u.A06().A8y(A03(0, 5, 99), C07828z.A1g, new AnonymousClass90(th));
            return null;
        }
    }
}
