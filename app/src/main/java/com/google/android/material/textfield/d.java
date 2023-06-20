package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.z;
import com.google.android.material.textfield.TextInputLayout;
import ha.j;
import xa.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes3.dex */
public class d extends com.google.android.material.textfield.e {

    /* renamed from: o  reason: collision with root package name */
    private static final boolean f22672o;

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f22673d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.e f22674e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f22675f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22676g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22677h;

    /* renamed from: i  reason: collision with root package name */
    private long f22678i;

    /* renamed from: j  reason: collision with root package name */
    private StateListDrawable f22679j;

    /* renamed from: k  reason: collision with root package name */
    private xa.g f22680k;

    /* renamed from: l  reason: collision with root package name */
    private AccessibilityManager f22681l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f22682m;

    /* renamed from: n  reason: collision with root package name */
    private ValueAnimator f22683n;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class a implements TextWatcher {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0301a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f22685a;

            RunnableC0301a(AutoCompleteTextView autoCompleteTextView) {
                this.f22685a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f22685a.isPopupShowing();
                d.this.z(isPopupShowing);
                d.this.f22676g = isPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView u10 = dVar.u(dVar.f22696a.getEditText());
            u10.post(new RunnableC0301a(u10));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.a0(Spinner.class.getName());
            if (cVar.L()) {
                cVar.l0(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView u10 = dVar.u(dVar.f22696a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f22681l.isTouchExplorationEnabled()) {
                d.this.C(u10);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView u10 = d.this.u(textInputLayout.getEditText());
            d.this.A(u10);
            d.this.r(u10);
            d.this.B(u10);
            u10.setThreshold(0);
            u10.removeTextChangedListener(d.this.f22673d);
            u10.addTextChangedListener(d.this.f22673d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f22674e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC0302d implements View.OnClickListener {
        View$OnClickListenerC0302d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.C((AutoCompleteTextView) d.this.f22696a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f22690a;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f22690a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.y()) {
                    d.this.f22676g = false;
                }
                d.this.C(this.f22690a);
                view.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            d.this.f22696a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            d.this.z(false);
            d.this.f22676g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f22676g = true;
            d.this.f22678i = System.currentTimeMillis();
            d.this.z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f22698c.setChecked(dVar.f22677h);
            d.this.f22683n.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f22698c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        f22672o = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f22673d = new a();
        this.f22674e = new b(this.f22696a);
        this.f22675f = new c();
        this.f22676g = false;
        this.f22677h = false;
        this.f22678i = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(AutoCompleteTextView autoCompleteTextView) {
        if (f22672o) {
            int boxBackgroundMode = this.f22696a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f22680k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f22679j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (f22672o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (y()) {
            this.f22676g = false;
        }
        if (!this.f22676g) {
            if (f22672o) {
                z(!this.f22677h);
            } else {
                this.f22677h = !this.f22677h;
                this.f22698c.toggle();
            }
            if (this.f22677h) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f22676g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f22696a.getBoxBackgroundMode();
        xa.g boxBackground = this.f22696a.getBoxBackground();
        int c10 = na.a.c(autoCompleteTextView, ha.b.f31137h);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            t(autoCompleteTextView, c10, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            s(autoCompleteTextView, c10, iArr, boxBackground);
        }
    }

    private void s(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, xa.g gVar) {
        int boxBackgroundColor = this.f22696a.getBoxBackgroundColor();
        int[] iArr2 = {na.a.f(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f22672o) {
            z.u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        xa.g gVar2 = new xa.g(gVar.B());
        gVar2.U(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int H = z.H(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int G = z.G(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        z.u0(autoCompleteTextView, layerDrawable);
        z.E0(autoCompleteTextView, H, paddingTop, G, paddingBottom);
    }

    private void t(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, xa.g gVar) {
        LayerDrawable layerDrawable;
        int c10 = na.a.c(autoCompleteTextView, ha.b.f31141l);
        xa.g gVar2 = new xa.g(gVar.B());
        int f10 = na.a.f(i10, c10, 0.1f);
        gVar2.U(new ColorStateList(iArr, new int[]{f10, 0}));
        if (f22672o) {
            gVar2.setTint(c10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f10, c10});
            xa.g gVar3 = new xa.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        z.u0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutoCompleteTextView u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator v(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ia.a.f31869a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private xa.g w(float f10, float f11, float f12, int i10) {
        k m10 = k.a().z(f10).D(f10).r(f11).v(f11).m();
        xa.g l10 = xa.g.l(this.f22697b, f12);
        l10.setShapeAppearanceModel(m10);
        l10.W(0, i10, 0, i10);
        return l10;
    }

    private void x() {
        this.f22683n = v(67, 0.0f, 1.0f);
        ValueAnimator v10 = v(50, 1.0f, 0.0f);
        this.f22682m = v10;
        v10.addListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f22678i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10) {
        if (this.f22677h != z10) {
            this.f22677h = z10;
            this.f22683n.cancel();
            this.f22682m.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f22697b.getResources().getDimensionPixelOffset(ha.d.D);
        float dimensionPixelOffset2 = this.f22697b.getResources().getDimensionPixelOffset(ha.d.B);
        int dimensionPixelOffset3 = this.f22697b.getResources().getDimensionPixelOffset(ha.d.C);
        xa.g w10 = w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        xa.g w11 = w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f22680k = w10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f22679j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, w10);
        this.f22679j.addState(new int[0], w11);
        this.f22696a.setEndIconDrawable(e.a.b(this.f22697b, f22672o ? ha.e.f31190d : ha.e.f31191e));
        TextInputLayout textInputLayout = this.f22696a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f31240f));
        this.f22696a.setEndIconOnClickListener(new View$OnClickListenerC0302d());
        this.f22696a.c(this.f22675f);
        x();
        z.A0(this.f22698c, 2);
        this.f22681l = (AccessibilityManager) this.f22697b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean c() {
        return true;
    }
}
