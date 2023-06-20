package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.z;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class l extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f3804d;

    /* renamed from: e  reason: collision with root package name */
    private final a f3805e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final l f3806d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f3807e = new WeakHashMap();

        public a(l lVar) {
            this.f3806d = lVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public i0.d b(View view) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            if (!this.f3806d.o() && this.f3806d.f3804d.getLayoutManager() != null) {
                this.f3806d.f3804d.getLayoutManager().V0(view, cVar);
                androidx.core.view.a aVar = this.f3807e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                } else {
                    super.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3807e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (!this.f3806d.o() && this.f3806d.f3804d.getLayoutManager() != null) {
                androidx.core.view.a aVar = this.f3807e.get(view);
                if (aVar != null) {
                    if (aVar.j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i10, bundle)) {
                    return true;
                }
                return this.f3806d.f3804d.getLayoutManager().p1(view, i10, bundle);
            }
            return super.j(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3807e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f3807e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a m10 = z.m(view);
            if (m10 == null || m10 == this) {
                return;
            }
            this.f3807e.put(view, m10);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f3804d = recyclerView;
        androidx.core.view.a n10 = n();
        if (n10 != null && (n10 instanceof a)) {
            this.f3805e = (a) n10;
        } else {
            this.f3805e = new a(this);
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().R0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, i0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f3804d.getLayoutManager() == null) {
            return;
        }
        this.f3804d.getLayoutManager().U0(cVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3804d.getLayoutManager() == null) {
            return false;
        }
        return this.f3804d.getLayoutManager().n1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3805e;
    }

    boolean o() {
        return this.f3804d.hasPendingAdapterUpdates();
    }
}
