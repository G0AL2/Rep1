package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class n extends e0 {

    /* renamed from: j  reason: collision with root package name */
    private static final f0.b f3164j = new a();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3168f;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Fragment> f3165c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, n> f3166d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, g0> f3167e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f3169g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3170h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3171i = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    class a implements f0.b {
        a() {
        }

        @Override // androidx.lifecycle.f0.b
        public <T extends e0> T a(Class<T> cls) {
            return new n(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(boolean z10) {
        this.f3168f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n j(g0 g0Var) {
        return (n) new f0(g0Var, f3164j).a(n.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void d() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3169g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3165c.equals(nVar.f3165c) && this.f3166d.equals(nVar.f3166d) && this.f3167e.equals(nVar.f3167e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f3171i) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f3165c.containsKey(fragment.mWho)) {
        } else {
            this.f3165c.put(fragment.mWho, fragment);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        n nVar = this.f3166d.get(fragment.mWho);
        if (nVar != null) {
            nVar.d();
            this.f3166d.remove(fragment.mWho);
        }
        g0 g0Var = this.f3167e.get(fragment.mWho);
        if (g0Var != null) {
            g0Var.a();
            this.f3167e.remove(fragment.mWho);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f3165c.get(str);
    }

    public int hashCode() {
        return (((this.f3165c.hashCode() * 31) + this.f3166d.hashCode()) * 31) + this.f3167e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n i(Fragment fragment) {
        n nVar = this.f3166d.get(fragment.mWho);
        if (nVar == null) {
            n nVar2 = new n(this.f3168f);
            this.f3166d.put(fragment.mWho, nVar2);
            return nVar2;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.f3165c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0 l(Fragment fragment) {
        g0 g0Var = this.f3167e.get(fragment.mWho);
        if (g0Var == null) {
            g0 g0Var2 = new g0();
            this.f3167e.put(fragment.mWho, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f3169g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (this.f3171i) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3165c.remove(fragment.mWho) != null) && FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.f3171i = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (this.f3165c.containsKey(fragment.mWho)) {
            if (this.f3168f) {
                return this.f3169g;
            }
            return !this.f3170h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f3165c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f3166d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3167e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
