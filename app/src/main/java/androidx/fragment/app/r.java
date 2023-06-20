package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class r extends androidx.viewpager.widget.a {

    /* renamed from: a  reason: collision with root package name */
    private final FragmentManager f3179a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3180b;

    /* renamed from: c  reason: collision with root package name */
    private t f3181c = null;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f3182d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f3183e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private Fragment f3184f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3185g;

    public r(FragmentManager fragmentManager, int i10) {
        this.f3179a = fragmentManager;
        this.f3180b = i10;
    }

    public abstract Fragment a(int i10);

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3181c == null) {
            this.f3181c = this.f3179a.m();
        }
        while (this.f3182d.size() <= i10) {
            this.f3182d.add(null);
        }
        this.f3182d.set(i10, fragment.isAdded() ? this.f3179a.l1(fragment) : null);
        this.f3183e.set(i10, null);
        this.f3181c.m(fragment);
        if (fragment.equals(this.f3184f)) {
            this.f3184f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(ViewGroup viewGroup) {
        t tVar = this.f3181c;
        if (tVar != null) {
            if (!this.f3185g) {
                try {
                    this.f3185g = true;
                    tVar.j();
                } finally {
                    this.f3185g = false;
                }
            }
            this.f3181c = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3183e.size() <= i10 || (fragment = this.f3183e.get(i10)) == null) {
            if (this.f3181c == null) {
                this.f3181c = this.f3179a.m();
            }
            Fragment a10 = a(i10);
            if (this.f3182d.size() > i10 && (savedState = this.f3182d.get(i10)) != null) {
                a10.setInitialSavedState(savedState);
            }
            while (this.f3183e.size() <= i10) {
                this.f3183e.add(null);
            }
            a10.setMenuVisibility(false);
            if (this.f3180b == 0) {
                a10.setUserVisibleHint(false);
            }
            this.f3183e.set(i10, a10);
            this.f3181c.b(viewGroup.getId(), a10);
            if (this.f3180b == 1) {
                this.f3181c.p(a10, i.c.STARTED);
            }
            return a10;
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3182d.clear();
            this.f3183e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3182d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(InneractiveMediationDefs.GENDER_FEMALE)) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment p02 = this.f3179a.p0(bundle, str);
                    if (p02 != null) {
                        while (this.f3183e.size() <= parseInt) {
                            this.f3183e.add(null);
                        }
                        p02.setMenuVisibility(false);
                        this.f3183e.set(parseInt, p02);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f3182d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3182d.size()];
            this.f3182d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f3183e.size(); i10++) {
            Fragment fragment = this.f3183e.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3179a.c1(bundle, InneractiveMediationDefs.GENDER_FEMALE + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3184f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3180b == 1) {
                    if (this.f3181c == null) {
                        this.f3181c = this.f3179a.m();
                    }
                    this.f3181c.p(this.f3184f, i.c.STARTED);
                } else {
                    this.f3184f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3180b == 1) {
                if (this.f3181c == null) {
                    this.f3181c = this.f3179a.m();
                }
                this.f3181c.p(fragment, i.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3184f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
