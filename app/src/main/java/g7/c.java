package g7;

import android.content.Context;

/* compiled from: ReactHorizontalScrollContainerView.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.views.view.g {

    /* renamed from: t  reason: collision with root package name */
    private int f30602t;

    /* renamed from: u  reason: collision with root package name */
    private int f30603u;

    public c(Context context) {
        super(context);
        this.f30602t = s6.a.d().g(context) ? 1 : 0;
        this.f30603u = 0;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f30602t == 1) {
            setLeft(0);
            setRight((i12 - i10) + 0);
            if (this.f30603u != getWidth()) {
                d dVar = (d) getParent();
                dVar.scrollTo(((dVar.getScrollX() + getWidth()) - this.f30603u) - dVar.getWidth(), dVar.getScrollY());
            }
        }
        this.f30603u = getWidth();
    }

    @Override // com.facebook.react.views.view.g
    public void setRemoveClippedSubviews(boolean z10) {
        if (this.f30602t == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z10);
        }
    }
}
