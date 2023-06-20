package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import f1.a;
import f1.m;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    private int J = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f29995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f29996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f29997c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f29995a = viewGroup;
            this.f29996b = view;
            this.f29997c = view2;
        }

        @Override // f1.n, f1.m.f
        public void a(m mVar) {
            x.a(this.f29995a).d(this.f29996b);
        }

        @Override // f1.n, f1.m.f
        public void c(m mVar) {
            if (this.f29996b.getParent() == null) {
                x.a(this.f29995a).c(this.f29996b);
            } else {
                j0.this.cancel();
            }
        }

        @Override // f1.m.f
        public void d(m mVar) {
            this.f29997c.setTag(j.f29992b, null);
            x.a(this.f29995a).d(this.f29996b);
            mVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0377a {

        /* renamed from: a  reason: collision with root package name */
        private final View f29999a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30000b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f30001c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f30002d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f30003e;

        /* renamed from: f  reason: collision with root package name */
        boolean f30004f = false;

        b(View view, int i10, boolean z10) {
            this.f29999a = view;
            this.f30000b = i10;
            this.f30001c = (ViewGroup) view.getParent();
            this.f30002d = z10;
            g(true);
        }

        private void f() {
            if (!this.f30004f) {
                c0.h(this.f29999a, this.f30000b);
                ViewGroup viewGroup = this.f30001c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f30002d || this.f30003e == z10 || (viewGroup = this.f30001c) == null) {
                return;
            }
            this.f30003e = z10;
            x.c(viewGroup, z10);
        }

        @Override // f1.m.f
        public void a(m mVar) {
            g(false);
        }

        @Override // f1.m.f
        public void b(m mVar) {
        }

        @Override // f1.m.f
        public void c(m mVar) {
            g(true);
        }

        @Override // f1.m.f
        public void d(m mVar) {
            f();
            mVar.Q(this);
        }

        @Override // f1.m.f
        public void e(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f30004f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, f1.a.InterfaceC0377a
        public void onAnimationPause(Animator animator) {
            if (this.f30004f) {
                return;
            }
            c0.h(this.f29999a, this.f30000b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, f1.a.InterfaceC0377a
        public void onAnimationResume(Animator animator) {
            if (this.f30004f) {
                return;
            }
            c0.h(this.f29999a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f30005a;

        /* renamed from: b  reason: collision with root package name */
        boolean f30006b;

        /* renamed from: c  reason: collision with root package name */
        int f30007c;

        /* renamed from: d  reason: collision with root package name */
        int f30008d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f30009e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f30010f;

        c() {
        }
    }

    private void d0(s sVar) {
        sVar.f30062a.put("android:visibility:visibility", Integer.valueOf(sVar.f30063b.getVisibility()));
        sVar.f30062a.put("android:visibility:parent", sVar.f30063b.getParent());
        int[] iArr = new int[2];
        sVar.f30063b.getLocationOnScreen(iArr);
        sVar.f30062a.put("android:visibility:screenLocation", iArr);
    }

    private c e0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f30005a = false;
        cVar.f30006b = false;
        if (sVar != null && sVar.f30062a.containsKey("android:visibility:visibility")) {
            cVar.f30007c = ((Integer) sVar.f30062a.get("android:visibility:visibility")).intValue();
            cVar.f30009e = (ViewGroup) sVar.f30062a.get("android:visibility:parent");
        } else {
            cVar.f30007c = -1;
            cVar.f30009e = null;
        }
        if (sVar2 != null && sVar2.f30062a.containsKey("android:visibility:visibility")) {
            cVar.f30008d = ((Integer) sVar2.f30062a.get("android:visibility:visibility")).intValue();
            cVar.f30010f = (ViewGroup) sVar2.f30062a.get("android:visibility:parent");
        } else {
            cVar.f30008d = -1;
            cVar.f30010f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f30007c;
            int i11 = cVar.f30008d;
            if (i10 == i11 && cVar.f30009e == cVar.f30010f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f30006b = false;
                    cVar.f30005a = true;
                } else if (i11 == 0) {
                    cVar.f30006b = true;
                    cVar.f30005a = true;
                }
            } else if (cVar.f30010f == null) {
                cVar.f30006b = false;
                cVar.f30005a = true;
            } else if (cVar.f30009e == null) {
                cVar.f30006b = true;
                cVar.f30005a = true;
            }
        } else if (sVar == null && cVar.f30008d == 0) {
            cVar.f30006b = true;
            cVar.f30005a = true;
        } else if (sVar2 == null && cVar.f30007c == 0) {
            cVar.f30006b = false;
            cVar.f30005a = true;
        }
        return cVar;
    }

    @Override // f1.m
    public String[] E() {
        return K;
    }

    @Override // f1.m
    public boolean G(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar == null || sVar2 == null || sVar2.f30062a.containsKey("android:visibility:visibility") == sVar.f30062a.containsKey("android:visibility:visibility")) {
            c e02 = e0(sVar, sVar2);
            if (e02.f30005a) {
                return e02.f30007c == 0 || e02.f30008d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // f1.m
    public void f(s sVar) {
        d0(sVar);
    }

    public abstract Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator g0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.J & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f30063b.getParent();
            if (e0(u(view, false), F(view, false)).f30005a) {
                return null;
            }
        }
        return f0(viewGroup, sVar2.f30063b, sVar, sVar2);
    }

    public abstract Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.f30037v != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator i0(android.view.ViewGroup r18, f1.s r19, int r20, f1.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.j0.i0(android.view.ViewGroup, f1.s, int, f1.s, int):android.animation.Animator");
    }

    @Override // f1.m
    public void j(s sVar) {
        d0(sVar);
    }

    public void j0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.J = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // f1.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        c e02 = e0(sVar, sVar2);
        if (e02.f30005a) {
            if (e02.f30009e == null && e02.f30010f == null) {
                return null;
            }
            if (e02.f30006b) {
                return g0(viewGroup, sVar, e02.f30007c, sVar2, e02.f30008d);
            }
            return i0(viewGroup, sVar, e02.f30007c, sVar2, e02.f30008d);
        }
        return null;
    }
}
