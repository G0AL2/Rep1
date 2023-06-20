package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.eO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1714eO {
    @Nullable
    public InterfaceC1717eR A00;
    @Nullable
    public InterfaceC1715eP A01;
    public C1702eC A02;
    public final InterfaceC1724eY A03;
    @Nullable
    public final InterfaceC1716eQ A04;

    public C1714eO(InterfaceC1724eY interfaceC1724eY, @Nullable InterfaceC1716eQ interfaceC1716eQ) {
        this.A03 = interfaceC1724eY;
        this.A04 = interfaceC1716eQ;
    }

    public static C1714eO A00() {
        return new C1714eO(new GO(), null);
    }

    private void A01(AbstractC1718eS abstractC1718eS, InterfaceC1722eW interfaceC1722eW, GL gl) {
        this.A02 = C1702eC.A00(abstractC1718eS, interfaceC1722eW, gl);
        InterfaceC1717eR interfaceC1717eR = this.A00;
        if (interfaceC1717eR != null) {
            this.A02.A03(interfaceC1717eR);
        }
        InterfaceC1715eP interfaceC1715eP = this.A01;
        if (interfaceC1715eP != null) {
            this.A02.A04(interfaceC1715eP);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C1720eU c1720eU) {
        this.A02.A02(view, c1720eU);
    }

    public final void A04(AbstractC1718eS abstractC1718eS, View view) {
        A01(abstractC1718eS, new GN(view, this.A03), new GL(this.A04) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A07;
            public static String[] A08 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A09;
            public long A00;
            @Nullable
            public InterfaceC1717eR A01;
            @Nullable
            public final InterfaceC1716eQ A02;
            public final Map<String, C1706eG> A06 = new HashMap();
            public final C1707eH A04 = new C1707eH();
            public final C1707eH A03 = new C1707eH();
            public final List<Rect> A05 = new ArrayList(1);

            public static String A02(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A07 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A09 = C06473g.class.getSimpleName();
            }

            {
                this.A02 = r3;
            }

            public static Rect A00(@Nullable C1706eG c1706eG) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c1706eG != null) {
                    rect = c1706eG.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c1706eG.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c1706eG.A02;
                            String[] strArr = A08;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[1] = "p";
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c1706eG.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c1706eG.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1706eG A01(C1720eU c1720eU, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C1706eG c1706eG = this.A06.get(c1720eU.A03);
                A06 = this.A04.A06(c1720eU);
                if (A06) {
                    if (c1706eG != null) {
                        c1706eG.A01 = EnumC1710eK.A04;
                    } else {
                        c1706eG = C1706eG.A03(this.A00);
                        this.A06.put(c1720eU.A03, c1706eG);
                    }
                }
                rect3 = c1706eG.A02;
                rect3.set(rect2);
                list = c1706eG.A03;
                list.add(new Rect(rect));
                return c1706eG;
            }

            private void A04(C1707eH c1707eH) {
                Collection<C1720eU> A01;
                List list;
                A01 = c1707eH.A01();
                for (C1720eU c1720eU : A01) {
                    C1706eG c1706eG = this.A06.get(c1720eU.A03);
                    if (c1706eG == null) {
                        InterfaceC1716eQ interfaceC1716eQ = this.A02;
                        String[] strArr = A08;
                        if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                        strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                        if (interfaceC1716eQ != null) {
                            String str = A02(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 36, 10) + c1720eU.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1706eG.A01 = EnumC1710eK.A03;
                        list = c1706eG.A03;
                        list.clear();
                        c1720eU.A03(this);
                    }
                }
            }

            private void A05(C1707eH c1707eH) {
                Collection<C1720eU> A00;
                A00 = c1707eH.A00();
                for (C1720eU c1720eU : A00) {
                    c1720eU.A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3J(C1720eU c1720eU, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c1720eU, rect, rect2);
                C1720eU c1720eU2 = c1720eU.A00;
                if (c1720eU2 == C1720eU.A06) {
                    return;
                }
                A06 = this.A03.A06(c1720eU2);
                C1706eG c1706eG = this.A06.get(c1720eU2.A03);
                if (A06) {
                    if (c1706eG == null) {
                        c1706eG = C1706eG.A03(this.A00);
                        rect3 = c1706eG.A02;
                        rect3.set(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
                        this.A06.put(c1720eU2.A03, c1706eG);
                    } else {
                        list2 = c1706eG.A03;
                        list2.clear();
                        c1706eG.A01 = EnumC1710eK.A04;
                    }
                }
                list = c1706eG.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3q(long j10, List<Rect> list) {
                Collection<C1720eU> A01;
                Collection<C1720eU> A012;
                List list2;
                this.A00 = j10;
                this.A05.clear();
                for (Rect rect : list) {
                    this.A05.add(new Rect(rect));
                }
                A01 = this.A04.A01();
                for (C1720eU c1720eU : A01) {
                    this.A06.remove(c1720eU.A03);
                }
                A012 = this.A03.A01();
                for (C1720eU c1720eU2 : A012) {
                    this.A06.remove(c1720eU2.A03);
                }
                for (C1706eG c1706eG : this.A06.values()) {
                    list2 = c1706eG.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A5E() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C1705eF(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1709eJ
            public final void A6j(C1720eU c1720eU, Rect rect) {
                List<Rect> list;
                rect.setEmpty();
                list = this.A06.get(c1720eU.A03).A03;
                for (Rect rect2 : list) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1709eJ
            public final EnumC1710eK A7o(C1720eU c1720eU) {
                EnumC1710eK enumC1710eK;
                enumC1710eK = this.A06.get(c1720eU.A03).A01;
                return enumC1710eK;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1709eJ
            public final void A7q(Rect rect) {
                rect.setEmpty();
                for (Rect rect2 : this.A05) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1709eJ
            public final float A7r(C1720eU c1720eU) {
                List<Rect> list;
                C1706eG c1706eG = this.A06.get(c1720eU.A03);
                if (c1706eG != null) {
                    Rect A00 = A00(c1706eG);
                    int height = A00.height() * A00.width();
                    int i10 = 0;
                    list = c1706eG.A03;
                    for (Rect rect : list) {
                        int totalPossibleArea = rect.height();
                        int totalVisibleArea = rect.width();
                        i10 += totalPossibleArea * totalVisibleArea;
                    }
                    return i10 / height;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void AEk(@Nullable InterfaceC1717eR interfaceC1717eR) {
                this.A01 = interfaceC1717eR;
            }
        });
    }
}
