package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: b  reason: collision with root package name */
    int f3190b;

    /* renamed from: c  reason: collision with root package name */
    int f3191c;

    /* renamed from: d  reason: collision with root package name */
    int f3192d;

    /* renamed from: e  reason: collision with root package name */
    int f3193e;

    /* renamed from: f  reason: collision with root package name */
    int f3194f;

    /* renamed from: g  reason: collision with root package name */
    boolean f3195g;

    /* renamed from: h  reason: collision with root package name */
    String f3196h;

    /* renamed from: i  reason: collision with root package name */
    int f3197i;

    /* renamed from: j  reason: collision with root package name */
    CharSequence f3198j;

    /* renamed from: k  reason: collision with root package name */
    int f3199k;

    /* renamed from: l  reason: collision with root package name */
    CharSequence f3200l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<String> f3201m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<String> f3202n;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<Runnable> f3204p;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f3189a = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    boolean f3203o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f3205a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f3206b;

        /* renamed from: c  reason: collision with root package name */
        int f3207c;

        /* renamed from: d  reason: collision with root package name */
        int f3208d;

        /* renamed from: e  reason: collision with root package name */
        int f3209e;

        /* renamed from: f  reason: collision with root package name */
        int f3210f;

        /* renamed from: g  reason: collision with root package name */
        i.c f3211g;

        /* renamed from: h  reason: collision with root package name */
        i.c f3212h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f3205a = i10;
            this.f3206b = fragment;
            i.c cVar = i.c.RESUMED;
            this.f3211g = cVar;
            this.f3212h = cVar;
        }

        a(int i10, Fragment fragment, i.c cVar) {
            this.f3205a = i10;
            this.f3206b = fragment;
            this.f3211g = fragment.mMaxState;
            this.f3212h = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(i iVar, ClassLoader classLoader) {
    }

    public t b(int i10, Fragment fragment) {
        l(i10, fragment, null, 1);
        return this;
    }

    public t c(int i10, Fragment fragment, String str) {
        l(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public t e(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f3189a.add(aVar);
        aVar.f3207c = this.f3190b;
        aVar.f3208d = this.f3191c;
        aVar.f3209e = this.f3192d;
        aVar.f3210f = this.f3193e;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public t k() {
        if (this.f3195g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.mFragmentId;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
                    }
                    fragment.mFragmentId = i10;
                    fragment.mContainerId = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            f(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public t m(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public t n(int i10, Fragment fragment) {
        return o(i10, fragment, null);
    }

    public t o(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            l(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public t p(Fragment fragment, i.c cVar) {
        f(new a(10, fragment, cVar));
        return this;
    }

    public t q(boolean z10) {
        this.f3203o = z10;
        return this;
    }
}
