package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s.d;
import s.e;
import t.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: t  reason: collision with root package name */
    private static l f1988t;

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f1989a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.c> f1990b;

    /* renamed from: c  reason: collision with root package name */
    protected s.f f1991c;

    /* renamed from: d  reason: collision with root package name */
    private int f1992d;

    /* renamed from: e  reason: collision with root package name */
    private int f1993e;

    /* renamed from: f  reason: collision with root package name */
    private int f1994f;

    /* renamed from: g  reason: collision with root package name */
    private int f1995g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f1996h;

    /* renamed from: i  reason: collision with root package name */
    private int f1997i;

    /* renamed from: j  reason: collision with root package name */
    private e f1998j;

    /* renamed from: k  reason: collision with root package name */
    protected d f1999k;

    /* renamed from: l  reason: collision with root package name */
    private int f2000l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, Integer> f2001m;

    /* renamed from: n  reason: collision with root package name */
    private int f2002n;

    /* renamed from: o  reason: collision with root package name */
    private int f2003o;

    /* renamed from: p  reason: collision with root package name */
    private SparseArray<s.e> f2004p;

    /* renamed from: q  reason: collision with root package name */
    c f2005q;

    /* renamed from: r  reason: collision with root package name */
    private int f2006r;

    /* renamed from: s  reason: collision with root package name */
    private int f2007s;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2008a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2008a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2008a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2008a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2008a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0502b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f2054a;

        /* renamed from: b  reason: collision with root package name */
        int f2055b;

        /* renamed from: c  reason: collision with root package name */
        int f2056c;

        /* renamed from: d  reason: collision with root package name */
        int f2057d;

        /* renamed from: e  reason: collision with root package name */
        int f2058e;

        /* renamed from: f  reason: collision with root package name */
        int f2059f;

        /* renamed from: g  reason: collision with root package name */
        int f2060g;

        public c(ConstraintLayout constraintLayout) {
            this.f2054a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // t.b.InterfaceC0502b
        public final void a() {
            int childCount = this.f2054a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2054a.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f2054a);
                }
            }
            int size = this.f2054a.f1990b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f2054a.f1990b.get(i11)).p(this.f2054a);
                }
            }
        }

        @Override // t.b.InterfaceC0502b
        @SuppressLint({"WrongCall"})
        public final void b(s.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i10;
            int i11;
            int i12;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.f37004e = 0;
                aVar.f37005f = 0;
                aVar.f37006g = 0;
            } else if (eVar.I() == null) {
            } else {
                e.b bVar = aVar.f37000a;
                e.b bVar2 = aVar.f37001b;
                int i13 = aVar.f37002c;
                int i14 = aVar.f37003d;
                int i15 = this.f2055b + this.f2056c;
                int i16 = this.f2057d;
                View view = (View) eVar.q();
                int[] iArr = a.f2008a;
                int i17 = iArr[bVar.ordinal()];
                if (i17 == 1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else if (i17 == 2) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2059f, i16, -2);
                } else if (i17 == 3) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2059f, i16 + eVar.z(), -1);
                } else if (i17 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2059f, i16, -2);
                    boolean z10 = eVar.f36649t == 1;
                    int i18 = aVar.f37009j;
                    if (i18 == b.a.f36998l || i18 == b.a.f36999m) {
                        if (aVar.f37009j == b.a.f36999m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || (view instanceof i) || eVar.l0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.U(), 1073741824);
                        }
                    }
                }
                int i19 = iArr[bVar2.ordinal()];
                if (i19 == 1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else if (i19 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2060g, i15, -2);
                } else if (i19 == 3) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2060g, i15 + eVar.S(), -1);
                } else if (i19 != 4) {
                    makeMeasureSpec2 = 0;
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2060g, i15, -2);
                    boolean z11 = eVar.f36651u == 1;
                    int i20 = aVar.f37009j;
                    if (i20 == b.a.f36998l || i20 == b.a.f36999m) {
                        if (aVar.f37009j == b.a.f36999m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.U())) || (view instanceof i) || eVar.m0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                        }
                    }
                }
                s.f fVar = (s.f) eVar.I();
                if (fVar != null && s.j.b(ConstraintLayout.this.f1997i, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                    if (d(eVar.A(), makeMeasureSpec, eVar.U()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                        aVar.f37004e = eVar.U();
                        aVar.f37005f = eVar.v();
                        aVar.f37006g = eVar.n();
                        return;
                    }
                }
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                boolean z12 = bVar == bVar3;
                boolean z13 = bVar2 == bVar3;
                e.b bVar4 = e.b.MATCH_PARENT;
                boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                boolean z16 = z12 && eVar.f36612a0 > 0.0f;
                boolean z17 = z13 && eVar.f36612a0 > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i21 = aVar.f37009j;
                if (i21 != b.a.f36998l && i21 != b.a.f36999m && z12 && eVar.f36649t == 0 && z13 && eVar.f36651u == 0) {
                    i12 = -1;
                    i11 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof m) && (eVar instanceof s.k)) {
                        ((m) view).t((s.k) eVar, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    eVar.S0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i22 = eVar.f36654w;
                    max = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                    int i23 = eVar.f36655x;
                    if (i23 > 0) {
                        max = Math.min(i23, max);
                    }
                    int i24 = eVar.f36657z;
                    if (i24 > 0) {
                        i11 = Math.max(i24, measuredHeight);
                        i10 = makeMeasureSpec;
                    } else {
                        i10 = makeMeasureSpec;
                        i11 = measuredHeight;
                    }
                    int i25 = eVar.A;
                    if (i25 > 0) {
                        i11 = Math.min(i25, i11);
                    }
                    if (!s.j.b(ConstraintLayout.this.f1997i, 1)) {
                        if (z16 && z14) {
                            max = (int) ((i11 * eVar.f36612a0) + 0.5f);
                        } else if (z17 && z15) {
                            i11 = (int) ((max / eVar.f36612a0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i11) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i10;
                        if (measuredHeight != i11) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        eVar.S0(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i11 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i12 = -1;
                }
                boolean z18 = baseline != i12;
                aVar.f37008i = (max == aVar.f37002c && i11 == aVar.f37003d) ? false : true;
                if (bVar5.f2014c0) {
                    z18 = true;
                }
                if (z18 && baseline != -1 && eVar.n() != baseline) {
                    aVar.f37008i = true;
                }
                aVar.f37004e = max;
                aVar.f37005f = i11;
                aVar.f37007h = z18;
                aVar.f37006g = baseline;
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2055b = i12;
            this.f2056c = i13;
            this.f2057d = i14;
            this.f2058e = i15;
            this.f2059f = i10;
            this.f2060g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1989a = new SparseArray<>();
        this.f1990b = new ArrayList<>(4);
        this.f1991c = new s.f();
        this.f1992d = 0;
        this.f1993e = 0;
        this.f1994f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1995g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1996h = true;
        this.f1997i = 257;
        this.f1998j = null;
        this.f1999k = null;
        this.f2000l = -1;
        this.f2001m = new HashMap<>();
        this.f2002n = -1;
        this.f2003o = -1;
        this.f2004p = new SparseArray<>();
        this.f2005q = new c(this);
        this.f2006r = 0;
        this.f2007s = 0;
        p(attributeSet, 0, 0);
    }

    private final s.e g(int i10) {
        if (i10 == 0) {
            return this.f1991c;
        }
        View view = this.f1989a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1991c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f2044r0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    public static l getSharedValues() {
        if (f1988t == null) {
            f1988t = new l();
        }
        return f1988t;
    }

    private void p(AttributeSet attributeSet, int i10, int i11) {
        this.f1991c.y0(this);
        this.f1991c.R1(this.f2005q);
        this.f1989a.put(getId(), this);
        this.f1998j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.U0, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == k.Z0) {
                    this.f1992d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1992d);
                } else if (index == k.f2226a1) {
                    this.f1993e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1993e);
                } else if (index == k.X0) {
                    this.f1994f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1994f);
                } else if (index == k.Y0) {
                    this.f1995g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1995g);
                } else if (index == k.f2339o2) {
                    this.f1997i = obtainStyledAttributes.getInt(index, this.f1997i);
                } else if (index == k.f2298j1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1999k = null;
                        }
                    }
                } else if (index == k.f2266f1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f1998j = eVar;
                        eVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1998j = null;
                    }
                    this.f2000l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1991c.S1(this.f1997i);
    }

    private void r() {
        this.f1996h = true;
        this.f2002n = -1;
        this.f2003o = -1;
    }

    private void v() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            s.e l10 = l(getChildAt(i10));
            if (l10 != null) {
                l10.r0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2000l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2000l && (childAt2 instanceof f)) {
                    this.f1998j = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f1998j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f1991c.r1();
        int size = this.f1990b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f1990b.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.f2004p.clear();
        this.f2004p.put(0, this.f1991c);
        this.f2004p.put(getId(), this.f1991c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2004p.put(childAt4.getId(), l(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            s.e l11 = l(childAt5);
            if (l11 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1991c.a(l11);
                c(isInEditMode, childAt5, l11, bVar, this.f2004p);
            }
        }
    }

    private void y(s.e eVar, b bVar, SparseArray<s.e> sparseArray, int i10, d.b bVar2) {
        View view = this.f1989a.get(i10);
        s.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f2014c0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f2014c0 = true;
            bVar4.f2044r0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private boolean z() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            v();
        }
        return z10;
    }

    protected void c(boolean z10, View view, s.e eVar, b bVar, SparseArray<s.e> sparseArray) {
        int i10;
        float f10;
        int i11;
        int i12;
        s.e eVar2;
        s.e eVar3;
        s.e eVar4;
        s.e eVar5;
        int i13;
        bVar.a();
        eVar.g1(view.getVisibility());
        if (bVar.f2020f0) {
            eVar.Q0(true);
            eVar.g1(8);
        }
        eVar.y0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).n(eVar, this.f1991c.L1());
        }
        if (bVar.f2016d0) {
            s.g gVar = (s.g) eVar;
            int i14 = bVar.f2038o0;
            int i15 = bVar.f2040p0;
            float f11 = bVar.f2042q0;
            if (Build.VERSION.SDK_INT < 17) {
                i14 = bVar.f2009a;
                i15 = bVar.f2011b;
                f11 = bVar.f2013c;
            }
            if (f11 != -1.0f) {
                gVar.w1(f11);
                return;
            } else if (i14 != -1) {
                gVar.u1(i14);
                return;
            } else if (i15 != -1) {
                gVar.v1(i15);
                return;
            } else {
                return;
            }
        }
        int i16 = bVar.f2024h0;
        int i17 = bVar.f2026i0;
        int i18 = bVar.f2028j0;
        int i19 = bVar.f2030k0;
        int i20 = bVar.f2032l0;
        int i21 = bVar.f2034m0;
        float f12 = bVar.f2036n0;
        if (Build.VERSION.SDK_INT < 17) {
            i16 = bVar.f2017e;
            int i22 = bVar.f2019f;
            int i23 = bVar.f2021g;
            int i24 = bVar.f2023h;
            int i25 = bVar.f2049w;
            int i26 = bVar.f2051y;
            float f13 = bVar.E;
            if (i16 == -1 && i22 == -1) {
                int i27 = bVar.f2046t;
                if (i27 != -1) {
                    i16 = i27;
                } else {
                    int i28 = bVar.f2045s;
                    if (i28 != -1) {
                        i22 = i28;
                    }
                }
            }
            if (i23 == -1 && i24 == -1) {
                i11 = bVar.f2047u;
                if (i11 == -1) {
                    int i29 = bVar.f2048v;
                    if (i29 != -1) {
                        i10 = i26;
                        f10 = f13;
                        i20 = i25;
                        i12 = i29;
                        i17 = i22;
                        i11 = i23;
                    }
                }
                i10 = i26;
                f10 = f13;
                i20 = i25;
                i12 = i24;
                i17 = i22;
            }
            i11 = i23;
            i10 = i26;
            f10 = f13;
            i20 = i25;
            i12 = i24;
            i17 = i22;
        } else {
            i10 = i21;
            f10 = f12;
            i11 = i18;
            i12 = i19;
        }
        int i30 = bVar.f2039p;
        if (i30 != -1) {
            s.e eVar6 = sparseArray.get(i30);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.f2043r, bVar.f2041q);
            }
        } else {
            if (i16 != -1) {
                s.e eVar7 = sparseArray.get(i16);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    eVar.c0(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i20);
                }
            } else if (i17 != -1 && (eVar2 = sparseArray.get(i17)) != null) {
                eVar.c0(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i20);
            }
            if (i11 != -1) {
                s.e eVar8 = sparseArray.get(i11);
                if (eVar8 != null) {
                    eVar.c0(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i10);
                }
            } else if (i12 != -1 && (eVar3 = sparseArray.get(i12)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.c0(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i10);
            }
            int i31 = bVar.f2025i;
            if (i31 != -1) {
                s.e eVar9 = sparseArray.get(i31);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.c0(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f2050x);
                }
            } else {
                int i32 = bVar.f2027j;
                if (i32 != -1 && (eVar4 = sparseArray.get(i32)) != null) {
                    eVar.c0(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f2050x);
                }
            }
            int i33 = bVar.f2029k;
            if (i33 != -1) {
                s.e eVar10 = sparseArray.get(i33);
                if (eVar10 != null) {
                    eVar.c0(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f2052z);
                }
            } else {
                int i34 = bVar.f2031l;
                if (i34 != -1 && (eVar5 = sparseArray.get(i34)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.c0(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f2052z);
                }
            }
            int i35 = bVar.f2033m;
            if (i35 != -1) {
                y(eVar, bVar, sparseArray, i35, d.b.BASELINE);
            } else {
                int i36 = bVar.f2035n;
                if (i36 != -1) {
                    y(eVar, bVar, sparseArray, i36, d.b.TOP);
                } else {
                    int i37 = bVar.f2037o;
                    if (i37 != -1) {
                        y(eVar, bVar, sparseArray, i37, d.b.BOTTOM);
                    }
                }
            }
            if (f10 >= 0.0f) {
                eVar.J0(f10);
            }
            float f14 = bVar.F;
            if (f14 >= 0.0f) {
                eVar.a1(f14);
            }
        }
        if (z10 && ((i13 = bVar.T) != -1 || bVar.U != -1)) {
            eVar.Y0(i13, bVar.U);
        }
        if (!bVar.f2010a0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.W) {
                    eVar.M0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.M0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.LEFT).f36596g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.m(d.b.RIGHT).f36596g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.M0(e.b.MATCH_CONSTRAINT);
                eVar.h1(0);
            }
        } else {
            eVar.M0(e.b.FIXED);
            eVar.h1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.M0(e.b.WRAP_CONTENT);
            }
        }
        if (!bVar.f2012b0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.X) {
                    eVar.d1(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.d1(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.TOP).f36596g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.m(d.b.BOTTOM).f36596g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.d1(e.b.MATCH_CONSTRAINT);
                eVar.I0(0);
            }
        } else {
            eVar.d1(e.b.FIXED);
            eVar.I0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.d1(e.b.WRAP_CONTENT);
            }
        }
        eVar.A0(bVar.G);
        eVar.O0(bVar.H);
        eVar.f1(bVar.I);
        eVar.K0(bVar.J);
        eVar.b1(bVar.K);
        eVar.i1(bVar.Z);
        eVar.N0(bVar.L, bVar.N, bVar.P, bVar.R);
        eVar.e1(bVar.M, bVar.O, bVar.Q, bVar.S);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f1990b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1990b.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2001m;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f2001m.get(str);
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        r();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1995g;
    }

    public int getMaxWidth() {
        return this.f1994f;
    }

    public int getMinHeight() {
        return this.f1993e;
    }

    public int getMinWidth() {
        return this.f1992d;
    }

    public int getOptimizationLevel() {
        return this.f1991c.G1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1991c.f36633l == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1991c.f36633l = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1991c.f36633l = "parent";
            }
        }
        if (this.f1991c.r() == null) {
            s.f fVar = this.f1991c;
            fVar.z0(fVar.f36633l);
            Log.v("ConstraintLayout", " setDebugName " + this.f1991c.r());
        }
        Iterator<s.e> it = this.f1991c.o1().iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f36633l == null && (id2 = view.getId()) != -1) {
                    next.f36633l = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.r() == null) {
                    next.z0(next.f36633l);
                    Log.v("ConstraintLayout", " setDebugName " + next.r());
                }
            }
        }
        this.f1991c.M(sb2);
        return sb2.toString();
    }

    public View h(int i10) {
        return this.f1989a.get(i10);
    }

    public final s.e l(View view) {
        if (view == this) {
            return this.f1991c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f2044r0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).f2044r0;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            s.e eVar = bVar.f2044r0;
            if ((childAt.getVisibility() != 8 || bVar.f2016d0 || bVar.f2018e0 || bVar.f2022g0 || isInEditMode) && !bVar.f2020f0) {
                int V = eVar.V();
                int W = eVar.W();
                int U = eVar.U() + V;
                int v10 = eVar.v() + W;
                childAt.layout(V, W, U, v10);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v10);
                }
            }
        }
        int size = this.f1990b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1990b.get(i15).o(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2006r == i10) {
            int i12 = this.f2007s;
        }
        if (!this.f1996h) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f1996h = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        boolean z10 = this.f1996h;
        this.f2006r = i10;
        this.f2007s = i11;
        this.f1991c.U1(q());
        if (this.f1996h) {
            this.f1996h = false;
            if (z()) {
                this.f1991c.W1();
            }
        }
        u(this.f1991c, this.f1997i, i10, i11);
        t(i10, i11, this.f1991c.U(), this.f1991c.v(), this.f1991c.M1(), this.f1991c.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        s.e l10 = l(view);
        if ((view instanceof h) && !(l10 instanceof s.g)) {
            b bVar = (b) view.getLayoutParams();
            s.g gVar = new s.g();
            bVar.f2044r0 = gVar;
            bVar.f2016d0 = true;
            gVar.x1(bVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.s();
            ((b) view.getLayoutParams()).f2018e0 = true;
            if (!this.f1990b.contains(cVar)) {
                this.f1990b.add(cVar);
            }
        }
        this.f1989a.put(view.getId(), view);
        this.f1996h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1989a.remove(view.getId());
        this.f1991c.q1(l(view));
        this.f1990b.remove(view);
        this.f1996h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        r();
        super.requestLayout();
    }

    protected void s(int i10) {
        this.f1999k = new d(getContext(), this, i10);
    }

    public void setConstraintSet(e eVar) {
        this.f1998j = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1989a.remove(getId());
        super.setId(i10);
        this.f1989a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1995g) {
            return;
        }
        this.f1995g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1994f) {
            return;
        }
        this.f1994f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1993e) {
            return;
        }
        this.f1993e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1992d) {
            return;
        }
        this.f1992d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f1999k;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1997i = i10;
        this.f1991c.S1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2005q;
        int i14 = cVar.f2058e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f2057d, i10, 0);
        int min = Math.min(this.f1994f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1995g, ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f2002n = min;
        this.f2003o = min2;
    }

    protected void u(s.f fVar, int i10, int i11, int i12) {
        int max;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i13 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.f2005q.c(i11, i12, max2, max3, paddingWidth, i13);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (q()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        x(fVar, mode, i14, mode2, i15);
        fVar.N1(i10, mode, i14, mode2, i15, this.f2002n, this.f2003o, max, max2);
    }

    public void w(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2001m == null) {
                this.f2001m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2001m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void x(s.f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f2005q;
        int i14 = cVar.f2058e;
        int i15 = cVar.f2057d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1992d);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f1992d);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.f1994f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1993e);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.f1995g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f1993e);
            }
            i13 = 0;
        }
        if (i11 != fVar.U() || i13 != fVar.v()) {
            fVar.J1();
        }
        fVar.j1(0);
        fVar.k1(0);
        fVar.U0(this.f1994f - i15);
        fVar.T0(this.f1995g - i14);
        fVar.X0(0);
        fVar.W0(0);
        fVar.M0(bVar);
        fVar.h1(i11);
        fVar.d1(bVar2);
        fVar.I0(i13);
        fVar.X0(this.f1992d - i15);
        fVar.W0(this.f1993e - i14);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f2009a;

        /* renamed from: a0  reason: collision with root package name */
        boolean f2010a0;

        /* renamed from: b  reason: collision with root package name */
        public int f2011b;

        /* renamed from: b0  reason: collision with root package name */
        boolean f2012b0;

        /* renamed from: c  reason: collision with root package name */
        public float f2013c;

        /* renamed from: c0  reason: collision with root package name */
        boolean f2014c0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2015d;

        /* renamed from: d0  reason: collision with root package name */
        boolean f2016d0;

        /* renamed from: e  reason: collision with root package name */
        public int f2017e;

        /* renamed from: e0  reason: collision with root package name */
        boolean f2018e0;

        /* renamed from: f  reason: collision with root package name */
        public int f2019f;

        /* renamed from: f0  reason: collision with root package name */
        boolean f2020f0;

        /* renamed from: g  reason: collision with root package name */
        public int f2021g;

        /* renamed from: g0  reason: collision with root package name */
        boolean f2022g0;

        /* renamed from: h  reason: collision with root package name */
        public int f2023h;

        /* renamed from: h0  reason: collision with root package name */
        int f2024h0;

        /* renamed from: i  reason: collision with root package name */
        public int f2025i;

        /* renamed from: i0  reason: collision with root package name */
        int f2026i0;

        /* renamed from: j  reason: collision with root package name */
        public int f2027j;

        /* renamed from: j0  reason: collision with root package name */
        int f2028j0;

        /* renamed from: k  reason: collision with root package name */
        public int f2029k;

        /* renamed from: k0  reason: collision with root package name */
        int f2030k0;

        /* renamed from: l  reason: collision with root package name */
        public int f2031l;

        /* renamed from: l0  reason: collision with root package name */
        int f2032l0;

        /* renamed from: m  reason: collision with root package name */
        public int f2033m;

        /* renamed from: m0  reason: collision with root package name */
        int f2034m0;

        /* renamed from: n  reason: collision with root package name */
        public int f2035n;

        /* renamed from: n0  reason: collision with root package name */
        float f2036n0;

        /* renamed from: o  reason: collision with root package name */
        public int f2037o;

        /* renamed from: o0  reason: collision with root package name */
        int f2038o0;

        /* renamed from: p  reason: collision with root package name */
        public int f2039p;

        /* renamed from: p0  reason: collision with root package name */
        int f2040p0;

        /* renamed from: q  reason: collision with root package name */
        public int f2041q;

        /* renamed from: q0  reason: collision with root package name */
        float f2042q0;

        /* renamed from: r  reason: collision with root package name */
        public float f2043r;

        /* renamed from: r0  reason: collision with root package name */
        s.e f2044r0;

        /* renamed from: s  reason: collision with root package name */
        public int f2045s;

        /* renamed from: t  reason: collision with root package name */
        public int f2046t;

        /* renamed from: u  reason: collision with root package name */
        public int f2047u;

        /* renamed from: v  reason: collision with root package name */
        public int f2048v;

        /* renamed from: w  reason: collision with root package name */
        public int f2049w;

        /* renamed from: x  reason: collision with root package name */
        public int f2050x;

        /* renamed from: y  reason: collision with root package name */
        public int f2051y;

        /* renamed from: z  reason: collision with root package name */
        public int f2052z;

        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f2053a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2053a = sparseIntArray;
                sparseIntArray.append(k.Z1, 64);
                sparseIntArray.append(k.C1, 65);
                sparseIntArray.append(k.L1, 8);
                sparseIntArray.append(k.M1, 9);
                sparseIntArray.append(k.O1, 10);
                sparseIntArray.append(k.P1, 11);
                sparseIntArray.append(k.V1, 12);
                sparseIntArray.append(k.U1, 13);
                sparseIntArray.append(k.f2366s1, 14);
                sparseIntArray.append(k.f2359r1, 15);
                sparseIntArray.append(k.f2330n1, 16);
                sparseIntArray.append(k.f2345p1, 52);
                sparseIntArray.append(k.f2338o1, 53);
                sparseIntArray.append(k.f2373t1, 2);
                sparseIntArray.append(k.f2387v1, 3);
                sparseIntArray.append(k.f2380u1, 4);
                sparseIntArray.append(k.f2259e2, 49);
                sparseIntArray.append(k.f2267f2, 50);
                sparseIntArray.append(k.f2415z1, 5);
                sparseIntArray.append(k.A1, 6);
                sparseIntArray.append(k.B1, 7);
                sparseIntArray.append(k.f2290i1, 67);
                sparseIntArray.append(k.V0, 1);
                sparseIntArray.append(k.Q1, 17);
                sparseIntArray.append(k.R1, 18);
                sparseIntArray.append(k.f2408y1, 19);
                sparseIntArray.append(k.f2401x1, 20);
                sparseIntArray.append(k.f2299j2, 21);
                sparseIntArray.append(k.f2323m2, 22);
                sparseIntArray.append(k.f2307k2, 23);
                sparseIntArray.append(k.f2283h2, 24);
                sparseIntArray.append(k.f2315l2, 25);
                sparseIntArray.append(k.f2291i2, 26);
                sparseIntArray.append(k.f2275g2, 55);
                sparseIntArray.append(k.f2331n2, 54);
                sparseIntArray.append(k.H1, 29);
                sparseIntArray.append(k.W1, 30);
                sparseIntArray.append(k.f2394w1, 44);
                sparseIntArray.append(k.J1, 45);
                sparseIntArray.append(k.Y1, 46);
                sparseIntArray.append(k.I1, 47);
                sparseIntArray.append(k.X1, 48);
                sparseIntArray.append(k.f2314l1, 27);
                sparseIntArray.append(k.f2306k1, 28);
                sparseIntArray.append(k.f2227a2, 31);
                sparseIntArray.append(k.D1, 32);
                sparseIntArray.append(k.f2243c2, 33);
                sparseIntArray.append(k.f2235b2, 34);
                sparseIntArray.append(k.f2251d2, 35);
                sparseIntArray.append(k.F1, 36);
                sparseIntArray.append(k.E1, 37);
                sparseIntArray.append(k.G1, 38);
                sparseIntArray.append(k.K1, 39);
                sparseIntArray.append(k.T1, 40);
                sparseIntArray.append(k.N1, 41);
                sparseIntArray.append(k.f2352q1, 42);
                sparseIntArray.append(k.f2322m1, 43);
                sparseIntArray.append(k.S1, 51);
                sparseIntArray.append(k.f2346p2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2009a = -1;
            this.f2011b = -1;
            this.f2013c = -1.0f;
            this.f2015d = true;
            this.f2017e = -1;
            this.f2019f = -1;
            this.f2021g = -1;
            this.f2023h = -1;
            this.f2025i = -1;
            this.f2027j = -1;
            this.f2029k = -1;
            this.f2031l = -1;
            this.f2033m = -1;
            this.f2035n = -1;
            this.f2037o = -1;
            this.f2039p = -1;
            this.f2041q = 0;
            this.f2043r = 0.0f;
            this.f2045s = -1;
            this.f2046t = -1;
            this.f2047u = -1;
            this.f2048v = -1;
            this.f2049w = RecyclerView.UNDEFINED_DURATION;
            this.f2050x = RecyclerView.UNDEFINED_DURATION;
            this.f2051y = RecyclerView.UNDEFINED_DURATION;
            this.f2052z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2010a0 = true;
            this.f2012b0 = true;
            this.f2014c0 = false;
            this.f2016d0 = false;
            this.f2018e0 = false;
            this.f2020f0 = false;
            this.f2022g0 = false;
            this.f2024h0 = -1;
            this.f2026i0 = -1;
            this.f2028j0 = -1;
            this.f2030k0 = -1;
            this.f2032l0 = RecyclerView.UNDEFINED_DURATION;
            this.f2034m0 = RecyclerView.UNDEFINED_DURATION;
            this.f2036n0 = 0.5f;
            this.f2044r0 = new s.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f2053a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2039p);
                        this.f2039p = resourceId;
                        if (resourceId == -1) {
                            this.f2039p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2041q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2041q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2043r) % 360.0f;
                        this.f2043r = f10;
                        if (f10 < 0.0f) {
                            this.f2043r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2009a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2009a);
                        break;
                    case 6:
                        this.f2011b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2011b);
                        break;
                    case 7:
                        this.f2013c = obtainStyledAttributes.getFloat(index, this.f2013c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2017e);
                        this.f2017e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2017e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2019f);
                        this.f2019f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2019f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2021g);
                        this.f2021g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2021g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2023h);
                        this.f2023h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2023h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2025i);
                        this.f2025i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2025i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2027j);
                        this.f2027j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2027j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2029k);
                        this.f2029k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2029k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2031l);
                        this.f2031l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2031l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2033m);
                        this.f2033m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2033m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2045s);
                        this.f2045s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2045s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2046t);
                        this.f2046t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2046t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2047u);
                        this.f2047u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2047u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2048v);
                        this.f2048v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2048v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2049w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2049w);
                        break;
                    case 22:
                        this.f2050x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2050x);
                        break;
                    case 23:
                        this.f2051y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2051y);
                        break;
                    case 24:
                        this.f2052z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2052z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                e.o(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2035n);
                                this.f2035n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2035n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2037o);
                                this.f2037o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2037o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i11) {
                                    case 64:
                                        e.m(this, obtainStyledAttributes, index, 0);
                                        continue;
                                    case 65:
                                        e.m(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f2015d = obtainStyledAttributes.getBoolean(index, this.f2015d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f2016d0 = false;
            this.f2010a0 = true;
            this.f2012b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.W) {
                this.f2010a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.X) {
                this.f2012b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2010a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2012b0 = false;
                if (i11 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f2013c == -1.0f && this.f2009a == -1 && this.f2011b == -1) {
                return;
            }
            this.f2016d0 = true;
            this.f2010a0 = true;
            this.f2012b0 = true;
            if (!(this.f2044r0 instanceof s.g)) {
                this.f2044r0 = new s.g();
            }
            ((s.g) this.f2044r0).x1(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2009a = -1;
            this.f2011b = -1;
            this.f2013c = -1.0f;
            this.f2015d = true;
            this.f2017e = -1;
            this.f2019f = -1;
            this.f2021g = -1;
            this.f2023h = -1;
            this.f2025i = -1;
            this.f2027j = -1;
            this.f2029k = -1;
            this.f2031l = -1;
            this.f2033m = -1;
            this.f2035n = -1;
            this.f2037o = -1;
            this.f2039p = -1;
            this.f2041q = 0;
            this.f2043r = 0.0f;
            this.f2045s = -1;
            this.f2046t = -1;
            this.f2047u = -1;
            this.f2048v = -1;
            this.f2049w = RecyclerView.UNDEFINED_DURATION;
            this.f2050x = RecyclerView.UNDEFINED_DURATION;
            this.f2051y = RecyclerView.UNDEFINED_DURATION;
            this.f2052z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2010a0 = true;
            this.f2012b0 = true;
            this.f2014c0 = false;
            this.f2016d0 = false;
            this.f2018e0 = false;
            this.f2020f0 = false;
            this.f2022g0 = false;
            this.f2024h0 = -1;
            this.f2026i0 = -1;
            this.f2028j0 = -1;
            this.f2030k0 = -1;
            this.f2032l0 = RecyclerView.UNDEFINED_DURATION;
            this.f2034m0 = RecyclerView.UNDEFINED_DURATION;
            this.f2036n0 = 0.5f;
            this.f2044r0 = new s.e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2009a = -1;
            this.f2011b = -1;
            this.f2013c = -1.0f;
            this.f2015d = true;
            this.f2017e = -1;
            this.f2019f = -1;
            this.f2021g = -1;
            this.f2023h = -1;
            this.f2025i = -1;
            this.f2027j = -1;
            this.f2029k = -1;
            this.f2031l = -1;
            this.f2033m = -1;
            this.f2035n = -1;
            this.f2037o = -1;
            this.f2039p = -1;
            this.f2041q = 0;
            this.f2043r = 0.0f;
            this.f2045s = -1;
            this.f2046t = -1;
            this.f2047u = -1;
            this.f2048v = -1;
            this.f2049w = RecyclerView.UNDEFINED_DURATION;
            this.f2050x = RecyclerView.UNDEFINED_DURATION;
            this.f2051y = RecyclerView.UNDEFINED_DURATION;
            this.f2052z = RecyclerView.UNDEFINED_DURATION;
            this.A = RecyclerView.UNDEFINED_DURATION;
            this.B = RecyclerView.UNDEFINED_DURATION;
            this.C = RecyclerView.UNDEFINED_DURATION;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f2010a0 = true;
            this.f2012b0 = true;
            this.f2014c0 = false;
            this.f2016d0 = false;
            this.f2018e0 = false;
            this.f2020f0 = false;
            this.f2022g0 = false;
            this.f2024h0 = -1;
            this.f2026i0 = -1;
            this.f2028j0 = -1;
            this.f2030k0 = -1;
            this.f2032l0 = RecyclerView.UNDEFINED_DURATION;
            this.f2034m0 = RecyclerView.UNDEFINED_DURATION;
            this.f2036n0 = 0.5f;
            this.f2044r0 = new s.e();
        }
    }
}
