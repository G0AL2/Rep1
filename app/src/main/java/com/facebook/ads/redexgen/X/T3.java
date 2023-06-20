package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class T3 extends AsyncTask<String, Void, Bitmap[]> implements C8S {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public OF A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    @Nullable
    public final WeakReference<OD> A06;
    public final WeakReference<C1400Xy> A07;
    @Nullable
    public final WeakReference<ImageView> A08;
    @Nullable
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    static {
        A01();
    }

    public T3(ViewGroup viewGroup, int i10, int i11, C1400Xy c1400Xy) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1400Xy);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public T3(ViewGroup viewGroup, C1400Xy c1400Xy) {
        this(viewGroup, 12, 16, c1400Xy);
    }

    public T3(ImageView imageView, C1400Xy c1400Xy) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1400Xy);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public T3(OD od2, C1400Xy c1400Xy) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1400Xy);
        this.A06 = new WeakReference<>(od2);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] bitmapArr) {
        OD od2;
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (bitmapArr[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(bitmapArr[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(bitmapArr[0]);
                }
            }
            if (this.A06 != null && (od2 = this.A06.get()) != null) {
                od2.setImage(bitmapArr[0], bitmapArr[1]);
            }
            if (this.A09 != null && this.A09.get() != null && bitmapArr[1] != null) {
                MS.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), bitmapArr[1]));
            }
            if (this.A02 != null) {
                this.A02.AAx(bitmapArr[0] != null);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    private final Bitmap[] A03(String... strArr) {
        if (L0.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            C1400Xy c1400Xy = this.A07.get();
            if (c1400Xy == null) {
                return new Bitmap[]{null, null};
            }
            Bitmap A0N = new C7U(c1400Xy).A0N(str, this.A00, this.A01);
            if (A0N != null && !this.A03) {
                bitmap = MZ.A01(c1400Xy, A0N, this.A04, this.A05);
            }
            return new Bitmap[]{A0N, bitmap};
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    public final T3 A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final T3 A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final T3 A06(OF of2) {
        this.A02 = of2;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            OF of2 = this.A02;
            if (of2 != null) {
                of2.AAx(false);
                return;
            }
            return;
        }
        executeOnExecutor(MX.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    @Nullable
    public final C1400Xy A5b() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (L0.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
