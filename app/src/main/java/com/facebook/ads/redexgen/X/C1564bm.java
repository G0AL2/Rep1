package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bm */
/* loaded from: assets/audience_network.dex */
public final class C1564bm extends AbstractC05790o {
    public static byte[] A03;
    @Nullable
    public View A00;
    public final AnonymousClass54 A01;
    public final C0904El A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C1564bm(AnonymousClass54 anonymousClass54) {
        this.A02 = anonymousClass54.A09();
        this.A01 = anonymousClass54;
    }

    public static /* synthetic */ View A00(C1564bm c1564bm) {
        return c1564bm.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0C() {
        this.A02.A0D().A3d();
        C1069Kz.A00(new C1566bo(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0D() {
        this.A02.A0D().A3g();
        C1069Kz.A00(new C1565bn(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3f();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof T5) {
                KO.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FQ A08 = this.A01.A08();
            if (A08 != null) {
                A08.A0F();
            }
            C1069Kz.A00(new C1567bp(this));
            AnonymousClass54 anonymousClass54 = this.A01;
            anonymousClass54.A0B(anonymousClass54.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && JR.A0w(this.A01.A07().getContext())) {
                final OE oe2 = new OE();
                this.A01.A0D(oe2);
                oe2.A0C(this.A01.getPlacementId());
                oe2.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    oe2.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof T5) {
                    oe2.A0A(((T5) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (C1564bm.A00(C1564bm.this) != null) {
                            oe2.setBounds(0, 0, C1564bm.A00(C1564bm.this).getWidth(), C1564bm.A00(C1564bm.this).getHeight());
                            OE oe3 = oe2;
                            oe3.A0D(!oe3.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(oe2);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0F(InterfaceC05780n interfaceC05780n) {
        this.A02.A0D().A3e(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05790o
    public final void A0G(KH kh) {
        this.A02.A0D().A2a(MJ.A01(this.A01.A04()), kh.A03().getErrorCode(), kh.A04());
        C1069Kz.A00(new C1568bq(this, kh));
    }
}
