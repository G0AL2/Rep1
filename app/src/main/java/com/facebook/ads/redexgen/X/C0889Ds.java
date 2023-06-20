package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Ds */
/* loaded from: assets/audience_network.dex */
public final class C0889Ds implements XH, InterfaceC0822Ao, InterfaceC0820Am {
    public static byte[] A0O;
    public static String[] A0P = {"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    public float A00;
    public int A01;
    public int A02;
    @Nullable
    public Surface A03;
    @Nullable
    public SurfaceHolder A04;
    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public BD A08;
    public C0855Bw A09;
    public C0855Bw A0A;
    public InterfaceC0919Fa A0B;
    public List<GX> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final XH A0F;
    public final XF A0G;
    public final XD A0H;
    public final CopyOnWriteArraySet<BT> A0I;
    public final CopyOnWriteArraySet<EJ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0946Gb> A0K;
    public final CopyOnWriteArraySet<JN> A0L;
    public final CopyOnWriteArraySet<JE> A0M;
    public final XG[] A0N;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, 23, 19, 14, 18, 27, 59, 6, 17, 46, 18, 31, 7, 27, 12, 9, 47, 40, 60, 59, 57, 63, 14, 63, 34, 46, 47, 40, 63, 22, 51, 41, 46, 63, 52, 63, 40, 122, 59, 54, 40, 63, 59, 62, 35, 122, 47, 52, 41, 63, 46, 122, 53, 40, 122, 40, 63, 42, 54, 59, 57, 63, 62, 116};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0889Ds(InterfaceC0830Aw interfaceC0830Aw, HT ht, InterfaceC0809Ab interfaceC0809Ab, @Nullable CM<C1372Ww> cm) {
        this(interfaceC0830Aw, ht, interfaceC0809Ab, cm, new B2());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0889Ds(InterfaceC0830Aw interfaceC0830Aw, HT ht, InterfaceC0809Ab interfaceC0809Ab, @Nullable CM<C1372Ww> cm, B2 b22) {
        this(interfaceC0830Aw, ht, interfaceC0809Ab, cm, b22, IN.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0889Ds(InterfaceC0830Aw interfaceC0830Aw, HT ht, InterfaceC0809Ab interfaceC0809Ab, @Nullable CM<C1372Ww> cm, B2 b22, IN in) {
        this.A0G = new XF(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        XF xf = this.A0G;
        this.A0N = interfaceC0830Aw.A4R(handler, xf, xf, xf, xf, cm);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = BD.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, ht, interfaceC0809Ab, in);
        this.A0H = b22.A00(this.A0F, in);
        A3E(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (cm instanceof C1374Wy) {
            ((C1374Wy) cm).A04(this.A0E, this.A0H);
        }
    }

    private final XH A02(XG[] xgArr, HT ht, InterfaceC0809Ab interfaceC0809Ab, IN in) {
        return new E3(xgArr, ht, interfaceC0809Ab, in);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(@Nullable Surface surface, boolean z10) {
        XG[] xgArr;
        ArrayList<C0826As> arrayList = new ArrayList();
        for (XG xg : this.A0N) {
            int A7i = xg.A7i();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (A7i == 2) {
                arrayList.add(this.A0F.A4L(xg).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C0826As c0826As : arrayList) {
                    c0826As.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z10;
    }

    private final void A0I(EJ ej) {
        this.A0J.add(ej);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AF4(false);
    }

    public final void A0N(float f10) {
        XG[] xgArr;
        this.A00 = f10;
        for (XG xg : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (xg.A7i() == 1) {
                this.A0F.A4L(xg).A06(2).A07(Float.valueOf(f10)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(InterfaceC0919Fa interfaceC0919Fa) {
        ADH(interfaceC0919Fa, true, true);
    }

    public final void A0Q(JE je2) {
        this.A0M.add(je2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void A3E(InterfaceC0818Ak interfaceC0818Ak) {
        this.A0F.A3E(interfaceC0818Ak);
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final C0826As A4L(InterfaceC0825Ar interfaceC0825Ar) {
        return this.A0F.A4L(interfaceC0825Ar);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A5r() {
        return this.A0F.A5r();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A5s() {
        return this.A0F.A5s();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6A() {
        return this.A0F.A6A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6C() {
        return this.A0F.A6C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6D() {
        return this.A0F.A6D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6F() {
        return this.A0F.A6F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final B1 A6H() {
        return this.A0F.A6H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final int A6I() {
        return this.A0F.A6I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final long A6R() {
        return this.A0F.A6R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final boolean A7D() {
        return this.A0F.A7D();
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final void ADH(InterfaceC0919Fa interfaceC0919Fa, boolean z10, boolean z11) {
        InterfaceC0919Fa interfaceC0919Fa2 = this.A0B;
        if (interfaceC0919Fa2 != interfaceC0919Fa) {
            if (interfaceC0919Fa2 != null) {
                interfaceC0919Fa2.ADv(this.A0H);
                this.A0H.A07();
            }
            interfaceC0919Fa.A3C(this.A0E, this.A0H);
            this.A0B = interfaceC0919Fa;
        }
        this.A0F.ADH(interfaceC0919Fa, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void ADm() {
        this.A0F.ADm();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        InterfaceC0919Fa interfaceC0919Fa = this.A0B;
        if (interfaceC0919Fa != null) {
            interfaceC0919Fa.ADv(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEN(long j10) {
        this.A0H.A06();
        this.A0F.AEN(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEO() {
        this.A0H.A06();
        this.A0F.AEO();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AEe(boolean z10) {
        this.A0F.AEe(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Ap
    public final void AF4(boolean z10) {
        this.A0F.AF4(z10);
        InterfaceC0919Fa interfaceC0919Fa = this.A0B;
        if (interfaceC0919Fa != null) {
            interfaceC0919Fa.ADv(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
