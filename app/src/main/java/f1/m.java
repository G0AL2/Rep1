package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class m implements Cloneable {
    private static final int[] G = {2, 1, 3, 4};
    private static final g H = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> I = new ThreadLocal<>();
    p C;
    private e D;
    private androidx.collection.a<String, String> E;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<s> f30035t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<s> f30036u;

    /* renamed from: a  reason: collision with root package name */
    private String f30016a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f30017b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f30018c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f30019d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Integer> f30020e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<View> f30021f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f30022g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Class<?>> f30023h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Integer> f30024i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<View> f30025j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Class<?>> f30026k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f30027l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f30028m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<View> f30029n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f30030o = null;

    /* renamed from: p  reason: collision with root package name */
    private t f30031p = new t();

    /* renamed from: q  reason: collision with root package name */
    private t f30032q = new t();

    /* renamed from: r  reason: collision with root package name */
    q f30033r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f30034s = G;

    /* renamed from: v  reason: collision with root package name */
    boolean f30037v = false;

    /* renamed from: w  reason: collision with root package name */
    ArrayList<Animator> f30038w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private int f30039x = 0;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30040y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f30041z = false;
    private ArrayList<f> A = null;
    private ArrayList<Animator> B = new ArrayList<>();
    private g F = H;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // f1.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f30042a;

        b(androidx.collection.a aVar) {
            this.f30042a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30042a.remove(animator);
            m.this.f30038w.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.f30038w.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f30045a;

        /* renamed from: b  reason: collision with root package name */
        String f30046b;

        /* renamed from: c  reason: collision with root package name */
        s f30047c;

        /* renamed from: d  reason: collision with root package name */
        m0 f30048d;

        /* renamed from: e  reason: collision with root package name */
        m f30049e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f30045a = view;
            this.f30046b = str;
            this.f30047c = sVar;
            this.f30048d = m0Var;
            this.f30049e = mVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean I(s sVar, s sVar2, String str) {
        Object obj = sVar.f30062a.get(str);
        Object obj2 = sVar2.f30062a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void J(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && H(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && H(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f30035t.add(sVar);
                    this.f30036u.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void K(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j10 = aVar.j(size);
            if (j10 != null && H(j10) && (remove = aVar2.remove(j10)) != null && H(remove.f30063b)) {
                this.f30035t.add(aVar.l(size));
                this.f30036u.add(remove);
            }
        }
    }

    private void L(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.d<View> dVar, androidx.collection.d<View> dVar2) {
        View f10;
        int o10 = dVar.o();
        for (int i10 = 0; i10 < o10; i10++) {
            View p10 = dVar.p(i10);
            if (p10 != null && H(p10) && (f10 = dVar2.f(dVar.j(i10))) != null && H(f10)) {
                s sVar = aVar.get(p10);
                s sVar2 = aVar2.get(f10);
                if (sVar != null && sVar2 != null) {
                    this.f30035t.add(sVar);
                    this.f30036u.add(sVar2);
                    aVar.remove(p10);
                    aVar2.remove(f10);
                }
            }
        }
    }

    private void M(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View n10 = aVar3.n(i10);
            if (n10 != null && H(n10) && (view = aVar4.get(aVar3.j(i10))) != null && H(view)) {
                s sVar = aVar.get(n10);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f30035t.add(sVar);
                    this.f30036u.add(sVar2);
                    aVar.remove(n10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(t tVar, t tVar2) {
        androidx.collection.a<View, s> aVar = new androidx.collection.a<>(tVar.f30065a);
        androidx.collection.a<View, s> aVar2 = new androidx.collection.a<>(tVar2.f30065a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f30034s;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    K(aVar, aVar2);
                } else if (i11 == 2) {
                    M(aVar, aVar2, tVar.f30068d, tVar2.f30068d);
                } else if (i11 == 3) {
                    J(aVar, aVar2, tVar.f30066b, tVar2.f30066b);
                } else if (i11 == 4) {
                    L(aVar, aVar2, tVar.f30067c, tVar2.f30067c);
                }
                i10++;
            } else {
                c(aVar, aVar2);
                return;
            }
        }
    }

    private void T(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s n10 = aVar.n(i10);
            if (H(n10.f30063b)) {
                this.f30035t.add(n10);
                this.f30036u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s n11 = aVar2.n(i11);
            if (H(n11.f30063b)) {
                this.f30036u.add(n11);
                this.f30035t.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f30065a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f30066b.indexOfKey(id2) >= 0) {
                tVar.f30066b.put(id2, null);
            } else {
                tVar.f30066b.put(id2, view);
            }
        }
        String L = androidx.core.view.z.L(view);
        if (L != null) {
            if (tVar.f30068d.containsKey(L)) {
                tVar.f30068d.put(L, null);
            } else {
                tVar.f30068d.put(L, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f30067c.i(itemIdAtPosition) >= 0) {
                    View f10 = tVar.f30067c.f(itemIdAtPosition);
                    if (f10 != null) {
                        androidx.core.view.z.z0(f10, false);
                        tVar.f30067c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                androidx.core.view.z.z0(view, true);
                tVar.f30067c.k(itemIdAtPosition, view);
            }
        }
    }

    private void g(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f30024i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f30025j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f30026k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f30026k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        j(sVar);
                    } else {
                        f(sVar);
                    }
                    sVar.f30064c.add(this);
                    i(sVar);
                    if (z10) {
                        d(this.f30031p, view, sVar);
                    } else {
                        d(this.f30032q, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f30028m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f30029n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f30030o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f30030o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                g(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private static androidx.collection.a<Animator, d> y() {
        androidx.collection.a<Animator, d> aVar = I.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            I.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public List<Integer> A() {
        return this.f30020e;
    }

    public List<String> B() {
        return this.f30022g;
    }

    public List<Class<?>> C() {
        return this.f30023h;
    }

    public List<View> D() {
        return this.f30021f;
    }

    public String[] E() {
        return null;
    }

    public s F(View view, boolean z10) {
        q qVar = this.f30033r;
        if (qVar != null) {
            return qVar.F(view, z10);
        }
        return (z10 ? this.f30031p : this.f30032q).f30065a.get(view);
    }

    public boolean G(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] E = E();
        if (E != null) {
            for (String str : E) {
                if (!I(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f30062a.keySet()) {
            if (I(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f30024i;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList4 = this.f30025j;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f30026k;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f30026k.get(i10).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f30027l == null || androidx.core.view.z.L(view) == null || !this.f30027l.contains(androidx.core.view.z.L(view))) {
                    if ((this.f30020e.size() == 0 && this.f30021f.size() == 0 && (((arrayList = this.f30023h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f30022g) == null || arrayList2.isEmpty()))) || this.f30020e.contains(Integer.valueOf(id2)) || this.f30021f.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f30022g;
                    if (arrayList6 == null || !arrayList6.contains(androidx.core.view.z.L(view))) {
                        if (this.f30023h != null) {
                            for (int i11 = 0; i11 < this.f30023h.size(); i11++) {
                                if (this.f30023h.get(i11).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void O(View view) {
        if (this.f30041z) {
            return;
        }
        androidx.collection.a<Animator, d> y10 = y();
        int size = y10.size();
        m0 d10 = c0.d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d n10 = y10.n(i10);
            if (n10.f30045a != null && d10.equals(n10.f30048d)) {
                f1.a.b(y10.j(i10));
            }
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.A.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).a(this);
            }
        }
        this.f30040y = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(ViewGroup viewGroup) {
        d dVar;
        this.f30035t = new ArrayList<>();
        this.f30036u = new ArrayList<>();
        N(this.f30031p, this.f30032q);
        androidx.collection.a<Animator, d> y10 = y();
        int size = y10.size();
        m0 d10 = c0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator j10 = y10.j(i10);
            if (j10 != null && (dVar = y10.get(j10)) != null && dVar.f30045a != null && d10.equals(dVar.f30048d)) {
                s sVar = dVar.f30047c;
                View view = dVar.f30045a;
                s F = F(view, true);
                s u10 = u(view, true);
                if (F == null && u10 == null) {
                    u10 = this.f30032q.f30065a.get(view);
                }
                if (!(F == null && u10 == null) && dVar.f30049e.G(sVar, u10)) {
                    if (!j10.isRunning() && !j10.isStarted()) {
                        y10.remove(j10);
                    } else {
                        j10.cancel();
                    }
                }
            }
        }
        p(viewGroup, this.f30031p, this.f30032q, this.f30035t, this.f30036u);
        U();
    }

    public m Q(f fVar) {
        ArrayList<f> arrayList = this.A;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.A.size() == 0) {
            this.A = null;
        }
        return this;
    }

    public m R(View view) {
        this.f30021f.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.f30040y) {
            if (!this.f30041z) {
                androidx.collection.a<Animator, d> y10 = y();
                int size = y10.size();
                m0 d10 = c0.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d n10 = y10.n(i10);
                    if (n10.f30045a != null && d10.equals(n10.f30048d)) {
                        f1.a.c(y10.j(i10));
                    }
                }
                ArrayList<f> arrayList = this.A;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.A.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).c(this);
                    }
                }
            }
            this.f30040y = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
        b0();
        androidx.collection.a<Animator, d> y10 = y();
        Iterator<Animator> it = this.B.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (y10.containsKey(next)) {
                b0();
                T(next, y10);
            }
        }
        this.B.clear();
        q();
    }

    public m V(long j10) {
        this.f30018c = j10;
        return this;
    }

    public void W(e eVar) {
        this.D = eVar;
    }

    public m X(TimeInterpolator timeInterpolator) {
        this.f30019d = timeInterpolator;
        return this;
    }

    public void Y(g gVar) {
        if (gVar == null) {
            this.F = H;
        } else {
            this.F = gVar;
        }
    }

    public void Z(p pVar) {
    }

    public m a(f fVar) {
        if (this.A == null) {
            this.A = new ArrayList<>();
        }
        this.A.add(fVar);
        return this;
    }

    public m a0(long j10) {
        this.f30017b = j10;
        return this;
    }

    public m b(View view) {
        this.f30021f.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0() {
        if (this.f30039x == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).e(this);
                }
            }
            this.f30041z = false;
        }
        this.f30039x++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f30018c != -1) {
            str2 = str2 + "dur(" + this.f30018c + ") ";
        }
        if (this.f30017b != -1) {
            str2 = str2 + "dly(" + this.f30017b + ") ";
        }
        if (this.f30019d != null) {
            str2 = str2 + "interp(" + this.f30019d + ") ";
        }
        if (this.f30020e.size() > 0 || this.f30021f.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f30020e.size() > 0) {
                for (int i10 = 0; i10 < this.f30020e.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f30020e.get(i10);
                }
            }
            if (this.f30021f.size() > 0) {
                for (int i11 = 0; i11 < this.f30021f.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f30021f.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f30038w.size() - 1; size >= 0; size--) {
            this.f30038w.get(size).cancel();
        }
        ArrayList<f> arrayList = this.A;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.A.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).b(this);
        }
    }

    protected void e(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(s sVar) {
    }

    public abstract void j(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        m(z10);
        if ((this.f30020e.size() <= 0 && this.f30021f.size() <= 0) || (((arrayList = this.f30022g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f30023h) != null && !arrayList2.isEmpty()))) {
            g(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f30020e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f30020e.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        j(sVar);
                    } else {
                        f(sVar);
                    }
                    sVar.f30064c.add(this);
                    i(sVar);
                    if (z10) {
                        d(this.f30031p, findViewById, sVar);
                    } else {
                        d(this.f30032q, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f30021f.size(); i11++) {
                View view = this.f30021f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    j(sVar2);
                } else {
                    f(sVar2);
                }
                sVar2.f30064c.add(this);
                i(sVar2);
                if (z10) {
                    d(this.f30031p, view, sVar2);
                } else {
                    d(this.f30032q, view, sVar2);
                }
            }
        }
        if (z10 || (aVar = this.E) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f30031p.f30068d.remove(this.E.j(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f30031p.f30068d.put(this.E.n(i13), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z10) {
        if (z10) {
            this.f30031p.f30065a.clear();
            this.f30031p.f30066b.clear();
            this.f30031p.f30067c.b();
            return;
        }
        this.f30032q.f30065a.clear();
        this.f30032q.f30066b.clear();
        this.f30032q.f30067c.b();
    }

    @Override // 
    /* renamed from: n */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.B = new ArrayList<>();
            mVar.f30031p = new t();
            mVar.f30032q = new t();
            mVar.f30035t = null;
            mVar.f30036u = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i10;
        View view;
        Animator animator;
        s sVar;
        Animator animator2;
        s sVar2;
        androidx.collection.a<Animator, d> y10 = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f30064c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f30064c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || G(sVar3, sVar4)) {
                    Animator o10 = o(viewGroup, sVar3, sVar4);
                    if (o10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f30063b;
                            String[] E = E();
                            if (E != null && E.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f30065a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < E.length) {
                                        sVar2.f30062a.put(E[i12], sVar5.f30062a.get(E[i12]));
                                        i12++;
                                        o10 = o10;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = o10;
                                i10 = size;
                                int size2 = y10.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = y10.get(y10.j(i13));
                                    if (dVar.f30047c != null && dVar.f30045a == view2 && dVar.f30046b.equals(v()) && dVar.f30047c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i10 = size;
                                animator2 = o10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i10 = size;
                            view = sVar3.f30063b;
                            animator = o10;
                            sVar = null;
                        }
                        if (animator != null) {
                            y10.put(animator, new d(view, v(), this, c0.d(viewGroup), sVar));
                            this.B.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.B.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        int i10 = this.f30039x - 1;
        this.f30039x = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.A;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.A.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f30031p.f30067c.o(); i12++) {
                View p10 = this.f30031p.f30067c.p(i12);
                if (p10 != null) {
                    androidx.core.view.z.z0(p10, false);
                }
            }
            for (int i13 = 0; i13 < this.f30032q.f30067c.o(); i13++) {
                View p11 = this.f30032q.f30067c.p(i13);
                if (p11 != null) {
                    androidx.core.view.z.z0(p11, false);
                }
            }
            this.f30041z = true;
        }
    }

    public long r() {
        return this.f30018c;
    }

    public e s() {
        return this.D;
    }

    public TimeInterpolator t() {
        return this.f30019d;
    }

    public String toString() {
        return c0("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s u(View view, boolean z10) {
        q qVar = this.f30033r;
        if (qVar != null) {
            return qVar.u(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.f30035t : this.f30036u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f30063b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f30036u : this.f30035t).get(i10);
        }
        return null;
    }

    public String v() {
        return this.f30016a;
    }

    public g w() {
        return this.F;
    }

    public p x() {
        return this.C;
    }

    public long z() {
        return this.f30017b;
    }
}
