package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: LinearLayoutCompat.java */
/* loaded from: classes.dex */
public class k0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1569a;

    /* renamed from: b  reason: collision with root package name */
    private int f1570b;

    /* renamed from: c  reason: collision with root package name */
    private int f1571c;

    /* renamed from: d  reason: collision with root package name */
    private int f1572d;

    /* renamed from: e  reason: collision with root package name */
    private int f1573e;

    /* renamed from: f  reason: collision with root package name */
    private int f1574f;

    /* renamed from: g  reason: collision with root package name */
    private float f1575g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1576h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f1577i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1578j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1579k;

    /* renamed from: l  reason: collision with root package name */
    private int f1580l;

    /* renamed from: m  reason: collision with root package name */
    private int f1581m;

    /* renamed from: n  reason: collision with root package name */
    private int f1582n;

    /* renamed from: o  reason: collision with root package name */
    private int f1583o;

    /* compiled from: LinearLayoutCompat.java */
    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public k0(Context context) {
        this(context, null);
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private void k(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s10.getMeasuredWidth();
                    measureChildWithMargins(s10, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s10.getMeasuredHeight();
                    measureChildWithMargins(s10, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = g1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View s10 = s(i11);
            if (s10 != null && s10.getVisibility() != 8 && t(i11)) {
                a aVar = (a) s10.getLayoutParams();
                if (b10) {
                    left2 = s10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (s10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1580l;
                }
                j(canvas, left2);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            if (s11 != null) {
                a aVar2 = (a) s11.getLayoutParams();
                if (b10) {
                    left = s11.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f1580l;
                    right = left - i10;
                } else {
                    right = s11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f1580l;
                right = left - i10;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1570b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1570b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1570b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1571c;
            if (this.f1572d == 1 && (i10 = this.f1573e & 112) != 48) {
                if (i10 == 16) {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1574f) / 2;
                } else if (i10 == 80) {
                    i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1574f;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1570b;
    }

    public Drawable getDividerDrawable() {
        return this.f1579k;
    }

    public int getDividerPadding() {
        return this.f1583o;
    }

    public int getDividerWidth() {
        return this.f1580l;
    }

    public int getGravity() {
        return this.f1573e;
    }

    public int getOrientation() {
        return this.f1572d;
    }

    public int getShowDividers() {
        return this.f1582n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1575g;
    }

    void h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View s10 = s(i10);
            if (s10 != null && s10.getVisibility() != 8 && t(i10)) {
                i(canvas, (s10.getTop() - ((LinearLayout.LayoutParams) ((a) s10.getLayoutParams())).topMargin) - this.f1581m);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            if (s11 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1581m;
            } else {
                bottom = s11.getBottom() + ((LinearLayout.LayoutParams) ((a) s11.getLayoutParams())).bottomMargin;
            }
            i(canvas, bottom);
        }
    }

    void i(Canvas canvas, int i10) {
        this.f1579k.setBounds(getPaddingLeft() + this.f1583o, i10, (getWidth() - getPaddingRight()) - this.f1583o, this.f1581m + i10);
        this.f1579k.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.f1579k.setBounds(i10, getPaddingTop() + this.f1583o, this.f1580l + i10, (getHeight() - getPaddingBottom()) - this.f1583o);
        this.f1579k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1572d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1579k == null) {
            return;
        }
        if (this.f1572d == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1572d == 1) {
            v(i10, i11, i12, i13);
        } else {
            u(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1572d == 1) {
            z(i10, i11);
        } else {
            x(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1569a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1570b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1579k) {
            return;
        }
        this.f1579k = drawable;
        if (drawable != null) {
            this.f1580l = drawable.getIntrinsicWidth();
            this.f1581m = drawable.getIntrinsicHeight();
        } else {
            this.f1580l = 0;
            this.f1581m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1583o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1573e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1573e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1573e;
        if ((8388615 & i12) != i11) {
            this.f1573e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1576h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1572d != i10) {
            this.f1572d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1582n) {
            requestLayout();
        }
        this.f1582n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1573e;
        if ((i12 & 112) != i11) {
            this.f1573e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1575g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(int i10) {
        if (i10 == 0) {
            return (this.f1582n & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.f1582n & 4) != 0;
        } else if ((this.f1582n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1573e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1574f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1574f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.k0$a r5 = (androidx.appcompat.widget.k0.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.z.C(r17)
            int r1 = androidx.core.view.e.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1581m
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.v(int, int, int, int):void");
    }

    void w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.x(int, int):void");
    }

    int y(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.z(int, int):void");
    }

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1569a = true;
        this.f1570b = -1;
        this.f1571c = 0;
        this.f1573e = 8388659;
        int[] iArr = d.j.W0;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        int k10 = v10.k(d.j.Y0, -1);
        if (k10 >= 0) {
            setOrientation(k10);
        }
        int k11 = v10.k(d.j.X0, -1);
        if (k11 >= 0) {
            setGravity(k11);
        }
        boolean a10 = v10.a(d.j.Z0, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f1575g = v10.i(d.j.f28802b1, -1.0f);
        this.f1570b = v10.k(d.j.f28797a1, -1);
        this.f1576h = v10.a(d.j.f28817e1, false);
        setDividerDrawable(v10.g(d.j.f28807c1));
        this.f1582n = v10.k(d.j.f28822f1, 0);
        this.f1583o = v10.f(d.j.f28812d1, 0);
        v10.w();
    }
}
