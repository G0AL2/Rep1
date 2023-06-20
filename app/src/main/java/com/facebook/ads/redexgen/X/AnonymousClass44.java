package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.44  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<F9> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432) {
                if ((anonymousClass43.A03 == null) != (anonymousClass432.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                } else if (anonymousClass43.A04 != anonymousClass432.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                } else {
                    int i10 = anonymousClass432.A02 - anonymousClass43.A02;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = anonymousClass43.A00 - anonymousClass432.A00;
                    if (i11 != 0) {
                        return i11;
                    }
                    return 0;
                }
            }
        };
    }

    private AbstractC06774l A00(F9 f92, int i10, long j10) {
        if (A08(f92, i10)) {
            return null;
        }
        C06674b c06674b = f92.A0r;
        try {
            f92.A1L();
            AbstractC06774l A0I = c06674b.A0I(i10, false, j10);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c06674b.A0X(A0I.A0H);
                } else {
                    c06674b.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            f92.A1q(false);
        }
    }

    private void A02() {
        AnonymousClass43 task;
        int i10 = this.A02.size();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            F9 f92 = this.A02.get(i12);
            int totalTaskCount = f92.getWindowVisibility();
            if (totalTaskCount == 0) {
                f92.A02.A04(f92, false);
                int totalTaskCount2 = f92.A02.A00;
                i11 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i11);
        int i13 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i14 = 0; i14 < i10; i14++) {
            F9 f93 = this.A02.get(i14);
            int totalTaskCount4 = f93.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C1589cC c1589cC = f93.A02;
                int abs = Math.abs(c1589cC.A01) + Math.abs(c1589cC.A02);
                for (int i15 = 0; i15 < c1589cC.A00 * 2; i15 += 2) {
                    if (i13 >= this.A03.size()) {
                        task = new AnonymousClass43();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i13);
                    }
                    int j10 = i15 + 1;
                    int i16 = c1589cC.A03[j10];
                    task.A04 = i16 <= abs;
                    task.A02 = abs;
                    task.A00 = i16;
                    task.A03 = f93;
                    int j11 = c1589cC.A03[i15];
                    task.A01 = j11;
                    i13++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j10) {
        for (int i10 = 0; i10 < this.A03.size(); i10++) {
            AnonymousClass43 anonymousClass43 = this.A03.get(i10);
            if (anonymousClass43.A03 == null) {
                return;
            }
            A06(anonymousClass43, j10);
            anonymousClass43.A00();
        }
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j10) {
        AbstractC06774l A00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j10);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j10);
        }
    }

    private void A07(@Nullable F9 f92, long j10) {
        if (f92 == null) {
            return;
        }
        if (f92.A0C) {
            C06583r c06583r = f92.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c06583r.A06() != 0) {
                    f92.A1O();
                }
            }
            throw new RuntimeException();
        }
        C1589cC c1589cC = f92.A02;
        c1589cC.A04(f92, true);
        if (c1589cC.A00 != 0) {
            try {
                C2V.A01(A01(0, 18, 7));
                f92.A0s.A05(f92.A04);
                int i10 = 0;
                while (true) {
                    int i11 = c1589cC.A00 * 2;
                    if (A06[6].charAt(8) == 'I') {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i10 < i11) {
                        A00(f92, c1589cC.A03[i10], j10);
                        i10 += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C2V.A00();
            }
        }
    }

    public static boolean A08(F9 f92, int i10) {
        int A062 = f92.A01.A06();
        for (int i11 = 0; i11 < A062; i11++) {
            View attachedView = f92.A01.A0A(i11);
            AbstractC06774l A0G = F9.A0G(attachedView);
            if (A0G.A03 == i10 && !A0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(F9 f92) {
        this.A02.add(f92);
    }

    public final void A0A(F9 f92) {
        this.A02.remove(f92);
    }

    public final void A0B(F9 f92, int i10, int i11) {
        if (f92.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = f92.getNanoTime();
            f92.post(this);
        }
        f92.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                F9 f92 = this.A02.get(i10);
                int i11 = f92.getWindowVisibility();
                if (i11 == 0) {
                    j10 = Math.max(f92.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(j10);
            A05(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C2V.A00();
        }
    }
}
