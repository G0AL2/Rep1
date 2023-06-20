package ia;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: MotionTiming.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f31884a;

    /* renamed from: b  reason: collision with root package name */
    private long f31885b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f31886c;

    /* renamed from: d  reason: collision with root package name */
    private int f31887d;

    /* renamed from: e  reason: collision with root package name */
    private int f31888e;

    public i(long j10, long j11) {
        this.f31884a = 0L;
        this.f31885b = 300L;
        this.f31886c = null;
        this.f31887d = 0;
        this.f31888e = 1;
        this.f31884a = j10;
        this.f31885b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f31887d = valueAnimator.getRepeatCount();
        iVar.f31888e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f31871c;
            }
            return interpolator instanceof DecelerateInterpolator ? a.f31872d : interpolator;
        }
        return a.f31870b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f31884a;
    }

    public long d() {
        return this.f31885b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f31886c;
        return timeInterpolator != null ? timeInterpolator : a.f31870b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
                return e().getClass().equals(iVar.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.f31887d;
    }

    public int h() {
        return this.f31888e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f31884a = 0L;
        this.f31885b = 300L;
        this.f31886c = null;
        this.f31887d = 0;
        this.f31888e = 1;
        this.f31884a = j10;
        this.f31885b = j11;
        this.f31886c = timeInterpolator;
    }
}
