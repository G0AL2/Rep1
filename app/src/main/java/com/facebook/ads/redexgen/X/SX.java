package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class SX extends O6 {
    public static byte[] A01;
    public final /* synthetic */ PA A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SX(PA pa2, C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A00 = pa2;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int specMode, int specSize, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int specMode2 = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return specMode;
                }
                return specMode2;
            }
            return Math.min(specMode, specSize);
        }
        return Math.min(Math.min(specMode, specMode2), specSize);
    }

    @Override // com.facebook.ads.redexgen.X.O6
    public final WebChromeClient A0D() {
        return new P5(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.O6
    public final WebViewClient A0E() {
        return new P6(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return PA.A01(this.A00).A0d().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return PA.A01(this.A00).A0d().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int w10, int h10) {
        int widthSpecMode = getDynamicWebViewWidth();
        int heightSpecMode = getDynamicWebViewHeight();
        if (widthSpecMode <= 0 || heightSpecMode <= 0) {
            super.onMeasure(w10, h10);
            return;
        }
        float f10 = widthSpecMode / heightSpecMode;
        int mode = View.MeasureSpec.getMode(w10);
        int mode2 = View.MeasureSpec.getMode(h10);
        boolean z10 = true;
        boolean z11 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z10 = false;
        }
        int i10 = getResources().getDisplayMetrics().widthPixels;
        int i11 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int maxWidth = viewGroup.getWidth();
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i10 = maxWidth != 0 ? viewGroup.getWidth() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int maxWidth2 = viewGroup.getHeight();
            if (maxWidth2 != 0) {
                i11 = viewGroup.getHeight();
            }
        }
        int A012 = A01(widthSpecMode, i10, w10);
        int widthSpecMode2 = A01(heightSpecMode, i11, h10);
        if (z10 || z11) {
            int maxWidth3 = A012 / widthSpecMode2;
            if (Math.abs(maxWidth3 - f10) > 1.0E-7d) {
                boolean done = false;
                if (z10) {
                    widthSpecMode2 = (int) (A012 / f10);
                    done = true;
                }
                if (!done && z11) {
                    A012 = (int) (widthSpecMode2 * f10);
                }
            }
        }
        setMeasuredDimension(A012, widthSpecMode2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PA.A06(this.A00) != null) {
            PA.A06(this.A00).ACX(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
