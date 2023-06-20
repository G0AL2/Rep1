package i2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator.java */
/* loaded from: classes.dex */
public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f31511a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f31512b = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f31512b.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31511a.add(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        for (Animator.AnimatorListener animatorListener : this.f31512b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31512b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        for (Animator.AnimatorListener animatorListener : this.f31512b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f31512b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f31511a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f31512b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f31511a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f31512b.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31511a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
