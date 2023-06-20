package nd;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: GestureHandlerOrchestrator.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: o  reason: collision with root package name */
    private static final PointF f34775o = new PointF();

    /* renamed from: p  reason: collision with root package name */
    private static final float[] f34776p = new float[2];

    /* renamed from: q  reason: collision with root package name */
    private static final Matrix f34777q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    private static final float[] f34778r = new float[2];

    /* renamed from: s  reason: collision with root package name */
    private static final Comparator<b> f34779s = new a();

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f34780a;

    /* renamed from: b  reason: collision with root package name */
    private final e f34781b;

    /* renamed from: c  reason: collision with root package name */
    private final p f34782c;

    /* renamed from: d  reason: collision with root package name */
    private final b[] f34783d = new b[20];

    /* renamed from: e  reason: collision with root package name */
    private final b[] f34784e = new b[20];

    /* renamed from: f  reason: collision with root package name */
    private final b[] f34785f = new b[20];

    /* renamed from: g  reason: collision with root package name */
    private final b[] f34786g = new b[20];

    /* renamed from: h  reason: collision with root package name */
    private int f34787h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f34788i = 0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f34789j = false;

    /* renamed from: k  reason: collision with root package name */
    private int f34790k = 0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34791l = false;

    /* renamed from: m  reason: collision with root package name */
    private int f34792m = 0;

    /* renamed from: n  reason: collision with root package name */
    private float f34793n = 0.0f;

    /* compiled from: GestureHandlerOrchestrator.java */
    /* loaded from: classes3.dex */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            boolean z10;
            boolean z11 = bVar.f34772v;
            if ((z11 && bVar2.f34772v) || ((z10 = bVar.f34773w) && bVar2.f34773w)) {
                return Integer.signum(bVar2.f34771u - bVar.f34771u);
            }
            if (z11) {
                return -1;
            }
            if (bVar2.f34772v) {
                return 1;
            }
            if (z10) {
                return -1;
            }
            return bVar2.f34773w ? 1 : 0;
        }
    }

    public d(ViewGroup viewGroup, e eVar, p pVar) {
        this.f34780a = viewGroup;
        this.f34781b = eVar;
        this.f34782c = pVar;
    }

    private static void A(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f34776p;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f34777q;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    private boolean B(View view, float[] fArr, int i10) {
        l a10 = this.f34782c.a(view);
        if (a10 == l.NONE) {
            return false;
        }
        if (a10 == l.BOX_ONLY) {
            return u(view, fArr, i10) || z(view, fArr);
        } else if (a10 == l.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return k((ViewGroup) view, fArr, i10);
            }
            return false;
        } else if (a10 == l.AUTO) {
            return u(view, fArr, i10) || (view instanceof ViewGroup ? k((ViewGroup) view, fArr, i10) : false) || z(view, fArr);
        } else {
            throw new IllegalArgumentException("Unknown pointer event type: " + a10.toString());
        }
    }

    private void C(b bVar) {
        if (l(bVar)) {
            a(bVar);
            return;
        }
        q(bVar);
        bVar.f34773w = false;
    }

    private void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f34788i;
            if (i10 < i11) {
                if (this.f34784e[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f34784e;
                if (i11 < bVarArr.length) {
                    this.f34788i = i11 + 1;
                    bVarArr[i11] = bVar;
                    bVar.f34773w = true;
                    int i12 = this.f34792m;
                    this.f34792m = i12 + 1;
                    bVar.f34771u = i12;
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            }
        }
    }

    private boolean b(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f34793n;
    }

    private static boolean c(b bVar, b bVar2) {
        return bVar == bVar2 || bVar.O(bVar2) || bVar2.O(bVar);
    }

    private void d() {
        for (int i10 = this.f34788i - 1; i10 >= 0; i10--) {
            this.f34784e[i10].d();
        }
        int i11 = this.f34787h;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f34785f[i12] = this.f34783d[i12];
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            this.f34785f[i13].d();
        }
    }

    private void e() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f34788i; i11++) {
            b[] bVarArr = this.f34784e;
            if (bVarArr[i11].f34773w) {
                bVarArr[i10] = bVarArr[i11];
                i10++;
            }
        }
        this.f34788i = i10;
    }

    private void f() {
        boolean z10 = false;
        for (int i10 = this.f34787h - 1; i10 >= 0; i10--) {
            b bVar = this.f34783d[i10];
            if (n(bVar.p()) && !bVar.f34773w) {
                this.f34783d[i10] = null;
                bVar.G();
                bVar.f34772v = false;
                bVar.f34773w = false;
                bVar.f34771u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                z10 = true;
            }
        }
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f34787h; i12++) {
                b[] bVarArr = this.f34783d;
                if (bVarArr[i12] != null) {
                    bVarArr[i11] = bVarArr[i12];
                    i11++;
                }
            }
            this.f34787h = i11;
        }
        this.f34791l = false;
    }

    private void g(b bVar, MotionEvent motionEvent) {
        if (!p(bVar.r())) {
            bVar.d();
        } else if (bVar.T()) {
            int actionMasked = motionEvent.getActionMasked();
            if (bVar.f34773w && actionMasked == 2) {
                return;
            }
            float[] fArr = f34778r;
            i(bVar.r(), motionEvent, fArr);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            motionEvent.setLocation(fArr[0], fArr[1]);
            bVar.s(motionEvent);
            if (bVar.f34772v) {
                bVar.f(motionEvent);
            }
            motionEvent.setLocation(x10, y10);
            if (actionMasked == 1 || actionMasked == 6) {
                bVar.S(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
    }

    private void i(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f34780a) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            i(viewGroup, motionEvent, fArr);
            PointF pointF = f34775o;
            A(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        } else {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        }
    }

    private void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f34778r;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        B(this.f34780a, fArr, pointerId);
        k(this.f34780a, fArr, pointerId);
    }

    private boolean k(ViewGroup viewGroup, float[] fArr, int i10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View c10 = this.f34782c.c(viewGroup, childCount);
            if (b(c10)) {
                PointF pointF = f34775o;
                A(fArr[0], fArr[1], viewGroup, c10, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean B = (!m(c10) || o(fArr[0], fArr[1], c10)) ? B(c10, fArr, i10) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (B) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean l(b bVar) {
        for (int i10 = 0; i10 < this.f34787h; i10++) {
            b bVar2 = this.f34783d[i10];
            if (!n(bVar2.p()) && y(bVar, bVar2)) {
                return true;
            }
        }
        return false;
    }

    private boolean m(View view) {
        return !(view instanceof ViewGroup) || this.f34782c.b((ViewGroup) view);
    }

    private static boolean n(int i10) {
        return i10 == 3 || i10 == 1 || i10 == 5;
    }

    private static boolean o(float f10, float f11, View view) {
        return f10 >= 0.0f && f10 <= ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }

    private boolean p(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f34780a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f34780a) {
            parent = parent.getParent();
        }
        return parent == this.f34780a;
    }

    private void q(b bVar) {
        int p10 = bVar.p();
        bVar.f34773w = false;
        bVar.f34772v = true;
        int i10 = this.f34792m;
        this.f34792m = i10 + 1;
        bVar.f34771u = i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34787h; i12++) {
            b bVar2 = this.f34783d[i12];
            if (x(bVar2, bVar)) {
                this.f34786g[i11] = bVar2;
                i11++;
            }
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            this.f34786g[i13].d();
        }
        for (int i14 = this.f34788i - 1; i14 >= 0; i14--) {
            b bVar3 = this.f34784e[i14];
            if (x(bVar3, bVar)) {
                bVar3.d();
                bVar3.f34773w = false;
            }
        }
        e();
        bVar.e(4, 2);
        if (p10 != 4) {
            bVar.e(5, 4);
            if (p10 != 5) {
                bVar.e(0, 5);
            }
        }
    }

    private void t(b bVar, View view) {
        int i10 = 0;
        while (true) {
            int i11 = this.f34787h;
            if (i10 < i11) {
                if (this.f34783d[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f34783d;
                if (i11 < bVarArr.length) {
                    this.f34787h = i11 + 1;
                    bVarArr[i11] = bVar;
                    bVar.f34772v = false;
                    bVar.f34773w = false;
                    bVar.f34771u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    bVar.F(view, this);
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            }
        }
    }

    private boolean u(View view, float[] fArr, int i10) {
        ArrayList<b> a10 = this.f34781b.a(view);
        if (a10 != null) {
            int size = a10.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = a10.get(i11);
                if (bVar.w() && bVar.y(view, fArr[0], fArr[1])) {
                    t(bVar, view);
                    bVar.R(i10);
                    z10 = true;
                }
            }
            return z10;
        }
        return false;
    }

    private void v() {
        if (!this.f34789j && this.f34790k == 0) {
            f();
        } else {
            this.f34791l = true;
        }
    }

    private static boolean x(b bVar, b bVar2) {
        if (bVar.t(bVar2) && !c(bVar, bVar2)) {
            if (bVar != bVar2) {
                if (bVar.f34773w || bVar.p() == 4) {
                    return bVar.N(bVar2);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private static boolean y(b bVar, b bVar2) {
        return bVar != bVar2 && (bVar.Q(bVar2) || bVar2.P(bVar));
    }

    private static boolean z(View view, float[] fArr) {
        return (!(view instanceof ViewGroup) || view.getBackground() != null) && o(fArr[0], fArr[1], view);
    }

    public void h(MotionEvent motionEvent) {
        int i10 = this.f34787h;
        System.arraycopy(this.f34783d, 0, this.f34785f, 0, i10);
        Arrays.sort(this.f34785f, 0, i10, f34779s);
        for (int i11 = 0; i11 < i10; i11++) {
            g(this.f34785f[i11], motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(b bVar, int i10, int i11) {
        this.f34790k++;
        if (n(i10)) {
            for (int i12 = 0; i12 < this.f34788i; i12++) {
                b bVar2 = this.f34784e[i12];
                if (y(bVar2, bVar)) {
                    if (i10 == 5) {
                        bVar2.d();
                        bVar2.f34773w = false;
                    } else {
                        C(bVar2);
                    }
                }
            }
            e();
        }
        if (i10 == 4) {
            C(bVar);
        } else if (i11 != 4 && i11 != 5) {
            bVar.e(i10, i11);
        } else if (bVar.f34772v) {
            bVar.e(i10, i11);
        }
        this.f34790k--;
        v();
    }

    public boolean s(MotionEvent motionEvent) {
        this.f34789j = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            j(motionEvent);
        } else if (actionMasked == 3) {
            d();
        }
        h(motionEvent);
        this.f34789j = false;
        if (this.f34791l && this.f34790k == 0) {
            f();
        }
        return true;
    }

    public void w(float f10) {
        this.f34793n = f10;
    }
}
