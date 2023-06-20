package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06322q {
    public static String[] A05 = {"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C06322q(@NonNull View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.A00;
        }
        return this.A01;
    }

    private void A01(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.A01 = viewParent;
        } else if (i10 != 1) {
        } else {
            this.A00 = viewParent;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i10) {
        ViewParent A00 = A00(i10);
        if (A00 != null) {
            C3O.A02(A00, this.A04, i10);
            A01(i10, null);
        }
    }

    public final void A04(boolean z10) {
        if (this.A02) {
            AnonymousClass38.A08(this.A04);
        }
        this.A02 = z10;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f10, float f11) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3O.A06(A00, this.A04, f10, f11);
    }

    public final boolean A08(float f10, float f11, boolean z10) {
        ViewParent A00;
        if (!A06() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3O.A07(A00, this.A04, f10, f11, z10);
    }

    public final boolean A09(int i10) {
        return A00(i10) != null;
    }

    public final boolean A0A(int i10) {
        return A0B(i10, 0);
    }

    public final boolean A0B(int i10, int i11) {
        if (A09(i11)) {
            return true;
        }
        if (A06()) {
            if (A05[0].charAt(13) != 't') {
                String[] strArr = A05;
                strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
                strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
                View view = this.A04;
                for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                    if (C3O.A08(parent, view, this.A04, i10, i11)) {
                        A01(i11, parent);
                        C3O.A05(parent, view, this.A04, i10, i11);
                        return true;
                    }
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                }
                return false;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final boolean A0C(int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return A0D(i10, i11, i12, i13, iArr, 0);
    }

    public final boolean A0D(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        ViewParent A00;
        if (!A06() || (A00 = A00(i14)) == null) {
            return false;
        }
        if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            int startY = 0;
            int i15 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                startY = iArr[0];
                i15 = iArr[1];
            }
            C3O.A03(A00, this.A04, i10, i11, i12, i13, i14);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - startY;
                iArr[1] = iArr[1] - i15;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return A0F(i10, i11, iArr, iArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        r16.A03 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        r14 = r16.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0F(int r17, int r18, @androidx.annotation.Nullable int[] r19, @androidx.annotation.Nullable int[] r20, int r21) {
        /*
            r16 = this;
            r14 = r19
            r1 = r16
            r4 = r1
            boolean r0 = r1.A06()
            r9 = 0
            if (r0 == 0) goto La7
            r15 = r21
            android.view.ViewParent r10 = r1.A00(r15)
            if (r10 != 0) goto L15
            return r9
        L15:
            r8 = 1
            r13 = r18
            r3 = r20
            r12 = r17
            if (r12 != 0) goto L20
            if (r13 == 0) goto La1
        L20:
            r7 = 0
            r6 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C06322q.A05
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L9b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06322q.A05
            java.lang.String r1 = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L41
            android.view.View r0 = r4.A04
            r0.getLocationInWindow(r3)
            r7 = r3[r9]
            r6 = r3[r8]
        L41:
            if (r14 != 0) goto L67
            int[] r5 = r4.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06322q.A05
            r0 = 5
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06322q.A05
            java.lang.String r1 = ""
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto L65
        L60:
            r0 = 2
            int[] r0 = new int[r0]
            r4.A03 = r0
        L65:
            int[] r14 = r4.A03
        L67:
            r14[r9] = r9
            r14[r8] = r9
            android.view.View r11 = r4.A04
            com.facebook.ads.redexgen.X.C3O.A04(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L81
            android.view.View r0 = r4.A04
            r0.getLocationInWindow(r3)
            r0 = r3[r9]
            int r0 = r0 - r7
            r3[r9] = r0
            r0 = r3[r8]
            int r0 = r0 - r6
            r3[r8] = r0
        L81:
            r0 = r14[r9]
            if (r0 != 0) goto L89
            r0 = r14[r8]
            if (r0 == 0) goto L8a
        L89:
            return r8
        L8a:
            r8 = 0
            goto L89
        L8c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06322q.A05
            java.lang.String r1 = "gHL5QaZEq3qu3ZW6"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "on2hgQBHubksAtN0"
            r0 = 7
            r2[r0] = r1
            if (r5 != 0) goto L65
            goto L60
        L9b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La1:
            if (r3 == 0) goto La7
            r3[r9] = r9
            r3[r8] = r9
        La7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06322q.A0F(int, int, int[], int[], int):boolean");
    }
}
