package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f22491a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f22492b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f22493c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f22494d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f22493c == animator) {
                eVar.f22493c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f22496a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f22497b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f22496a = iArr;
            this.f22497b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f22493c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f22493c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f22497b;
        this.f22493c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f22494d);
        this.f22491a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f22493c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f22493c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f22491a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f22491a.get(i10);
            if (StateSet.stateSetMatches(bVar.f22496a, iArr)) {
                break;
            }
            i10++;
        }
        b bVar2 = this.f22492b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f22492b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
