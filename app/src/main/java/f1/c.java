package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class c extends m {
    private static final String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> N = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> O = new C0378c(PointF.class, "topLeft");
    private static final Property<k, PointF> P = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> Q = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> S = new g(PointF.class, "position");
    private static f1.k T = new f1.k();
    private int[] J = new int[2];
    private boolean K = false;
    private boolean L = false;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f29940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f29941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f29942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f29943d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f29940a = viewGroup;
            this.f29941b = bitmapDrawable;
            this.f29942c = view;
            this.f29943d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f29940a).b(this.f29941b);
            c0.g(this.f29942c, this.f29943d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f29944a;

        b(Class cls, String str) {
            super(cls, str);
            this.f29944a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f29944a);
            Rect rect = this.f29944a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f29944a);
            this.f29944a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f29944a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: f1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0378c extends Property<k, PointF> {
        C0378c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f29945a;
        private k mViewBounds;

        h(c cVar, k kVar) {
            this.f29945a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f29946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f29947b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f29948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29949d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f29950e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f29951f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f29952g;

        i(c cVar, View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f29947b = view;
            this.f29948c = rect;
            this.f29949d = i10;
            this.f29950e = i11;
            this.f29951f = i12;
            this.f29952g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29946a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f29946a) {
                return;
            }
            androidx.core.view.z.x0(this.f29947b, this.f29948c);
            c0.f(this.f29947b, this.f29949d, this.f29950e, this.f29951f, this.f29952g);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f29953a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f29954b;

        j(c cVar, ViewGroup viewGroup) {
            this.f29954b = viewGroup;
        }

        @Override // f1.n, f1.m.f
        public void a(m mVar) {
            x.c(this.f29954b, false);
        }

        @Override // f1.n, f1.m.f
        public void b(m mVar) {
            x.c(this.f29954b, false);
            this.f29953a = true;
        }

        @Override // f1.n, f1.m.f
        public void c(m mVar) {
            x.c(this.f29954b, true);
        }

        @Override // f1.m.f
        public void d(m mVar) {
            if (!this.f29953a) {
                x.c(this.f29954b, false);
            }
            mVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f29955a;

        /* renamed from: b  reason: collision with root package name */
        private int f29956b;

        /* renamed from: c  reason: collision with root package name */
        private int f29957c;

        /* renamed from: d  reason: collision with root package name */
        private int f29958d;

        /* renamed from: e  reason: collision with root package name */
        private View f29959e;

        /* renamed from: f  reason: collision with root package name */
        private int f29960f;

        /* renamed from: g  reason: collision with root package name */
        private int f29961g;

        k(View view) {
            this.f29959e = view;
        }

        private void b() {
            c0.f(this.f29959e, this.f29955a, this.f29956b, this.f29957c, this.f29958d);
            this.f29960f = 0;
            this.f29961g = 0;
        }

        void a(PointF pointF) {
            this.f29957c = Math.round(pointF.x);
            this.f29958d = Math.round(pointF.y);
            int i10 = this.f29961g + 1;
            this.f29961g = i10;
            if (this.f29960f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f29955a = Math.round(pointF.x);
            this.f29956b = Math.round(pointF.y);
            int i10 = this.f29960f + 1;
            this.f29960f = i10;
            if (i10 == this.f29961g) {
                b();
            }
        }
    }

    private void d0(s sVar) {
        View view = sVar.f30063b;
        if (!androidx.core.view.z.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f30062a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f30062a.put("android:changeBounds:parent", sVar.f30063b.getParent());
        if (this.L) {
            sVar.f30063b.getLocationInWindow(this.J);
            sVar.f30062a.put("android:changeBounds:windowX", Integer.valueOf(this.J[0]));
            sVar.f30062a.put("android:changeBounds:windowY", Integer.valueOf(this.J[1]));
        }
        if (this.K) {
            sVar.f30062a.put("android:changeBounds:clip", androidx.core.view.z.u(view));
        }
    }

    private boolean e0(View view, View view2) {
        if (this.L) {
            s u10 = u(view, true);
            if (u10 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == u10.f30063b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // f1.m
    public String[] E() {
        return M;
    }

    @Override // f1.m
    public void f(s sVar) {
        d0(sVar);
    }

    @Override // f1.m
    public void j(s sVar) {
        d0(sVar);
    }

    @Override // f1.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f30062a;
        Map<String, Object> map2 = sVar2.f30062a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f30063b;
        if (e0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f30062a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f30062a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            Rect rect4 = (Rect) sVar.f30062a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f30062a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (i16 != i17 || i18 != i19) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 > 0) {
                if (!this.K) {
                    view = view2;
                    c0.f(view, i12, i14, i16, i18);
                    if (i10 == 2) {
                        if (i20 == i22 && i21 == i23) {
                            c10 = f1.f.a(view, S, w().a(i12, i14, i13, i15));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a10 = f1.f.a(kVar, O, w().a(i12, i14, i13, i15));
                            ObjectAnimator a11 = f1.f.a(kVar, P, w().a(i16, i18, i17, i19));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a10, a11);
                            animatorSet.addListener(new h(this, kVar));
                            c10 = animatorSet;
                        }
                    } else if (i12 == i13 && i14 == i15) {
                        c10 = f1.f.a(view, Q, w().a(i16, i18, i17, i19));
                    } else {
                        c10 = f1.f.a(view, R, w().a(i12, i14, i13, i15));
                    }
                } else {
                    view = view2;
                    c0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                    ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : f1.f.a(view, S, w().a(i12, i14, i13, i15));
                    if (rect4 == null) {
                        i11 = 0;
                        rect = new Rect(0, 0, i20, i21);
                    } else {
                        i11 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        androidx.core.view.z.x0(view, rect);
                        f1.k kVar2 = T;
                        Object[] objArr = new Object[2];
                        objArr[i11] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        ofObject.addListener(new i(this, view, rect5, i13, i15, i17, i19));
                        objectAnimator = ofObject;
                    }
                    c10 = r.c(a12, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    a(new j(this, viewGroup4));
                }
                return c10;
            }
            return null;
        }
        int intValue = ((Integer) sVar.f30062a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f30062a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f30062a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f30062a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.J);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c11 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        f1.g w10 = w();
        int[] iArr = this.J;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, f1.i.a(N, w10.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c11));
        return ofPropertyValuesHolder;
    }
}
