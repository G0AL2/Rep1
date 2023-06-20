package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "RethrownThrowableArgument"})
/* loaded from: assets/audience_network.dex */
public final class LA extends ViewGroup {
    public static final AtomicBoolean A00 = new AtomicBoolean();

    private final void A00() {
        super.onAttachedToWindow();
    }

    private final void A01() {
        super.onDetachedFromWindow();
    }

    private final void A02() {
        super.onFinishInflate();
    }

    private final void A03(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @SuppressLint({"WrongCall"})
    private final void A04(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    private final void A05(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @SuppressLint({"WrongCall"})
    private final void A06(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A07(Throwable th) {
        LF.A00().A8p(IronSourceConstants.BN_INSTANCE_LEAVE_APP, th);
    }

    public static void A08(boolean z10) {
        A00.set(z10);
    }

    private final void A09(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    private final void A0A(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
    }

    private final boolean A0B() {
        return super.performClick();
    }

    private final boolean A0C(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    private final boolean A0D(int i10, KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    private final boolean A0E(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0F(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            A00();
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A06(canvas);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A02();
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            A0A(z10, i10, rect);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onFocusChanged(z10, i10, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        try {
            return A0C(i10, keyEvent);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                return super.onKeyDown(i10, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        try {
            return A0D(i10, keyEvent);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                return super.onKeyUp(i10, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        try {
            A04(i10, i11);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onMeasure(i10, i11);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        try {
            A05(i10, i11, i12, i13);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onSizeChanged(i10, i11, i12, i13);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0E(motionEvent);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0F(motionEvent);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        try {
            A09(z10);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onWindowFocusChanged(z10);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        try {
            A03(i10);
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                super.onWindowVisibilityChanged(i10);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0B();
        } catch (Throwable th) {
            if (A00.get()) {
                A07(th);
                return super.performClick();
            }
            throw th;
        }
    }
}
