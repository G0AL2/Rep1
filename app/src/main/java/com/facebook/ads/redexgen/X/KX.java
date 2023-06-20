package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class KX implements Q7 {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    @Nullable
    public QK A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1093Lz A07 = new AbstractC1093Lz() { // from class: com.facebook.ads.redexgen.X.83
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass85 anonymousClass85) {
            KX.A01(KX.this).removeCallbacksAndMessages(null);
            if (KX.A0A(KX.this, QS.A05)) {
                KX.A04(KX.this);
                KX.A05(KX.this, true, false);
            }
            KX.A0B(KX.this, true);
        }
    };
    public final N6 A06 = new N6() { // from class: com.facebook.ads.redexgen.X.82
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass88 anonymousClass88) {
            KX.A04(KX.this);
            KX.A05(KX.this, false, false);
            KX.A0B(KX.this, true);
        }
    };
    public final AbstractC1079Lj A08 = new AnonymousClass81(this);
    public final L3 A09 = new L3() { // from class: com.facebook.ads.redexgen.X.80
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC07859c
        /* renamed from: A00 */
        public final void A03(AnonymousClass84 anonymousClass84) {
            if (!KX.A08(KX.this) && KX.A0A(KX.this, QS.A05)) {
                KX.A04(KX.this);
                KX.A05(KX.this, true, false);
            }
        }
    };
    public final AbstractC1051Ke A0A = new C07617z(this);
    public final Handler A05 = new Handler();
    public final List<QT> A0B = new ArrayList();
    public int A00 = 2000;

    public KX(boolean z10) {
        this.A02 = z10;
    }

    public static /* synthetic */ int A00(KX kx) {
        return kx.A00;
    }

    public static /* synthetic */ Handler A01(KX kx) {
        return kx.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<QT> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(KX kx) {
        kx.A03();
    }

    public static /* synthetic */ void A05(KX kx, boolean z10, boolean z11) {
        kx.A06(z10, z11);
    }

    public void A06(boolean z10, boolean z11) {
        for (QT qt : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            qt.A3M(z10, z11);
        }
    }

    public static /* synthetic */ boolean A07(KX kx) {
        return kx.A03;
    }

    public static /* synthetic */ boolean A08(KX kx) {
        return kx.A02;
    }

    public static /* synthetic */ boolean A09(KX kx) {
        return kx.A04;
    }

    public static /* synthetic */ boolean A0A(KX kx, QS qs) {
        return kx.A0D(qs);
    }

    public static /* synthetic */ boolean A0B(KX kx, boolean z10) {
        kx.A03 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0C(KX kx, boolean z10) {
        kx.A04 = z10;
        return z10;
    }

    public boolean A0D(QS qs) {
        for (QT qt : this.A0B) {
            if (qt.A7X() != qs) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(QT qt) {
        this.A0B.add(qt);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A8o(QK qk) {
        this.A01 = qk;
        qk.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void AFG(QK qk) {
        A03();
        qk.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
