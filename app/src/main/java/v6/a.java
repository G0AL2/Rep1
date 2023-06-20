package v6;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: JSResponderHandler.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f37812a = -1;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f37813b;

    private void c() {
        ViewParent viewParent = this.f37813b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f37813b = null;
        }
    }

    @Override // v6.b
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i10 = this.f37812a;
        return (i10 == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i10) ? false : true;
    }

    public void b() {
        this.f37812a = -1;
        c();
    }

    public void d(int i10, ViewParent viewParent) {
        this.f37812a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f37813b = viewParent;
        }
    }
}
