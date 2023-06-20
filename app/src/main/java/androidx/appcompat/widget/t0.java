package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: SwitchCompat.java */
/* loaded from: classes.dex */
public class t0 extends CompoundButton {
    private static final Property<t0, Float> R = new a(Float.class, "thumbPos");
    private static final int[] S = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private final TextPaint H;
    private ColorStateList I;
    private Layout J;
    private Layout K;
    private TransformationMethod L;
    ObjectAnimator M;
    private final b0 N;
    private n O;
    private b P;
    private final Rect Q;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f1704a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1705b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1706c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1707d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1708e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1709f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f1710g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f1711h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1712i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1713j;

    /* renamed from: k  reason: collision with root package name */
    private int f1714k;

    /* renamed from: l  reason: collision with root package name */
    private int f1715l;

    /* renamed from: m  reason: collision with root package name */
    private int f1716m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1717n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f1718o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1719p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f1720q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1721r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1722s;

    /* renamed from: t  reason: collision with root package name */
    private int f1723t;

    /* renamed from: u  reason: collision with root package name */
    private int f1724u;

    /* renamed from: v  reason: collision with root package name */
    private float f1725v;

    /* renamed from: w  reason: collision with root package name */
    private float f1726w;

    /* renamed from: x  reason: collision with root package name */
    private VelocityTracker f1727x;

    /* renamed from: y  reason: collision with root package name */
    private int f1728y;

    /* renamed from: z  reason: collision with root package name */
    float f1729z;

    /* compiled from: SwitchCompat.java */
    /* loaded from: classes.dex */
    class a extends Property<t0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(t0 t0Var) {
            return Float.valueOf(t0Var.f1729z);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(t0 t0Var, Float f10) {
            t0Var.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwitchCompat.java */
    /* loaded from: classes.dex */
    public static class b extends d.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<t0> f1730a;

        b(t0 t0Var) {
            this.f1730a = new WeakReference(t0Var);
        }

        @Override // androidx.emoji2.text.d.e
        public void a(Throwable th) {
            t0 t0Var = this.f1730a.get();
            if (t0Var != null) {
                t0Var.j();
            }
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            t0 t0Var = this.f1730a.get();
            if (t0Var != null) {
                t0Var.j();
            }
        }
    }

