package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4C {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4B A00;

    public C4C(C4B c4b) {
        this.A00 = c4b;
    }

    private int A00(List<C06553o> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 == 8) {
                if (z10) {
                    return size;
                }
            } else {
                z10 = true;
            }
        }
        return -1;
    }

    private void A01(List<C06553o> list, int i10, int i11) {
        C06553o c06553o = list.get(i10);
        C06553o nextOp = list.get(i11);
        int i12 = nextOp.A00;
        if (i12 != 1) {
            if (i12 == 2) {
                A03(list, i10, c06553o, i11, nextOp);
                return;
            } else if (i12 == 4) {
                A04(list, i10, c06553o, i11, nextOp);
                return;
            } else {
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A02(list, i10, c06553o, i11, nextOp);
    }

    private void A02(List<C06553o> list, int i10, C06553o c06553o, int i11, C06553o c06553o2) {
        int i12 = 0;
        if (c06553o.A01 < c06553o2.A02) {
            i12 = 0 - 1;
        }
        if (c06553o.A02 < c06553o2.A02) {
            i12++;
        }
        if (c06553o2.A02 <= c06553o.A02) {
            c06553o.A02 += c06553o2.A01;
        }
        if (c06553o2.A02 <= c06553o.A01) {
            c06553o.A01 += c06553o2.A01;
        }
        c06553o2.A02 += i12;
        list.set(i10, c06553o2);
        list.set(i11, c06553o);
    }

    private final void A03(List<C06553o> list, int i10, C06553o c06553o, int i11, C06553o c06553o2) {
        boolean z10;
        C06553o c06553o3 = null;
        boolean z11 = false;
        if (c06553o.A02 < c06553o.A01) {
            z10 = false;
            if (c06553o2.A02 == c06553o.A02 && c06553o2.A01 == c06553o.A01 - c06553o.A02) {
                z11 = true;
            }
        } else {
            z10 = true;
            if (c06553o2.A02 == c06553o.A01 + 1 && c06553o2.A01 == c06553o.A02 - c06553o.A01) {
                z11 = true;
            }
        }
        if (c06553o.A01 < c06553o2.A02) {
            c06553o2.A02--;
        } else if (c06553o.A01 < c06553o2.A02 + c06553o2.A01) {
            c06553o2.A01--;
            c06553o.A00 = 2;
            c06553o.A01 = 1;
            int i12 = c06553o2.A01;
            if (A01[6].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
            strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
            if (i12 == 0) {
                list.remove(i11);
                this.A00.ADh(c06553o2);
                return;
            }
            return;
        }
        if (c06553o.A02 <= c06553o2.A02) {
            c06553o2.A02++;
        } else if (c06553o.A02 < c06553o2.A02 + c06553o2.A01) {
            c06553o3 = this.A00.A9n(2, c06553o.A02 + 1, (c06553o2.A02 + c06553o2.A01) - c06553o.A02, null);
            c06553o2.A01 = c06553o.A02 - c06553o2.A02;
        }
        if (z11) {
            list.set(i10, c06553o2);
            list.remove(i11);
            this.A00.ADh(c06553o);
            return;
        }
        if (z10) {
            if (c06553o3 != null) {
                if (c06553o.A02 > c06553o3.A02) {
                    c06553o.A02 -= c06553o3.A01;
                }
                if (c06553o.A01 > c06553o3.A02) {
                    c06553o.A01 -= c06553o3.A01;
                }
            }
            if (c06553o.A02 > c06553o2.A02) {
                c06553o.A02 -= c06553o2.A01;
            }
            if (c06553o.A01 > c06553o2.A02) {
                c06553o.A01 -= c06553o2.A01;
            }
        } else {
            if (c06553o3 != null) {
                if (c06553o.A02 >= c06553o3.A02) {
                    c06553o.A02 -= c06553o3.A01;
                }
                if (c06553o.A01 >= c06553o3.A02) {
                    c06553o.A01 -= c06553o3.A01;
                }
            }
            if (c06553o.A02 >= c06553o2.A02) {
                c06553o.A02 -= c06553o2.A01;
            }
            if (c06553o.A01 >= c06553o2.A02) {
                c06553o.A01 -= c06553o2.A01;
            }
        }
        list.set(i10, c06553o2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c06553o.A02 != c06553o.A01) {
            list.set(i11, c06553o);
        } else {
            list.remove(i11);
        }
        if (c06553o3 != null) {
            list.add(i10, c06553o3);
        }
    }

    private final void A04(List<C06553o> list, int i10, C06553o c06553o, int i11, C06553o c06553o2) {
        C06553o c06553o3 = null;
        C06553o c06553o4 = null;
        if (c06553o.A01 < c06553o2.A02) {
            c06553o2.A02--;
        } else if (c06553o.A01 < c06553o2.A02 + c06553o2.A01) {
            c06553o2.A01--;
            c06553o3 = this.A00.A9n(4, c06553o.A02, 1, c06553o2.A03);
        }
        if (c06553o.A02 <= c06553o2.A02) {
            c06553o2.A02++;
        } else if (c06553o.A02 < c06553o2.A02 + c06553o2.A01) {
            int i12 = (c06553o2.A02 + c06553o2.A01) - c06553o.A02;
            c06553o4 = this.A00.A9n(4, c06553o.A02 + 1, i12, c06553o2.A03);
            c06553o2.A01 -= i12;
        }
        list.set(i11, c06553o);
        if (c06553o2.A01 > 0) {
            list.set(i10, c06553o2);
        } else {
            list.remove(i10);
            this.A00.ADh(c06553o2);
        }
        if (c06553o3 != null) {
            list.add(i10, c06553o3);
        }
        if (c06553o4 != null) {
            list.add(i10, c06553o4);
        }
    }

    public final void A05(List<C06553o> list) {
        while (true) {
            int A00 = A00(list);
            if (A00 != -1) {
                A01(list, A00, A00 + 1);
            } else {
                return;
            }
        }
    }
}
