package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class e extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    private ViewPager2.i f4368a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPager2 f4369b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f4370c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f4371d;

    /* renamed from: e  reason: collision with root package name */
    private int f4372e;

    /* renamed from: f  reason: collision with root package name */
    private int f4373f;

    /* renamed from: g  reason: collision with root package name */
    private a f4374g;

    /* renamed from: h  reason: collision with root package name */
    private int f4375h;

    /* renamed from: i  reason: collision with root package name */
    private int f4376i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4377j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4378k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4379l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4380m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f4381a;

        /* renamed from: b  reason: collision with root package name */
        float f4382b;

        /* renamed from: c  reason: collision with root package name */
        int f4383c;

        a() {
        }

        void a() {
            this.f4381a = -1;
            this.f4382b = 0.0f;
            this.f4383c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ViewPager2 viewPager2) {
        this.f4369b = viewPager2;
        RecyclerView recyclerView = viewPager2.f4333j;
        this.f4370c = recyclerView;
        this.f4371d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f4374g = new a();
        n();
    }

    private void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f4368a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        ViewPager2.i iVar = this.f4368a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f4372e == 3 && this.f4373f == 0) || this.f4373f == i10) {
            return;
        }
        this.f4373f = i10;
        ViewPager2.i iVar = this.f4368a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    private int f() {
        return this.f4371d.g2();
    }

    private boolean k() {
        int i10 = this.f4372e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f4372e = 0;
        this.f4373f = 0;
        this.f4374g.a();
        this.f4375h = -1;
        this.f4376i = -1;
        this.f4377j = false;
        this.f4378k = false;
        this.f4380m = false;
        this.f4379l = false;
    }

    private void p(boolean z10) {
        this.f4380m = z10;
        this.f4372e = z10 ? 4 : 1;
        int i10 = this.f4376i;
        if (i10 != -1) {
            this.f4375h = i10;
            this.f4376i = -1;
        } else if (this.f4375h == -1) {
            this.f4375h = f();
        }
        e(1);
    }

    private void q() {
        int top;
        a aVar = this.f4374g;
        int g22 = this.f4371d.g2();
        aVar.f4381a = g22;
        if (g22 == -1) {
            aVar.a();
            return;
        }
        View M = this.f4371d.M(g22);
        if (M == null) {
            aVar.a();
            return;
        }
        int k02 = this.f4371d.k0(M);
        int p02 = this.f4371d.p0(M);
        int s02 = this.f4371d.s0(M);
        int R = this.f4371d.R(M);
        ViewGroup.LayoutParams layoutParams = M.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            k02 += marginLayoutParams.leftMargin;
            p02 += marginLayoutParams.rightMargin;
            s02 += marginLayoutParams.topMargin;
            R += marginLayoutParams.bottomMargin;
        }
        int height = M.getHeight() + s02 + R;
        int width = M.getWidth() + k02 + p02;
        if (this.f4371d.t2() == 0) {
            top = (M.getLeft() - k02) - this.f4370c.getPaddingLeft();
            if (this.f4369b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (M.getTop() - s02) - this.f4370c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f4383c = i10;
        if (i10 < 0) {
            if (new androidx.viewpager2.widget.a(this.f4371d).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f4383c)));
        }
        aVar.f4382b = height == 0 ? 0.0f : i10 / height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if ((this.f4372e != 1 || this.f4373f != 1) && i10 == 1) {
            p(false);
        } else if (k() && i10 == 2) {
            if (this.f4378k) {
                e(2);
                this.f4377j = true;
            }
        } else {
            if (k() && i10 == 0) {
                q();
                if (!this.f4378k) {
                    int i11 = this.f4374g.f4381a;
                    if (i11 != -1) {
                        c(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f4374g;
                    if (aVar.f4383c == 0) {
                        int i12 = this.f4375h;
                        int i13 = aVar.f4381a;
                        if (i12 != i13) {
                            d(i13);
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    e(0);
                    n();
                }
            }
            if (this.f4372e == 2 && i10 == 0 && this.f4379l) {
                q();
                a aVar2 = this.f4374g;
                if (aVar2.f4383c == 0) {
                    int i14 = this.f4376i;
                    int i15 = aVar2.f4381a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        d(i15);
                    }
                    e(0);
                    n();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f4369b.d()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f4378k = r4
            r3.q()
            boolean r0 = r3.f4377j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f4377j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f4369b
            boolean r6 = r6.d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = 0
            goto L23
        L22:
            r5 = 1
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f4374g
            int r6 = r5.f4383c
            if (r6 == 0) goto L2f
            int r5 = r5.f4381a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f4374g
            int r5 = r5.f4381a
        L33:
            r3.f4376i = r5
            int r6 = r3.f4375h
            if (r6 == r5) goto L4b
            r3.d(r5)
            goto L4b
        L3d:
            int r5 = r3.f4372e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f4374g
            int r5 = r5.f4381a
            if (r5 != r1) goto L48
            r5 = 0
        L48:
            r3.d(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f4374g
            int r6 = r5.f4381a
            if (r6 != r1) goto L52
            r6 = 0
        L52:
            float r0 = r5.f4382b
            int r5 = r5.f4383c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f4374g
            int r6 = r5.f4381a
            int r0 = r3.f4376i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f4383c
            if (r5 != 0) goto L71
            int r5 = r3.f4373f
            if (r5 == r4) goto L71
            r3.e(r2)
            r3.n()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double g() {
        q();
        a aVar = this.f4374g;
        return aVar.f4381a + aVar.f4382b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f4373f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f4380m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f4373f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f4379l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i10, boolean z10) {
        this.f4372e = z10 ? 2 : 3;
        this.f4380m = false;
        boolean z11 = this.f4376i != i10;
        this.f4376i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ViewPager2.i iVar) {
        this.f4368a = iVar;
    }
}
