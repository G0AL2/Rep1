package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.t;
import androidx.fragment.app.u;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.b<IntentSenderRequest> A;
    private androidx.activity.result.b<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<p> L;
    private androidx.fragment.app.n M;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3013b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f3015d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f3016e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f3018g;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<m> f3023l;

    /* renamed from: r  reason: collision with root package name */
    private androidx.fragment.app.j<?> f3029r;

    /* renamed from: s  reason: collision with root package name */
    private androidx.fragment.app.f f3030s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f3031t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f3032u;

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.b<Intent> f3037z;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<n> f3012a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final s f3014c = new s();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.k f3017f = new androidx.fragment.app.k(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f3019h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f3020i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Bundle> f3021j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f3022k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<e0.b>> f3024m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final u.g f3025n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final androidx.fragment.app.l f3026o = new androidx.fragment.app.l(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.fragment.app.o> f3027p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f3028q = -1;

    /* renamed from: v  reason: collision with root package name */
    private androidx.fragment.app.i f3033v = null;

    /* renamed from: w  reason: collision with root package name */
    private androidx.fragment.app.i f3034w = new e();

    /* renamed from: x  reason: collision with root package name */
    private a0 f3035x = null;

    /* renamed from: y  reason: collision with root package name */
    private a0 f3036y = new f(this);
    ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements androidx.lifecycle.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.p f3039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.i f3040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FragmentManager f3041d;

        @Override // androidx.lifecycle.m
        public void b(androidx.lifecycle.p pVar, i.b bVar) {
            Bundle bundle;
            if (bVar == i.b.ON_START && (bundle = (Bundle) this.f3041d.f3021j.get(this.f3038a)) != null) {
                this.f3039b.a(this.f3038a, bundle);
                this.f3041d.r(this.f3038a);
            }
            if (bVar == i.b.ON_DESTROY) {
                this.f3040c.c(this);
                this.f3041d.f3022k.remove(this.f3038a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3042a;
            int i10 = pollFirst.f3043b;
            Fragment i11 = FragmentManager.this.f3014c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, activityResult.e(), activityResult.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.a<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3042a;
            int i11 = pollFirst.f3043b;
            Fragment i12 = FragmentManager.this.f3014c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i12.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.activity.b {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.b
        public void b() {
            FragmentManager.this.C0();
        }
    }

    /* loaded from: classes.dex */
    class d implements u.g {
        d() {
        }

        @Override // androidx.fragment.app.u.g
        public void a(Fragment fragment, e0.b bVar) {
            if (bVar.c()) {
                return;
            }
            FragmentManager.this.d1(fragment, bVar);
        }

        @Override // androidx.fragment.app.u.g
        public void b(Fragment fragment, e0.b bVar) {
            FragmentManager.this.f(fragment, bVar);
        }
    }

    /* loaded from: classes.dex */
    class e extends androidx.fragment.app.i {
        e() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.u0().b(FragmentManager.this.u0().f(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class f implements a0 {
        f(FragmentManager fragmentManager) {
        }

        @Override // androidx.fragment.app.a0
        public z a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3052c;

        h(FragmentManager fragmentManager, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3050a = viewGroup;
            this.f3051b = view;
            this.f3052c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3050a.endViewTransition(this.f3051b);
            animator.removeListener(this);
            Fragment fragment = this.f3052c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements androidx.fragment.app.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3053a;

        i(FragmentManager fragmentManager, Fragment fragment) {
            this.f3053a = fragment;
        }

        @Override // androidx.fragment.app.o
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3053a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements androidx.activity.result.a<ActivityResult> {
        j() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3042a;
            int i10 = pollFirst.f3043b;
            Fragment i11 = FragmentManager.this.f3014c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, activityResult.e(), activityResult.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends c.a<IntentSenderRequest, ActivityResult> {
        k() {
        }

        @Override // c.a
        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent c10 = intentSenderRequest.c();
            if (c10 != null && (bundleExtra = c10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                c10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (c10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.g()).b(null).c(intentSenderRequest.f(), intentSenderRequest.e()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        /* renamed from: e */
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
    }

    /* loaded from: classes.dex */
    public interface m {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class o implements n {

        /* renamed from: a  reason: collision with root package name */
        final String f3055a;

        /* renamed from: b  reason: collision with root package name */
        final int f3056b;

        /* renamed from: c  reason: collision with root package name */
        final int f3057c;

        o(String str, int i10, int i11) {
            this.f3055a = str;
            this.f3056b = i10;
            this.f3057c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3032u;
            if (fragment == null || this.f3056b >= 0 || this.f3055a != null || !fragment.getChildFragmentManager().Y0()) {
                return FragmentManager.this.a1(arrayList, arrayList2, this.f3055a, this.f3056b, this.f3057c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p implements Fragment.l {

        /* renamed from: a  reason: collision with root package name */
        final boolean f3059a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.fragment.app.a f3060b;

        /* renamed from: c  reason: collision with root package name */
        private int f3061c;

        p(androidx.fragment.app.a aVar, boolean z10) {
            this.f3059a = z10;
            this.f3060b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            this.f3061c++;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            int i10 = this.f3061c - 1;
            this.f3061c = i10;
            if (i10 != 0) {
                return;
            }
            this.f3060b.f3083q.m1();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f3060b;
            aVar.f3083q.u(aVar, this.f3059a, false, false);
        }

        void d() {
            boolean z10 = this.f3061c > 0;
            for (Fragment fragment : this.f3060b.f3083q.t0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z10 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            androidx.fragment.app.a aVar = this.f3060b;
            aVar.f3083q.u(aVar, this.f3059a, !z10, true);
        }

        public boolean e() {
            return this.f3061c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment A0(View view) {
        Object tag = view.getTag(q0.b.f35761a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean G0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void P0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment j10 = bVar.j(i10);
            if (!j10.mAdded) {
                View requireView = j10.requireView();
                j10.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private void T(int i10) {
        try {
            this.f3013b = true;
            this.f3014c.d(i10);
            R0(i10, false);
            if (P) {
                for (z zVar : s()) {
                    zVar.j();
                }
            }
            this.f3013b = false;
            b0(true);
        } catch (Throwable th) {
            this.f3013b = false;
            throw th;
        }
    }

    private void W() {
        if (this.H) {
            this.H = false;
            s1();
        }
    }

    private void Y() {
        if (P) {
            for (z zVar : s()) {
                zVar.j();
            }
        } else if (!this.f3024m.isEmpty()) {
            for (Fragment fragment : this.f3024m.keySet()) {
                n(fragment);
                S0(fragment);
            }
        }
    }

    private boolean Z0(String str, int i10, int i11) {
        b0(false);
        a0(true);
        Fragment fragment = this.f3032u;
        if (fragment == null || i10 >= 0 || str != null || !fragment.getChildFragmentManager().Y0()) {
            boolean a12 = a1(this.I, this.J, str, i10, i11);
            if (a12) {
                this.f3013b = true;
                try {
                    f1(this.I, this.J);
                } finally {
                    q();
                }
            }
            u1();
            W();
            this.f3014c.b();
            return a12;
        }
        return true;
    }

    private void a0(boolean z10) {
        if (!this.f3013b) {
            if (this.f3029r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f3029r.g().getLooper()) {
                if (!z10) {
                    p();
                }
                if (this.I == null) {
                    this.I = new ArrayList<>();
                    this.J = new ArrayList<>();
                }
                this.f3013b = true;
                try {
                    f0(null, null);
                    return;
                } finally {
                    this.f3013b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private int b1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.C() && !aVar.A(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                p pVar = new p(aVar, booleanValue);
                this.L.add(pVar);
                aVar.E(pVar);
                if (booleanValue) {
                    aVar.v();
                } else {
                    aVar.w(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f3028q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment.mState < min) {
                T0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.r(-1);
                aVar.w(i10 == i11 + (-1));
            } else {
                aVar.r(1);
                aVar.v();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<p> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.L.get(i10);
            if (arrayList != null && !pVar.f3059a && (indexOf2 = arrayList.indexOf(pVar.f3060b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i10);
                i10--;
                size--;
                pVar.c();
            } else if (pVar.e() || (arrayList != null && pVar.f3060b.A(arrayList, 0, arrayList.size()))) {
                this.L.remove(i10);
                i10--;
                size--;
                if (arrayList != null && !pVar.f3059a && (indexOf = arrayList.indexOf(pVar.f3060b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    pVar.c();
                } else {
                    pVar.d();
                }
            }
            i10++;
        }
    }

    private void f1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            f0(arrayList, arrayList2);
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f3203o) {
                    if (i11 != i10) {
                        e0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3203o) {
                            i11++;
                        }
                    }
                    e0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                e0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void h1() {
        if (this.f3023l != null) {
            for (int i10 = 0; i10 < this.f3023l.size(); i10++) {
                this.f3023l.get(i10).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j1(int i10) {
        if (i10 != 4097) {
            if (i10 != 4099) {
                return i10 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    private void k0() {
        if (P) {
            for (z zVar : s()) {
                zVar.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3012a) {
            if (this.f3012a.isEmpty()) {
                return false;
            }
            int size = this.f3012a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f3012a.get(i10).a(arrayList, arrayList2);
            }
            this.f3012a.clear();
            this.f3029r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    private void n(Fragment fragment) {
        HashSet<e0.b> hashSet = this.f3024m.get(fragment);
        if (hashSet != null) {
            Iterator<e0.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            x(fragment);
            this.f3024m.remove(fragment);
        }
    }

    private androidx.fragment.app.n n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void p() {
        if (L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q() {
        this.f3013b = false;
        this.J.clear();
        this.I.clear();
    }

    private ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3030s.d()) {
            View c10 = this.f3030s.c(fragment.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void q1(Fragment fragment) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = q0.b.f35763c;
        if (q02.getTag(i10) == null) {
            q02.setTag(i10, fragment);
        }
        ((Fragment) q02.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    private Set<z> s() {
        HashSet hashSet = new HashSet();
        for (q qVar : this.f3014c.k()) {
            ViewGroup viewGroup = qVar.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(z.o(viewGroup, z0()));
            }
        }
        return hashSet;
    }

    private void s1() {
        for (q qVar : this.f3014c.k()) {
            W0(qVar);
        }
    }

    private Set<z> t(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<t.a> it = arrayList.get(i10).f3189a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3206b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(z.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void t1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
        androidx.fragment.app.j<?> jVar = this.f3029r;
        if (jVar != null) {
            try {
                jVar.h("  ", null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                X("  ", null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    private void u1() {
        synchronized (this.f3012a) {
            boolean z10 = true;
            if (!this.f3012a.isEmpty()) {
                this.f3019h.f(true);
            } else {
                this.f3019h.f((m0() <= 0 || !J0(this.f3031t)) ? false : false);
            }
        }
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            e.d c10 = androidx.fragment.app.e.c(this.f3029r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c10 != null && (animator = c10.f3141b) != null) {
                animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        c10.f3141b.addListener(new h(this, viewGroup, view, fragment));
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                c10.f3141b.start();
            } else {
                if (c10 != null) {
                    fragment.mView.startAnimation(c10.f3140a);
                    c10.f3140a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        E0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void x(Fragment fragment) {
        fragment.performDestroyView();
        this.f3026o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.o(null);
        fragment.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Configuration configuration) {
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0 B0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f3028q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void C0() {
        b0(true);
        if (this.f3019h.c()) {
            Y0();
        } else {
            this.f3018g.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        q1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f3028q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null && I0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f3016e != null) {
            for (int i10 = 0; i10 < this.f3016e.size(); i10++) {
                Fragment fragment2 = this.f3016e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3016e = arrayList;
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(Fragment fragment) {
        if (fragment.mAdded && H0(fragment)) {
            this.D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.f3029r = null;
        this.f3030s = null;
        this.f3031t = null;
        if (this.f3018g != null) {
            this.f3019h.d();
            this.f3018g = null;
        }
        androidx.activity.result.b<Intent> bVar = this.f3037z;
        if (bVar != null) {
            bVar.c();
            this.A.c();
            this.B.c();
        }
    }

    public boolean F0() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z10) {
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<androidx.fragment.app.o> it = this.f3027p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.y0()) && J0(fragmentManager.f3031t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K(MenuItem menuItem) {
        if (this.f3028q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K0(int i10) {
        return this.f3028q >= i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Menu menu) {
        if (this.f3028q < 1) {
            return;
        }
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean L0() {
        return this.E || this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0(Fragment fragment, String[] strArr, int i10) {
        if (this.B != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            this.B.a(strArr);
            return;
        }
        this.f3029r.k(fragment, strArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3037z != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3037z.a(intent);
            return;
        }
        this.f3029r.n(fragment, intent, i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(boolean z10) {
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.A != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (G0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest a10 = new IntentSenderRequest.b(intentSender).b(intent2).c(i12, i11).a();
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (G0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.A.a(a10);
            return;
        }
        this.f3029r.o(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f3028q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null && I0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        u1();
        M(this.f3032u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(Fragment fragment) {
        if (!this.f3014c.c(fragment.mWho)) {
            if (G0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3028q + "since it is not added to " + this);
                return;
            }
            return;
        }
        S0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f10 = fragment.mPostponedAlpha;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            e.d c10 = androidx.fragment.app.e.c(this.f3029r.f(), fragment, true, fragment.getPopDirection());
            if (c10 != null) {
                Animation animation = c10.f3140a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    c10.f3141b.setTarget(fragment.mView);
                    c10.f3141b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            v(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0(int i10, boolean z10) {
        androidx.fragment.app.j<?> jVar;
        if (this.f3029r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f3028q) {
            this.f3028q = i10;
            if (P) {
                this.f3014c.r();
            } else {
                for (Fragment fragment : this.f3014c.n()) {
                    Q0(fragment);
                }
                for (q qVar : this.f3014c.k()) {
                    Fragment k10 = qVar.k();
                    if (!k10.mIsNewlyAdded) {
                        Q0(k10);
                    }
                    if (k10.mRemoving && !k10.isInBackStack()) {
                        this.f3014c.q(qVar);
                    }
                }
            }
            s1();
            if (this.D && (jVar = this.f3029r) != null && this.f3028q == 7) {
                jVar.p();
                this.D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(Fragment fragment) {
        T0(fragment, this.f3028q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void T0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.T0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.F = true;
        this.M.o(true);
        T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0() {
        if (this.f3029r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.f3014c.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        T(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0(androidx.fragment.app.g gVar) {
        View view;
        for (q qVar : this.f3014c.k()) {
            Fragment k10 = qVar.k();
            if (k10.mContainerId == gVar.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = gVar;
                qVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(q qVar) {
        Fragment k10 = qVar.k();
        if (k10.mDeferStart) {
            if (this.f3013b) {
                this.H = true;
                return;
            }
            k10.mDeferStart = false;
            if (P) {
                qVar.m();
            } else {
                S0(k10);
            }
        }
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3014c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3016e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3016e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f3015d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f3015d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3020i.get());
        synchronized (this.f3012a) {
            int size3 = this.f3012a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f3012a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3029r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3030s);
        if (this.f3031t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3031t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3028q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public void X0(int i10, int i11) {
        if (i10 >= 0) {
            Z(new o(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean Y0() {
        return Z0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(n nVar, boolean z10) {
        if (!z10) {
            if (this.f3029r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            p();
        }
        synchronized (this.f3012a) {
            if (this.f3029r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f3012a.add(nVar);
            m1();
        }
    }

    boolean a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f3015d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3015d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f3015d.get(size2);
                    if ((str != null && str.equals(aVar.y())) || (i10 >= 0 && i10 == aVar.f3085s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f3015d.get(size2);
                        if (str == null || !str.equals(aVar2.y())) {
                            if (i10 < 0 || i10 != aVar2.f3085s) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f3015d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3015d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f3015d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (l0(this.I, this.J)) {
            this.f3013b = true;
            try {
                f1(this.I, this.J);
                q();
                z11 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        u1();
        W();
        this.f3014c.b();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(n nVar, boolean z10) {
        if (z10 && (this.f3029r == null || this.G)) {
            return;
        }
        a0(z10);
        if (nVar.a(this.I, this.J)) {
            this.f3013b = true;
            try {
                f1(this.I, this.J);
            } finally {
                q();
            }
        }
        u1();
        W();
        this.f3014c.b();
    }

    public void c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            t1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    void d1(Fragment fragment, e0.b bVar) {
        HashSet<e0.b> hashSet = this.f3024m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3024m.remove(fragment);
            if (fragment.mState < 5) {
                x(fragment);
                S0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(androidx.fragment.app.a aVar) {
        if (this.f3015d == null) {
            this.f3015d = new ArrayList<>();
        }
        this.f3015d.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f3014c.s(fragment);
            if (H0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            q1(fragment);
        }
    }

    void f(Fragment fragment, e0.b bVar) {
        if (this.f3024m.get(fragment) == null) {
            this.f3024m.put(fragment, new HashSet<>());
        }
        this.f3024m.get(fragment).add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q g(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        q w10 = w(fragment);
        fragment.mFragmentManager = this;
        this.f3014c.p(w10);
        if (!fragment.mDetached) {
            this.f3014c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H0(fragment)) {
                this.D = true;
            }
        }
        return w10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.f3014c.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g1(Fragment fragment) {
        this.M.n(fragment);
    }

    public void h(androidx.fragment.app.o oVar) {
        this.f3027p.add(oVar);
    }

    public Fragment h0(int i10) {
        return this.f3014c.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment i0(String str) {
        return this.f3014c.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(Parcelable parcelable) {
        q qVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3062a == null) {
            return;
        }
        this.f3014c.t();
        Iterator<FragmentState> it = fragmentManagerState.f3062a.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment h10 = this.M.h(next.f3071b);
                if (h10 != null) {
                    if (G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h10);
                    }
                    qVar = new q(this.f3026o, this.f3014c, h10, next);
                } else {
                    qVar = new q(this.f3026o, this.f3014c, this.f3029r.f().getClassLoader(), r0(), next);
                }
                Fragment k10 = qVar.k();
                k10.mFragmentManager = this;
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                }
                qVar.o(this.f3029r.f().getClassLoader());
                this.f3014c.p(qVar);
                qVar.u(this.f3028q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f3014c.c(fragment.mWho)) {
                if (G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3062a);
                }
                this.M.n(fragment);
                fragment.mFragmentManager = this;
                q qVar2 = new q(this.f3026o, this.f3014c, fragment);
                qVar2.u(1);
                qVar2.m();
                fragment.mRemoving = true;
                qVar2.m();
            }
        }
        this.f3014c.u(fragmentManagerState.f3063b);
        if (fragmentManagerState.f3064c != null) {
            this.f3015d = new ArrayList<>(fragmentManagerState.f3064c.length);
            int i10 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3064c;
                if (i10 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a c10 = backStackStateArr[i10].c(this);
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c10.f3085s + "): " + c10);
                    PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
                    c10.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3015d.add(c10);
                i10++;
            }
        } else {
            this.f3015d = null;
        }
        this.f3020i.set(fragmentManagerState.f3065d);
        String str = fragmentManagerState.f3066e;
        if (str != null) {
            Fragment g02 = g0(str);
            this.f3032u = g02;
            M(g02);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3067f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = fragmentManagerState.f3068g.get(i11);
                bundle.setClassLoader(this.f3029r.f().getClassLoader());
                this.f3021j.put(arrayList.get(i11), bundle);
            }
        }
        this.C = new ArrayDeque<>(fragmentManagerState.f3069h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f3020i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.f3014c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    public void k(androidx.fragment.app.j<?> jVar, androidx.fragment.app.f fVar, Fragment fragment) {
        String str;
        if (this.f3029r == null) {
            this.f3029r = jVar;
            this.f3030s = fVar;
            this.f3031t = fragment;
            if (fragment != null) {
                h(new i(this, fragment));
            } else if (jVar instanceof androidx.fragment.app.o) {
                h((androidx.fragment.app.o) jVar);
            }
            if (this.f3031t != null) {
                u1();
            }
            if (jVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) jVar;
                OnBackPressedDispatcher onBackPressedDispatcher = cVar.getOnBackPressedDispatcher();
                this.f3018g = onBackPressedDispatcher;
                androidx.lifecycle.p pVar = cVar;
                if (fragment != null) {
                    pVar = fragment;
                }
                onBackPressedDispatcher.a(pVar, this.f3019h);
            }
            if (fragment != null) {
                this.M = fragment.mFragmentManager.n0(fragment);
            } else if (jVar instanceof h0) {
                this.M = androidx.fragment.app.n.j(((h0) jVar).getViewModelStore());
            } else {
                this.M = new androidx.fragment.app.n(false);
            }
            this.M.o(L0());
            this.f3014c.x(this.M);
            androidx.fragment.app.j<?> jVar2 = this.f3029r;
            if (jVar2 instanceof androidx.activity.result.c) {
                ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) jVar2).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f3037z = activityResultRegistry.j(str2 + "StartActivityForResult", new c.c(), new j());
                this.A = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new k(), new a());
                this.B = activityResultRegistry.j(str2 + "RequestPermissions", new c.b(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable k1() {
        int size;
        k0();
        Y();
        b0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<FragmentState> v10 = this.f3014c.v();
        BackStackState[] backStackStateArr = null;
        if (v10.isEmpty()) {
            if (G0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w10 = this.f3014c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f3015d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackStateArr[i10] = new BackStackState(this.f3015d.get(i10));
                if (G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3015d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3062a = v10;
        fragmentManagerState.f3063b = w10;
        fragmentManagerState.f3064c = backStackStateArr;
        fragmentManagerState.f3065d = this.f3020i.get();
        Fragment fragment = this.f3032u;
        if (fragment != null) {
            fragmentManagerState.f3066e = fragment.mWho;
        }
        fragmentManagerState.f3067f.addAll(this.f3021j.keySet());
        fragmentManagerState.f3068g.addAll(this.f3021j.values());
        fragmentManagerState.f3069h = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3014c.a(fragment);
            if (G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H0(fragment)) {
                this.D = true;
            }
        }
    }

    public Fragment.SavedState l1(Fragment fragment) {
        q m10 = this.f3014c.m(fragment.mWho);
        if (m10 == null || !m10.k().equals(fragment)) {
            t1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m10.r();
    }

    public t m() {
        return new androidx.fragment.app.a(this);
    }

    public int m0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f3015d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void m1() {
        synchronized (this.f3012a) {
            ArrayList<p> arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f3012a.size() == 1;
            if (z10 || z11) {
                this.f3029r.g().removeCallbacks(this.N);
                this.f3029r.g().post(this.N);
                u1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1(Fragment fragment, boolean z10) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || !(q02 instanceof androidx.fragment.app.g)) {
            return;
        }
        ((androidx.fragment.app.g) q02).setDrawDisappearingViewsLast(!z10);
    }

    boolean o() {
        boolean z10 = false;
        for (Fragment fragment : this.f3014c.l()) {
            if (fragment != null) {
                z10 = H0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.f o0() {
        return this.f3030s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o1(Fragment fragment, i.c cVar) {
        if (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public Fragment p0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment g02 = g0(string);
        if (g02 == null) {
            t1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return g02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(g0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3032u;
        this.f3032u = fragment;
        M(fragment2);
        M(this.f3032u);
    }

    public final void r(String str) {
        this.f3021j.remove(str);
    }

    public androidx.fragment.app.i r0() {
        androidx.fragment.app.i iVar = this.f3033v;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.f3031t;
        if (fragment != null) {
            return fragment.mFragmentManager.r0();
        }
        return this.f3034w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s s0() {
        return this.f3014c;
    }

    public List<Fragment> t0() {
        return this.f3014c.n();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3031t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3031t)));
            sb2.append("}");
        } else {
            androidx.fragment.app.j<?> jVar = this.f3029r;
            if (jVar != null) {
                sb2.append(jVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3029r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    void u(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.w(z12);
        } else {
            aVar.v();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f3028q >= 1) {
            u.B(this.f3029r.f(), this.f3030s, arrayList, arrayList2, 0, 1, true, this.f3025n);
        }
        if (z12) {
            R0(this.f3028q, true);
        }
        for (Fragment fragment : this.f3014c.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.z(fragment.mContainerId)) {
                float f10 = fragment.mPostponedAlpha;
                if (f10 > 0.0f) {
                    fragment.mView.setAlpha(f10);
                }
                if (z12) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.j<?> u0() {
        return this.f3029r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 v0() {
        return this.f3017f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q w(Fragment fragment) {
        q m10 = this.f3014c.m(fragment.mWho);
        if (m10 != null) {
            return m10;
        }
        q qVar = new q(this.f3026o, this.f3014c, fragment);
        qVar.o(this.f3029r.f().getClassLoader());
        qVar.u(this.f3028q);
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.l w0() {
        return this.f3026o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment x0() {
        return this.f3031t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3014c.s(fragment);
            if (H0(fragment)) {
                this.D = true;
            }
            q1(fragment);
        }
    }

    public Fragment y0() {
        return this.f3032u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 z0() {
        a0 a0Var = this.f3035x;
        if (a0Var != null) {
            return a0Var;
        }
        Fragment fragment = this.f3031t;
        if (fragment != null) {
            return fragment.mFragmentManager.z0();
        }
        return this.f3036y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f3042a;

        /* renamed from: b  reason: collision with root package name */
        int f3043b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(String str, int i10) {
            this.f3042a = str;
            this.f3043b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3042a);
            parcel.writeInt(this.f3043b);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3042a = parcel.readString();
            this.f3043b = parcel.readInt();
        }
    }
}
