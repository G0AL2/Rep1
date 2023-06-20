package f1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f30050a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>>> f30051b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f30052c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        m f30053a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f30054b;

        /* compiled from: TransitionManager.java */
        /* renamed from: f1.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0379a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f30055a;

            C0379a(androidx.collection.a aVar) {
                this.f30055a = aVar;
            }

            @Override // f1.m.f
            public void d(m mVar) {
                ((ArrayList) this.f30055a.get(a.this.f30054b)).remove(mVar);
                mVar.Q(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f30053a = mVar;
            this.f30054b = viewGroup;
        }

        private void a() {
            this.f30054b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f30054b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (o.f30052c.remove(this.f30054b)) {
                androidx.collection.a<ViewGroup, ArrayList<m>> b10 = o.b();
                ArrayList<m> arrayList = b10.get(this.f30054b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b10.put(this.f30054b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f30053a);
                this.f30053a.a(new C0379a(b10));
                this.f30053a.k(this.f30054b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).S(this.f30054b);
                    }
                }
                this.f30053a.P(this.f30054b);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f30052c.remove(this.f30054b);
            ArrayList<m> arrayList = o.b().get(this.f30054b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().S(this.f30054b);
                }
            }
            this.f30053a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f30052c.contains(viewGroup) || !androidx.core.view.z.U(viewGroup)) {
            return;
        }
        f30052c.add(viewGroup);
        if (mVar == null) {
            mVar = f30050a;
        }
        m clone = mVar.clone();
        d(viewGroup, clone);
        l.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static androidx.collection.a<ViewGroup, ArrayList<m>> b() {
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>> weakReference = f30051b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            androidx.collection.a<ViewGroup, ArrayList<m>> aVar2 = new androidx.collection.a<>();
            f30051b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().O(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.k(viewGroup, true);
        }
        l b10 = l.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
