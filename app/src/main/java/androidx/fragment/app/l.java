package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f3160a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f3161b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final FragmentManager.l f3162a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f3163b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(FragmentManager fragmentManager) {
        this.f3161b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.a(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.f3163b
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r4.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.a(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.j r0 = r0.u0()
            r0.f()
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.b(r3, r1)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L36
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L36
            goto L23
        L36:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.b(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.c(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.f3163b
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r4.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.c(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.d(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.d(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.e(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.e(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.f(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.f(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.j r0 = r0.u0()
            r0.f()
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.g(r3, r1)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L36
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L36
            goto L23
        L36:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.g(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.h(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.f3163b
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r4.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.h(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.i(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.i(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.j(r3, r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            if (r5 == 0) goto L2d
            boolean r0 = r4.f3163b
            if (r0 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r4.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.j(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.k(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.k(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.l(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.l(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(androidx.fragment.app.Fragment r3, android.view.View r4, android.os.Bundle r5, boolean r6) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.m(r3, r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            if (r6 == 0) goto L2d
            boolean r5 = r4.f3163b
            if (r5 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r4.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.m(androidx.fragment.app.Fragment, android.view.View, android.os.Bundle, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f3161b
            androidx.fragment.app.Fragment r0 = r0.x0()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.l r0 = r0.w0()
            r1 = 1
            r0.n(r3, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.l$a> r3 = r2.f3160a
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.l$a r0 = (androidx.fragment.app.l.a) r0
            if (r4 == 0) goto L2d
            boolean r1 = r0.f3163b
            if (r1 != 0) goto L2d
            goto L1a
        L2d:
            androidx.fragment.app.FragmentManager$l r3 = r0.f3162a
            r3 = 0
            throw r3
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.n(androidx.fragment.app.Fragment, boolean):void");
    }
}
