package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import ca.n;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.l;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import ea.n0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class DefaultTimeBar extends View implements l {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* renamed from: a */
    private final Rect f21623a;

    /* renamed from: b */
    private final Rect f21624b;

    /* renamed from: c */
    private final Rect f21625c;

    /* renamed from: d */
    private final Rect f21626d;

    /* renamed from: e */
    private final Paint f21627e;

    /* renamed from: f */
    private final Paint f21628f;

    /* renamed from: g */
    private final Paint f21629g;

    /* renamed from: h */
    private final Paint f21630h;

    /* renamed from: i */
    private final Paint f21631i;

    /* renamed from: j */
    private final Paint f21632j;

    /* renamed from: k */
    private final Drawable f21633k;

    /* renamed from: l */
    private final int f21634l;

    /* renamed from: m */
    private final int f21635m;

    /* renamed from: n */
    private final int f21636n;

    /* renamed from: o */
    private final int f21637o;

    /* renamed from: p */
    private final int f21638p;

    /* renamed from: q */
    private final int f21639q;

    /* renamed from: r */
    private final int f21640r;

    /* renamed from: s */
    private final int f21641s;

    /* renamed from: t */
    private final int f21642t;

    /* renamed from: u */
    private final StringBuilder f21643u;

    /* renamed from: v */
    private final Formatter f21644v;

    /* renamed from: w */
    private final Runnable f21645w;

    /* renamed from: x */
    private final CopyOnWriteArraySet<l.a> f21646x;

    /* renamed from: y */
    private final Point f21647y;

    /* renamed from: z */
    private final float f21648z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar) {
        defaultTimeBar.i();
    }

    public static /* synthetic */ void d(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.j(valueAnimator);
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i10;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f21626d;
        int q10 = n0.q(rect.right, rect.left, this.f21624b.right);
        int centerY = this.f21626d.centerY();
        Drawable drawable = this.f21633k;
        if (drawable == null) {
            if (!this.H && !isFocused()) {
                i10 = isEnabled() ? this.f21638p : this.f21639q;
            } else {
                i10 = this.f21640r;
            }
            canvas.drawCircle(q10, centerY, (int) ((i10 * this.F) / 2.0f), this.f21632j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f21633k.getIntrinsicHeight() * this.F)) / 2;
        this.f21633k.setBounds(q10 - intrinsicWidth, centerY - intrinsicHeight, q10 + intrinsicWidth, centerY + intrinsicHeight);
        this.f21633k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int height = this.f21624b.height();
        int centerY = this.f21624b.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.J <= 0) {
            Rect rect = this.f21624b;
            canvas.drawRect(rect.left, centerY, rect.right, i10, this.f21629g);
            return;
        }
        Rect rect2 = this.f21625c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.f21624b.left, i12), this.f21626d.right);
        int i13 = this.f21624b.right;
        if (max < i13) {
            canvas.drawRect(max, centerY, i13, i10, this.f21629g);
        }
        int max2 = Math.max(i11, this.f21626d.right);
        if (i12 > max2) {
            canvas.drawRect(max2, centerY, i12, i10, this.f21628f);
        }
        if (this.f21626d.width() > 0) {
            Rect rect3 = this.f21626d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i10, this.f21627e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) ea.a.e(this.N);
        boolean[] zArr = (boolean[]) ea.a.e(this.O);
        int i14 = this.f21637o / 2;
        for (int i15 = 0; i15 < this.M; i15++) {
            long r10 = n0.r(jArr[i15], 0L, this.J);
            Rect rect4 = this.f21624b;
            int min = rect4.left + Math.min(rect4.width() - this.f21637o, Math.max(0, ((int) ((this.f21624b.width() * r10) / this.J)) - i14));
            canvas.drawRect(min, centerY, min + this.f21637o, i10, zArr[i15] ? this.f21631i : this.f21630h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 == -9223372036854775807L) {
            long j11 = this.J;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            return j11 / this.A;
        }
        return j10;
    }

    private String getProgressText() {
        return n0.i0(this.f21643u, this.f21644v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f21624b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f21626d.width() * this.J) / this.f21624b.width();
    }

    private boolean h(float f10, float f11) {
        return this.f21623a.contains((int) f10, (int) f11);
    }

    public /* synthetic */ void i() {
        s(false);
    }

    public /* synthetic */ void j(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f21623a);
    }

    private void k(float f10) {
        Rect rect = this.f21626d;
        Rect rect2 = this.f21624b;
        rect.right = n0.q((int) f10, rect2.left, rect2.right);
    }

    private static int l(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point m(MotionEvent motionEvent) {
        this.f21647y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f21647y;
    }

    private boolean n(long j10) {
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.H ? this.I : this.K;
        long r10 = n0.r(j12 + j10, 0L, j11);
        if (r10 == j12) {
            return false;
        }
        if (!this.H) {
            r(r10);
        } else {
            v(r10);
        }
        t();
        return true;
    }

    private boolean o(Drawable drawable) {
        return n0.f29709a >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i10) {
        return n0.f29709a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void q(int i10, int i11) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i10 && this.D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void r(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<l.a> it = this.f21646x.iterator();
        while (it.hasNext()) {
            it.next().F(this, j10);
        }
    }

    private void s(boolean z10) {
        removeCallbacks(this.f21645w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<l.a> it = this.f21646x.iterator();
        while (it.hasNext()) {
            it.next().A(this, this.I, z10);
        }
    }

    private void t() {
        this.f21625c.set(this.f21624b);
        this.f21626d.set(this.f21624b);
        long j10 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int width = (int) ((this.f21624b.width() * this.L) / this.J);
            Rect rect = this.f21625c;
            Rect rect2 = this.f21624b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f21624b.width() * j10) / this.J);
            Rect rect3 = this.f21626d;
            Rect rect4 = this.f21624b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f21625c;
            int i10 = this.f21624b.left;
            rect5.right = i10;
            this.f21626d.right = i10;
        }
        invalidate(this.f21623a);
    }

    private void u() {
        Drawable drawable = this.f21633k;
        if (drawable != null && drawable.isStateful() && this.f21633k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void v(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator<l.a> it = this.f21646x.iterator();
        while (it.hasNext()) {
            it.next().h(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void a(l.a aVar) {
        ea.a.e(aVar);
        this.f21646x.add(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void b(long[] jArr, boolean[] zArr, int i10) {
        ea.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.M = i10;
        this.N = jArr;
        this.O = zArr;
        t();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        u();
    }

    @Override // com.google.android.exoplayer2.ui.l
    public long getPreferredUpdateDelay() {
        int l10 = l(this.f21648z, this.f21624b.width());
        if (l10 != 0) {
            long j10 = this.J;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / l10;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21633k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.H || z10) {
            return;
        }
        s(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (n0.f29709a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(Constants.BUFFER_SIZE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f21645w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f21645w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.H
            if (r0 == 0) goto L30
            r5 = 0
            r4.s(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.G ? 0 : this.f21641s;
        if (this.f21636n == 1) {
            i14 = (i17 - getPaddingBottom()) - this.f21635m;
            int i19 = this.f21634l;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i14 = (i17 - this.f21635m) / 2;
            i15 = (i17 - this.f21634l) / 2;
        }
        this.f21623a.set(paddingLeft, i14, paddingRight, this.f21635m + i14);
        Rect rect = this.f21624b;
        Rect rect2 = this.f21623a;
        rect.set(rect2.left + i18, i15, rect2.right - i18, this.f21634l + i15);
        if (n0.f29709a >= 29) {
            q(i16, i17);
        }
        t();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f21635m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f21635m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        u();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f21633k;
        if (drawable == null || !p(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.H
            if (r8 == 0) goto L76
            int r8 = r7.f21642t
            if (r0 >= r8) goto L3a
            int r8 = r7.C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.C = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            r7.t()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.s(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.h(r8, r0)
            if (r0 == 0) goto L76
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.r(r0)
            r7.t()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (n(-getPositionIncrement())) {
                s(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (n(getPositionIncrement())) {
                s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f21630h.setColor(i10);
        invalidate(this.f21623a);
    }

    public void setBufferedColor(int i10) {
        this.f21628f.setColor(i10);
        invalidate(this.f21623a);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setBufferedPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        t();
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == -9223372036854775807L) {
            s(true);
        }
        t();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.l
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.H || z10) {
            return;
        }
        s(true);
    }

    public void setKeyCountIncrement(int i10) {
        ea.a.a(i10 > 0);
        this.A = i10;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        ea.a.a(j10 > 0);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f21631i.setColor(i10);
        invalidate(this.f21623a);
    }

    public void setPlayedColor(int i10) {
        this.f21627e.setColor(i10);
        invalidate(this.f21623a);
    }

    @Override // com.google.android.exoplayer2.ui.l
    public void setPosition(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        setContentDescription(getProgressText());
        t();
    }

    public void setScrubberColor(int i10) {
        this.f21632j.setColor(i10);
        invalidate(this.f21623a);
    }

    public void setUnplayedColor(int i10) {
        this.f21629g.setColor(i10);
        invalidate(this.f21623a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        this(context, attributeSet, i10, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f21623a = new Rect();
        this.f21624b = new Rect();
        this.f21625c = new Rect();
        this.f21626d = new Rect();
        Paint paint = new Paint();
        this.f21627e = paint;
        Paint paint2 = new Paint();
        this.f21628f = paint2;
        Paint paint3 = new Paint();
        this.f21629g = paint3;
        Paint paint4 = new Paint();
        this.f21630h = paint4;
        Paint paint5 = new Paint();
        this.f21631i = paint5;
        Paint paint6 = new Paint();
        this.f21632j = paint6;
        paint6.setAntiAlias(true);
        this.f21646x = new CopyOnWriteArraySet<>();
        this.f21647y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f21648z = f10;
        this.f21642t = e(f10, -50);
        int e10 = e(f10, 4);
        int e11 = e(f10, 26);
        int e12 = e(f10, 4);
        int e13 = e(f10, 12);
        int e14 = e(f10, 0);
        int e15 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, n.f5405c, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(n.f5416n);
                this.f21633k = drawable;
                if (drawable != null) {
                    o(drawable);
                    e11 = Math.max(drawable.getMinimumHeight(), e11);
                }
                this.f21634l = obtainStyledAttributes.getDimensionPixelSize(n.f5409g, e10);
                this.f21635m = obtainStyledAttributes.getDimensionPixelSize(n.f5418p, e11);
                this.f21636n = obtainStyledAttributes.getInt(n.f5408f, 0);
                this.f21637o = obtainStyledAttributes.getDimensionPixelSize(n.f5407e, e12);
                this.f21638p = obtainStyledAttributes.getDimensionPixelSize(n.f5417o, e13);
                this.f21639q = obtainStyledAttributes.getDimensionPixelSize(n.f5414l, e14);
                this.f21640r = obtainStyledAttributes.getDimensionPixelSize(n.f5415m, e15);
                int i12 = obtainStyledAttributes.getInt(n.f5412j, -1);
                int i13 = obtainStyledAttributes.getInt(n.f5413k, -1);
                int i14 = obtainStyledAttributes.getInt(n.f5410h, -855638017);
                int i15 = obtainStyledAttributes.getInt(n.f5419q, 872415231);
                int i16 = obtainStyledAttributes.getInt(n.f5406d, -1291845888);
                int i17 = obtainStyledAttributes.getInt(n.f5411i, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f21634l = e10;
            this.f21635m = e11;
            this.f21636n = 0;
            this.f21637o = e12;
            this.f21638p = e13;
            this.f21639q = e14;
            this.f21640r = e15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f21633k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f21643u = sb2;
        this.f21644v = new Formatter(sb2, Locale.getDefault());
        this.f21645w = new Runnable() { // from class: ca.d
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.c(DefaultTimeBar.this);
            }
        };
        Drawable drawable2 = this.f21633k;
        if (drawable2 != null) {
            this.f21641s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f21641s = (Math.max(this.f21639q, Math.max(this.f21638p, this.f21640r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ca.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.d(DefaultTimeBar.this, valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
