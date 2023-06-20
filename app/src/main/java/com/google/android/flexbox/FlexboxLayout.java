package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f21845a;

    /* renamed from: b  reason: collision with root package name */
    private int f21846b;

    /* renamed from: c  reason: collision with root package name */
    private int f21847c;

    /* renamed from: d  reason: collision with root package name */
    private int f21848d;

    /* renamed from: e  reason: collision with root package name */
    private int f21849e;

    /* renamed from: f  reason: collision with root package name */
    private int f21850f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f21851g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f21852h;

    /* renamed from: i  reason: collision with root package name */
    private int f21853i;

    /* renamed from: j  reason: collision with root package name */
    private int f21854j;

    /* renamed from: k  reason: collision with root package name */
    private int f21855k;

    /* renamed from: l  reason: collision with root package name */
    private int f21856l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f21857m;

    /* renamed from: n  reason: collision with root package name */
    private SparseIntArray f21858n;

    /* renamed from: o  reason: collision with root package name */
    private c f21859o;

    /* renamed from: p  reason: collision with root package name */
    private List<b> f21860p;

    /* renamed from: q  reason: collision with root package name */
    private c.b f21861q;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.f21851g == null && this.f21852h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f21860p.get(i11).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View r10 = r(i10 - i12);
            if (r10 != null && r10.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void m(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f21860p.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f21860p.get(i12);
            for (int i13 = 0; i13 < bVar.f21916h; i13++) {
                int i14 = bVar.f21923o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z10) {
                            left = r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f21856l;
                        }
                        p(canvas, left, bVar.f21910b, bVar.f21915g);
                    }
                    if (i13 == bVar.f21916h - 1 && (this.f21854j & 4) > 0) {
                        if (z10) {
                            right = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f21856l;
                        } else {
                            right = r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        p(canvas, right, bVar.f21910b, bVar.f21915g);
                    }
                }
            }
            if (t(i12)) {
                if (z11) {
                    i11 = bVar.f21912d;
                } else {
                    i11 = bVar.f21910b - this.f21855k;
                }
                o(canvas, paddingLeft, i11, max);
            }
            if (u(i12) && (this.f21853i & 4) > 0) {
                if (z11) {
                    i10 = bVar.f21910b - this.f21855k;
                } else {
                    i10 = bVar.f21912d;
                }
                o(canvas, paddingLeft, i10, max);
            }
        }
    }

    private void n(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f21860p.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f21860p.get(i12);
            for (int i13 = 0; i13 < bVar.f21916h; i13++) {
                int i14 = bVar.f21923o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z11) {
                            top = r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f21855k;
                        }
                        o(canvas, bVar.f21909a, top, bVar.f21915g);
                    }
                    if (i13 == bVar.f21916h - 1 && (this.f21853i & 4) > 0) {
                        if (z11) {
                            bottom = (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f21855k;
                        } else {
                            bottom = r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        o(canvas, bVar.f21909a, bottom, bVar.f21915g);
                    }
                }
            }
            if (t(i12)) {
                if (z10) {
                    i11 = bVar.f21911c;
                } else {
                    i11 = bVar.f21909a - this.f21856l;
                }
                p(canvas, i11, paddingTop, max);
            }
            if (u(i12) && (this.f21854j & 4) > 0) {
                if (z10) {
                    i10 = bVar.f21909a - this.f21856l;
                } else {
                    i10 = bVar.f21911c;
                }
                p(canvas, i10, paddingTop, max);
            }
        }
    }

    private void o(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f21851g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f21855k + i11);
        this.f21851g.draw(canvas);
    }

    private void p(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f21852h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f21856l + i10, i12 + i11);
        this.f21852h.draw(canvas);
    }

    private boolean s(int i10, int i11) {
        return l(i10, i11) ? k() ? (this.f21854j & 1) != 0 : (this.f21853i & 1) != 0 : k() ? (this.f21854j & 2) != 0 : (this.f21853i & 2) != 0;
    }

    private boolean t(int i10) {
        if (i10 < 0 || i10 >= this.f21860p.size()) {
            return false;
        }
        return a(i10) ? k() ? (this.f21853i & 1) != 0 : (this.f21854j & 1) != 0 : k() ? (this.f21853i & 2) != 0 : (this.f21854j & 2) != 0;
    }

    private boolean u(int i10) {
        if (i10 < 0 || i10 >= this.f21860p.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.f21860p.size(); i11++) {
            if (this.f21860p.get(i11).c() > 0) {
                return false;
            }
        }
        return k() ? (this.f21853i & 4) != 0 : (this.f21854j & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i10, int i11) {
        this.f21860p.clear();
        this.f21861q.a();
        this.f21859o.c(this.f21861q, i10, i11);
        this.f21860p = this.f21861q.f21932a;
        this.f21859o.p(i10, i11);
        if (this.f21848d == 3) {
            for (b bVar : this.f21860p) {
                int i12 = RecyclerView.UNDEFINED_DURATION;
                for (int i13 = 0; i13 < bVar.f21916h; i13++) {
                    View r10 = r(bVar.f21923o + i13);
                    if (r10 != null && r10.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                        if (this.f21846b != 2) {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + Math.max(bVar.f21920l - r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((bVar.f21920l - r10.getMeasuredHeight()) + r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                bVar.f21915g = i12;
            }
        }
        this.f21859o.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f21859o.X();
        z(this.f21845a, i10, i11, this.f21861q.f21933b);
    }

    private void y(int i10, int i11) {
        this.f21860p.clear();
        this.f21861q.a();
        this.f21859o.f(this.f21861q, i10, i11);
        this.f21860p = this.f21861q.f21932a;
        this.f21859o.p(i10, i11);
        this.f21859o.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f21859o.X();
        z(this.f21845a, i10, i11, this.f21861q.f21933b);
    }

    private void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + i10);
        } else {
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f21858n == null) {
            this.f21858n = new SparseIntArray(getChildCount());
        }
        this.f21857m = this.f21859o.n(view, i10, layoutParams, this.f21858n);
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i10, int i11, b bVar) {
        if (s(i10, i11)) {
            if (k()) {
                int i12 = bVar.f21913e;
                int i13 = this.f21856l;
                bVar.f21913e = i12 + i13;
                bVar.f21914f += i13;
                return;
            }
            int i14 = bVar.f21913e;
            int i15 = this.f21855k;
            bVar.f21913e = i14 + i15;
            bVar.f21914f += i15;
        }
    }

    @Override // com.google.android.flexbox.a
    public int c(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public View d(int i10) {
        return getChildAt(i10);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.a
    public int f(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public void g(b bVar) {
        if (k()) {
            if ((this.f21854j & 4) > 0) {
                int i10 = bVar.f21913e;
                int i11 = this.f21856l;
                bVar.f21913e = i10 + i11;
                bVar.f21914f += i11;
            }
        } else if ((this.f21853i & 4) > 0) {
            int i12 = bVar.f21913e;
            int i13 = this.f21855k;
            bVar.f21913e = i12 + i13;
            bVar.f21914f += i13;
        }
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f21849e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f21848d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f21851g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f21852h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f21845a;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f21860p.size());
        for (b bVar : this.f21860p) {
            if (bVar.c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.f21860p;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f21846b;
    }

    public int getJustifyContent() {
        return this.f21847c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        int i10 = RecyclerView.UNDEFINED_DURATION;
        for (b bVar : this.f21860p) {
            i10 = Math.max(i10, bVar.f21913e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f21850f;
    }

    public int getShowDividerHorizontal() {
        return this.f21853i;
    }

    public int getShowDividerVertical() {
        return this.f21854j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.f21860p.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = this.f21860p.get(i13);
            if (t(i13)) {
                if (k()) {
                    i11 = this.f21855k;
                } else {
                    i11 = this.f21856l;
                }
                i12 += i11;
            }
            if (u(i13)) {
                if (k()) {
                    i10 = this.f21855k;
                } else {
                    i10 = this.f21856l;
                }
                i12 += i10;
            }
            i12 += bVar.f21915g;
        }
        return i12;
    }

    @Override // com.google.android.flexbox.a
    public View h(int i10) {
        return r(i10);
    }

    @Override // com.google.android.flexbox.a
    public void i(int i10, View view) {
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i10, int i11) {
        int i12;
        int i13;
        if (k()) {
            i12 = s(i10, i11) ? 0 + this.f21856l : 0;
            if ((this.f21854j & 4) <= 0) {
                return i12;
            }
            i13 = this.f21856l;
        } else {
            i12 = s(i10, i11) ? 0 + this.f21855k : 0;
            if ((this.f21853i & 4) <= 0) {
                return i12;
            }
            i13 = this.f21855k;
        }
        return i12 + i13;
    }

    @Override // com.google.android.flexbox.a
    public boolean k() {
        int i10 = this.f21845a;
        return i10 == 0 || i10 == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f21852h == null && this.f21851g == null) {
            return;
        }
        if (this.f21853i == 0 && this.f21854j == 0) {
            return;
        }
        int C = z.C(this);
        int i10 = this.f21845a;
        if (i10 == 0) {
            m(canvas, C == 1, this.f21846b == 2);
        } else if (i10 == 1) {
            m(canvas, C != 1, this.f21846b == 2);
        } else if (i10 == 2) {
            boolean z10 = C == 1;
            if (this.f21846b == 2) {
                z10 = !z10;
            }
            n(canvas, z10, false);
        } else if (i10 != 3) {
        } else {
            boolean z11 = C == 1;
            if (this.f21846b == 2) {
                z11 = !z11;
            }
            n(canvas, z11, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int C = z.C(this);
        int i14 = this.f21845a;
        if (i14 == 0) {
            v(C == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            v(C != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z11 = C == 1;
            w(this.f21846b == 2 ? !z11 : z11, false, i10, i11, i12, i13);
        } else if (i14 == 3) {
            z11 = C == 1;
            w(this.f21846b == 2 ? !z11 : z11, true, i10, i11, i12, i13);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f21845a);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f21858n == null) {
            this.f21858n = new SparseIntArray(getChildCount());
        }
        if (this.f21859o.O(this.f21858n)) {
            this.f21857m = this.f21859o.m(this.f21858n);
        }
        int i12 = this.f21845a;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
        } else if (i12 != 2 && i12 != 3) {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f21845a);
        } else {
            y(i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f21857m;
            if (i10 >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i10]);
        }
        return null;
    }

    public void setAlignContent(int i10) {
        if (this.f21849e != i10) {
            this.f21849e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f21848d != i10) {
            this.f21848d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f21851g) {
            return;
        }
        this.f21851g = drawable;
        if (drawable != null) {
            this.f21855k = drawable.getIntrinsicHeight();
        } else {
            this.f21855k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f21852h) {
            return;
        }
        this.f21852h = drawable;
        if (drawable != null) {
            this.f21856l = drawable.getIntrinsicWidth();
        } else {
            this.f21856l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f21845a != i10) {
            this.f21845a = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.f21860p = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f21846b != i10) {
            this.f21846b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f21847c != i10) {
            this.f21847c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f21850f != i10) {
            this.f21850f = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f21853i) {
            this.f21853i = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f21854j) {
            this.f21854j = i10;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21850f = -1;
        this.f21859o = new c(this);
        this.f21860p = new ArrayList();
        this.f21861q = new c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f21936a, i10, 0);
        this.f21845a = obtainStyledAttributes.getInt(d.f21942g, 0);
        this.f21846b = obtainStyledAttributes.getInt(d.f21943h, 0);
        this.f21847c = obtainStyledAttributes.getInt(d.f21944i, 0);
        this.f21848d = obtainStyledAttributes.getInt(d.f21938c, 0);
        this.f21849e = obtainStyledAttributes.getInt(d.f21937b, 0);
        this.f21850f = obtainStyledAttributes.getInt(d.f21945j, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(d.f21939d);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(d.f21940e);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(d.f21941f);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(d.f21946k, 0);
        if (i11 != 0) {
            this.f21854j = i11;
            this.f21853i = i11;
        }
        int i12 = obtainStyledAttributes.getInt(d.f21948m, 0);
        if (i12 != 0) {
            this.f21854j = i12;
        }
        int i13 = obtainStyledAttributes.getInt(d.f21947l, 0);
        if (i13 != 0) {
            this.f21853i = i13;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f21862a;

        /* renamed from: b  reason: collision with root package name */
        private float f21863b;

        /* renamed from: c  reason: collision with root package name */
        private float f21864c;

        /* renamed from: d  reason: collision with root package name */
        private int f21865d;

        /* renamed from: e  reason: collision with root package name */
        private float f21866e;

        /* renamed from: f  reason: collision with root package name */
        private int f21867f;

        /* renamed from: g  reason: collision with root package name */
        private int f21868g;

        /* renamed from: h  reason: collision with root package name */
        private int f21869h;

        /* renamed from: i  reason: collision with root package name */
        private int f21870i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f21871j;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21862a = 1;
            this.f21863b = 0.0f;
            this.f21864c = 1.0f;
            this.f21865d = -1;
            this.f21866e = -1.0f;
            this.f21867f = -1;
            this.f21868g = -1;
            this.f21869h = 16777215;
            this.f21870i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f21949n);
            this.f21862a = obtainStyledAttributes.getInt(d.f21958w, 1);
            this.f21863b = obtainStyledAttributes.getFloat(d.f21952q, 0.0f);
            this.f21864c = obtainStyledAttributes.getFloat(d.f21953r, 1.0f);
            this.f21865d = obtainStyledAttributes.getInt(d.f21950o, -1);
            this.f21866e = obtainStyledAttributes.getFraction(d.f21951p, 1, 1, -1.0f);
            this.f21867f = obtainStyledAttributes.getDimensionPixelSize(d.f21957v, -1);
            this.f21868g = obtainStyledAttributes.getDimensionPixelSize(d.f21956u, -1);
            this.f21869h = obtainStyledAttributes.getDimensionPixelSize(d.f21955t, 16777215);
            this.f21870i = obtainStyledAttributes.getDimensionPixelSize(d.f21954s, 16777215);
            this.f21871j = obtainStyledAttributes.getBoolean(d.f21959x, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public int C() {
            return this.f21867f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int C0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int O() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void T(int i10) {
            this.f21868g = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float U() {
            return this.f21863b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int U0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y0() {
            return this.f21868g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Z() {
            return this.f21866e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int b1() {
            return this.f21870i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean g0() {
            return this.f21871j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f21862a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int m0() {
            return this.f21869h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i10) {
            this.f21867f = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int w() {
            return this.f21865d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f21862a);
            parcel.writeFloat(this.f21863b);
            parcel.writeFloat(this.f21864c);
            parcel.writeInt(this.f21865d);
            parcel.writeFloat(this.f21866e);
            parcel.writeInt(this.f21867f);
            parcel.writeInt(this.f21868g);
            parcel.writeInt(this.f21869h);
            parcel.writeInt(this.f21870i);
            parcel.writeByte(this.f21871j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public float y() {
            return this.f21864c;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f21862a = 1;
            this.f21863b = 0.0f;
            this.f21864c = 1.0f;
            this.f21865d = -1;
            this.f21866e = -1.0f;
            this.f21867f = -1;
            this.f21868g = -1;
            this.f21869h = 16777215;
            this.f21870i = 16777215;
            this.f21862a = layoutParams.f21862a;
            this.f21863b = layoutParams.f21863b;
            this.f21864c = layoutParams.f21864c;
            this.f21865d = layoutParams.f21865d;
            this.f21866e = layoutParams.f21866e;
            this.f21867f = layoutParams.f21867f;
            this.f21868g = layoutParams.f21868g;
            this.f21869h = layoutParams.f21869h;
            this.f21870i = layoutParams.f21870i;
            this.f21871j = layoutParams.f21871j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21862a = 1;
            this.f21863b = 0.0f;
            this.f21864c = 1.0f;
            this.f21865d = -1;
            this.f21866e = -1.0f;
            this.f21867f = -1;
            this.f21868g = -1;
            this.f21869h = 16777215;
            this.f21870i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21862a = 1;
            this.f21863b = 0.0f;
            this.f21864c = 1.0f;
            this.f21865d = -1;
            this.f21866e = -1.0f;
            this.f21867f = -1;
            this.f21868g = -1;
            this.f21869h = 16777215;
            this.f21870i = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f21862a = 1;
            this.f21863b = 0.0f;
            this.f21864c = 1.0f;
            this.f21865d = -1;
            this.f21866e = -1.0f;
            this.f21867f = -1;
            this.f21868g = -1;
            this.f21869h = 16777215;
            this.f21870i = 16777215;
            this.f21862a = parcel.readInt();
            this.f21863b = parcel.readFloat();
            this.f21864c = parcel.readFloat();
            this.f21865d = parcel.readInt();
            this.f21866e = parcel.readFloat();
            this.f21867f = parcel.readInt();
            this.f21868g = parcel.readInt();
            this.f21869h = parcel.readInt();
            this.f21870i = parcel.readInt();
            this.f21871j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
