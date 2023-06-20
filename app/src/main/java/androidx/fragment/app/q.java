package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import com.amazon.device.ads.DtbDeviceDataRetriever;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final l f3172a;

    /* renamed from: b  reason: collision with root package name */
    private final s f3173b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f3174c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3175d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f3176e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3177a;

        a(q qVar, View view) {
            this.f3177a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3177a.removeOnAttachStateChangeListener(this);
            androidx.core.view.z.n0(this.f3177a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3178a;

        static {
            int[] iArr = new int[i.c.values().length];
            f3178a = iArr;
            try {
                iArr[i.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3178a[i.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3178a[i.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3178a[i.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l lVar, s sVar, Fragment fragment) {
        this.f3172a = lVar;
        this.f3173b = sVar;
        this.f3174c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f3174c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3174c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f3174c.performSaveInstanceState(bundle);
        this.f3172a.j(this.f3174c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3174c.mView != null) {
            t();
        }
        if (this.f3174c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3174c.mSavedViewState);
        }
        if (this.f3174c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3174c.mSavedViewRegistryState);
        }
        if (!this.f3174c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3174c.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        l lVar = this.f3172a;
        Fragment fragment2 = this.f3174c;
        lVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f3173b.j(this.f3174c);
        Fragment fragment = this.f3174c;
        fragment.mContainer.addView(fragment.mView, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        Fragment fragment2 = fragment.mTarget;
        q qVar = null;
        if (fragment2 != null) {
            q m10 = this.f3173b.m(fragment2.mWho);
            if (m10 != null) {
                Fragment fragment3 = this.f3174c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                qVar = m10;
            } else {
                throw new IllegalStateException("Fragment " + this.f3174c + " declared target fragment " + this.f3174c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (qVar = this.f3173b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3174c + " declared target fragment " + this.f3174c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (qVar != null && (FragmentManager.P || qVar.k().mState < 1)) {
            qVar.m();
        }
        Fragment fragment4 = this.f3174c;
        fragment4.mHost = fragment4.mFragmentManager.u0();
        Fragment fragment5 = this.f3174c;
        fragment5.mParentFragment = fragment5.mFragmentManager.x0();
        this.f3172a.g(this.f3174c, false);
        this.f3174c.performAttach();
        this.f3172a.b(this.f3174c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3174c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i10 = this.f3176e;
        int i11 = b.f3178a[fragment2.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        Fragment fragment3 = this.f3174c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i10 = Math.max(this.f3176e, 2);
                View view = this.f3174c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f3176e < 4 ? Math.min(i10, fragment3.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f3174c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        z.e.b bVar = null;
        if (FragmentManager.P && (viewGroup = (fragment = this.f3174c).mContainer) != null) {
            bVar = z.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        }
        if (bVar == z.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == z.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f3174c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f3174c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f3174c);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        if (!fragment.mIsCreated) {
            this.f3172a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f3174c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            l lVar = this.f3172a;
            Fragment fragment3 = this.f3174c;
            lVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f3174c.mState = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        String str;
        if (this.f3174c.mFromLayout) {
            return;
        }
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3174c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.mContainerId;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.o0().c(this.f3174c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f3174c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f3174c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3174c.mContainerId) + " (" + str + ") for fragment " + this.f3174c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3174c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f3174c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3174c.mView;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3174c;
            fragment5.mView.setTag(q0.b.f35761a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f3174c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (androidx.core.view.z.T(this.f3174c.mView)) {
                androidx.core.view.z.n0(this.f3174c.mView);
            } else {
                View view2 = this.f3174c.mView;
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            this.f3174c.performViewCreated();
            l lVar = this.f3172a;
            Fragment fragment7 = this.f3174c;
            lVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3174c.mView.getVisibility();
            float alpha = this.f3174c.mView.getAlpha();
            if (FragmentManager.P) {
                this.f3174c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f3174c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f3174c.setFocusedView(findFocus);
                        if (FragmentManager.G0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3174c);
                        }
                    }
                    this.f3174c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f3174c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z10 = true;
                }
                fragment9.mIsNewlyAdded = z10;
            }
        }
        this.f3174c.mState = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11 || this.f3173b.o().p(this.f3174c)) {
            j<?> jVar = this.f3174c.mHost;
            if (jVar instanceof h0) {
                z10 = this.f3173b.o().m();
            } else if (jVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) jVar.f()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f3173b.o().g(this.f3174c);
            }
            this.f3174c.performDestroy();
            this.f3172a.d(this.f3174c, false);
            for (q qVar : this.f3173b.k()) {
                if (qVar != null) {
                    Fragment k10 = qVar.k();
                    if (this.f3174c.mWho.equals(k10.mTargetWho)) {
                        k10.mTarget = this.f3174c;
                        k10.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f3174c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f3173b.f(str);
            }
            this.f3173b.q(this);
            return;
        }
        String str2 = this.f3174c.mTargetWho;
        if (str2 != null && (f10 = this.f3173b.f(str2)) != null && f10.mRetainInstance) {
            this.f3174c.mTarget = f10;
        }
        this.f3174c.mState = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        View view;
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3174c);
        }
        Fragment fragment = this.f3174c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3174c.performDestroyView();
        this.f3172a.n(this.f3174c, false);
        Fragment fragment2 = this.f3174c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o(null);
        this.f3174c.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3174c);
        }
        this.f3174c.performDetach();
        boolean z10 = false;
        this.f3172a.e(this.f3174c, false);
        Fragment fragment = this.f3174c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f3173b.o().p(this.f3174c)) {
            if (FragmentManager.G0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3174c);
            }
            this.f3174c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f3174c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3174c);
            }
            Fragment fragment2 = this.f3174c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3174c.mSavedFragmentState);
            View view = this.f3174c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3174c;
                fragment3.mView.setTag(q0.b.f35761a, fragment3);
                Fragment fragment4 = this.f3174c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3174c.performViewCreated();
                l lVar = this.f3172a;
                Fragment fragment5 = this.f3174c;
                lVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3174c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.f3174c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3175d) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f3175d = true;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f3174c;
                int i10 = fragment.mState;
                if (d10 == i10) {
                    if (FragmentManager.P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            z n10 = z.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f3174c.mHidden) {
                                n10.c(this);
                            } else {
                                n10.e(this);
                            }
                        }
                        Fragment fragment2 = this.f3174c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.E0(fragment2);
                        }
                        Fragment fragment3 = this.f3174c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                } else if (d10 > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                z.n(viewGroup2, fragment.getParentFragmentManager()).b(z.e.c.b(this.f3174c.mView.getVisibility()), this);
                            }
                            this.f3174c.mState = 4;
                            continue;
                        case 5:
                            v();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f3174c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3174c);
                            }
                            Fragment fragment4 = this.f3174c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment5 = this.f3174c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                z.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.f3174c.mState = 3;
                            continue;
                        case 4:
                            w();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f3175d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3174c);
        }
        this.f3174c.performPause();
        this.f3172a.f(this.f3174c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3174c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3174c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3174c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3174c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f3174c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3174c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3174c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3174c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3174c);
        }
        View focusedView = this.f3174c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.G0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3174c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3174c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3174c.setFocusedView(null);
        this.f3174c.performResume();
        this.f3172a.i(this.f3174c, false);
        Fragment fragment = this.f3174c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment.SavedState r() {
        Bundle q10;
        if (this.f3174c.mState <= -1 || (q10 = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState s() {
        FragmentState fragmentState = new FragmentState(this.f3174c);
        Fragment fragment = this.f3174c;
        if (fragment.mState > -1 && fragmentState.f3082m == null) {
            Bundle q10 = q();
            fragmentState.f3082m = q10;
            if (this.f3174c.mTargetWho != null) {
                if (q10 == null) {
                    fragmentState.f3082m = new Bundle();
                }
                fragmentState.f3082m.putString("android:target_state", this.f3174c.mTargetWho);
                int i10 = this.f3174c.mTargetRequestCode;
                if (i10 != 0) {
                    fragmentState.f3082m.putInt("android:target_req_state", i10);
                }
            }
        } else {
            fragmentState.f3082m = fragment.mSavedFragmentState;
        }
        return fragmentState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        if (this.f3174c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3174c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3174c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3174c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3174c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        this.f3176e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3174c);
        }
        this.f3174c.performStart();
        this.f3172a.k(this.f3174c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3174c);
        }
        this.f3174c.performStop();
        this.f3172a.l(this.f3174c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l lVar, s sVar, ClassLoader classLoader, i iVar, FragmentState fragmentState) {
        this.f3172a = lVar;
        this.f3173b = sVar;
        Fragment a10 = iVar.a(classLoader, fragmentState.f3070a);
        this.f3174c = a10;
        Bundle bundle = fragmentState.f3079j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(fragmentState.f3079j);
        a10.mWho = fragmentState.f3071b;
        a10.mFromLayout = fragmentState.f3072c;
        a10.mRestored = true;
        a10.mFragmentId = fragmentState.f3073d;
        a10.mContainerId = fragmentState.f3074e;
        a10.mTag = fragmentState.f3075f;
        a10.mRetainInstance = fragmentState.f3076g;
        a10.mRemoving = fragmentState.f3077h;
        a10.mDetached = fragmentState.f3078i;
        a10.mHidden = fragmentState.f3080k;
        a10.mMaxState = i.c.values()[fragmentState.f3081l];
        Bundle bundle2 = fragmentState.f3082m;
        if (bundle2 != null) {
            a10.mSavedFragmentState = bundle2;
        } else {
            a10.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(l lVar, s sVar, Fragment fragment, FragmentState fragmentState) {
        this.f3172a = lVar;
        this.f3173b = sVar;
        this.f3174c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3082m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
