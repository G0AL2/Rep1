package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1590cD implements C4B {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC06212e<C06553o> A01;
    public final InterfaceC06543n A02;
    public final C4C A03;
    public final Runnable A04;
    public final ArrayList<C06553o> A05;
    public final ArrayList<C06553o> A06;
    public final boolean A07;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public C1590cD(InterfaceC06543n interfaceC06543n) {
        this(interfaceC06543n, false);
    }

    public C1590cD(InterfaceC06543n interfaceC06543n, boolean z10) {
        this.A01 = new C1603cT(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC06543n;
        this.A07 = z10;
        this.A03 = new C4C(this);
    }

    private int A00(int i10, int start) {
        int i11;
        int i12;
        for (int end = this.A06.size() - 1; end >= 0; end--) {
            C06553o c06553o = this.A06.get(end);
            if (c06553o.A00 == 8) {
                if (c06553o.A02 < c06553o.A01) {
                    i11 = c06553o.A02;
                    i12 = c06553o.A01;
                } else {
                    i11 = c06553o.A01;
                    i12 = c06553o.A02;
                }
                if (i10 >= i11 && i10 <= i12) {
                    if (i11 == c06553o.A02) {
                        if (start == 1) {
                            c06553o.A01++;
                        } else if (start == 2) {
                            c06553o.A01--;
                        }
                        i10++;
                    } else {
                        if (start == 1) {
                            c06553o.A02++;
                        } else if (start == 2) {
                            c06553o.A02--;
                        }
                        i10--;
                    }
                } else if (i10 < c06553o.A02) {
                    if (start == 1) {
                        c06553o.A02++;
                        c06553o.A01++;
                    } else if (start == 2) {
                        c06553o.A02--;
                        c06553o.A01--;
                    }
                }
            } else if (c06553o.A02 <= i10) {
                if (c06553o.A00 == 1) {
                    int i13 = c06553o.A01;
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    A09[7] = "N0sU";
                    i10 -= i13;
                } else if (c06553o.A00 == 2) {
                    i10 += c06553o.A01;
                }
            } else if (start == 1) {
                c06553o.A02++;
            } else if (start == 2) {
                c06553o.A02--;
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C06553o c06553o2 = this.A06.get(size);
            if (c06553o2.A00 == 8) {
                if (c06553o2.A01 == c06553o2.A02 || c06553o2.A01 < 0) {
                    this.A06.remove(size);
                    ADh(c06553o2);
                }
            } else if (c06553o2.A01 <= 0) {
                this.A06.remove(size);
                ADh(c06553o2);
            }
        }
        return i10;
    }

    private final int A01(int i10, int i11) {
        int size = this.A06.size();
        while (i11 < size) {
            C06553o c06553o = this.A06.get(i11);
            if (c06553o.A00 == 8) {
                if (c06553o.A02 == i10) {
                    i10 = c06553o.A01;
                } else {
                    if (c06553o.A02 < i10) {
                        i10--;
                    }
                    if (c06553o.A01 <= i10) {
                        i10++;
                    }
                }
            } else if (c06553o.A02 > i10) {
                continue;
            } else if (c06553o.A00 == 2) {
                if (i10 < c06553o.A02 + c06553o.A01) {
                    return -1;
                }
                i10 -= c06553o.A01;
            } else {
                int i12 = c06553o.A00;
                String[] strArr = A09;
                if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                if (i12 == 1) {
                    i10 += c06553o.A01;
                }
            }
            i11++;
        }
        return i10;
    }

    private void A04(C06553o c06553o) {
        A09(c06553o);
    }

    private void A05(C06553o c06553o) {
        A09(c06553o);
    }

    private void A06(C06553o c06553o) {
        int tmpEnd = c06553o.A02;
        int type = 0;
        int position = c06553o.A02 + c06553o.A01;
        char c10 = 65535;
        int i10 = c06553o.A02;
        while (i10 < position) {
            boolean z10 = false;
            if (this.A02.A5Q(i10) != null || A0C(i10)) {
                if (c10 == 0) {
                    A08(A9n(2, tmpEnd, type, null));
                    z10 = true;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    C06553o newOp = A9n(2, tmpEnd, type, null);
                    A09(newOp);
                    z10 = true;
                }
                c10 = 0;
            }
            if (z10) {
                i10 -= type;
                position -= type;
                type = 1;
            } else {
                type++;
            }
            i10++;
        }
        if (type != c06553o.A01) {
            ADh(c06553o);
            c06553o = A9n(2, tmpEnd, type, null);
        }
        if (c10 == 0) {
            A08(c06553o);
        } else {
            A09(c06553o);
        }
    }

    private void A07(C06553o c06553o) {
        int tmpEnd = c06553o.A02;
        int type = 0;
        int position = c06553o.A02 + c06553o.A01;
        char c10 = 65535;
        int i10 = c06553o.A02;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (i10 < position) {
                if (this.A02.A5Q(i10) != null || A0C(i10)) {
                    if (c10 == 0) {
                        A08(A9n(4, tmpEnd, type, c06553o.A03));
                        type = 0;
                        tmpEnd = i10;
                    }
                    c10 = 1;
                } else {
                    if (c10 == 1) {
                        C06553o newOp = A9n(4, tmpEnd, type, c06553o.A03);
                        A09(newOp);
                        type = 0;
                        tmpEnd = i10;
                    }
                    c10 = 0;
                }
                type++;
                i10++;
            } else {
                if (type != c06553o.A01) {
                    Object obj = c06553o.A03;
                    ADh(c06553o);
                    c06553o = A9n(4, tmpEnd, type, obj);
                }
                if (c10 == 0) {
                    A08(c06553o);
                    return;
                } else {
                    A09(c06553o);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.C06553o r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1590cD.A08(com.facebook.ads.redexgen.X.3o):void");
    }

    private void A09(C06553o c06553o) {
        this.A06.add(c06553o);
        int i10 = c06553o.A00;
        if (i10 == 1) {
            this.A02.A9o(c06553o.A02, c06553o.A01);
        } else if (i10 == 2) {
            this.A02.A9r(c06553o.A02, c06553o.A01);
        } else if (i10 == 4) {
            this.A02.A9U(c06553o.A02, c06553o.A01, c06553o.A03);
        } else if (i10 == 8) {
            this.A02.A9p(c06553o.A02, c06553o.A01);
        } else {
            throw new IllegalArgumentException(A02(0, 27, 5) + c06553o);
        }
    }

    private final void A0A(C06553o c06553o, int i10) {
        this.A02.AAV(c06553o);
        int i11 = c06553o.A00;
        if (i11 == 2) {
            this.A02.A9q(i10, c06553o.A01);
        } else if (i11 == 4) {
            this.A02.A9U(i10, c06553o.A01, c06553o.A03);
        } else {
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0B(List<C06553o> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ADh(list.get(i10));
        }
        list.clear();
    }

    private boolean A0C(int i10) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C06553o c06553o = this.A06.get(pos);
            if (c06553o.A00 == 8) {
                if (A01(c06553o.A01, pos + 1) == i10) {
                    return true;
                }
            } else {
                int i11 = c06553o.A00;
                if (A09[4].length() != 28) {
                    A09[7] = "h3FT";
                    if (i11 == 1) {
                        int i12 = c06553o.A02 + c06553o.A01;
                        for (int i13 = c06553o.A02; i13 < i12; i13++) {
                            if (A01(i13, pos + 1) == i10) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }

    public final int A0D(int i10) {
        return A01(i10, 0);
    }

    public final int A0E(int i10) {
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            C06553o c06553o = this.A05.get(i11);
            int i12 = c06553o.A00;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        if (c06553o.A02 == i10) {
                            i10 = c06553o.A01;
                        } else {
                            if (c06553o.A02 < i10) {
                                i10--;
                            }
                            if (c06553o.A01 <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (c06553o.A02 > i10) {
                    continue;
                } else if (c06553o.A02 + c06553o.A01 > i10) {
                    return -1;
                } else {
                    i10 -= c06553o.A01;
                }
            } else if (c06553o.A02 <= i10) {
                i10 += c06553o.A01;
            }
        }
        return i10;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A02.AAX(this.A06.get(i10));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C06553o c06553o = this.A05.get(i10);
            int i11 = c06553o.A00;
            if (i11 == 1) {
                this.A02.AAX(c06553o);
                InterfaceC06543n interfaceC06543n = this.A02;
                int i12 = c06553o.A02;
                int i13 = c06553o.A01;
                interfaceC06543n.A9o(i12, i13);
            } else if (i11 == 2) {
                this.A02.AAX(c06553o);
                InterfaceC06543n interfaceC06543n2 = this.A02;
                int i14 = c06553o.A02;
                int i15 = c06553o.A01;
                if (A09[0].charAt(28) != 'A') {
                    A09[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    interfaceC06543n2.A9q(i14, i15);
                } else {
                    A09[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    interfaceC06543n2.A9q(i14, i15);
                }
            } else if (i11 == 4) {
                this.A02.AAX(c06553o);
                InterfaceC06543n interfaceC06543n3 = this.A02;
                int i16 = c06553o.A02;
                int i17 = c06553o.A01;
                if (A09[0].charAt(28) != 'A') {
                    throw new RuntimeException();
                }
                A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                interfaceC06543n3.A9U(i16, i17, c06553o.A03);
            } else if (i11 == 8) {
                this.A02.AAX(c06553o);
                InterfaceC06543n interfaceC06543n4 = this.A02;
                int i18 = c06553o.A02;
                int i19 = c06553o.A01;
                interfaceC06543n4.A9p(i18, i19);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C06553o c06553o = this.A05.get(i10);
            int i11 = c06553o.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i12 = str.charAt(31);
            if (i12 != str2.charAt(31)) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i11 == 1) {
                A04(c06553o);
            } else if (i11 == 2) {
                A06(c06553o);
            } else if (i11 == 4) {
                A07(c06553o);
            } else if (i11 == 8) {
                A05(c06553o);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final C06553o A9n(int i10, int i11, int i12, Object obj) {
        C06553o A2O = this.A01.A2O();
        if (A2O == null) {
            return new C06553o(i10, i11, i12, obj);
        }
        A2O.A00 = i10;
        A2O.A02 = i11;
        A2O.A01 = i12;
        A2O.A03 = obj;
        return A2O;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void ADh(C06553o c06553o) {
        if (!this.A07) {
            c06553o.A03 = null;
            this.A01.ADp(c06553o);
        }
    }
}
