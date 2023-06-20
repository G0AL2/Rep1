package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
class t extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1702b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1703a;

    static {
        f1702b = Build.VERSION.SDK_INT < 21;
    }

    public t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        z0 v10 = z0.v(context, attributeSet, d.j.T1, i10, i11);
        int i12 = d.j.V1;
        if (v10.s(i12)) {
            b(v10.a(i12, false));
        }
        setBackgroundDrawable(v10.g(d.j.U1));
        v10.w();
    }

    private void b(boolean z10) {
        if (f1702b) {
            this.f1703a = z10;
        } else {
            androidx.core.widget.i.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1702b && this.f1703a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1702b && this.f1703a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1702b && this.f1703a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
