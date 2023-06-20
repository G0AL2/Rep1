package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import i0.c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2639c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f2640a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f2641b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0050a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f2642a;

        C0050a(a aVar) {
            this.f2642a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2642a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            i0.d b10 = this.f2642a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2642a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            i0.c F0 = i0.c.F0(accessibilityNodeInfo);
            F0.u0(z.X(view));
            F0.k0(z.S(view));
            F0.p0(z.q(view));
            F0.A0(z.K(view));
            this.f2642a.g(view, F0);
            F0.f(accessibilityNodeInfo.getText(), view);
            List<c.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                F0.b(c10.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2642a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2642a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2642a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f2642a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2642a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f2639c);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(w.c.f38107b);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q10 = i0.c.q(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; q10 != null && i10 < q10.length; i10++) {
                if (clickableSpan.equals(q10[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(w.c.f38108c);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2640a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public i0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2640a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new i0.d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f2641b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2640a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, i0.c cVar) {
        this.f2640a.onInitializeAccessibilityNodeInfo(view, cVar.E0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2640a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2640a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<c.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            c.a aVar = c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 16) {
            z10 = this.f2640a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != w.c.f38106a) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f2640a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2640a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2640a = accessibilityDelegate;
        this.f2641b = new C0050a(this);
    }
}
