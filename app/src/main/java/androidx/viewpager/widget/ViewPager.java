package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.i0;
import androidx.core.view.s;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: l0  reason: collision with root package name */
    static final int[] f4267l0 = {16842931};

    /* renamed from: m0  reason: collision with root package name */
    private static final Comparator<f> f4268m0 = new a();

    /* renamed from: n0  reason: collision with root package name */
    private static final Interpolator f4269n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    private static final m f4270o0 = new m();
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G;
    private VelocityTracker H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private EdgeEffect N;
    private EdgeEffect O;
    private boolean P;
    private boolean Q;
    private int R;
    private List<j> S;
    private j T;
    private j U;
    private List<i> V;
    private k W;

    /* renamed from: a  reason: collision with root package name */
    private int f4271a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f> f4272b;

    /* renamed from: c  reason: collision with root package name */
    private final f f4273c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f4274d;

    /* renamed from: e  reason: collision with root package name */
    androidx.viewpager.widget.a f4275e;

    /* renamed from: f  reason: collision with root package name */
    int f4276f;

    /* renamed from: g  reason: collision with root package name */
    private int f4277g;

    /* renamed from: g0  reason: collision with root package name */
    private int f4278g0;

    /* renamed from: h  reason: collision with root package name */
    private Parcelable f4279h;

    /* renamed from: h0  reason: collision with root package name */
    private int f4280h0;

    /* renamed from: i  reason: collision with root package name */
    private ClassLoader f4281i;

    /* renamed from: i0  reason: collision with root package name */
    private ArrayList<View> f4282i0;

    /* renamed from: j  reason: collision with root package name */
    private Scroller f4283j;

    /* renamed from: j0  reason: collision with root package name */
    private final Runnable f4284j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4285k;

    /* renamed from: k0  reason: collision with root package name */
    private int f4286k0;

    /* renamed from: l  reason: collision with root package name */
    private l f4287l;

    /* renamed from: m  reason: collision with root package name */
    private int f4288m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f4289n;

    /* renamed from: o  reason: collision with root package name */
    private int f4290o;

    /* renamed from: p  reason: collision with root package name */
    private int f4291p;

    /* renamed from: q  reason: collision with root package name */
    private float f4292q;

    /* renamed from: r  reason: collision with root package name */
    private float f4293r;

    /* renamed from: s  reason: collision with root package name */
    private int f4294s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4295t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4296u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4297v;

    /* renamed from: w  reason: collision with root package name */
    private int f4298w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f4299x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4300y;

    /* renamed from: z  reason: collision with root package name */
    private int f4301z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f4302c;

        /* renamed from: d  reason: collision with root package name */
        Parcelable f4303d;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f4304e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4302c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4302c);
            parcel.writeParcelable(this.f4303d, i10);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4302c = parcel.readInt();
            this.f4303d = parcel.readParcelable(classLoader);
            this.f4304e = classLoader;
        }
    }

    /* loaded from: classes.dex */
    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f4309b - fVar2.f4309b;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements s {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f4306a = new Rect();

        d() {
        }

        @Override // androidx.core.view.s
        public i0 a(View view, i0 i0Var) {
            i0 c02 = z.c0(view, i0Var);
            if (c02.n()) {
                return c02;
            }
            Rect rect = this.f4306a;
            rect.left = c02.i();
            rect.top = c02.k();
            rect.right = c02.j();
            rect.bottom = c02.h();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i0 h10 = z.h(ViewPager.this.getChildAt(i10), c02);
                rect.left = Math.min(h10.i(), rect.left);
                rect.top = Math.min(h10.k(), rect.top);
                rect.right = Math.min(h10.j(), rect.right);
                rect.bottom = Math.min(h10.h(), rect.bottom);
            }
            return c02.o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f4308a;

        /* renamed from: b  reason: collision with root package name */
        int f4309b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4310c;

        /* renamed from: d  reason: collision with root package name */
        float f4311d;

        /* renamed from: e  reason: collision with root package name */
        float f4312e;

        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends androidx.core.view.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f4275e;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f4275e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f4276f);
            accessibilityEvent.setToIndex(ViewPager.this.f4276f);
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.a0(ViewPager.class.getName());
            cVar.v0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(Constants.BUFFER_SIZE);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 == 8192 && ViewPager.this.canScrollHorizontally(-1)) {
                    ViewPager viewPager = ViewPager.this;
                    viewPager.setCurrentItem(viewPager.f4276f - 1);
                    return true;
                }
                return false;
            } else if (ViewPager.this.canScrollHorizontally(1)) {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f4276f + 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f4313a;
            if (z10 != gVar2.f4313a) {
                return z10 ? 1 : -1;
            }
            return gVar.f4317e - gVar2.f4317e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f4272b = new ArrayList<>();
        this.f4273c = new f();
        this.f4274d = new Rect();
        this.f4277g = -1;
        this.f4279h = null;
        this.f4281i = null;
        this.f4292q = -3.4028235E38f;
        this.f4293r = Float.MAX_VALUE;
        this.f4298w = 1;
        this.G = -1;
        this.P = true;
        this.f4284j0 = new c();
        this.f4286k0 = 0;
        v();
    }

    private boolean C(int i10) {
        if (this.f4272b.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            y(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f t10 = t();
        int clientWidth = getClientWidth();
        int i11 = this.f4288m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = t10.f4309b;
        float f11 = ((i10 / f10) - t10.f4312e) / (t10.f4311d + (i11 / f10));
        this.Q = false;
        y(i13, f11, (int) (i12 * f11));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.C - f10;
        this.C = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f4292q * clientWidth;
        float f13 = this.f4293r * clientWidth;
        boolean z12 = false;
        f fVar = this.f4272b.get(0);
        ArrayList<f> arrayList = this.f4272b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f4309b != 0) {
            f12 = fVar.f4312e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f4309b != this.f4275e.getCount() - 1) {
            f13 = fVar2.f4312e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.N.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.O.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.C += scrollX - i10;
        scrollTo(i10, getScrollY());
        C(i10);
        return z12;
    }

    private void G(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f4272b.isEmpty()) {
            if (!this.f4283j.isFinished()) {
                this.f4283j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f u10 = u(this.f4276f);
        int min = (int) ((u10 != null ? Math.min(u10.f4312e, this.f4293r) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            g(false);
            scrollTo(min, getScrollY());
        }
    }

    private void H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f4313a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean L() {
        this.G = -1;
        o();
        this.N.onRelease();
        this.O.onRelease();
        return this.N.isFinished() || this.O.isFinished();
    }

    private void M(int i10, boolean z10, int i11, boolean z11) {
        f u10 = u(i10);
        int clientWidth = u10 != null ? (int) (getClientWidth() * Math.max(this.f4292q, Math.min(u10.f4312e, this.f4293r))) : 0;
        if (z10) {
            Q(clientWidth, 0, i11);
            if (z11) {
                k(i10);
                return;
            }
            return;
        }
        if (z11) {
            k(i10);
        }
        g(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    private void R() {
        if (this.f4280h0 != 0) {
            ArrayList<View> arrayList = this.f4282i0;
            if (arrayList == null) {
                this.f4282i0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f4282i0.add(getChildAt(i10));
            }
            Collections.sort(this.f4282i0, f4270o0);
        }
    }

    private void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int count = this.f4275e.getCount();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f4288m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f4309b;
            int i14 = fVar.f4309b;
            if (i13 < i14) {
                int i15 = 0;
                float f11 = fVar2.f4312e + fVar2.f4311d + f10;
                while (true) {
                    i13++;
                    if (i13 > fVar.f4309b || i15 >= this.f4272b.size()) {
                        break;
                    }
                    f fVar5 = this.f4272b.get(i15);
                    while (true) {
                        fVar4 = fVar5;
                        if (i13 <= fVar4.f4309b || i15 >= this.f4272b.size() - 1) {
                            break;
                        }
                        i15++;
                        fVar5 = this.f4272b.get(i15);
                    }
                    while (i13 < fVar4.f4309b) {
                        f11 += this.f4275e.getPageWidth(i13) + f10;
                        i13++;
                    }
                    fVar4.f4312e = f11;
                    f11 += fVar4.f4311d + f10;
                }
            } else if (i13 > i14) {
                int size = this.f4272b.size() - 1;
                float f12 = fVar2.f4312e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f4309b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f4272b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f4309b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f4272b.get(size);
                    }
                    while (i13 > fVar3.f4309b) {
                        f12 -= this.f4275e.getPageWidth(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f4311d + f10;
                    fVar3.f4312e = f12;
                }
            }
        }
        int size2 = this.f4272b.size();
        float f13 = fVar.f4312e;
        int i16 = fVar.f4309b;
        int i17 = i16 - 1;
        this.f4292q = i16 == 0 ? f13 : -3.4028235E38f;
        int i18 = count - 1;
        this.f4293r = i16 == i18 ? (fVar.f4311d + f13) - 1.0f : Float.MAX_VALUE;
        int i19 = i10 - 1;
        while (i19 >= 0) {
            f fVar7 = this.f4272b.get(i19);
            while (true) {
                i12 = fVar7.f4309b;
                if (i17 <= i12) {
                    break;
                }
                f13 -= this.f4275e.getPageWidth(i17) + f10;
                i17--;
            }
            f13 -= fVar7.f4311d + f10;
            fVar7.f4312e = f13;
            if (i12 == 0) {
                this.f4292q = f13;
            }
            i19--;
            i17--;
        }
        float f14 = fVar.f4312e + fVar.f4311d + f10;
        int i20 = fVar.f4309b + 1;
        int i21 = i10 + 1;
        while (i21 < size2) {
            f fVar8 = this.f4272b.get(i21);
            while (true) {
                i11 = fVar8.f4309b;
                if (i20 >= i11) {
                    break;
                }
                f14 += this.f4275e.getPageWidth(i20) + f10;
                i20++;
            }
            if (i11 == i18) {
                this.f4293r = (fVar8.f4311d + f14) - 1.0f;
            }
            fVar8.f4312e = f14;
            f14 += fVar8.f4311d + f10;
            i21++;
            i20++;
        }
    }

    private void g(boolean z10) {
        boolean z11 = this.f4286k0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f4283j.isFinished()) {
                this.f4283j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4283j.getCurrX();
                int currY = this.f4283j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.f4297v = false;
        for (int i10 = 0; i10 < this.f4272b.size(); i10++) {
            f fVar = this.f4272b.get(i10);
            if (fVar.f4310c) {
                fVar.f4310c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                z.i0(this, this.f4284j0);
            } else {
                this.f4284j0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.K || Math.abs(i11) <= this.I) {
            i10 += (int) (f10 + (i10 >= this.f4276f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f4272b.size() > 0) {
            ArrayList<f> arrayList = this.f4272b;
            return Math.max(this.f4272b.get(0).f4309b, Math.min(i10, arrayList.get(arrayList.size() - 1).f4309b));
        }
        return i10;
    }

    private void j(int i10, float f10, int i11) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.onPageScrolled(i10, f10, i11);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.S.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i10, f10, i11);
        }
    }

    private void k(int i10) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.S.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i10);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.onPageSelected(i10);
        }
    }

    private void l(int i10) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.S.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i10);
        }
    }

    private void n(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f4278g0 : 0, null);
        }
    }

    private void o() {
        this.f4299x = false;
        this.f4300y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f4296u != z10) {
            this.f4296u = z10;
        }
    }

    private f t() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f4288m / clientWidth : 0.0f;
        f fVar = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f4272b.size()) {
            f fVar2 = this.f4272b.get(i12);
            if (!z10 && fVar2.f4309b != (i10 = i11 + 1)) {
                fVar2 = this.f4273c;
                fVar2.f4312e = f10 + f12 + f11;
                fVar2.f4309b = i10;
                fVar2.f4311d = this.f4275e.getPageWidth(i10);
                i12--;
            }
            f10 = fVar2.f4312e;
            float f13 = fVar2.f4311d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i12 == this.f4272b.size() - 1) {
                return fVar2;
            }
            i11 = fVar2.f4309b;
            f12 = fVar2.f4311d;
            i12++;
            fVar = fVar2;
            z10 = false;
        }
        return fVar;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f10, float f11) {
        return (f10 < ((float) this.A) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.A)) && f11 < 0.0f);
    }

    private void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i10);
            this.G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() {
        int i10 = this.f4276f;
        if (i10 > 0) {
            N(i10 - 1, true);
            return true;
        }
        return false;
    }

    boolean B() {
        androidx.viewpager.widget.a aVar = this.f4275e;
        if (aVar == null || this.f4276f >= aVar.getCount() - 1) {
            return false;
        }
        N(this.f4276f + 1, true);
        return true;
    }

    void E() {
        F(this.f4276f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void F(int r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public void I(i iVar) {
        List<i> list = this.V;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.S;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void N(int i10, boolean z10) {
        this.f4297v = false;
        O(i10, z10, false);
    }

    void O(int i10, boolean z10, boolean z11) {
        P(i10, z10, z11, 0);
    }

    void P(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f4275e;
        if (aVar != null && aVar.getCount() > 0) {
            if (!z11 && this.f4276f == i10 && this.f4272b.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f4275e.getCount()) {
                i10 = this.f4275e.getCount() - 1;
            }
            int i12 = this.f4298w;
            int i13 = this.f4276f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f4272b.size(); i14++) {
                    this.f4272b.get(i14).f4310c = true;
                }
            }
            boolean z12 = this.f4276f != i10;
            if (this.P) {
                this.f4276f = i10;
                if (z12) {
                    k(i10);
                }
                requestLayout();
                return;
            }
            F(i10);
            M(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    void Q(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4283j;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f4285k ? this.f4283j.getCurrX() : this.f4283j.getStartX();
            this.f4283j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            g(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float m10 = f11 + (m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((f10 * this.f4275e.getPageWidth(this.f4276f)) + this.f4288m)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f4285k = false;
        this.f4283j.startScroll(i13, scrollY, i14, i15, min);
        z.h0(this);
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f4309b = i10;
        fVar.f4308a = this.f4275e.instantiateItem((ViewGroup) this, i10);
        fVar.f4311d = this.f4275e.getPageWidth(i10);
        if (i11 >= 0 && i11 < this.f4272b.size()) {
            this.f4272b.add(i11, fVar);
        } else {
            this.f4272b.add(fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f s10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f4309b == this.f4276f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f s10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f4309b == this.f4276f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean w10 = gVar.f4313a | w(view);
        gVar.f4313a = w10;
        if (!this.f4295t) {
            super.addView(view, i10, layoutParams);
        } else if (!w10) {
            gVar.f4316d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(i iVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(iVar);
    }

    public void c(j jVar) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f4275e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4292q)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f4293r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f4285k = true;
        if (!this.f4283j.isFinished() && this.f4283j.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4283j.getCurrX();
            int currY = this.f4283j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!C(currX)) {
                    this.f4283j.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            z.h0(this);
            return;
        }
        g(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f4274d
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4274d
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.A()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.f4274d
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f4274d
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.B()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.B()
            goto Lcd
        Lc9:
            boolean r2 = r6.A()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f s10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f4309b == this.f4276f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f4275e) == null || aVar.getCount() <= 1)) {
            this.N.finish();
            this.O.finish();
        } else {
            if (!this.N.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f4292q * width);
                this.N.setSize(height, width);
                z10 = false | this.N.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.O.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4293r + 1.0f)) * width2);
                this.O.setSize(height2, width2);
                z10 |= this.O.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            z.h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4289n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f4275e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f4280h0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.f4282i0.get(i11).getLayoutParams()).f4318f;
    }

    public int getCurrentItem() {
        return this.f4276f;
    }

    public int getOffscreenPageLimit() {
        return this.f4298w;
    }

    public int getPageMargin() {
        return this.f4288m;
    }

    void h() {
        int count = this.f4275e.getCount();
        this.f4271a = count;
        boolean z10 = this.f4272b.size() < (this.f4298w * 2) + 1 && this.f4272b.size() < count;
        int i10 = this.f4276f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f4272b.size()) {
            f fVar = this.f4272b.get(i11);
            int itemPosition = this.f4275e.getItemPosition(fVar.f4308a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f4272b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f4275e.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f4275e.destroyItem((ViewGroup) this, fVar.f4309b, fVar.f4308a);
                    int i12 = this.f4276f;
                    if (i12 == fVar.f4309b) {
                        i10 = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = fVar.f4309b;
                    if (i13 != itemPosition) {
                        if (i13 == this.f4276f) {
                            i10 = itemPosition;
                        }
                        fVar.f4309b = itemPosition;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f4275e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f4272b, f4268m0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f4313a) {
                    gVar.f4315c = 0.0f;
                }
            }
            O(i10, false, true);
            requestLayout();
        }
    }

    float m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f4284j0);
        Scroller scroller = this.f4283j;
        if (scroller != null && !scroller.isFinished()) {
            this.f4283j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.f4288m <= 0 || this.f4289n == null || this.f4272b.size() <= 0 || this.f4275e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f12 = this.f4288m / width2;
        int i11 = 0;
        f fVar = this.f4272b.get(0);
        float f13 = fVar.f4312e;
        int size = this.f4272b.size();
        int i12 = fVar.f4309b;
        int i13 = this.f4272b.get(size - 1).f4309b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f4309b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = this.f4272b.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f4312e;
                float f15 = fVar.f4311d;
                f10 = (f14 + f15) * width2;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f4275e.getPageWidth(i12);
                f10 = (f13 + pageWidth) * width2;
                f13 += pageWidth + f12;
            }
            if (this.f4288m + f10 > scrollX) {
                f11 = f12;
                this.f4289n.setBounds(Math.round(f10), this.f4290o, Math.round(this.f4288m + f10), this.f4291p);
                this.f4289n.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f4299x) {
                    return true;
                }
                if (this.f4300y) {
                    return false;
                }
            }
            if (action == 0) {
                float x10 = motionEvent.getX();
                this.E = x10;
                this.C = x10;
                float y10 = motionEvent.getY();
                this.F = y10;
                this.D = y10;
                this.G = motionEvent.getPointerId(0);
                this.f4300y = false;
                this.f4285k = true;
                this.f4283j.computeScrollOffset();
                if (this.f4286k0 == 2 && Math.abs(this.f4283j.getFinalX() - this.f4283j.getCurrX()) > this.L) {
                    this.f4283j.abortAnimation();
                    this.f4297v = false;
                    E();
                    this.f4299x = true;
                    K(true);
                    setScrollState(1);
                } else {
                    g(false);
                    this.f4299x = false;
                }
            } else if (action == 2) {
                int i10 = this.G;
                if (i10 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float f10 = x11 - this.C;
                    float abs = Math.abs(f10);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y11 - this.F);
                    int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i11 != 0 && !x(this.C, f10) && f(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.C = x11;
                        this.D = y11;
                        this.f4300y = true;
                        return false;
                    }
                    int i12 = this.B;
                    if (abs > i12 && abs * 0.5f > abs2) {
                        this.f4299x = true;
                        K(true);
                        setScrollState(1);
                        float f11 = this.E;
                        float f12 = this.B;
                        this.C = i11 > 0 ? f11 + f12 : f11 - f12;
                        this.D = y11;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i12) {
                        this.f4300y = true;
                    }
                    if (this.f4299x && D(x11)) {
                        z.h0(this);
                    }
                }
            } else if (action == 6) {
                z(motionEvent);
            }
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent);
            return this.f4299x;
        }
        L();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        f s10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (s10 = s(childAt)) != null && s10.f4309b == this.f4276f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        androidx.viewpager.widget.a aVar = this.f4275e;
        if (aVar != null) {
            aVar.restoreState(savedState.f4303d, savedState.f4304e);
            O(savedState.f4302c, false, true);
            return;
        }
        this.f4277g = savedState.f4302c;
        this.f4279h = savedState.f4303d;
        this.f4281i = savedState.f4304e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4302c = this.f4276f;
        androidx.viewpager.widget.a aVar = this.f4275e;
        if (aVar != null) {
            savedState.f4303d = aVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f4288m;
            G(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.M) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f4275e) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f4283j.abortAnimation();
            this.f4297v = false;
            E();
            float x10 = motionEvent.getX();
            this.E = x10;
            this.C = x10;
            float y10 = motionEvent.getY();
            this.F = y10;
            this.D = y10;
            this.G = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f4299x) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.G);
                    if (findPointerIndex == -1) {
                        z10 = L();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.C);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.D);
                        if (abs > this.B && abs > abs2) {
                            this.f4299x = true;
                            K(true);
                            float f10 = this.E;
                            this.C = x11 - f10 > 0.0f ? f10 + this.B : f10 - this.B;
                            this.D = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f4299x) {
                    z10 = false | D(motionEvent.getX(motionEvent.findPointerIndex(this.G)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.C = motionEvent.getX(actionIndex);
                    this.G = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    z(motionEvent);
                    this.C = motionEvent.getX(motionEvent.findPointerIndex(this.G));
                }
            } else if (this.f4299x) {
                M(this.f4276f, true, 0, false);
                z10 = L();
            }
        } else if (this.f4299x) {
            VelocityTracker velocityTracker = this.H;
            velocityTracker.computeCurrentVelocity(1000, this.J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.G);
            this.f4297v = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f t10 = t();
            float f11 = clientWidth;
            P(i(t10.f4309b, ((scrollX / f11) - t10.f4312e) / (t10.f4311d + (this.f4288m / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.G)) - this.E)), true, true, xVelocity);
            z10 = L();
        }
        if (z10) {
            z.h0(this);
        }
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return A();
                }
                return d(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return B();
                }
                return d(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    f r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return s(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4295t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    f s(View view) {
        for (int i10 = 0; i10 < this.f4272b.size(); i10++) {
            f fVar = this.f4272b.get(i10);
            if (this.f4275e.isViewFromObject(view, fVar.f4308a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f4275e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f4275e.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f4272b.size(); i10++) {
                f fVar = this.f4272b.get(i10);
                this.f4275e.destroyItem((ViewGroup) this, fVar.f4309b, fVar.f4308a);
            }
            this.f4275e.finishUpdate((ViewGroup) this);
            this.f4272b.clear();
            H();
            this.f4276f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f4275e;
        this.f4275e = aVar;
        this.f4271a = 0;
        if (aVar != null) {
            if (this.f4287l == null) {
                this.f4287l = new l();
            }
            this.f4275e.setViewPagerObserver(this.f4287l);
            this.f4297v = false;
            boolean z10 = this.P;
            this.P = true;
            this.f4271a = this.f4275e.getCount();
            if (this.f4277g >= 0) {
                this.f4275e.restoreState(this.f4279h, this.f4281i);
                O(this.f4277g, false, true);
                this.f4277g = -1;
                this.f4279h = null;
                this.f4281i = null;
            } else if (!z10) {
                E();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.V;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.V.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.V.get(i11).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f4297v = false;
        O(i10, !this.P, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f4298w) {
            this.f4298w = i10;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.T = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f4288m;
        this.f4288m = i10;
        int width = getWidth();
        G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4289n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f4286k0 == i10) {
            return;
        }
        this.f4286k0 = i10;
        if (this.W != null) {
            n(i10 != 0);
        }
        l(i10);
    }

    f u(int i10) {
        for (int i11 = 0; i11 < this.f4272b.size(); i11++) {
            f fVar = this.f4272b.get(i11);
            if (fVar.f4309b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4283j = new Scroller(context, f4269n0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f10);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N = new EdgeEffect(context);
        this.O = new EdgeEffect(context);
        this.K = (int) (25.0f * f10);
        this.L = (int) (2.0f * f10);
        this.f4301z = (int) (f10 * 16.0f);
        z.q0(this, new h());
        if (z.A(this) == 0) {
            z.A0(this, 1);
        }
        z.D0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4289n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f4313a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4314b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.W
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f4313a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.W
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4313a;

        /* renamed from: b  reason: collision with root package name */
        public int f4314b;

        /* renamed from: c  reason: collision with root package name */
        float f4315c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4316d;

        /* renamed from: e  reason: collision with root package name */
        int f4317e;

        /* renamed from: f  reason: collision with root package name */
        int f4318f;

        public g() {
            super(-1, -1);
            this.f4315c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4315c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4267l0);
            this.f4314b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.b.f(getContext(), i10));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4272b = new ArrayList<>();
        this.f4273c = new f();
        this.f4274d = new Rect();
        this.f4277g = -1;
        this.f4279h = null;
        this.f4281i = null;
        this.f4292q = -3.4028235E38f;
        this.f4293r = Float.MAX_VALUE;
        this.f4298w = 1;
        this.G = -1;
        this.P = true;
        this.f4284j0 = new c();
        this.f4286k0 = 0;
        v();
    }
}
