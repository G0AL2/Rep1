package com.reactnativepagerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import qe.k;

/* compiled from: NestedScrollableHost.kt */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Integer f28382a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28383b;

    /* renamed from: c  reason: collision with root package name */
    private int f28384c;

    /* renamed from: d  reason: collision with root package name */
    private float f28385d;

    /* renamed from: e  reason: collision with root package name */
    private float f28386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        k.f(context, "context");
        this.f28384c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean a(int i10, float f10) {
        int i11 = -((int) Math.signum(f10));
        if (i10 == 0) {
            View child = getChild();
            if (child == null) {
                return false;
            }
            return child.canScrollHorizontally(i11);
        } else if (i10 == 1) {
            View child2 = getChild();
            if (child2 == null) {
                return false;
            }
            return child2.canScrollVertically(i11);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private final void b(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        Integer valueOf = parentViewPager == null ? null : Integer.valueOf(parentViewPager.getOrientation());
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        if (a(intValue, -1.0f) || a(intValue, 1.0f)) {
            if (motionEvent.getAction() == 0) {
                this.f28385d = motionEvent.getX();
                this.f28386e = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.f28385d;
                float y10 = motionEvent.getY() - this.f28386e;
                boolean z10 = intValue == 0;
                float abs = Math.abs(x10) * (z10 ? 0.5f : 1.0f);
                float abs2 = Math.abs(y10) * (z10 ? 1.0f : 0.5f);
                int i10 = this.f28384c;
                if (abs > i10 || abs2 > i10) {
                    if (z10 == (abs2 > abs)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z10) {
                        x10 = y10;
                    }
                    if (a(intValue, x10)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:6:0x000d->B:11:0x001b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000c -> B:6:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L25
            r2 = r0
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.a.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    public final boolean getDidSetInitialIndex() {
        return this.f28383b;
    }

    public final Integer getInitialIndex() {
        return this.f28382a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k.f(motionEvent, "e");
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDidSetInitialIndex(boolean z10) {
        this.f28383b = z10;
    }

    public final void setInitialIndex(Integer num) {
        this.f28382a = num;
    }
}
