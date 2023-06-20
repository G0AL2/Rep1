package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.g0;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import ha.j;
import ha.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: x0  reason: collision with root package name */
    private static final int f22607x0 = k.f31258g;
    private int A;
    private final Rect B;
    private final Rect C;
    private final RectF D;
    private Typeface E;
    private final CheckableImageButton F;
    private ColorStateList G;
    private boolean H;
    private PorterDuff.Mode I;
    private boolean J;
    private Drawable K;
    private View.OnLongClickListener L;
    private final LinkedHashSet<f> M;
    private int N;
    private final SparseArray<com.google.android.material.textfield.e> O;
    private final CheckableImageButton P;
    private final LinkedHashSet<g> Q;
    private ColorStateList R;
    private boolean S;
    private PorterDuff.Mode T;
    private boolean U;
    private Drawable V;
    private Drawable W;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f22608a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f22609b;

    /* renamed from: c  reason: collision with root package name */
    EditText f22610c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f22611d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.material.textfield.f f22612e;

    /* renamed from: f  reason: collision with root package name */
    boolean f22613f;

    /* renamed from: g  reason: collision with root package name */
    private int f22614g;

    /* renamed from: g0  reason: collision with root package name */
    private final CheckableImageButton f22615g0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22616h;

    /* renamed from: h0  reason: collision with root package name */
    private View.OnLongClickListener f22617h0;

    /* renamed from: i  reason: collision with root package name */
    private TextView f22618i;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f22619i0;

    /* renamed from: j  reason: collision with root package name */
    private int f22620j;

    /* renamed from: j0  reason: collision with root package name */
    private ColorStateList f22621j0;

    /* renamed from: k  reason: collision with root package name */
    private int f22622k;

    /* renamed from: k0  reason: collision with root package name */
    private final int f22623k0;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f22624l;

    /* renamed from: l0  reason: collision with root package name */
    private final int f22625l0;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f22626m;

    /* renamed from: m0  reason: collision with root package name */
    private int f22627m0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22628n;

    /* renamed from: n0  reason: collision with root package name */
    private int f22629n0;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f22630o;

    /* renamed from: o0  reason: collision with root package name */
    private final int f22631o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22632p;

    /* renamed from: p0  reason: collision with root package name */
    private final int f22633p0;

    /* renamed from: q  reason: collision with root package name */
    private xa.g f22634q;

    /* renamed from: q0  reason: collision with root package name */
    private final int f22635q0;

    /* renamed from: r  reason: collision with root package name */
    private xa.g f22636r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f22637r0;

    /* renamed from: s  reason: collision with root package name */
    private xa.k f22638s;

    /* renamed from: s0  reason: collision with root package name */
    final com.google.android.material.internal.a f22639s0;

    /* renamed from: t  reason: collision with root package name */
    private final int f22640t;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f22641t0;

    /* renamed from: u  reason: collision with root package name */
    private int f22642u;

    /* renamed from: u0  reason: collision with root package name */
    private ValueAnimator f22643u0;

    /* renamed from: v  reason: collision with root package name */
    private final int f22644v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f22645v0;

    /* renamed from: w  reason: collision with root package name */
    private int f22646w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f22647w0;

    /* renamed from: x  reason: collision with root package name */
    private final int f22648x;

    /* renamed from: y  reason: collision with root package name */
    private final int f22649y;

    /* renamed from: z  reason: collision with root package name */
    private int f22650z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f22651c;

        /* renamed from: d  reason: collision with root package name */
        boolean f22652d;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f22651c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f22651c, parcel, i10);
            parcel.writeInt(this.f22652d ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22651c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f22652d = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.c0(!textInputLayout.f22647w0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f22613f) {
                textInputLayout2.V(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.P.performClick();
            TextInputLayout.this.P.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f22610c.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f22639s0.O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f22657d;

        public e(TextInputLayout textInputLayout) {
            this.f22657d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f22657d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f22657d.getHint();
            CharSequence error = this.f22657d.getError();
            CharSequence counterOverflowDescription = this.f22657d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !TextUtils.isEmpty(error);
            boolean z13 = false;
            boolean z14 = z12 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z10) {
                cVar.B0(text);
            } else if (z11) {
                cVar.B0(hint);
            }
            if (z11) {
                cVar.l0(hint);
                if (!z10 && z11) {
                    z13 = true;
                }
                cVar.x0(z13);
            }
            if (z14) {
                if (!z12) {
                    error = counterOverflowDescription;
                }
                cVar.h0(error);
                cVar.f0(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.B);
    }

    private void A(Canvas canvas) {
        if (this.f22628n) {
            this.f22639s0.i(canvas);
        }
    }

    private void B(boolean z10) {
        ValueAnimator valueAnimator = this.f22643u0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22643u0.cancel();
        }
        if (z10 && this.f22641t0) {
            e(0.0f);
        } else {
            this.f22639s0.O(0.0f);
        }
        if (w() && ((com.google.android.material.textfield.c) this.f22634q).g0()) {
            u();
        }
        this.f22637r0 = true;
    }

    private boolean C() {
        return this.N != 0;
    }

    private boolean D() {
        return getStartIconDrawable() != null;
    }

    private boolean H() {
        return this.f22642u == 1 && (Build.VERSION.SDK_INT < 16 || this.f22610c.getMinLines() <= 1);
    }

    private void J() {
        l();
        M();
        e0();
        if (this.f22642u != 0) {
            b0();
        }
    }

    private void K() {
        if (w()) {
            RectF rectF = this.D;
            this.f22639s0.k(rectF);
            h(rectF);
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.c) this.f22634q).m0(rectF);
        }
    }

    private static void L(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                L((ViewGroup) childAt, z10);
            }
        }
    }

    private void M() {
        if (R()) {
            z.u0(this.f22610c, this.f22634q);
        }
    }

    private static void N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean P = z.P(checkableImageButton);
        boolean z10 = false;
        boolean z11 = onLongClickListener != null;
        z10 = (P || z11) ? true : true;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(P);
        checkableImageButton.setPressable(P);
        checkableImageButton.setLongClickable(z11);
        z.A0(checkableImageButton, z10 ? 1 : 2);
    }

    private static void O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private boolean R() {
        EditText editText = this.f22610c;
        return (editText == null || this.f22634q == null || editText.getBackground() != null || this.f22642u == 0) ? false : true;
    }

    private void S(boolean z10) {
        if (z10 && getEndIconDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.a.n(mutate, this.f22612e.n());
            this.P.setImageDrawable(mutate);
            return;
        }
        i();
    }

    private void T(Rect rect) {
        xa.g gVar = this.f22636r;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f22649y, rect.right, i10);
        }
    }

    private void U() {
        if (this.f22618i != null) {
            EditText editText = this.f22610c;
            V(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void W(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? j.f31236b : j.f31235a, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f22618i;
        if (textView != null) {
            Q(textView, this.f22616h ? this.f22620j : this.f22622k);
            if (!this.f22616h && (colorStateList2 = this.f22624l) != null) {
                this.f22618i.setTextColor(colorStateList2);
            }
            if (!this.f22616h || (colorStateList = this.f22626m) == null) {
                return;
            }
            this.f22618i.setTextColor(colorStateList);
        }
    }

    private boolean Z() {
        int max;
        if (this.f22610c != null && this.f22610c.getMeasuredHeight() < (max = Math.max(this.P.getMeasuredHeight(), this.F.getMeasuredHeight()))) {
            this.f22610c.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private boolean a0() {
        boolean z10;
        if (this.f22610c == null) {
            return false;
        }
        boolean z11 = true;
        if (D() && I() && this.F.getMeasuredWidth() > 0) {
            if (this.K == null) {
                this.K = new ColorDrawable();
                this.K.setBounds(0, 0, (this.F.getMeasuredWidth() - this.f22610c.getPaddingLeft()) + androidx.core.view.h.a((ViewGroup.MarginLayoutParams) this.F.getLayoutParams()), 1);
            }
            Drawable[] a10 = androidx.core.widget.j.a(this.f22610c);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.K;
            if (drawable != drawable2) {
                androidx.core.widget.j.l(this.f22610c, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.K != null) {
                Drawable[] a11 = androidx.core.widget.j.a(this.f22610c);
                androidx.core.widget.j.l(this.f22610c, null, a11[1], a11[2], a11[3]);
                this.K = null;
                z10 = true;
            }
            z10 = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.V == null) {
                this.V = new ColorDrawable();
                this.V.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.f22610c.getPaddingRight()) + androidx.core.view.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] a12 = androidx.core.widget.j.a(this.f22610c);
            Drawable drawable3 = a12[2];
            Drawable drawable4 = this.V;
            if (drawable3 != drawable4) {
                this.W = a12[2];
                androidx.core.widget.j.l(this.f22610c, a12[0], a12[1], drawable4, a12[3]);
            } else {
                z11 = z10;
            }
        } else if (this.V == null) {
            return z10;
        } else {
            Drawable[] a13 = androidx.core.widget.j.a(this.f22610c);
            if (a13[2] == this.V) {
                androidx.core.widget.j.l(this.f22610c, a13[0], a13[1], this.W, a13[3]);
            } else {
                z11 = z10;
            }
            this.V = null;
        }
        return z11;
    }

    private void b0() {
        if (this.f22642u != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f22608a.getLayoutParams();
            int r10 = r();
            if (r10 != layoutParams.topMargin) {
                layoutParams.topMargin = r10;
                this.f22608a.requestLayout();
            }
        }
    }

    private void d0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f22610c;
        boolean z12 = true;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f22610c;
        z12 = (editText2 == null || !editText2.hasFocus()) ? false : false;
        boolean k10 = this.f22612e.k();
        ColorStateList colorStateList2 = this.f22619i0;
        if (colorStateList2 != null) {
            this.f22639s0.E(colorStateList2);
            this.f22639s0.K(this.f22619i0);
        }
        if (!isEnabled) {
            this.f22639s0.E(ColorStateList.valueOf(this.f22635q0));
            this.f22639s0.K(ColorStateList.valueOf(this.f22635q0));
        } else if (k10) {
            this.f22639s0.E(this.f22612e.o());
        } else if (this.f22616h && (textView = this.f22618i) != null) {
            this.f22639s0.E(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f22621j0) != null) {
            this.f22639s0.E(colorStateList);
        }
        if (!z13 && (!isEnabled() || (!z12 && !k10))) {
            if (z11 || !this.f22637r0) {
                B(z10);
            }
        } else if (z11 || this.f22637r0) {
            v(z10);
        }
    }

    private void f() {
        xa.g gVar = this.f22634q;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f22638s);
        if (s()) {
            this.f22634q.Z(this.f22646w, this.f22650z);
        }
        int m10 = m();
        this.A = m10;
        this.f22634q.U(ColorStateList.valueOf(m10));
        if (this.N == 3) {
            this.f22610c.getBackground().invalidateSelf();
        }
        g();
        invalidate();
    }

    private void g() {
        if (this.f22636r == null) {
            return;
        }
        if (t()) {
            this.f22636r.U(ColorStateList.valueOf(this.f22650z));
        }
        invalidate();
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.O.get(this.N);
        return eVar != null ? eVar : this.O.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f22615g0.getVisibility() == 0) {
            return this.f22615g0;
        }
        if (C() && E()) {
            return this.P;
        }
        return null;
    }

    private void h(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f22640t;
        rectF.left = f10 - i10;
        rectF.top -= i10;
        rectF.right += i10;
        rectF.bottom += i10;
    }

    private void i() {
        j(this.P, this.S, this.R, this.U, this.T);
    }

    private void j(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z10) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z11) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void k() {
        j(this.F, this.H, this.G, this.J, this.I);
    }

    private void l() {
        int i10 = this.f22642u;
        if (i10 == 0) {
            this.f22634q = null;
            this.f22636r = null;
        } else if (i10 == 1) {
            this.f22634q = new xa.g(this.f22638s);
            this.f22636r = new xa.g();
        } else if (i10 == 2) {
            if (this.f22628n && !(this.f22634q instanceof com.google.android.material.textfield.c)) {
                this.f22634q = new com.google.android.material.textfield.c(this.f22638s);
            } else {
                this.f22634q = new xa.g(this.f22638s);
            }
            this.f22636r = null;
        } else {
            throw new IllegalArgumentException(this.f22642u + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int m() {
        return this.f22642u == 1 ? na.a.e(na.a.d(this, ha.b.f31141l, 0), this.A) : this.A;
    }

    private Rect n(Rect rect) {
        EditText editText = this.f22610c;
        if (editText != null) {
            Rect rect2 = this.C;
            rect2.bottom = rect.bottom;
            int i10 = this.f22642u;
            if (i10 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = rect.top + this.f22644v;
                rect2.right = rect.right - this.f22610c.getCompoundPaddingRight();
                return rect2;
            } else if (i10 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.f22610c.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - r();
                rect2.right = rect.right - this.f22610c.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    private int o(Rect rect, Rect rect2, float f10) {
        if (this.f22642u == 1) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f22610c.getCompoundPaddingBottom();
    }

    private int p(Rect rect, float f10) {
        if (H()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f22610c.getCompoundPaddingTop();
    }

    private Rect q(Rect rect) {
        if (this.f22610c != null) {
            Rect rect2 = this.C;
            float q10 = this.f22639s0.q();
            rect2.left = rect.left + this.f22610c.getCompoundPaddingLeft();
            rect2.top = p(rect, q10);
            rect2.right = rect.right - this.f22610c.getCompoundPaddingRight();
            rect2.bottom = o(rect, rect2, q10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r() {
        float m10;
        if (this.f22628n) {
            int i10 = this.f22642u;
            if (i10 == 0 || i10 == 1) {
                m10 = this.f22639s0.m();
            } else if (i10 != 2) {
                return 0;
            } else {
                m10 = this.f22639s0.m() / 2.0f;
            }
            return (int) m10;
        }
        return 0;
    }

    private boolean s() {
        return this.f22642u == 2 && t();
    }

    private void setEditText(EditText editText) {
        if (this.f22610c == null) {
            if (this.N != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f22610c = editText;
            J();
            setTextInputAccessibilityDelegate(new e(this));
            this.f22639s0.U(this.f22610c.getTypeface());
            this.f22639s0.M(this.f22610c.getTextSize());
            int gravity = this.f22610c.getGravity();
            this.f22639s0.F((gravity & (-113)) | 48);
            this.f22639s0.L(gravity);
            this.f22610c.addTextChangedListener(new a());
            if (this.f22619i0 == null) {
                this.f22619i0 = this.f22610c.getHintTextColors();
            }
            if (this.f22628n) {
                if (TextUtils.isEmpty(this.f22630o)) {
                    CharSequence hint = this.f22610c.getHint();
                    this.f22611d = hint;
                    setHint(hint);
                    this.f22610c.setHint((CharSequence) null);
                }
                this.f22632p = true;
            }
            if (this.f22618i != null) {
                V(this.f22610c.getText().length());
            }
            Y();
            this.f22612e.e();
            this.F.bringToFront();
            this.f22609b.bringToFront();
            this.f22615g0.bringToFront();
            x();
            d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        this.f22615g0.setVisibility(z10 ? 0 : 8);
        this.f22609b.setVisibility(z10 ? 8 : 0);
        if (C()) {
            return;
        }
        a0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f22630o)) {
            return;
        }
        this.f22630o = charSequence;
        this.f22639s0.S(charSequence);
        if (this.f22637r0) {
            return;
        }
        K();
    }

    private boolean t() {
        return this.f22646w > -1 && this.f22650z != 0;
    }

    private void u() {
        if (w()) {
            ((com.google.android.material.textfield.c) this.f22634q).j0();
        }
    }

    private void v(boolean z10) {
        ValueAnimator valueAnimator = this.f22643u0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22643u0.cancel();
        }
        if (z10 && this.f22641t0) {
            e(1.0f);
        } else {
            this.f22639s0.O(1.0f);
        }
        this.f22637r0 = false;
        if (w()) {
            K();
        }
    }

    private boolean w() {
        return this.f22628n && !TextUtils.isEmpty(this.f22630o) && (this.f22634q instanceof com.google.android.material.textfield.c);
    }

    private void x() {
        Iterator<f> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void y(int i10) {
        Iterator<g> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10);
        }
    }

    private void z(Canvas canvas) {
        xa.g gVar = this.f22636r;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f22646w;
            this.f22636r.draw(canvas);
        }
    }

    public boolean E() {
        return this.f22609b.getVisibility() == 0 && this.P.getVisibility() == 0;
    }

    public boolean F() {
        return this.f22612e.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f22632p;
    }

    public boolean I() {
        return this.F.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.j.q(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = ha.k.f31252a
            androidx.core.widget.j.q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = ha.c.f31156a
            int r4 = androidx.core.content.b.d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q(android.widget.TextView, int):void");
    }

    void V(int i10) {
        boolean z10 = this.f22616h;
        if (this.f22614g == -1) {
            this.f22618i.setText(String.valueOf(i10));
            this.f22618i.setContentDescription(null);
            this.f22616h = false;
        } else {
            if (z.p(this.f22618i) == 1) {
                z.s0(this.f22618i, 0);
            }
            this.f22616h = i10 > this.f22614g;
            W(getContext(), this.f22618i, i10, this.f22614g, this.f22616h);
            if (z10 != this.f22616h) {
                X();
                if (this.f22616h) {
                    z.s0(this.f22618i, 1);
                }
            }
            this.f22618i.setText(getContext().getString(j.f31237c, Integer.valueOf(i10), Integer.valueOf(this.f22614g)));
        }
        if (this.f22610c == null || z10 == this.f22616h) {
            return;
        }
        c0(false);
        e0();
        Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f22610c;
        if (editText == null || this.f22642u != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (g0.a(background)) {
            background = background.mutate();
        }
        if (this.f22612e.k()) {
            background.setColorFilter(androidx.appcompat.widget.k.e(this.f22612e.n(), PorterDuff.Mode.SRC_IN));
        } else if (this.f22616h && (textView = this.f22618i) != null) {
            background.setColorFilter(androidx.appcompat.widget.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.c(background);
            this.f22610c.refreshDrawableState();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f22608a.addView(view, layoutParams2);
            this.f22608a.setLayoutParams(layoutParams);
            b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public void c(f fVar) {
        this.M.add(fVar);
        if (this.f22610c != null) {
            fVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(boolean z10) {
        d0(z10, false);
    }

    public void d(g gVar) {
        this.Q.add(gVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText;
        if (this.f22611d != null && (editText = this.f22610c) != null) {
            boolean z10 = this.f22632p;
            this.f22632p = false;
            CharSequence hint = editText.getHint();
            this.f22610c.setHint(this.f22611d);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f22610c.setHint(hint);
                this.f22632p = z10;
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f22647w0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f22647w0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        A(canvas);
        z(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f22645v0) {
            return;
        }
        boolean z10 = true;
        this.f22645v0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f22639s0;
        boolean R = aVar != null ? aVar.R(drawableState) | false : false;
        c0((z.U(this) && isEnabled()) ? false : false);
        Y();
        e0();
        if (R) {
            invalidate();
        }
        this.f22645v0 = false;
    }

    void e(float f10) {
        if (this.f22639s0.r() == f10) {
            return;
        }
        if (this.f22643u0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f22643u0 = valueAnimator;
            valueAnimator.setInterpolator(ia.a.f31870b);
            this.f22643u0.setDuration(167L);
            this.f22643u0.addUpdateListener(new d());
        }
        this.f22643u0.setFloatValues(this.f22639s0.r(), f10);
        this.f22643u0.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f22634q == null || this.f22642u == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f22610c) != null && editText2.hasFocus());
        boolean z12 = isHovered() || ((editText = this.f22610c) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f22650z = this.f22635q0;
        } else if (this.f22612e.k()) {
            this.f22650z = this.f22612e.n();
        } else if (this.f22616h && (textView = this.f22618i) != null) {
            this.f22650z = textView.getCurrentTextColor();
        } else if (z11) {
            this.f22650z = this.f22627m0;
        } else if (z12) {
            this.f22650z = this.f22625l0;
        } else {
            this.f22650z = this.f22623k0;
        }
        S(this.f22612e.k() && getEndIconDelegate().c());
        if (getErrorIconDrawable() != null && this.f22612e.v() && this.f22612e.k()) {
            z10 = true;
        }
        setErrorIconVisible(z10);
        if ((z12 || z11) && isEnabled()) {
            this.f22646w = this.f22649y;
        } else {
            this.f22646w = this.f22648x;
        }
        if (this.f22642u == 1) {
            if (!isEnabled()) {
                this.A = this.f22631o0;
            } else if (z12) {
                this.A = this.f22633p0;
            } else {
                this.A = this.f22629n0;
            }
        }
        f();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f22610c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + r();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xa.g getBoxBackground() {
        int i10 = this.f22642u;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.f22634q;
    }

    public int getBoxBackgroundColor() {
        return this.A;
    }

    public int getBoxBackgroundMode() {
        return this.f22642u;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f22634q.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f22634q.s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f22634q.F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f22634q.E();
    }

    public int getBoxStrokeColor() {
        return this.f22627m0;
    }

    public int getCounterMaxLength() {
        return this.f22614g;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f22613f && this.f22616h && (textView = this.f22618i) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f22624l;
    }

    public ColorStateList getCounterTextColor() {
        return this.f22624l;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f22619i0;
    }

    public EditText getEditText() {
        return this.f22610c;
    }

    public CharSequence getEndIconContentDescription() {
        return this.P.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.P.getDrawable();
    }

    public int getEndIconMode() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.P;
    }

    public CharSequence getError() {
        if (this.f22612e.v()) {
            return this.f22612e.m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f22612e.n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f22615g0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f22612e.n();
    }

    public CharSequence getHelperText() {
        if (this.f22612e.w()) {
            return this.f22612e.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f22612e.q();
    }

    public CharSequence getHint() {
        if (this.f22628n) {
            return this.f22630o;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f22639s0.m();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f22639s0.n();
    }

    public ColorStateList getHintTextColor() {
        return this.f22621j0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.P.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.P.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.F.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.F.getDrawable();
    }

    public Typeface getTypeface() {
        return this.E;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f22610c;
        if (editText != null) {
            Rect rect = this.B;
            com.google.android.material.internal.b.a(this, editText, rect);
            T(rect);
            if (this.f22628n) {
                this.f22639s0.C(n(rect));
                this.f22639s0.J(q(rect));
                this.f22639s0.z();
                if (!w() || this.f22637r0) {
                    return;
                }
                K();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean Z = Z();
        boolean a02 = a0();
        if (Z || a02) {
            this.f22610c.post(new c());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setError(savedState.f22651c);
        if (savedState.f22652d) {
            this.P.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f22612e.k()) {
            savedState.f22651c = getError();
        }
        savedState.f22652d = C() && this.P.isChecked();
        return savedState;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.A != i10) {
            this.A = i10;
            this.f22629n0 = i10;
            f();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.b.d(getContext(), i10));
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f22642u) {
            return;
        }
        this.f22642u = i10;
        if (this.f22610c != null) {
            J();
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f22627m0 != i10) {
            this.f22627m0 = i10;
            e0();
        }
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f22613f != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f22618i = appCompatTextView;
                appCompatTextView.setId(ha.f.f31216w);
                Typeface typeface = this.E;
                if (typeface != null) {
                    this.f22618i.setTypeface(typeface);
                }
                this.f22618i.setMaxLines(1);
                this.f22612e.d(this.f22618i, 2);
                X();
                U();
            } else {
                this.f22612e.x(this.f22618i, 2);
                this.f22618i = null;
            }
            this.f22613f = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f22614g != i10) {
            if (i10 > 0) {
                this.f22614g = i10;
            } else {
                this.f22614g = -1;
            }
            if (this.f22613f) {
                U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f22620j != i10) {
            this.f22620j = i10;
            X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f22626m != colorStateList) {
            this.f22626m = colorStateList;
            X();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f22622k != i10) {
            this.f22622k = i10;
            X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f22624l != colorStateList) {
            this.f22624l = colorStateList;
            X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f22619i0 = colorStateList;
        this.f22621j0 = colorStateList;
        if (this.f22610c != null) {
            c0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        L(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.P.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.P.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.N;
        this.N = i10;
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f22642u)) {
            getEndIconDelegate().a();
            i();
            y(i11);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f22642u + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.P, onClickListener, this.f22617h0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f22617h0 = onLongClickListener;
        P(this.P, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.S = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            this.U = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (E() != z10) {
            this.P.setVisibility(z10 ? 0 : 4);
            a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f22612e.v()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f22612e.J(charSequence);
        } else {
            this.f22612e.r();
        }
    }

    public void setErrorEnabled(boolean z10) {
        this.f22612e.z(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f22615g0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.f22615g0.getDrawable() != drawable) {
            this.f22615g0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f22615g0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.f22615g0.getDrawable() != drawable) {
            this.f22615g0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f22612e.A(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f22612e.B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (F()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!F()) {
            setHelperTextEnabled(true);
        }
        this.f22612e.K(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f22612e.E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f22612e.D(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f22612e.C(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f22628n) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f22641t0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f22628n) {
            this.f22628n = z10;
            if (!z10) {
                this.f22632p = false;
                if (!TextUtils.isEmpty(this.f22630o) && TextUtils.isEmpty(this.f22610c.getHint())) {
                    this.f22610c.setHint(this.f22630o);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f22610c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f22630o)) {
                        setHint(hint);
                    }
                    this.f22610c.setHint((CharSequence) null);
                }
                this.f22632p = true;
            }
            if (this.f22610c != null) {
                b0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f22639s0.D(i10);
        this.f22621j0 = this.f22639s0.l();
        if (this.f22610c != null) {
            c0(false);
            b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f22621j0 != colorStateList) {
            if (this.f22619i0 == null) {
                this.f22639s0.E(colorStateList);
            }
            this.f22621j0 = colorStateList;
            if (this.f22610c != null) {
                c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.N != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.R = colorStateList;
        this.S = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.T = mode;
        this.U = true;
        i();
    }

    public void setStartIconCheckable(boolean z10) {
        this.F.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.F, onClickListener, this.L);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.L = onLongClickListener;
        P(this.F, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            this.H = true;
            k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.I != mode) {
            this.I = mode;
            this.J = true;
            k();
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (I() != z10) {
            this.F.setVisibility(z10 ? 0 : 8);
            a0();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f22610c;
        if (editText != null) {
            z.q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.E) {
            this.E = typeface;
            this.f22639s0.U(typeface);
            this.f22612e.G(typeface);
            TextView textView = this.f22618i;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.P.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.P.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f22615g0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f22612e.v());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.F.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.F.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.P.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.P.setImageDrawable(drawable);
    }
}
