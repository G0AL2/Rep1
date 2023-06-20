package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import ha.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes3.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f22658d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f22659e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f22660f;

    /* renamed from: g  reason: collision with root package name */
    private ValueAnimator f22661g;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0300a implements TextWatcher {
        C0300a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!a.j(editable)) {
                a.this.f22660f.cancel();
                a.this.f22661g.start();
            } else if (a.this.f22696a.E()) {
            } else {
                a.this.f22661g.cancel();
                a.this.f22660f.start();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.f22658d);
            editText.addTextChangedListener(a.this.f22658d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f22696a.getEditText().setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f22696a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f22696a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f22698c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f22698c.setScaleX(floatValue);
            a.this.f22698c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f22658d = new C0300a();
        this.f22659e = new b();
    }

    private ValueAnimator h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ia.a.f31869a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    private ValueAnimator i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(ia.a.f31872d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(Editable editable) {
        return editable.length() > 0;
    }

    private void k() {
        ValueAnimator i10 = i();
        ValueAnimator h10 = h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22660f = animatorSet;
        animatorSet.playTogether(i10, h10);
        this.f22660f.addListener(new d());
        ValueAnimator h11 = h(1.0f, 0.0f);
        this.f22661g = h11;
        h11.addListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f22696a.setEndIconDrawable(e.a.b(this.f22697b, ha.e.f31192f));
        TextInputLayout textInputLayout = this.f22696a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f31238d));
        this.f22696a.setEndIconOnClickListener(new c());
        this.f22696a.c(this.f22659e);
        k();
    }
}
