package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f3186a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, q> f3187b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private n f3188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f3186a.contains(fragment)) {
            synchronized (this.f3186a) {
                this.f3186a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f3187b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f3187b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        for (q qVar : this.f3187b.values()) {
            if (qVar != null) {
                qVar.u(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3187b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q qVar : this.f3187b.values()) {
                printWriter.print(str);
                if (qVar != null) {
                    Fragment k10 = qVar.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3186a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3186a.get(i10).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        q qVar = this.f3187b.get(str);
        if (qVar != null) {
            return qVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f3186a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3186a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (q qVar : this.f3187b.values()) {
            if (qVar != null) {
                Fragment k10 = qVar.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f3186a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3186a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (q qVar : this.f3187b.values()) {
                if (qVar != null) {
                    Fragment k10 = qVar.k();
                    if (str.equals(k10.mTag)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (q qVar : this.f3187b.values()) {
            if (qVar != null && (findFragmentByWho = qVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3186a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f3186a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3186a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3186a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<q> k() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.f3187b.values()) {
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.f3187b.values()) {
            if (qVar != null) {
                arrayList.add(qVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q m(String str) {
        return this.f3187b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f3186a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3186a) {
            arrayList = new ArrayList(this.f3186a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n o() {
        return this.f3188c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(q qVar) {
        Fragment k10 = qVar.k();
        if (c(k10.mWho)) {
            return;
        }
        this.f3187b.put(k10.mWho, qVar);
        if (k10.mRetainInstanceChangedWhileDetached) {
            if (k10.mRetainInstance) {
                this.f3188c.f(k10);
            } else {
                this.f3188c.n(k10);
            }
            k10.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(q qVar) {
        Fragment k10 = qVar.k();
        if (k10.mRetainInstance) {
            this.f3188c.n(k10);
        }
        if (this.f3187b.put(k10.mWho, null) != null && FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.f3186a.iterator();
        while (it.hasNext()) {
            q qVar = this.f3187b.get(it.next().mWho);
            if (qVar != null) {
                qVar.m();
            }
        }
        for (q qVar2 : this.f3187b.values()) {
            if (qVar2 != null) {
                qVar2.m();
                Fragment k10 = qVar2.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    q(qVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f3186a) {
            this.f3186a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f3187b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f3186a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 != null) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<FragmentState> v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3187b.size());
        for (q qVar : this.f3187b.values()) {
            if (qVar != null) {
                Fragment k10 = qVar.k();
                FragmentState s10 = qVar.s();
                arrayList.add(s10);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + s10.f3082m);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f3186a) {
            if (this.f3186a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3186a.size());
            Iterator<Fragment> it = this.f3186a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(n nVar) {
        this.f3188c = nVar;
    }
}