    public t0(Context context) {
        this(context, null);
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, z10 ? 1.0f : 0.0f);
        this.M = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.M.setAutoCancel(true);
        }
        this.M.start();
    }

    private void b() {
        Drawable drawable = this.f1704a;
        if (drawable != null) {
            if (this.f1707d || this.f1708e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f1704a = mutate;
                if (this.f1707d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1705b);
                }
                if (this.f1708e) {
                    androidx.core.graphics.drawable.a.p(this.f1704a, this.f1706c);
                }
                if (this.f1704a.isStateful()) {
                    this.f1704a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1709f;
        if (drawable != null) {
            if (this.f1712i || this.f1713j) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f1709f = mutate;
                if (this.f1712i) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1710g);
                }
                if (this.f1713j) {
                    androidx.core.graphics.drawable.a.p(this.f1709f, this.f1711h);
                }
                if (this.f1709f.isStateful()) {
                    this.f1709f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.L);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    private n getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new n(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        return this.f1729z > 0.5f;
    }

    private int getThumbOffset() {
        float f10;
        if (g1.b(this)) {
            f10 = 1.0f - this.f1729z;
        } else {
            f10 = this.f1729z;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1709f;
        if (drawable != null) {
            Rect rect2 = this.Q;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1704a;
            if (drawable2 != null) {
                rect = g0.d(drawable2);
            } else {
                rect = g0.f1509c;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private boolean h(float f10, float f11) {
        if (this.f1704a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1704a.getPadding(this.Q);
        int i10 = this.E;
        int i11 = this.f1724u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        Rect rect = this.Q;
        return f10 > ((float) i13) && f10 < ((float) ((((this.C + i13) + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.H;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1720q;
            if (charSequence == null) {
                charSequence = getResources().getString(d.h.f28778b);
            }
            androidx.core.view.z.I0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1718o;
            if (charSequence == null) {
                charSequence = getResources().getString(d.h.f28779c);
            }
            androidx.core.view.z.I0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.P == null && this.O.b() && androidx.emoji2.text.d.h()) {
            androidx.emoji2.text.d b10 = androidx.emoji2.text.d.b();
            int d10 = b10.d();
            if (d10 == 3 || d10 == 0) {
                b bVar = new b(this);
                this.P = bVar;
                b10.s(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f1723t = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f1727x.computeCurrentVelocity(1000);
            float xVelocity = this.f1727x.getXVelocity();
            if (Math.abs(xVelocity) > this.f1728y) {
                if (!g1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z10 = false;
                }
            } else {
                z10 = getTargetCheckedState();
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1720q = charSequence;
        this.f1721r = g(charSequence);
        this.K = null;
        if (this.f1722s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1718o = charSequence;
        this.f1719p = g(charSequence);
        this.J = null;
        if (this.f1722s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.Q;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1704a;
        if (drawable != null) {
            rect = g0.d(drawable);
        } else {
            rect = g0.f1509c;
        }
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f1709f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1709f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1704a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.C + rect2.right;
            this.f1704a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f10, f11);
        }
        Drawable drawable = this.f1704a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1704a;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!g1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1716m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1716m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1722s;
    }

    public boolean getSplitTrack() {
        return this.f1717n;
    }

    public int getSwitchMinWidth() {
        return this.f1715l;
    }

    public int getSwitchPadding() {
        return this.f1716m;
    }

    public CharSequence getTextOff() {
        return this.f1720q;
    }

    public CharSequence getTextOn() {
        return this.f1718o;
    }

    public Drawable getThumbDrawable() {
        return this.f1704a;
    }

    public int getThumbTextPadding() {
        return this.f1714k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1705b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1706c;
    }

    public Drawable getTrackDrawable() {
        return this.f1709f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1710g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1711h;
    }

    void j() {
        setTextOnInternal(this.f1718o);
        setTextOffInternal(this.f1720q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1704a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.M.end();
        this.M = null;
    }

    public void m(Context context, int i10) {
        z0 t10 = z0.t(context, i10, d.j.M2);
        ColorStateList c10 = t10.c(d.j.Q2);
        if (c10 != null) {
            this.I = c10;
        } else {
            this.I = getTextColors();
        }
        int f10 = t10.f(d.j.N2, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.H.getTextSize()) {
                this.H.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(d.j.O2, -1), t10.k(d.j.P2, -1));
        if (t10.a(d.j.X2, false)) {
            this.L = new h.a(getContext());
        } else {
            this.L = null;
        }
        setTextOnInternal(this.f1718o);
        setTextOffInternal(this.f1720q);
        t10.w();
    }

    public void n(Typeface typeface, int i10) {
        Typeface create;
        if (i10 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i10);
            } else {
                create = Typeface.create(typeface, i10);
            }
            setSwitchTypeface(create);
            int i11 = (~(create != null ? create.getStyle() : 0)) & i10;
            this.H.setFakeBoldText((i11 & 1) != 0);
            this.H.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.H.setFakeBoldText(false);
        this.H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.Q;
        Drawable drawable = this.f1709f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1704a;
        if (drawable != null) {
            if (this.f1717n && drawable2 != null) {
                Rect d10 = g0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.J : this.K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.I;
            if (colorStateList != null) {
                this.H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1718o : this.f1720q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f1704a != null) {
            Rect rect = this.Q;
            Drawable drawable = this.f1709f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = g0.d(this.f1704a);
            i14 = Math.max(0, d10.left - rect.left);
            i18 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (g1.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.A + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.A) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i16 = this.B;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i16 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i16 = this.B;
        } else {
            i17 = getHeight() - getPaddingBottom();
            paddingTop = i17 - this.B;
            this.D = i15;
            this.E = paddingTop;
            this.G = i17;
            this.F = width;
        }
        i17 = i16 + paddingTop;
        this.D = i15;
        this.E = paddingTop;
        this.G = i17;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1722s) {
            if (this.J == null) {
                this.J = i(this.f1719p);
            }
            if (this.K == null) {
                this.K = i(this.f1721r);
            }
        }
        Rect rect = this.Q;
        Drawable drawable = this.f1704a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1704a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1704a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.C = Math.max(this.f1722s ? Math.max(this.J.getWidth(), this.K.getWidth()) + (this.f1714k * 2) : 0, i12);
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f1709f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1704a;
        if (drawable3 != null) {
            Rect d10 = g0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = Math.max(this.f1715l, (this.C * 2) + i15 + i16);
        int max2 = Math.max(i14, i13);
        this.A = max;
        this.B = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1718o : this.f1720q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1727x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f1723t
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1725v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.g1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.f1729z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1729z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f1725v = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1725v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1724u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.f1726w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1724u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f1723t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1725v = r0
            r6.f1726w = r3
            return r1
        L8b:
            int r0 = r6.f1723t
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f1723t = r0
            android.view.VelocityTracker r0 = r6.f1727x
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f1723t = r1
            r6.f1725v = r0
            r6.f1726w = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.z.U(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1718o);
        setTextOffInternal(this.f1720q);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1722s != z10) {
            this.f1722s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1717n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1715l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1716m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.H.getTypeface() == null || this.H.getTypeface().equals(typeface)) && (this.H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1704a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1704a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f1729z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(e.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1714k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1705b = colorStateList;
        this.f1707d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1706c = mode;
        this.f1708e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1709f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1709f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(e.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1710g = colorStateList;
        this.f1712i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1711h = mode;
        this.f1713j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1704a || drawable == this.f1709f;
    }

    public t0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.K);
    }

    public t0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1705b = null;
        this.f1706c = null;
        this.f1707d = false;
        this.f1708e = false;
        this.f1710g = null;
        this.f1711h = null;
        this.f1712i = false;
        this.f1713j = false;
        this.f1727x = VelocityTracker.obtain();
        this.Q = new Rect();
        u0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = d.j.f28913x2;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(d.j.A2);
        this.f1704a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(d.j.J2);
        this.f1709f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(d.j.f28918y2));
        setTextOffInternal(v10.p(d.j.f28923z2));
        this.f1722s = v10.a(d.j.B2, true);
        this.f1714k = v10.f(d.j.G2, 0);
        this.f1715l = v10.f(d.j.D2, 0);
        this.f1716m = v10.f(d.j.E2, 0);
        this.f1717n = v10.a(d.j.C2, false);
        ColorStateList c10 = v10.c(d.j.H2);
        if (c10 != null) {
            this.f1705b = c10;
            this.f1707d = true;
        }
        PorterDuff.Mode e10 = g0.e(v10.k(d.j.I2, -1), null);
        if (this.f1706c != e10) {
            this.f1706c = e10;
            this.f1708e = true;
        }
        if (this.f1707d || this.f1708e) {
            b();
        }
        ColorStateList c11 = v10.c(d.j.K2);
        if (c11 != null) {
            this.f1710g = c11;
            this.f1712i = true;
        }
        PorterDuff.Mode e11 = g0.e(v10.k(d.j.L2, -1), null);
        if (this.f1711h != e11) {
            this.f1711h = e11;
            this.f1713j = true;
        }
        if (this.f1712i || this.f1713j) {
            c();
        }
        int n10 = v10.n(d.j.F2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        b0 b0Var = new b0(this);
        this.N = b0Var;
        b0Var.m(attributeSet, i10);
        v10.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1724u = viewConfiguration.getScaledTouchSlop();
        this.f1728y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
