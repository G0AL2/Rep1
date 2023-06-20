package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class SB extends C4Y {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    @Nullable
    public InterfaceC1163Or A02;
    public C1220Qw A04;
    @Nullable
    public List<C1172Pa> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1588cB A0C;
    public final AbstractC06724g A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC1167Ov A0F = new SE(this);
    public InterfaceC1165Ot A03 = new SD(this);
    public final InterfaceC1166Ou A0E = new SC(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public SB(C2M c2m, int i10, @Nullable List<C1172Pa> list, @Nullable C1220Qw c1220Qw, @Nullable Bundle bundle) {
        this.A0C = c2m.getLayoutManager();
        this.A0A = i10;
        this.A05 = list;
        this.A04 = c1220Qw;
        this.A0D = new C1587cA(c2m.getContext());
        this.A0B = c2m.getContext();
        c2m.A1j(this);
        A0D(bundle);
    }

    @Nullable
    private AbstractC1261Sl A03(int i10, int i11) {
        return A04(i10, i11, true);
    }

    @Nullable
    private AbstractC1261Sl A04(int i10, int i11, boolean isCompletelyVisible) {
        AbstractC1261Sl abstractC1261Sl = null;
        while (i10 <= i11) {
            AbstractC1261Sl abstractC1261Sl2 = (AbstractC1261Sl) this.A0C.A1q(i10);
            if (abstractC1261Sl2 == null || abstractC1261Sl2.A0h()) {
                return null;
            }
            boolean A0b = A0b(abstractC1261Sl2);
            if (A0I[2].length() != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (abstractC1261Sl == null && abstractC1261Sl2.A0i() && A0b && !this.A0G.contains(Integer.valueOf(i10)) && (!isCompletelyVisible || A0I(abstractC1261Sl2, this.A0A))) {
                abstractC1261Sl = abstractC1261Sl2;
            }
            if (abstractC1261Sl2.A0i() && !A0b) {
                A0C(i10, false);
            }
            i10++;
        }
        return abstractC1261Sl;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int A28 = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        AbstractC1261Sl firstAutoplayableVideo = A03(A28, lastVisibleItem);
        if (firstAutoplayableVideo != null) {
            firstAutoplayableVideo.A0f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A27 = this.A0C.A27();
        if (A27 != -1 && A27 < this.A05.size() - 1) {
            A0V(A27 + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i10) {
        AbstractC1261Sl A04 = A04(i10 + 1, this.A0C.A29(), false);
        if (A04 != null) {
            A04.A0f();
            A0V(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i10, int i11) {
        while (i10 <= i11) {
            A0T(i10);
            i10++;
        }
    }

    private final void A0B(int i10, int i11) {
        A0S(i10);
        A0S(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i10, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i10));
        } else {
            this.A0G.remove(Integer.valueOf(i10));
        }
    }

    private void A0D(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return JR.A21(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC1151Of abstractC1151Of, int i10) {
        int width;
        int width2;
        if (i10 != 2) {
            width = (int) (((abstractC1151Of.getWidth() + Lr.A01.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i11 = Lr.A01.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            width = i11 - 1;
        }
        if (i10 != 2) {
            width2 = (int) (((Lr.A01.widthPixels - abstractC1151Of.getWidth()) * 0.7f) / 2.0f);
        } else {
            width2 = 1;
        }
        return ((int) (abstractC1151Of.getX() + ((float) abstractC1151Of.getWidth()))) <= width && abstractC1151Of.getX() >= ((float) width2);
    }

    private boolean A0J(AbstractC1261Sl abstractC1261Sl) {
        if (this.A08 && abstractC1261Sl.A0i()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public void A0L(F9 f92, int i10) {
        super.A0L(f92, i10);
        if (i10 == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public void A0M(F9 f92, int i10, int i11) {
        super.A0M(f92, i10, i11);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int A28 = this.A0C.A28();
        int A29 = this.A0C.A29();
        A0B(A28, A29);
        A0A(A28, A29);
        A0W(A28, A29, i10);
    }

    public final InterfaceC1165Ot A0N() {
        return this.A03;
    }

    public final InterfaceC1166Ou A0O() {
        return this.A0E;
    }

    public final InterfaceC1167Ov A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A29 = this.A0C.A29();
        for (int A28 = this.A0C.A28(); A28 <= A29 && A28 >= 0; A28++) {
            AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) this.A0C.A1q(A28);
            if (abstractC1261Sl != null && abstractC1261Sl.A0h()) {
                this.A01 = A28;
                abstractC1261Sl.A0e();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) this.A0C.A1q(this.A01);
        if (abstractC1261Sl != null && this.A01 >= 0) {
            abstractC1261Sl.A0f();
        }
    }

    public final void A0S(int i10) {
        AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) this.A0C.A1q(i10);
        if (abstractC1261Sl == null || A0b(abstractC1261Sl)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(abstractC1261Sl, false);
    }

    public final void A0T(int i10) {
        List<C1172Pa> list;
        AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) this.A0C.A1q(i10);
        if (abstractC1261Sl == null) {
            return;
        }
        if (A0b(abstractC1261Sl)) {
            A0a(abstractC1261Sl, true);
        }
        if (!A0J(abstractC1261Sl) || (list = this.A05) == null) {
            return;
        }
        this.A0F.setVolume(list.get(((Integer) abstractC1261Sl.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
    }

    public final void A0U(int i10) {
        A0A(i10, i10);
    }

    public final void A0V(int i10) {
        this.A0D.A0A(i10);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int recomputeFrom, int i10, int i11) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int A27 = this.A0C.A27();
        if (A27 == -1) {
            A27 = i11 < 0 ? recomputeFrom : i10;
        }
        this.A02.AFK(A27);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Z(InterfaceC1163Or interfaceC1163Or) {
        this.A02 = interfaceC1163Or;
    }

    public void A0a(AbstractC1261Sl abstractC1261Sl, boolean z10) {
        if (A0H()) {
            A0Y(abstractC1261Sl, z10);
        }
        if (z10) {
            return;
        }
        boolean A0h = abstractC1261Sl.A0h();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A0h) {
            abstractC1261Sl.A0e();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
