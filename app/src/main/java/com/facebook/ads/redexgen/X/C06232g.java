package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* renamed from: com.facebook.ads.redexgen.X.2g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C06232g<K, V> {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public static byte[] A07;
    public static String[] A08 = {"BrVHgBkmBksyBnnjIq0pHnqXAu9AUg3j", "iIth6RrlZFIJsCIcgsKekGbs32ChyRjv", "Uwdt1z4SmD1Mf7UvGeSYdNXOfhFYTYnY", "QITUqyWPG2VnlGrB2a6hYhF3R3KaavLD", "arDW8RiIBmWFNCZvgTvY8WvuJ76u3VTs", "pOGA2rk9V0ZEl", "438Cia9wbNYnLnXWpHR8BTCUnyjltaF2", "slnYcYZFDBEgJMtczrpzy3D6NQdPiCOq"};
    public int[] A01 = C2W.A00;
    public Object[] A02 = C2W.A02;
    public int A00 = 0;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        if (A08[5].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "Xtbm9MFCOkvOfDux5Me3XhO5K6Bs7EUd";
        strArr[1] = "PZcI0QBOeZ0LYFf6gJzuFWLZdUoY6utj";
        A07 = new byte[]{-69, 7, -5, -4, 6, -77, -32, -12, 3, -68, -62, -74, 3, 5};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A00() {
        int index = this.A00;
        if (index == 0) {
            return -1;
        }
        int A02 = A02(this.A01, index, 0);
        if (A02 < 0) {
            return A02;
        }
        if (this.A02[A02 << 1] == null) {
            return A02;
        }
        int i10 = A02 + 1;
        while (i10 < index) {
            int end = this.A01[i10];
            if (end != 0) {
                break;
            }
            Object[] objArr = this.A02;
            String[] strArr = A08;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(15);
            int end2 = str2.charAt(15);
            if (charAt != end2) {
                throw new RuntimeException();
            }
            A08[5] = "5BliZlAS3QBBz9o";
            int end3 = i10 << 1;
            if (objArr[end3] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = A02 - 1; i11 >= 0; i11--) {
            int end4 = this.A01[i11];
            if (end4 != 0) {
                break;
            }
            int end5 = i11 << 1;
            if (this.A02[end5] == null) {
                return i11;
            }
        }
        int end6 = i10 ^ (-1);
        return end6;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private final int A01(Object obj, int end) {
        int i10 = this.A00;
        if (i10 == 0) {
            if (A08[7].charAt(6) != 'Z') {
                throw new RuntimeException();
            }
            A08[7] = "y399iLZYsEEz0hzdxnUhzykHYZJwaaUE";
            return -1;
        }
        int A02 = A02(this.A01, i10, end);
        if (A02 < 0) {
            return A02;
        }
        if (obj.equals(this.A02[A02 << 1])) {
            return A02;
        }
        int i11 = A02 + 1;
        while (i11 < i10 && this.A01[i11] == end) {
            if (obj.equals(this.A02[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = A02 - 1; i12 >= 0 && this.A01[i12] == end; i12--) {
            if (obj.equals(this.A02[i12 << 1])) {
                return i12;
            }
        }
        return i11 ^ (-1);
    }

    public static int A02(int[] iArr, int i10, int i11) {
        try {
            return C2W.A02(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    private void A05(int i10) {
        if (i10 == 8) {
            synchronized (C1604cU.class) {
                if (A06 != null) {
                    Object[] objArr = A06;
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C1604cU.class) {
                if (A05 != null) {
                    Object[] objArr2 = A05;
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i10];
        this.A02 = new Object[i10 << 1];
    }

    public static void A06(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C1604cU.class) {
                if (A04 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    A06 = objArr;
                    A04++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1604cU.class) {
                if (A03 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    A05 = objArr;
                    A03++;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A07(Object obj) {
        int i10 = this.A00 * 2;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    int i12 = i11 >> 1;
                    return i12;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i10; i13 += 2) {
            if (obj.equals(objArr[i13])) {
                int i14 = i13 >> 1;
                return i14;
            }
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int A08(Object obj) {
        return obj == null ? A00() : A01(obj, obj.hashCode());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final K A09(int i10) {
        return (K) this.A02[i10 << 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0A(int i10) {
        int i11;
        Object[] objArr = this.A02;
        V v10 = (V) objArr[(i10 << 1) + 1];
        int i12 = this.A00;
        if (i12 <= 1) {
            A06(this.A01, objArr, i12);
            this.A01 = C2W.A00;
            this.A02 = C2W.A02;
            i11 = 0;
        } else {
            i11 = i12 - 1;
            int[] iArr = this.A01;
            int osize = iArr.length;
            int i13 = 8;
            if (osize > 8) {
                int i14 = this.A00;
                int osize2 = iArr.length;
                if (i14 < osize2 / 3) {
                    if (i12 > 8) {
                        int osize3 = i12 >> 1;
                        i13 = i12 + osize3;
                    }
                    int[] iArr2 = this.A01;
                    Object[] objArr2 = this.A02;
                    A05(i13);
                    if (i12 == this.A00) {
                        if (i10 > 0) {
                            int[] ohashes = this.A01;
                            System.arraycopy(iArr2, 0, ohashes, 0, i10);
                            System.arraycopy(objArr2, 0, this.A02, 0, i10 << 1);
                        }
                        if (i10 < i11) {
                            System.arraycopy(iArr2, i10 + 1, this.A01, i10, i11 - i10);
                            System.arraycopy(objArr2, (i10 + 1) << 1, this.A02, i10 << 1, (i11 - i10) << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
            }
            if (i10 < i11) {
                int[] iArr3 = this.A01;
                System.arraycopy(iArr3, i10 + 1, iArr3, i10, i11 - i10);
                Object[] objArr3 = this.A02;
                System.arraycopy(objArr3, (i10 + 1) << 1, objArr3, i10 << 1, (i11 - i10) << 1);
            }
            Object[] objArr4 = this.A02;
            objArr4[i11 << 1] = null;
            objArr4[(i11 << 1) + 1] = null;
        }
        int i15 = this.A00;
        String[] strArr = A08;
        String str = strArr[0];
        String str2 = strArr[1];
        int charAt = str.charAt(11);
        int osize4 = str2.charAt(11);
        if (charAt != osize4) {
            String[] strArr2 = A08;
            strArr2[0] = "xFHRCOjHDqSI1UlNRZSx5FadcPcGQITj";
            strArr2[1] = "4ZMke5GLOi53P3lo3UgzHK3l5Qzb3367";
            if (i12 == i15) {
                this.A00 = i11;
                return v10;
            }
            throw new ConcurrentModificationException();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0B(int i10) {
        return (V) this.A02[(i10 << 1) + 1];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V A0C(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.A02;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void A0D(int i10) {
        int i11 = this.A00;
        if (this.A01.length < i10) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            A05(i10);
            if (this.A00 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i11);
                System.arraycopy(objArr, 0, this.A02, 0, i11 << 1);
            }
            A06(iArr, objArr, i11);
        }
        if (this.A00 == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final void clear() {
        if (this.A00 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            int i10 = this.A00;
            this.A01 = C2W.A00;
            Object[] oarray = C2W.A02;
            this.A02 = oarray;
            this.A00 = 0;
            A06(iArr, objArr, i10);
        }
        if (this.A00 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsKey(Object obj) {
        return A08(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean containsValue(Object obj) {
        return A07(obj) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
        return false;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<?, ?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 != r7) goto L4
            return r5
        L4:
            boolean r0 = r7 instanceof com.facebook.ads.redexgen.X.C06232g
            r4 = 0
            if (r0 == 0) goto L41
            com.facebook.ads.redexgen.X.2g r7 = (com.facebook.ads.redexgen.X.C06232g) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 == r0) goto L16
            return r4
        L16:
            r3 = r4
        L17:
            int r0 = r6.A00     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            if (r3 >= r0) goto L3e
            java.lang.Object r2 = r6.A09(r3)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            java.lang.Object r1 = r6.A0B(r3)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            java.lang.Object r0 = r7.get(r2)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            if (r1 != 0) goto L32
            if (r0 != 0) goto L3c
            boolean r0 = r7.containsKey(r2)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            if (r0 != 0) goto L39
            goto L3c
        L32:
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L3f java.lang.NullPointerException -> L40
            if (r0 != 0) goto L39
            goto L3d
        L39:
            int r3 = r3 + 1
            goto L17
        L3c:
            return r4
        L3d:
            return r4
        L3e:
            return r5
        L3f:
            return r4
        L40:
            return r4
        L41:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L7d
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 == r0) goto L52
            return r4
        L52:
            r3 = r4
        L53:
            int r0 = r6.A00     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            if (r3 >= r0) goto L7a
            java.lang.Object r2 = r6.A09(r3)     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            java.lang.Object r1 = r6.A0B(r3)     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            java.lang.Object r0 = r7.get(r2)     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            if (r1 != 0) goto L6e
            if (r0 != 0) goto L78
            boolean r0 = r7.containsKey(r2)     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            if (r0 != 0) goto L75
            goto L78
        L6e:
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7b java.lang.NullPointerException -> L7c
            if (r0 != 0) goto L75
            goto L79
        L75:
            int r3 = r3 + 1
            goto L53
        L78:
            return r4
        L79:
            return r4
        L7a:
            return r5
        L7b:
            return r4
        L7c:
            return r4
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06232g.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V get(Object obj) {
        int A082 = A08(obj);
        if (A082 >= 0) {
            return (V) this.A02[(A082 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i10 = 0;
        int v10 = 0;
        int s10 = 1;
        int i11 = this.A00;
        while (v10 < i11) {
            Object obj = objArr[s10];
            i10 += iArr[v10] ^ (obj == null ? 0 : obj.hashCode());
            v10++;
            s10 += 2;
        }
        return i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V put(K k10, V v10) {
        int hashCode;
        int A01;
        int n10 = this.A00;
        if (k10 == null) {
            hashCode = 0;
            A01 = A00();
        } else {
            hashCode = k10.hashCode();
            A01 = A01(k10, hashCode);
        }
        if (A01 >= 0) {
            int i10 = (A01 << 1) + 1;
            Object[] objArr = this.A02;
            V value = (V) objArr[i10];
            objArr[i10] = v10;
            return value;
        }
        int i11 = A01 ^ (-1);
        if (n10 >= this.A01.length) {
            int i12 = 4;
            if (n10 >= 8) {
                i12 = (n10 >> 1) + n10;
            } else if (n10 >= 4) {
                i12 = 8;
            }
            int[] iArr = this.A01;
            Object[] objArr2 = this.A02;
            A05(i12);
            if (n10 == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A06(iArr, objArr2, n10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < n10) {
            int[] iArr3 = this.A01;
            System.arraycopy(iArr3, i11, iArr3, i11 + 1, n10 - i11);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i11 << 1, objArr3, (i11 + 1) << 1, (this.A00 - i11) << 1);
        }
        int i13 = this.A00;
        if (n10 == i13) {
            int[] iArr4 = this.A01;
            if (i11 < iArr4.length) {
                iArr4[i11] = hashCode;
                Object[] objArr4 = this.A02;
                objArr4[i11 << 1] = k10;
                objArr4[(i11 << 1) + 1] = v10;
                this.A00 = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final V remove(Object obj) {
        int A082 = A08(obj);
        if (A082 >= 0) {
            return A0A(A082);
        }
        String[] strArr = A08;
        if (strArr[2].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        A08[5] = "POG7nMkVNzdGaGlGxNMu0E80q";
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    public final int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.SimpleArrayMap<K, V> */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L10
            r2 = 12
            r1 = 2
            r0 = 31
            java.lang.String r0 = A03(r2, r1, r0)
            return r0
        L10:
            int r0 = r9.A00
            int r0 = r0 * 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r4.append(r0)
            r5 = 0
        L1f:
            int r0 = r9.A00
            if (r5 >= r0) goto L7b
            if (r5 <= 0) goto L31
            r2 = 10
            r1 = 2
            r0 = 45
            java.lang.String r0 = A03(r2, r1, r0)
            r4.append(r0)
        L31:
            java.lang.Object r7 = r9.A09(r5)
            r8 = 0
            r6 = 10
            r3 = 42
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C06232g.A08
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C06232g.A08
            java.lang.String r1 = "5MoFeGsxqoTSR8Y6IShdOiE5VevAoRo0"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "kGPruxXsJMcA49LPD5OztVvQJS4oto1Y"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = A03(r8, r6, r3)
            if (r7 == r9) goto L71
            r4.append(r7)
        L5c:
            r0 = 61
            r4.append(r0)
            java.lang.Object r0 = r9.A0B(r5)
            if (r0 == r9) goto L6d
            r4.append(r0)
        L6a:
            int r5 = r5 + 1
            goto L1f
        L6d:
            r4.append(r1)
            goto L6a
        L71:
            r4.append(r1)
            goto L5c
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7b:
            r0 = 125(0x7d, float:1.75E-43)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C06232g.toString():java.lang.String");
    }
}
