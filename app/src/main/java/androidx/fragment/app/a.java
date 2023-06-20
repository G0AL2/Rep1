package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import androidx.lifecycle.i;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends t implements FragmentManager.n {

    /* renamed from: q  reason: collision with root package name */
    final FragmentManager f3083q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3084r;

    /* renamed from: s  reason: collision with root package name */
    int f3085s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FragmentManager fragmentManager) {
        super(fragmentManager.r0(), fragmentManager.u0() != null ? fragmentManager.u0().f().getClassLoader() : null);
        this.f3085s = -1;
        this.f3083q = fragmentManager;
    }

    private static boolean B(t.a aVar) {
        Fragment fragment = aVar.f3206b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f3189a.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f3189a.get(i13).f3206b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f3189a.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f3189a.get(i16).f3206b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C() {
        for (int i10 = 0; i10 < this.f3189a.size(); i10++) {
            if (B(this.f3189a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void D() {
        if (this.f3204p != null) {
            for (int i10 = 0; i10 < this.f3204p.size(); i10++) {
                this.f3204p.get(i10).run();
            }
            this.f3204p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(Fragment.l lVar) {
        for (int i10 = 0; i10 < this.f3189a.size(); i10++) {
            t.a aVar = this.f3189a.get(i10);
            if (B(aVar)) {
                aVar.f3206b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment F(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3189a.size() - 1; size >= 0; size--) {
            t.a aVar = this.f3189a.get(size);
            int i10 = aVar.f3205a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3206b;
                            break;
                        case 10:
                            aVar.f3212h = aVar.f3211g;
                            break;
                    }
                }
                arrayList.add(aVar.f3206b);
            }
            arrayList.remove(aVar.f3206b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3195g) {
            this.f3083q.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.t
    public int g() {
        return s(false);
    }

    @Override // androidx.fragment.app.t
    public int h() {
        return s(true);
    }

    @Override // androidx.fragment.app.t
    public void i() {
        k();
        this.f3083q.c0(this, false);
    }

    @Override // androidx.fragment.app.t
    public void j() {
        k();
        this.f3083q.c0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.t
    public void l(int i10, Fragment fragment, String str, int i11) {
        super.l(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f3083q;
    }

    @Override // androidx.fragment.app.t
    public t m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f3083q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.m(fragment);
    }

    @Override // androidx.fragment.app.t
    public t p(Fragment fragment, i.c cVar) {
        if (fragment.mFragmentManager == this.f3083q) {
            if (cVar == i.c.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != i.c.DESTROYED) {
                return super.p(fragment, cVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3083q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i10) {
        t.a aVar;
        if (this.f3195g) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3189a.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f3189a.get(i11).f3206b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3206b + " to " + aVar.f3206b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int s(boolean z10) {
        if (!this.f3084r) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
                t("  ", printWriter);
                printWriter.close();
            }
            this.f3084r = true;
            if (this.f3195g) {
                this.f3085s = this.f3083q.j();
            } else {
                this.f3085s = -1;
            }
            this.f3083q.Z(this, z10);
            return this.f3085s;
        }
        throw new IllegalStateException("commit already called");
    }

    public void t(String str, PrintWriter printWriter) {
        u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3085s >= 0) {
            sb2.append(" #");
            sb2.append(this.f3085s);
        }
        if (this.f3196h != null) {
            sb2.append(" ");
            sb2.append(this.f3196h);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void u(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3196h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3085s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3084r);
            if (this.f3194f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3194f));
            }
            if (this.f3190b != 0 || this.f3191c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3190b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3191c));
            }
            if (this.f3192d != 0 || this.f3193e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3192d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3193e));
            }
            if (this.f3197i != 0 || this.f3198j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3197i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3198j);
            }
            if (this.f3199k != 0 || this.f3200l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3199k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3200l);
            }
        }
        if (this.f3189a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3189a.size();
        for (int i10 = 0; i10 < size; i10++) {
            t.a aVar = this.f3189a.get(i10);
            switch (aVar.f3205a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3205a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3206b);
            if (z10) {
                if (aVar.f3207c != 0 || aVar.f3208d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3207c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3208d));
                }
                if (aVar.f3209e != 0 || aVar.f3210f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3209e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3210f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        int size = this.f3189a.size();
        for (int i10 = 0; i10 < size; i10++) {
            t.a aVar = this.f3189a.get(i10);
            Fragment fragment = aVar.f3206b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3194f);
                fragment.setSharedElementNames(this.f3201m, this.f3202n);
            }
            switch (aVar.f3205a) {
                case 1:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, false);
                    this.f3083q.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3205a);
                case 3:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.e1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, false);
                    this.f3083q.r1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, false);
                    this.f3083q.l(fragment);
                    break;
                case 8:
                    this.f3083q.p1(fragment);
                    break;
                case 9:
                    this.f3083q.p1(null);
                    break;
                case 10:
                    this.f3083q.o1(fragment, aVar.f3212h);
                    break;
            }
            if (!this.f3203o && aVar.f3205a != 1 && fragment != null && !FragmentManager.P) {
                this.f3083q.Q0(fragment);
            }
        }
        if (this.f3203o || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.f3083q;
        fragmentManager.R0(fragmentManager.f3028q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(boolean z10) {
        for (int size = this.f3189a.size() - 1; size >= 0; size--) {
            t.a aVar = this.f3189a.get(size);
            Fragment fragment = aVar.f3206b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.j1(this.f3194f));
                fragment.setSharedElementNames(this.f3202n, this.f3201m);
            }
            switch (aVar.f3205a) {
                case 1:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, true);
                    this.f3083q.e1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3205a);
                case 3:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.r1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, true);
                    this.f3083q.D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3207c, aVar.f3208d, aVar.f3209e, aVar.f3210f);
                    this.f3083q.n1(fragment, true);
                    this.f3083q.y(fragment);
                    break;
                case 8:
                    this.f3083q.p1(null);
                    break;
                case 9:
                    this.f3083q.p1(fragment);
                    break;
                case 10:
                    this.f3083q.o1(fragment, aVar.f3211g);
                    break;
            }
            if (!this.f3203o && aVar.f3205a != 3 && fragment != null && !FragmentManager.P) {
                this.f3083q.Q0(fragment);
            }
        }
        if (this.f3203o || !z10 || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.f3083q;
        fragmentManager.R0(fragmentManager.f3028q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment x(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f3189a.size()) {
            t.a aVar = this.f3189a.get(i10);
            int i11 = aVar.f3205a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f3206b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3189a.add(i10, new t.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                t.a aVar2 = new t.a(3, fragment4);
                                aVar2.f3207c = aVar.f3207c;
                                aVar2.f3209e = aVar.f3209e;
                                aVar2.f3208d = aVar.f3208d;
                                aVar2.f3210f = aVar.f3210f;
                                this.f3189a.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3189a.remove(i10);
                        i10--;
                    } else {
                        aVar.f3205a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f3206b);
                    Fragment fragment5 = aVar.f3206b;
                    if (fragment5 == fragment2) {
                        this.f3189a.add(i10, new t.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f3189a.add(i10, new t.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f3206b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f3206b);
            i10++;
        }
        return fragment2;
    }

    public String y() {
        return this.f3196h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z(int i10) {
        int size = this.f3189a.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f3189a.get(i11).f3206b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }
}
