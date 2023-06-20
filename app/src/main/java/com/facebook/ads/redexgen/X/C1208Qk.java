package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1208Qk {
    public static C1208Qk A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public F0 A00;
    @Nullable
    public I4 A01;
    public File A02;
    public boolean A03;
    public final C1399Xx A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C1206Qi> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC1205Qh(this);
    public final InterfaceC0912Et A07 = new ID(this);

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C1332Vf.A03};
    }

    @VisibleForTesting
    public C1208Qk(C1399Xx c1399Xx, @Nullable F0 f02) {
        this.A06 = c1399Xx;
        if (f02 != null) {
            this.A00 = f02;
            f02.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized F0 A01() {
        if (this.A00 == null) {
            this.A00 = new F0(new F5(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private V0 A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized I4 A03() {
        if (this.A01 == null) {
            this.A01 = new C1313Um(new File(A06(), A07(64, 14, 16)), new BI(JR.A0N(this.A06)));
        }
        return this.A01;
    }

    public static C1316Up A04(V6 v62, I4 i42) {
        return new C1316Up(i42, v62, new V2(), null, 2, null);
    }

    public static synchronized C1208Qk A05(C1399Xx c1399Xx) {
        C1208Qk c1208Qk;
        synchronized (C1208Qk.class) {
            if (A09 == null) {
                A09 = new C1208Qk(c1399Xx, null);
            }
            c1208Qk = A09;
        }
        return c1208Qk;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    @Nullable
    public static String A08(C1399Xx c1399Xx, Uri uri) {
        try {
            if (!JR.A1F(c1399Xx)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c1399Xx.A06().A8y(A07(81, 5, 14), C07828z.A0u, new AnonymousClass90(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C0918Ez[] A0S;
        for (C0918Ez c0918Ez : A01().A0S()) {
            int state = c0918Ez.A02;
            C1206Qi c1206Qi = this.A05.get(state);
            if (c1206Qi != null) {
                int i10 = c0918Ez.A01;
                if (i10 == 2 || c0918Ez.A03 > c1206Qi.A00) {
                    String str = A07(15, 19, 61) + i10 + A07(0, 8, 18) + c0918Ez.A03;
                    c1206Qi.A01.AAY(c1206Qi.A02);
                    this.A05.remove(state);
                } else if (i10 == 4 || i10 == 3) {
                    String str2 = A07(34, 14, 111) + i10;
                    c1206Qi.A01.AAk(c0918Ez.A05);
                    this.A05.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c0918Ez.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC0974Hd A0F(Context context) {
        return A04(new V6(context, (I0<? super InterfaceC0975He>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC1207Qj interfaceC1207Qj, long j10) {
        String cacheKey = A08(this.A06, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean cacheHit = A0H(cacheKey);
        C1332Vf c1332Vf = new C1332Vf(uri, false, null, cacheKey);
        F0 downloadManager = A01();
        int actionId = downloadManager.A0O(c1332Vf);
        this.A05.put(actionId, new C1206Qi(interfaceC1207Qj, j10, cacheHit, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A5w(str, 0L, 1L) > 0;
    }
}
