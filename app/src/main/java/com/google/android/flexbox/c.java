package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlexboxHelper.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.flexbox.a f21927a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f21928b;

    /* renamed from: c  reason: collision with root package name */
    int[] f21929c;

    /* renamed from: d  reason: collision with root package name */
    long[] f21930d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f21931e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        List<com.google.android.flexbox.b> f21932a;

        /* renamed from: b  reason: collision with root package name */
        int f21933b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            this.f21932a = null;
            this.f21933b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0293c implements Comparable<C0293c> {

        /* renamed from: a  reason: collision with root package name */
        int f21934a;

        /* renamed from: b  reason: collision with root package name */
        int f21935b;

        private C0293c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C0293c c0293c) {
            int i10 = this.f21935b;
            int i11 = c0293c.f21935b;
            return i10 != i11 ? i10 - i11 : this.f21934a - c0293c.f21934a;
        }

        public String toString() {
            return "Order{order=" + this.f21935b + ", index=" + this.f21934a + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.android.flexbox.a aVar) {
        this.f21927a = aVar;
    }

    private int A(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f21927a;
        int c10 = aVar.c(i10, aVar.getPaddingLeft() + this.f21927a.getPaddingRight() + flexItem.E0() + flexItem.U0() + i11, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(c10);
        if (size > flexItem.m0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.m0(), View.MeasureSpec.getMode(c10));
        }
        return size < flexItem.C() ? View.MeasureSpec.makeMeasureSpec(flexItem.C(), View.MeasureSpec.getMode(c10)) : c10;
    }

    private int B(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.C0();
        }
        return flexItem.U0();
    }

    private int C(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.U0();
        }
        return flexItem.C0();
    }

    private int D(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.O();
        }
        return flexItem.E0();
    }

    private int E(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.E0();
        }
        return flexItem.O();
    }

    private int F(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    private int H(boolean z10) {
        if (z10) {
            return this.f21927a.getPaddingBottom();
        }
        return this.f21927a.getPaddingEnd();
    }

    private int I(boolean z10) {
        if (z10) {
            return this.f21927a.getPaddingEnd();
        }
        return this.f21927a.getPaddingBottom();
    }

    private int J(boolean z10) {
        if (z10) {
            return this.f21927a.getPaddingTop();
        }
        return this.f21927a.getPaddingStart();
    }

    private int K(boolean z10) {
        if (z10) {
            return this.f21927a.getPaddingStart();
        }
        return this.f21927a.getPaddingTop();
    }

    private int L(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int M(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private boolean N(int i10, int i11, com.google.android.flexbox.b bVar) {
        return i10 == i11 - 1 && bVar.c() != 0;
    }

    private boolean P(View view, int i10, int i11, int i12, int i13, FlexItem flexItem, int i14, int i15, int i16) {
        if (this.f21927a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.g0()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f21927a.getMaxLine();
        if (maxLine == -1 || maxLine > i16 + 1) {
            int j10 = this.f21927a.j(view, i14, i15);
            if (j10 > 0) {
                i13 += j10;
            }
            return i11 < i12 + i13;
        }
        return false;
    }

    private void T(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17 = bVar.f21913e;
        float f10 = bVar.f21919k;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 > i17) {
            return;
        }
        float f12 = (i17 - i12) / f10;
        bVar.f21913e = i13 + bVar.f21914f;
        if (!z10) {
            bVar.f21915g = RecyclerView.UNDEFINED_DURATION;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < bVar.f21916h) {
            int i20 = bVar.f21923o + i18;
            View h10 = this.f21927a.h(i20);
            if (h10 == null || h10.getVisibility() == 8) {
                i14 = i17;
                i15 = i18;
            } else {
                FlexItem flexItem = (FlexItem) h10.getLayoutParams();
                int flexDirection = this.f21927a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = h10.getMeasuredHeight();
                    long[] jArr = this.f21931e;
                    if (jArr != null) {
                        measuredHeight = x(jArr[i20]);
                    }
                    int measuredWidth = h10.getMeasuredWidth();
                    long[] jArr2 = this.f21931e;
                    if (jArr2 != null) {
                        measuredWidth = y(jArr2[i20]);
                    }
                    if (this.f21928b[i20] || flexItem.y() <= f11) {
                        i14 = i17;
                        i15 = i18;
                    } else {
                        float y10 = measuredHeight - (flexItem.y() * f12);
                        if (i18 == bVar.f21916h - 1) {
                            y10 += f13;
                            f13 = 0.0f;
                        }
                        int round = Math.round(y10);
                        if (round < flexItem.Y0()) {
                            round = flexItem.Y0();
                            this.f21928b[i20] = true;
                            bVar.f21919k -= flexItem.y();
                            i14 = i17;
                            i15 = i18;
                            z11 = true;
                        } else {
                            f13 += y10 - round;
                            i14 = i17;
                            i15 = i18;
                            double d10 = f13;
                            if (d10 > 1.0d) {
                                round++;
                                f13 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f13 += 1.0f;
                            }
                        }
                        int A = A(i10, flexItem, bVar.f21921m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        h10.measure(A, makeMeasureSpec);
                        measuredWidth = h10.getMeasuredWidth();
                        int measuredHeight2 = h10.getMeasuredHeight();
                        Z(i20, A, makeMeasureSpec, h10);
                        this.f21927a.i(i20, h10);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, measuredWidth + flexItem.E0() + flexItem.U0() + this.f21927a.f(h10));
                    bVar.f21913e += measuredHeight + flexItem.O() + flexItem.C0();
                } else {
                    i14 = i17;
                    int i21 = i18;
                    int measuredWidth2 = h10.getMeasuredWidth();
                    long[] jArr3 = this.f21931e;
                    if (jArr3 != null) {
                        measuredWidth2 = y(jArr3[i20]);
                    }
                    int measuredHeight3 = h10.getMeasuredHeight();
                    long[] jArr4 = this.f21931e;
                    if (jArr4 != null) {
                        measuredHeight3 = x(jArr4[i20]);
                    }
                    if (this.f21928b[i20] || flexItem.y() <= 0.0f) {
                        i15 = i21;
                    } else {
                        float y11 = measuredWidth2 - (flexItem.y() * f12);
                        i15 = i21;
                        if (i15 == bVar.f21916h - 1) {
                            y11 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(y11);
                        if (round2 < flexItem.C()) {
                            round2 = flexItem.C();
                            this.f21928b[i20] = true;
                            bVar.f21919k -= flexItem.y();
                            z11 = true;
                        } else {
                            f13 += y11 - round2;
                            double d11 = f13;
                            if (d11 > 1.0d) {
                                round2++;
                                f13 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f13 += 1.0f;
                            }
                        }
                        int z12 = z(i11, flexItem, bVar.f21921m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        h10.measure(makeMeasureSpec2, z12);
                        int measuredWidth3 = h10.getMeasuredWidth();
                        int measuredHeight4 = h10.getMeasuredHeight();
                        Z(i20, makeMeasureSpec2, z12, h10);
                        this.f21927a.i(i20, h10);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, measuredHeight3 + flexItem.O() + flexItem.C0() + this.f21927a.f(h10));
                    bVar.f21913e += measuredWidth2 + flexItem.E0() + flexItem.U0();
                    i16 = max;
                }
                bVar.f21915g = Math.max(bVar.f21915g, i16);
                i19 = i16;
            }
            i18 = i15 + 1;
            i17 = i14;
            f11 = 0.0f;
        }
        int i22 = i17;
        if (!z11 || i22 == bVar.f21913e) {
            return;
        }
        T(i10, i11, bVar, i12, i13, true);
    }

    private int[] U(int i10, List<C0293c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (C0293c c0293c : list) {
            int i12 = c0293c.f21934a;
            iArr[i11] = i12;
            sparseIntArray.append(i12, c0293c.f21935b);
            i11++;
        }
        return iArr;
    }

    private void V(View view, int i10, int i11) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.E0()) - flexItem.U0()) - this.f21927a.f(view), flexItem.C()), flexItem.m0());
        long[] jArr = this.f21931e;
        if (jArr != null) {
            measuredHeight = x(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i11, makeMeasureSpec2, makeMeasureSpec, view);
        this.f21927a.i(i11, view);
    }

    private void W(View view, int i10, int i11) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.O()) - flexItem.C0()) - this.f21927a.f(view), flexItem.Y0()), flexItem.b1());
        long[] jArr = this.f21931e;
        if (jArr != null) {
            measuredWidth = y(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i11, makeMeasureSpec, makeMeasureSpec2, view);
        this.f21927a.i(i11, view);
    }

    private void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.f21930d;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.f21931e;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<com.google.android.flexbox.b> list, com.google.android.flexbox.b bVar, int i10, int i11) {
        bVar.f21921m = i11;
        this.f21927a.g(bVar);
        bVar.f21924p = i10;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.C()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.C()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.m0()
            if (r1 <= r3) goto L26
            int r1 = r0.m0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.Y0()
            if (r2 >= r5) goto L32
            int r2 = r0.Y0()
            goto L3e
        L32:
            int r5 = r0.b1()
            if (r2 <= r5) goto L3d
            int r2 = r0.b1()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f21927a
            r0.i(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.i(android.view.View, int):void");
    }

    private List<com.google.android.flexbox.b> k(List<com.google.android.flexbox.b> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f21915g = (i10 - i11) / 2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private List<C0293c> l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            C0293c c0293c = new C0293c();
            c0293c.f21935b = ((FlexItem) this.f21927a.d(i11).getLayoutParams()).getOrder();
            c0293c.f21934a = i11;
            arrayList.add(c0293c);
        }
        return arrayList;
    }

    private void r(int i10) {
        boolean[] zArr = this.f21928b;
        if (zArr == null) {
            this.f21928b = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f21928b = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int C = flexItem.C();
        int Y0 = flexItem.Y0();
        Drawable a10 = androidx.core.widget.d.a(compoundButton);
        int minimumWidth = a10 == null ? 0 : a10.getMinimumWidth();
        int minimumHeight = a10 != null ? a10.getMinimumHeight() : 0;
        if (C == -1) {
            C = minimumWidth;
        }
        flexItem.setMinWidth(C);
        if (Y0 == -1) {
            Y0 = minimumHeight;
        }
        flexItem.T(Y0);
    }

    private void w(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        float f10 = bVar.f21918j;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i12 < (i14 = bVar.f21913e)) {
            return;
        }
        float f12 = (i12 - i14) / f10;
        bVar.f21913e = i13 + bVar.f21914f;
        if (!z10) {
            bVar.f21915g = RecyclerView.UNDEFINED_DURATION;
        }
        int i18 = 0;
        boolean z11 = false;
        int i19 = 0;
        float f13 = 0.0f;
        while (i18 < bVar.f21916h) {
            int i20 = bVar.f21923o + i18;
            View h10 = this.f21927a.h(i20);
            if (h10 == null || h10.getVisibility() == 8) {
                i15 = i14;
            } else {
                FlexItem flexItem = (FlexItem) h10.getLayoutParams();
                int flexDirection = this.f21927a.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = h10.getMeasuredHeight();
                    long[] jArr = this.f21931e;
                    if (jArr != null) {
                        measuredHeight = x(jArr[i20]);
                    }
                    int measuredWidth = h10.getMeasuredWidth();
                    long[] jArr2 = this.f21931e;
                    if (jArr2 != null) {
                        measuredWidth = y(jArr2[i20]);
                    }
                    if (this.f21928b[i20] || flexItem.U() <= f11) {
                        i17 = i14;
                    } else {
                        float U = measuredHeight + (flexItem.U() * f12);
                        if (i18 == bVar.f21916h - 1) {
                            U += f13;
                            f13 = 0.0f;
                        }
                        int round = Math.round(U);
                        if (round > flexItem.b1()) {
                            round = flexItem.b1();
                            this.f21928b[i20] = true;
                            bVar.f21918j -= flexItem.U();
                            i17 = i14;
                            z11 = true;
                        } else {
                            f13 += U - round;
                            i17 = i14;
                            double d12 = f13;
                            if (d12 > 1.0d) {
                                round++;
                                d11 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                round--;
                                d11 = d12 + 1.0d;
                            }
                            f13 = (float) d11;
                        }
                        int A = A(i10, flexItem, bVar.f21921m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        h10.measure(A, makeMeasureSpec);
                        measuredWidth = h10.getMeasuredWidth();
                        int measuredHeight2 = h10.getMeasuredHeight();
                        Z(i20, A, makeMeasureSpec, h10);
                        this.f21927a.i(i20, h10);
                        measuredHeight = measuredHeight2;
                    }
                    i16 = Math.max(i19, measuredWidth + flexItem.E0() + flexItem.U0() + this.f21927a.f(h10));
                    bVar.f21913e += measuredHeight + flexItem.O() + flexItem.C0();
                    i15 = i17;
                } else {
                    int i21 = i14;
                    int measuredWidth2 = h10.getMeasuredWidth();
                    long[] jArr3 = this.f21931e;
                    if (jArr3 != null) {
                        measuredWidth2 = y(jArr3[i20]);
                    }
                    int measuredHeight3 = h10.getMeasuredHeight();
                    long[] jArr4 = this.f21931e;
                    i15 = i21;
                    if (jArr4 != null) {
                        measuredHeight3 = x(jArr4[i20]);
                    }
                    if (!this.f21928b[i20] && flexItem.U() > 0.0f) {
                        float U2 = measuredWidth2 + (flexItem.U() * f12);
                        if (i18 == bVar.f21916h - 1) {
                            U2 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(U2);
                        if (round2 > flexItem.m0()) {
                            round2 = flexItem.m0();
                            this.f21928b[i20] = true;
                            bVar.f21918j -= flexItem.U();
                            z11 = true;
                        } else {
                            f13 += U2 - round2;
                            double d13 = f13;
                            if (d13 > 1.0d) {
                                round2++;
                                d10 = d13 - 1.0d;
                            } else if (d13 < -1.0d) {
                                round2--;
                                d10 = d13 + 1.0d;
                            }
                            f13 = (float) d10;
                        }
                        int z12 = z(i11, flexItem, bVar.f21921m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        h10.measure(makeMeasureSpec2, z12);
                        int measuredWidth3 = h10.getMeasuredWidth();
                        int measuredHeight4 = h10.getMeasuredHeight();
                        Z(i20, makeMeasureSpec2, z12, h10);
                        this.f21927a.i(i20, h10);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i19, measuredHeight3 + flexItem.O() + flexItem.C0() + this.f21927a.f(h10));
                    bVar.f21913e += measuredWidth2 + flexItem.E0() + flexItem.U0();
                    i16 = max;
                }
                bVar.f21915g = Math.max(bVar.f21915g, i16);
                i19 = i16;
            }
            i18++;
            i14 = i15;
            f11 = 0.0f;
        }
        int i22 = i14;
        if (!z11 || i22 == bVar.f21913e) {
            return;
        }
        w(i10, i11, bVar, i12, i13, true);
    }

    private int z(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f21927a;
        int e10 = aVar.e(i10, aVar.getPaddingTop() + this.f21927a.getPaddingBottom() + flexItem.O() + flexItem.C0() + i11, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(e10);
        if (size > flexItem.b1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.b1(), View.MeasureSpec.getMode(e10));
        }
        return size < flexItem.Y0() ? View.MeasureSpec.makeMeasureSpec(flexItem.Y0(), View.MeasureSpec.getMode(e10)) : e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21927a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View d10 = this.f21927a.d(i10);
            if (d10 != null && ((FlexItem) d10.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(View view, com.google.android.flexbox.b bVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f21927a.getAlignItems();
        if (flexItem.w() != -1) {
            alignItems = flexItem.w();
        }
        int i14 = bVar.f21915g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f21927a.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - flexItem.C0(), i12, i15 - flexItem.C0());
                    return;
                }
                view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + flexItem.O(), i12, (i13 - i14) + view.getMeasuredHeight() + flexItem.O());
                return;
            } else if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + flexItem.O()) - flexItem.C0()) / 2;
                if (this.f21927a.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                }
                int i17 = i11 - measuredHeight;
                view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                return;
            } else if (alignItems == 3) {
                if (this.f21927a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f21920l - view.getBaseline(), flexItem.O());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                }
                int max2 = Math.max((bVar.f21920l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.C0());
                view.layout(i10, i11 - max2, i12, i13 - max2);
                return;
            } else if (alignItems != 4) {
                return;
            }
        }
        if (this.f21927a.getFlexWrap() != 2) {
            view.layout(i10, i11 + flexItem.O(), i12, i13 + flexItem.O());
        } else {
            view.layout(i10, i11 - flexItem.C0(), i12, i13 - flexItem.C0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(View view, com.google.android.flexbox.b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f21927a.getAlignItems();
        if (flexItem.w() != -1) {
            alignItems = flexItem.w();
        }
        int i14 = bVar.f21915g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - flexItem.U0(), i11, ((i12 + i14) - view.getMeasuredWidth()) - flexItem.U0(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + flexItem.E0(), i11, (i12 - i14) + view.getMeasuredWidth() + flexItem.E0(), i13);
                    return;
                }
            } else if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + h.b(marginLayoutParams)) - h.a(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            } else if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + flexItem.E0(), i11, i12 + flexItem.E0(), i13);
        } else {
            view.layout(i10 - flexItem.U0(), i11, i12 - flexItem.U0(), i13);
        }
    }

    long S(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i10) {
        View h10;
        if (i10 >= this.f21927a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f21927a.getFlexDirection();
        if (this.f21927a.getAlignItems() == 4) {
            int[] iArr = this.f21929c;
            List<com.google.android.flexbox.b> flexLinesInternal = this.f21927a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                com.google.android.flexbox.b bVar = flexLinesInternal.get(i11);
                int i12 = bVar.f21916h;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = bVar.f21923o + i13;
                    if (i13 < this.f21927a.getFlexItemCount() && (h10 = this.f21927a.h(i14)) != null && h10.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) h10.getLayoutParams();
                        if (flexItem.w() == -1 || flexItem.w() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                W(h10, bVar.f21915g, i14);
                            } else if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            } else {
                                V(h10, bVar.f21915g, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (com.google.android.flexbox.b bVar2 : this.f21927a.getFlexLinesInternal()) {
            for (Integer num : bVar2.f21922n) {
                View h11 = this.f21927a.h(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    W(h11, bVar2.f21915g, num.intValue());
                } else if (flexDirection != 2 && flexDirection != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                } else {
                    V(h11, bVar2.f21915g, num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(b bVar, int i10, int i11, int i12, int i13, int i14, List<com.google.android.flexbox.b> list) {
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18;
        List<com.google.android.flexbox.b> list2;
        int i19;
        View view;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        com.google.android.flexbox.b bVar3;
        int i26;
        int i27 = i10;
        int i28 = i11;
        int i29 = i14;
        boolean k10 = this.f21927a.k();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        bVar.f21932a = arrayList;
        boolean z10 = i29 == -1;
        int K = K(k10);
        int I = I(k10);
        int J = J(k10);
        int H = H(k10);
        com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
        int i30 = i13;
        bVar4.f21923o = i30;
        int i31 = I + K;
        bVar4.f21913e = i31;
        int flexItemCount = this.f21927a.getFlexItemCount();
        boolean z11 = z10;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = RecyclerView.UNDEFINED_DURATION;
        while (true) {
            if (i30 >= flexItemCount) {
                i15 = i33;
                bVar2 = bVar;
                break;
            }
            View h10 = this.f21927a.h(i30);
            if (h10 == null) {
                if (N(i30, flexItemCount, bVar4)) {
                    a(arrayList, bVar4, i30, i32);
                }
            } else if (h10.getVisibility() == 8) {
                bVar4.f21917i++;
                bVar4.f21916h++;
                if (N(i30, flexItemCount, bVar4)) {
                    a(arrayList, bVar4, i30, i32);
                }
            } else {
                if (h10 instanceof CompoundButton) {
                    v((CompoundButton) h10);
                }
                FlexItem flexItem = (FlexItem) h10.getLayoutParams();
                int i36 = flexItemCount;
                if (flexItem.w() == 4) {
                    bVar4.f21922n.add(Integer.valueOf(i30));
                }
                int G = G(flexItem, k10);
                if (flexItem.Z() != -1.0f && mode == 1073741824) {
                    G = Math.round(size * flexItem.Z());
                }
                if (k10) {
                    int c10 = this.f21927a.c(i27, i31 + E(flexItem, true) + C(flexItem, true), G);
                    i16 = size;
                    i17 = mode;
                    int e10 = this.f21927a.e(i28, J + H + D(flexItem, true) + B(flexItem, true) + i32, F(flexItem, true));
                    h10.measure(c10, e10);
                    Z(i30, c10, e10, h10);
                    i18 = c10;
                } else {
                    i16 = size;
                    i17 = mode;
                    int c11 = this.f21927a.c(i28, J + H + D(flexItem, false) + B(flexItem, false) + i32, F(flexItem, false));
                    int e11 = this.f21927a.e(i27, E(flexItem, false) + i31 + C(flexItem, false), G);
                    h10.measure(c11, e11);
                    Z(i30, c11, e11, h10);
                    i18 = e11;
                }
                this.f21927a.i(i30, h10);
                i(h10, i30);
                i33 = View.combineMeasuredStates(i33, h10.getMeasuredState());
                int i37 = i32;
                int i38 = i31;
                com.google.android.flexbox.b bVar5 = bVar4;
                int i39 = i30;
                list2 = arrayList;
                int i40 = i18;
                if (P(h10, i17, i16, bVar4.f21913e, C(flexItem, k10) + M(h10, k10) + E(flexItem, k10), flexItem, i39, i34, arrayList.size())) {
                    if (bVar5.c() > 0) {
                        if (i39 > 0) {
                            i26 = i39 - 1;
                            bVar3 = bVar5;
                        } else {
                            bVar3 = bVar5;
                            i26 = 0;
                        }
                        a(list2, bVar3, i26, i37);
                        i32 = bVar3.f21915g + i37;
                    } else {
                        i32 = i37;
                    }
                    if (k10) {
                        if (flexItem.getHeight() == -1) {
                            com.google.android.flexbox.a aVar = this.f21927a;
                            i19 = i11;
                            i30 = i39;
                            view = h10;
                            view.measure(i40, aVar.e(i19, aVar.getPaddingTop() + this.f21927a.getPaddingBottom() + flexItem.O() + flexItem.C0() + i32, flexItem.getHeight()));
                            i(view, i30);
                        } else {
                            i19 = i11;
                            view = h10;
                            i30 = i39;
                        }
                    } else {
                        i19 = i11;
                        view = h10;
                        i30 = i39;
                        if (flexItem.getWidth() == -1) {
                            com.google.android.flexbox.a aVar2 = this.f21927a;
                            view.measure(aVar2.c(i19, aVar2.getPaddingLeft() + this.f21927a.getPaddingRight() + flexItem.E0() + flexItem.U0() + i32, flexItem.getWidth()), i40);
                            i(view, i30);
                        }
                    }
                    bVar4 = new com.google.android.flexbox.b();
                    bVar4.f21916h = 1;
                    i20 = i38;
                    bVar4.f21913e = i20;
                    bVar4.f21923o = i30;
                    i21 = 0;
                    i22 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i19 = i11;
                    view = h10;
                    i30 = i39;
                    bVar4 = bVar5;
                    i20 = i38;
                    bVar4.f21916h++;
                    i21 = i34 + 1;
                    i32 = i37;
                    i22 = i35;
                }
                bVar4.f21925q |= flexItem.U() != 0.0f;
                bVar4.f21926r |= flexItem.y() != 0.0f;
                int[] iArr = this.f21929c;
                if (iArr != null) {
                    iArr[i30] = list2.size();
                }
                bVar4.f21913e += M(view, k10) + E(flexItem, k10) + C(flexItem, k10);
                bVar4.f21918j += flexItem.U();
                bVar4.f21919k += flexItem.y();
                this.f21927a.b(view, i30, i21, bVar4);
                int max = Math.max(i22, L(view, k10) + D(flexItem, k10) + B(flexItem, k10) + this.f21927a.f(view));
                bVar4.f21915g = Math.max(bVar4.f21915g, max);
                if (k10) {
                    if (this.f21927a.getFlexWrap() != 2) {
                        bVar4.f21920l = Math.max(bVar4.f21920l, view.getBaseline() + flexItem.O());
                    } else {
                        bVar4.f21920l = Math.max(bVar4.f21920l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.C0());
                    }
                }
                i23 = i36;
                if (N(i30, i23, bVar4)) {
                    a(list2, bVar4, i30, i32);
                    i32 += bVar4.f21915g;
                }
                i24 = i14;
                if (i24 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).f21924p >= i24 && i30 >= i24 && !z11) {
                        i32 = -bVar4.a();
                        i25 = i12;
                        z11 = true;
                        if (i32 <= i25 && z11) {
                            bVar2 = bVar;
                            i15 = i33;
                            break;
                        }
                        i34 = i21;
                        i35 = max;
                        i30++;
                        i27 = i10;
                        flexItemCount = i23;
                        i28 = i19;
                        i31 = i20;
                        arrayList = list2;
                        mode = i17;
                        i29 = i24;
                        size = i16;
                    }
                }
                i25 = i12;
                if (i32 <= i25) {
                }
                i34 = i21;
                i35 = max;
                i30++;
                i27 = i10;
                flexItemCount = i23;
                i28 = i19;
                i31 = i20;
                arrayList = list2;
                mode = i17;
                i29 = i24;
                size = i16;
            }
            i16 = size;
            i17 = mode;
            i19 = i28;
            i24 = i29;
            list2 = arrayList;
            i20 = i31;
            i23 = flexItemCount;
            i30++;
            i27 = i10;
            flexItemCount = i23;
            i28 = i19;
            i31 = i20;
            arrayList = list2;
            mode = i17;
            i29 = i24;
            size = i16;
        }
        bVar2.f21933b = i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(List<com.google.android.flexbox.b> list, int i10) {
        int i11 = this.f21929c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f21929c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f21930d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21927a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21927a.getFlexItemCount();
        List<C0293c> l10 = l(flexItemCount);
        C0293c c0293c = new C0293c();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c0293c.f21935b = ((FlexItem) layoutParams).getOrder();
        } else {
            c0293c.f21935b = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < this.f21927a.getFlexItemCount()) {
                c0293c.f21934a = i10;
                while (i10 < flexItemCount) {
                    l10.get(i10).f21934a++;
                    i10++;
                }
            } else {
                c0293c.f21934a = flexItemCount;
            }
        } else {
            c0293c.f21934a = flexItemCount;
        }
        l10.add(c0293c);
        return U(flexItemCount + 1, l10, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.f21927a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.f21927a.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.f21927a.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f21915g = i14 - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f21927a.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
                    bVar.f21915g = i16;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f21927a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                } else if (alignContent == 3) {
                    if (sumOfCrossSize >= i14) {
                        return;
                    }
                    float size2 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i15 < size3) {
                        arrayList.add(flexLinesInternal.get(i15));
                        if (i15 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                            if (i15 == flexLinesInternal.size() - 2) {
                                bVar2.f21915g = Math.round(f10 + size2);
                                f10 = 0.0f;
                            } else {
                                bVar2.f21915g = Math.round(size2);
                            }
                            int i17 = bVar2.f21915g;
                            f10 += size2 - i17;
                            if (f10 > 1.0f) {
                                bVar2.f21915g = i17 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                bVar2.f21915g = i17 - 1;
                                f10 += 1.0f;
                            }
                            arrayList.add(bVar2);
                        }
                        i15++;
                    }
                    this.f21927a.setFlexLines(arrayList);
                } else if (alignContent == 4) {
                    if (sumOfCrossSize >= i14) {
                        this.f21927a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.b bVar3 = new com.google.android.flexbox.b();
                    bVar3.f21915g = size4;
                    for (com.google.android.flexbox.b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    this.f21927a.setFlexLines(arrayList2);
                } else if (alignContent == 5 && sumOfCrossSize < i14) {
                    float size5 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i15 < size6) {
                        com.google.android.flexbox.b bVar5 = flexLinesInternal.get(i15);
                        float f12 = bVar5.f21915g + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int round = Math.round(f12);
                        f11 += f12 - round;
                        if (f11 > 1.0f) {
                            round++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            round--;
                            f11 += 1.0f;
                        }
                        bVar5.f21915g = round;
                        i15++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.f21927a.getFlexItemCount());
        if (i12 >= this.f21927a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f21927a.getFlexDirection();
        int flexDirection2 = this.f21927a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f21927a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f21927a.getPaddingLeft();
            paddingRight = this.f21927a.getPaddingRight();
        } else if (flexDirection2 != 2 && flexDirection2 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f21927a.getLargestMainSize();
            }
            paddingLeft = this.f21927a.getPaddingTop();
            paddingRight = this.f21927a.getPaddingBottom();
        }
        int i13 = paddingLeft + paddingRight;
        int[] iArr = this.f21929c;
        int i14 = iArr != null ? iArr[i12] : 0;
        List<com.google.android.flexbox.b> flexLinesInternal = this.f21927a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i15 = i14; i15 < size2; i15++) {
            com.google.android.flexbox.b bVar = flexLinesInternal.get(i15);
            int i16 = bVar.f21913e;
            if (i16 < size && bVar.f21925q) {
                w(i10, i11, bVar, size, i13, false);
            } else if (i16 > size && bVar.f21926r) {
                T(i10, i11, bVar, size, i13, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10) {
        int[] iArr = this.f21929c;
        if (iArr == null) {
            this.f21929c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f21929c = Arrays.copyOf(this.f21929c, Math.max(iArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        long[] jArr = this.f21930d;
        if (jArr == null) {
            this.f21930d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f21930d = Arrays.copyOf(this.f21930d, Math.max(jArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        long[] jArr = this.f21931e;
        if (jArr == null) {
            this.f21931e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f21931e = Arrays.copyOf(this.f21931e, Math.max(jArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y(long j10) {
        return (int) j10;
    }
}
