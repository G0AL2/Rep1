package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class S3 extends AbstractC06774l {
    @Nullable
    @DoNotStrip
    public AbstractC1219Qv A00;
    public C1220Qw A01;
    @Nullable
    public C1220Qw A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C1400Xy A05;
    public final AB A06;

    public S3(AB ab2, SparseBooleanArray sparseBooleanArray, C1220Qw c1220Qw, int i10, C1400Xy c1400Xy) {
        super(ab2);
        this.A05 = c1400Xy;
        this.A06 = ab2;
        this.A04 = sparseBooleanArray;
        this.A01 = c1220Qw;
        this.A03 = i10;
    }

    private void A08(InterfaceC1028Jh interfaceC1028Jh, MK mk, String str, C1172Pa c1172Pa) {
        if (this.A04.get(c1172Pa.A02())) {
            return;
        }
        C1220Qw c1220Qw = this.A02;
        if (c1220Qw != null) {
            c1220Qw.A0V();
            this.A02 = null;
        }
        this.A00 = new S5(this, str, c1172Pa, interfaceC1028Jh, c1172Pa.A04(), mk);
        this.A02 = new C1220Qw(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new S4(this, c1172Pa));
    }

    public final void A0l(C1172Pa c1172Pa, InterfaceC1028Jh interfaceC1028Jh, C7U c7u, MK mk, String str, int i10, int i11, int i12) {
        int A02 = c1172Pa.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(A02));
        this.A06.setupNativeCtaExtension(c1172Pa);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int i13 = A02 == 0 ? i12 : i11;
        if (A02 < this.A03 - 1) {
            i12 = i11;
        }
        marginLayoutParams.setMargins(i13, 0, i12, 0);
        String A07 = c1172Pa.A03().A0D().A07();
        String A08 = c1172Pa.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c7u.A0S(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.A0j(c1172Pa.A04());
        A08(interfaceC1028Jh, mk, str, c1172Pa);
    }

    public final void A0m(C1220Qw c1220Qw) {
        this.A01 = c1220Qw;
    }
}
