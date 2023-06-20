package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A extends View$OnTouchListenerC05981h implements PX {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC1115Mv A04;
    public boolean A05;
    public final BF A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C1A(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c1400Xy, new PU(), new PT());
        A02();
    }

    public C1A(C1400Xy c1400Xy, AttributeSet attributeSet) {
        super(c1400Xy, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c1400Xy, new PU(), new PT());
        A02();
    }

    public C1A(C1400Xy c1400Xy, AttributeSet attributeSet, int i10) {
        super(c1400Xy, attributeSet, i10);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c1400Xy, new PU(), new PT());
        A02();
    }

    private int A00(int availableWidth) {
        int numFullItems = this.A00 * 2;
        int itemSize = (getMeasuredWidth() - getPaddingLeft()) - numFullItems;
        int A0D = getAdapter().A0D();
        int i10 = 0;
        int numItems = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        while (numItems > availableWidth) {
            i10++;
            if (i10 >= A0D) {
                return availableWidth;
            }
            int numItems2 = i10 * numFullItems;
            numItems = (int) ((itemSize - numItems2) / (i10 + 0.333f));
        }
        return numItems;
    }

    private void A02() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        MS.A0K(this);
    }

    private void A04(int i10, int i11) {
        if (i10 == this.A03 && i11 == this.A02) {
            return;
        }
        this.A03 = i10;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i11;
        if (this.A04 != null) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.facebook.ads.redexgen.X.View$OnTouchListenerC05981h
    public final void A22(int i10, boolean z10) {
        super.A22(i10, z10);
        A04(i10, 0);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final int A7G(int i10) {
        int abs = Math.abs(i10);
        if (abs <= ((View$OnTouchListenerC05981h) this).A06) {
            return 0;
        }
        int i11 = this.A01;
        if (i11 == 0) {
            return 1;
        }
        return 1 + (abs / i11);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.F9, android.view.View
    public final void onMeasure(int i10, int itemSize) {
        int round;
        int A00;
        super.onMeasure(i10, itemSize);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            round = (((int) Lr.A00) * JR.A0C(getContext())) + paddingTop;
        } else {
            round = Math.round(getMeasuredWidth() / 1.91f);
        }
        int mode = View.MeasureSpec.getMode(itemSize);
        if (mode == Integer.MIN_VALUE) {
            round = Math.min(View.MeasureSpec.getSize(itemSize), round);
        } else if (mode == 1073741824) {
            round = View.MeasureSpec.getSize(itemSize);
        }
        int i11 = round - paddingTop;
        if (this.A05) {
            A00 = Math.min(C1112Ms.A09, i11);
        } else {
            A00 = A00(i11);
        }
        setMeasuredDimension(getMeasuredWidth(), A00 + paddingTop);
        if (!this.A05) {
            setChildWidth((this.A00 * 2) + A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public void setAdapter(@Nullable C4H c4h) {
        this.A06.A2L(c4h == null ? -1 : c4h.hashCode());
        super.setAdapter(c4h);
    }

    public void setChildSpacing(int i10) {
        this.A00 = i10;
    }

    public void setChildWidth(int i10) {
        this.A01 = i10;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2M((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2K(this.A01 / measuredWidth);
    }

    public void setCurrentPosition(int i10) {
        A22(i10, false);
    }

    public void setOnPageChangedListener(InterfaceC1115Mv interfaceC1115Mv) {
        this.A04 = interfaceC1115Mv;
    }

    public void setShowTextInCarousel(boolean z10) {
        this.A05 = z10;
    }
}
