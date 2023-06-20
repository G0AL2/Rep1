package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;

@TargetApi(12)
/* loaded from: assets/audience_network.dex */
public final class KT implements Q7 {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    @Nullable
    public QK A01;
    @Nullable
    public QJ A02;
    public boolean A03;
    public final Handler A04;
    public final N6 A05;
    public final AbstractC1093Lz A06;
    public final AbstractC1079Lj A07;
    public final AbstractC1051Ke A08;
    public final boolean A09;
    public final boolean A0A;

    public KT(View view, QJ qj, boolean z10) {
        this(view, qj, z10, false);
    }

    public KT(View view, @Nullable QJ qj, boolean z10, boolean z11) {
        this.A06 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.7r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass85 anonymousClass85) {
                KT.A0A(KT.this, 1, 0);
            }
        };
        this.A07 = new AbstractC1079Lj() { // from class: com.facebook.ads.redexgen.X.7q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(C1092Ly c1092Ly) {
                if (!KT.A0C(KT.this)) {
                    return;
                }
                if (KT.A03(KT.this) == QJ.A03 || KT.A0D(KT.this)) {
                    KT.A04(KT.this, null);
                    KT.A09(KT.this);
                    return;
                }
                KT.A0A(KT.this, 0, 8);
            }
        };
        this.A05 = new N6() { // from class: com.facebook.ads.redexgen.X.7p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC07859c
            /* renamed from: A00 */
            public final void A03(AnonymousClass88 anonymousClass88) {
                if (KT.A03(KT.this) != QJ.A04) {
                    KT.A01(KT.this).setAlpha(1.0f);
                    KT.A01(KT.this).setVisibility(0);
                }
            }
        };
        this.A08 = new C07537o(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, qj);
    }

    public static /* synthetic */ View A01(KT kt) {
        return kt.A00;
    }

    public static /* synthetic */ QJ A03(KT kt) {
        return kt.A02;
    }

    public static /* synthetic */ QJ A04(KT kt, QJ qj) {
        kt.A02 = qj;
        return qj;
    }

    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new QI(this));
    }

    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, QJ qj) {
        this.A02 = qj;
        this.A00 = view;
        this.A00.clearAnimation();
        if (qj == QJ.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    public static /* synthetic */ void A09(KT kt) {
        kt.A05();
    }

    public static /* synthetic */ void A0A(KT kt, int i10, int i11) {
        kt.A06(i10, i11);
    }

    public static /* synthetic */ boolean A0C(KT kt) {
        return kt.A03;
    }

    public static /* synthetic */ boolean A0D(KT kt) {
        return kt.A09;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A8o(QK qk) {
        this.A01 = qk;
        qk.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void AFG(QK qk) {
        A06(1, 0);
        qk.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
