package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Rw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1246Rw extends AbstractC06774l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    @DoNotStrip
    public AbstractC1219Qv A00;
    public C1220Qw A01;
    @Nullable
    public C1220Qw A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C1400Xy A08;
    public final A3 A09;

    public C1246Rw(A3 a32, SparseBooleanArray sparseBooleanArray, C1220Qw c1220Qw, int i10, int i11, int i12, int i13, C1400Xy c1400Xy) {
        super(a32);
        this.A08 = c1400Xy;
        this.A09 = a32;
        this.A07 = sparseBooleanArray;
        this.A01 = c1220Qw;
        this.A03 = i10;
        this.A04 = i11;
        this.A05 = i12;
        this.A06 = i13;
    }

    private void A08(InterfaceC1028Jh interfaceC1028Jh, MK mk, String str, C1172Pa c1172Pa) {
        if (this.A07.get(c1172Pa.A02())) {
            return;
        }
        C1220Qw c1220Qw = this.A02;
        if (c1220Qw != null) {
            c1220Qw.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C1248Ry(this, str, c1172Pa, interfaceC1028Jh, c1172Pa.A04(), mk);
        this.A02 = new C1220Qw(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C1247Rx(this, c1172Pa));
    }

    public final void A0l(C1172Pa c1172Pa, InterfaceC1028Jh interfaceC1028Jh, C7U c7u, MK mk, String videoUrl) {
        int A02 = c1172Pa.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(A02 == 0 ? this.A04 : this.A05, 0, A02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String A07 = c1172Pa.A03().A0D().A07();
        String A08 = c1172Pa.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(A07);
            this.A09.setVideoUrl(c7u.A0S(A08));
        } else {
            this.A09.setImageUrl(A07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(c1172Pa.A03().A0E().A06(), c1172Pa.A03().A0E().A01());
        this.A09.setCTAInfo(c1172Pa.A03().A0F(), c1172Pa.A04());
        this.A09.A0k(c1172Pa.A04());
        A08(interfaceC1028Jh, mk, videoUrl, c1172Pa);
    }
}
