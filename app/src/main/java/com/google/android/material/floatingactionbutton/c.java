package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import ia.h;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionStrategy.java */
/* loaded from: classes2.dex */
public interface c {
    void a();

    void b();

    h c();

    boolean d();

    void e(h hVar);

    void f();

    AnimatorSet g();

    List<Animator.AnimatorListener> h();

    void i(ExtendedFloatingActionButton.d dVar);

    void onAnimationStart(Animator animator);
}
