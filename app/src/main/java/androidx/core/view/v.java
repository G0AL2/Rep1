package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f2719a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f2720b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f2721c;

    private v(View view, Runnable runnable) {
        this.f2719a = view;
        this.f2720b = view.getViewTreeObserver();
        this.f2721c = runnable;
    }

    public static v a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    public void b() {
        if (this.f2720b.isAlive()) {
            this.f2720b.removeOnPreDrawListener(this);
        } else {
            this.f2719a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2719a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2721c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2720b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
