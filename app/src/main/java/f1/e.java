package f1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import f1.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.w {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f29968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f29969b;

        b(e eVar, View view, ArrayList arrayList) {
            this.f29968a = view;
            this.f29969b = arrayList;
        }

        @Override // f1.m.f
        public void a(m mVar) {
        }

        @Override // f1.m.f
        public void b(m mVar) {
        }

        @Override // f1.m.f
        public void c(m mVar) {
        }

        @Override // f1.m.f
        public void d(m mVar) {
            mVar.Q(this);
            this.f29968a.setVisibility(8);
            int size = this.f29969b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f29969b.get(i10)).setVisibility(0);
            }
        }

        @Override // f1.m.f
        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class c extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f29970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f29971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f29972c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f29973d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f29974e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f29975f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f29970a = obj;
            this.f29971b = arrayList;
            this.f29972c = obj2;
            this.f29973d = arrayList2;
            this.f29974e = obj3;
            this.f29975f = arrayList3;
        }

        @Override // f1.m.f
        public void d(m mVar) {
            mVar.Q(this);
        }

        @Override // f1.n, f1.m.f
        public void e(m mVar) {
            Object obj = this.f29970a;
            if (obj != null) {
                e.this.q(obj, this.f29971b, null);
            }
            Object obj2 = this.f29972c;
            if (obj2 != null) {
                e.this.q(obj2, this.f29973d, null);
            }
            Object obj3 = this.f29974e;
            if (obj3 != null) {
                e.this.q(obj3, this.f29975f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class d extends m.e {
        d(e eVar, Rect rect) {
        }
    }

    private static boolean C(m mVar) {
        return (androidx.fragment.app.w.l(mVar.A()) && androidx.fragment.app.w.l(mVar.B()) && androidx.fragment.app.w.l(mVar.C())) ? false : true;
    }

    @Override // androidx.fragment.app.w
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.D().clear();
            qVar.D().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.f0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.w
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int i02 = qVar.i0();
            while (i10 < i02) {
                b(qVar.h0(i10), arrayList);
                i10++;
            }
        } else if (C(mVar) || !androidx.fragment.app.w.l(mVar.D())) {
        } else {
            int size = arrayList.size();
            while (i10 < size) {
                mVar.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.w
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.w
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().f0(mVar).f0(mVar2).n0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 != null) {
            q qVar = new q();
            if (mVar != null) {
                qVar.f0(mVar);
            }
            qVar.f0(mVar3);
            return qVar;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.w
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.f0((m) obj);
        }
        if (obj2 != null) {
            qVar.f0((m) obj2);
        }
        if (obj3 != null) {
            qVar.f0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.w
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).R(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int i02 = qVar.i0();
            while (i10 < i02) {
                q(qVar.h0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!C(mVar)) {
            List<View> D = mVar.D();
            if (D.size() == arrayList.size() && D.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    mVar.b(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.R(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.w
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.w
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).W(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).W(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> D = qVar.D();
        D.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.w.d(D, arrayList.get(i10));
        }
        D.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
