package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.z;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1126a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1127b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1128c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1129d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1130e;

    /* renamed from: f  reason: collision with root package name */
    private View f1131f;

    /* renamed from: g  reason: collision with root package name */
    private int f1132g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1133h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f1134i;

    /* renamed from: j  reason: collision with root package name */
    private h f1135j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1136k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1137l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        h lVar;
        Display defaultDisplay = ((WindowManager) this.f1126a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f1126a.getResources().getDimensionPixelSize(d.d.f28692c)) {
            lVar = new b(this.f1126a, this.f1131f, this.f1129d, this.f1130e, this.f1128c);
        } else {
            lVar = new l(this.f1126a, this.f1127b, this.f1131f, this.f1129d, this.f1130e, this.f1128c);
        }
        lVar.j(this.f1127b);
        lVar.t(this.f1137l);
        lVar.n(this.f1131f);
        lVar.d(this.f1134i);
        lVar.q(this.f1133h);
        lVar.r(this.f1132g);
        return lVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.u(z11);
        if (z10) {
            if ((androidx.core.view.e.b(this.f1132g, z.C(this.f1131f)) & 7) == 5) {
                i10 -= this.f1131f.getWidth();
            }
            c10.s(i10);
            c10.v(i11);
            int i12 = (int) ((this.f1126a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public void b() {
        if (d()) {
            this.f1135j.dismiss();
        }
    }

    public h c() {
        if (this.f1135j == null) {
            this.f1135j = a();
        }
        return this.f1135j;
    }

    public boolean d() {
        h hVar = this.f1135j;
        return hVar != null && hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f1135j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1136k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1131f = view;
    }

    public void g(boolean z10) {
        this.f1133h = z10;
        h hVar = this.f1135j;
        if (hVar != null) {
            hVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f1132g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1136k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1134i = aVar;
        h hVar = this.f1135j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1131f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1131f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f1132g = 8388611;
        this.f1137l = new a();
        this.f1126a = context;
        this.f1127b = eVar;
        this.f1131f = view;
        this.f1128c = z10;
        this.f1129d = i10;
        this.f1130e = i11;
    }
}
