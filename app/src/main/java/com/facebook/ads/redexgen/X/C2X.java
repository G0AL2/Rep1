package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2X  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2X<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, 27, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2X() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C2X(int i10) {
        this.A01 = false;
        if (i10 == 0) {
            this.A02 = C2W.A01;
            this.A03 = C2W.A02;
        } else {
            int A00 = C2W.A00(i10);
            this.A02 = new long[A00];
            this.A03 = new Object[A00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i10) {
        if (this.A01) {
            A04();
        }
        return this.A02[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01 */
    public final C2X<E> clone() {
        C2X<E> c2x = null;
        try {
            c2x = (C2X) super.clone();
            c2x.A02 = (long[]) this.A02.clone();
            c2x.A03 = (Object[]) this.A03.clone();
            return c2x;
        } catch (CloneNotSupportedException unused) {
            return c2x;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j10, E e10) {
        int A03 = C2W.A03(this.A02, this.A00, j10);
        if (A03 >= 0) {
            Object[] objArr = this.A03;
            if (objArr[A03] != A05) {
                return (E) objArr[A03];
            }
        }
        return e10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int o10 = this.A00;
        int i10 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < o10; i11++) {
            Object obj = objArr[i11];
            if (obj != A05) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.A01 = false;
        this.A00 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i10) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j10) {
        return A02(j10, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i10 = this.A00;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i10) {
        Object[] objArr = this.A03;
        Object obj = objArr[i10];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.A01 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j10, E e10) {
        int A03 = C2W.A03(this.A02, this.A00, j10);
        if (A03 >= 0) {
            this.A03[A03] = e10;
            return;
        }
        int i10 = A03 ^ (-1);
        if (i10 < this.A00) {
            Object[] objArr = this.A03;
            if (objArr[i10] == A05) {
                this.A02[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.A01 && this.A00 >= this.A02.length) {
            A04();
            i10 = C2W.A03(this.A02, this.A00, j10) ^ (-1);
        }
        int i11 = this.A00;
        if (i11 >= this.A02.length) {
            int A00 = C2W.A00(i11 + 1);
            long[] jArr = new long[A00];
            Object[] objArr2 = new Object[A00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i12 = this.A00;
        if (i12 - i10 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, i10, jArr3, i10 + 1, i12 - i10);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i10, objArr4, i10 + 1, this.A00 - i10);
        }
        this.A02[i10] = j10;
        this.A03[i10] = e10;
        this.A00++;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.A06()
            if (r0 > 0) goto L10
            r2 = 12
            r1 = 2
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            return r0
        L10:
            int r0 = r5.A00
            int r0 = r0 * 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            r4 = 0
        L1f:
            int r0 = r5.A00
            if (r4 >= r0) goto L56
            if (r4 <= 0) goto L31
            r2 = 10
            r1 = 2
            r0 = 65
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
        L31:
            long r0 = r5.A00(r4)
            r3.append(r0)
            r0 = 61
            r3.append(r0)
            java.lang.Object r0 = r5.A07(r4)
            if (r0 == r5) goto L49
            r3.append(r0)
        L46:
            int r4 = r4 + 1
            goto L1f
        L49:
            r2 = 0
            r1 = 10
            r0 = 13
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            goto L46
        L56:
            r0 = 125(0x7d, float:1.75E-43)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2X.toString():java.lang.String");
    }
}
