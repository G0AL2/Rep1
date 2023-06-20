package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.z;
import androidx.core.widget.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22699a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f22700b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f22701c;

    /* renamed from: d  reason: collision with root package name */
    private int f22702d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f22703e;

    /* renamed from: f  reason: collision with root package name */
    private int f22704f;

    /* renamed from: g  reason: collision with root package name */
    private Animator f22705g;

    /* renamed from: h  reason: collision with root package name */
    private final float f22706h;

    /* renamed from: i  reason: collision with root package name */
    private int f22707i;

    /* renamed from: j  reason: collision with root package name */
    private int f22708j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f22709k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22710l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f22711m;

    /* renamed from: n  reason: collision with root package name */
    private int f22712n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f22713o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f22714p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f22715q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f22716r;

    /* renamed from: s  reason: collision with root package name */
    private int f22717s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f22718t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f22719u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f22721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f22722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f22723d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f22720a = i10;
            this.f22721b = textView;
            this.f22722c = i11;
            this.f22723d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f22707i = this.f22720a;
            f.this.f22705g = null;
            TextView textView = this.f22721b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f22722c == 1 && f.this.f22711m != null) {
                    f.this.f22711m.setText((CharSequence) null);
                }
                TextView textView2 = this.f22723d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f22723d.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f22723d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f22699a = context;
        this.f22700b = textInputLayout;
        this.f22706h = context.getResources().getDimensionPixelSize(ha.d.f31170j);
    }

    private void F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void H(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean I(TextView textView, CharSequence charSequence) {
        return z.U(this.f22700b) && this.f22700b.isEnabled() && !(this.f22708j == this.f22707i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void L(int i10, int i11, boolean z10) {
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22705g = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f22715q, this.f22716r, 2, i10, i11);
            h(arrayList, this.f22710l, this.f22711m, 1, i10, i11);
            ia.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, l(i10), i10, l(i11)));
            animatorSet.start();
        } else {
            y(i10, i11);
        }
        this.f22700b.Y();
        this.f22700b.c0(z10);
        this.f22700b.e0();
    }

    private boolean f() {
        return (this.f22701c == null || this.f22700b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(i(textView, i12 == i10));
            if (i12 == i10) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(ia.a.f31869a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f22706h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(ia.a.f31872d);
        return ofFloat;
    }

    private TextView l(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f22716r;
        }
        return this.f22711m;
    }

    private boolean t(int i10) {
        return (i10 != 1 || this.f22711m == null || TextUtils.isEmpty(this.f22709k)) ? false : true;
    }

    private void y(int i10, int i11) {
        TextView l10;
        TextView l11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (l11 = l(i11)) != null) {
            l11.setVisibility(0);
            l11.setAlpha(1.0f);
        }
        if (i10 != 0 && (l10 = l(i10)) != null) {
            l10.setVisibility(4);
            if (i10 == 1) {
                l10.setText((CharSequence) null);
            }
        }
        this.f22707i = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i10) {
        this.f22712n = i10;
        TextView textView = this.f22711m;
        if (textView != null) {
            this.f22700b.Q(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        this.f22713o = colorStateList;
        TextView textView = this.f22711m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int i10) {
        this.f22717s = i10;
        TextView textView = this.f22716r;
        if (textView != null) {
            j.q(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(boolean z10) {
        if (this.f22715q == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f22699a);
            this.f22716r = appCompatTextView;
            appCompatTextView.setId(ha.f.f31218y);
            Typeface typeface = this.f22719u;
            if (typeface != null) {
                this.f22716r.setTypeface(typeface);
            }
            this.f22716r.setVisibility(4);
            z.s0(this.f22716r, 1);
            C(this.f22717s);
            E(this.f22718t);
            d(this.f22716r, 1);
        } else {
            s();
            x(this.f22716r, 1);
            this.f22716r = null;
            this.f22700b.Y();
            this.f22700b.e0();
        }
        this.f22715q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(ColorStateList colorStateList) {
        this.f22718t = colorStateList;
        TextView textView = this.f22716r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(Typeface typeface) {
        if (typeface != this.f22719u) {
            this.f22719u = typeface;
            F(this.f22711m, typeface);
            F(this.f22716r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(CharSequence charSequence) {
        g();
        this.f22709k = charSequence;
        this.f22711m.setText(charSequence);
        int i10 = this.f22707i;
        if (i10 != 1) {
            this.f22708j = 1;
        }
        L(i10, this.f22708j, I(this.f22711m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(CharSequence charSequence) {
        g();
        this.f22714p = charSequence;
        this.f22716r.setText(charSequence);
        int i10 = this.f22707i;
        if (i10 != 2) {
            this.f22708j = 2;
        }
        L(i10, this.f22708j, I(this.f22716r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView, int i10) {
        if (this.f22701c == null && this.f22703e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f22699a);
            this.f22701c = linearLayout;
            linearLayout.setOrientation(0);
            this.f22700b.addView(this.f22701c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f22699a);
            this.f22703e = frameLayout;
            this.f22701c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f22701c.addView(new Space(this.f22699a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f22700b.getEditText() != null) {
                e();
            }
        }
        if (u(i10)) {
            this.f22703e.setVisibility(0);
            this.f22703e.addView(textView);
            this.f22704f++;
        } else {
            this.f22701c.addView(textView, i10);
        }
        this.f22701c.setVisibility(0);
        this.f22702d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            z.E0(this.f22701c, z.H(this.f22700b.getEditText()), 0, z.G(this.f22700b.getEditText()), 0);
        }
    }

    void g() {
        Animator animator = this.f22705g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return t(this.f22708j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence m() {
        return this.f22709k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        TextView textView = this.f22711m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList o() {
        TextView textView = this.f22711m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f22714p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f22716r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f22709k = null;
        g();
        if (this.f22707i == 1) {
            if (this.f22715q && !TextUtils.isEmpty(this.f22714p)) {
                this.f22708j = 2;
            } else {
                this.f22708j = 0;
            }
        }
        L(this.f22707i, this.f22708j, I(this.f22711m, null));
    }

    void s() {
        g();
        int i10 = this.f22707i;
        if (i10 == 2) {
            this.f22708j = 0;
        }
        L(i10, this.f22708j, I(this.f22716r, null));
    }

    boolean u(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        return this.f22710l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f22715q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f22701c == null) {
            return;
        }
        if (u(i10) && (frameLayout = this.f22703e) != null) {
            int i11 = this.f22704f - 1;
            this.f22704f = i11;
            H(frameLayout, i11);
            this.f22703e.removeView(textView);
        } else {
            this.f22701c.removeView(textView);
        }
        int i12 = this.f22702d - 1;
        this.f22702d = i12;
        H(this.f22701c, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z10) {
        if (this.f22710l == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f22699a);
            this.f22711m = appCompatTextView;
            appCompatTextView.setId(ha.f.f31217x);
            Typeface typeface = this.f22719u;
            if (typeface != null) {
                this.f22711m.setTypeface(typeface);
            }
            A(this.f22712n);
            B(this.f22713o);
            this.f22711m.setVisibility(4);
            z.s0(this.f22711m, 1);
            d(this.f22711m, 0);
        } else {
            r();
            x(this.f22711m, 0);
            this.f22711m = null;
            this.f22700b.Y();
            this.f22700b.e0();
        }
        this.f22710l = z10;
    }
}
