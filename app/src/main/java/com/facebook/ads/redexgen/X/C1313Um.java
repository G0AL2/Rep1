package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Um  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1313Um implements I4 {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final InterfaceC1315Uo A02;
    public final IC A03;
    public final File A04;
    public final HashMap<String, ArrayList<I3>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, 11, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 11, 66, 69, 88, 95, 74, 69, 72, 78, 11, 94, 88, 78, 88, 11, 95, 67, 78, 11, 77, 68, 71, 79, 78, 89, 17, 11, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, 28, 30, 28, 23, 26, 27, 32, 28, 16, 17, 11, 26, 17, 11, 32, 22, 17, 27, 26, 7, 81, 26, 7, 22};
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public C1313Um(File file, InterfaceC1315Uo interfaceC1315Uo) {
        this(file, interfaceC1315Uo, null, false);
    }

    public C1313Um(File file, InterfaceC1315Uo interfaceC1315Uo, IC ic2) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC1315Uo;
            this.A03 = ic2;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new IH(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public C1313Um(File file, InterfaceC1315Uo interfaceC1315Uo, byte[] bArr, boolean z10) {
        this(file, interfaceC1315Uo, new IC(file, bArr, z10));
    }

    private C1312Ul A00(String str, long j10) throws I2 {
        C1312Ul A062;
        IB A09 = this.A03.A09(str);
        if (A09 == null) {
            return C1312Ul.A02(str, j10);
        }
        while (true) {
            A062 = A09.A06(j10);
            if (!A062.A05 || A062.A03.exists()) {
                break;
            }
            A05();
        }
        return A062;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I4
    /* renamed from: A01 */
    public final synchronized C1312Ul AEz(String str, long j10) throws InterruptedException, I2 {
        C1312Ul AF0;
        while (true) {
            AF0 = AF0(str, j10);
            if (AF0 == null) {
                wait();
            }
        }
        return AF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I4
    /* renamed from: A02 */
    public final synchronized C1312Ul AF0(String str, long j10) throws I2 {
        IK.A04(!this.A01);
        C1312Ul A00 = A00(str, j10);
        if (A00.A05) {
            C1312Ul A072 = this.A03.A09(str).A07(A00);
            A0C(A00, A072);
            return A072;
        }
        IB A0A = this.A03.A0A(str);
        if (!A0A.A0D()) {
            A0A.A0B(true);
            return A00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C1312Ul span = file.length() > 0 ? C1312Ul.A00(file, this.A03) : null;
                if (span != null) {
                    A0A(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (I2 e10) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e10);
        }
    }

    private void A05() throws I2 {
        ArrayList arrayList = new ArrayList();
        for (IB cachedContent : this.A03.A0D()) {
            Iterator<C1312Ul> it = cachedContent.A08().iterator();
            while (it.hasNext()) {
                C1312Ul next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((I8) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(I8 i82) {
        ArrayList<I3> arrayList = this.A05.get(i82.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACO(this, i82);
            }
        }
        this.A02.ACO(this, i82);
    }

    private void A08(I8 i82, boolean z10) throws I2 {
        IB A09 = this.A03.A09(i82.A04);
        if (A09 == null || !A09.A0E(i82)) {
            return;
        }
        this.A00 -= i82.A01;
        if (z10) {
            try {
                this.A03.A0H(A09.A03);
                this.A03.A0G();
            } finally {
                A07(i82);
            }
        }
    }

    private void A0A(C1312Ul c1312Ul) {
        this.A03.A0A(c1312Ul.A04).A09(c1312Ul);
        this.A00 += c1312Ul.A01;
        A0B(c1312Ul);
    }

    private void A0B(C1312Ul c1312Ul) {
        ArrayList<I3> arrayList = this.A05.get(c1312Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACN(this, c1312Ul);
            }
        }
        this.A02.ACN(this, c1312Ul);
    }

    private void A0C(C1312Ul c1312Ul, I8 i82) {
        ArrayList<I3> arrayList = this.A05.get(c1312Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACP(this, c1312Ul, i82);
            }
        }
        this.A02.ACP(this, c1312Ul, i82);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C1313Um.class) {
            if (A06) {
                return true;
            }
            return A08.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void A3P(String str, IG ig) throws I2 {
        IK.A04(!this.A01);
        this.A03.A0I(str, ig);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void A44(File file) throws I2 {
        IK.A04(!this.A01);
        C1312Ul A00 = C1312Ul.A00(file, this.A03);
        IK.A04(A00 != null);
        IB A09 = this.A03.A09(A00.A04);
        IK.A01(A09);
        IK.A04(A09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = IF.A00(A09.A05());
            if (A002 != -1) {
                long j10 = A00.A02;
                long length = A00.A01;
                IK.A04(j10 + length <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A5v() {
        IK.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A5w(String str, long j10, long j11) {
        IB A09;
        IK.A04(!this.A01);
        A09 = this.A03.A09(str);
        return A09 != null ? A09.A04(j10, j11) : -j11;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    @NonNull
    public final synchronized NavigableSet<I8> A5x(String str) {
        TreeSet treeSet;
        IK.A04(!this.A01);
        IB A09 = this.A03.A09(str);
        if (A09 == null || A09.A0C()) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet((Collection) A09.A08());
        }
        return treeSet;
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized long A68(String str) {
        return IF.A00(A69(str));
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized IE A69(String str) {
        IK.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void ADq(I8 i82) {
        IK.A04(!this.A01);
        IB A09 = this.A03.A09(i82.A04);
        IK.A01(A09);
        IK.A04(A09.A0D());
        A09.A0B(false);
        this.A03.A0H(A09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void ADx(I8 i82) throws I2 {
        IK.A04(!this.A01);
        A08(i82, true);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized void AEW(String str, long j10) throws I2 {
        IG ig = new IG();
        IF.A05(ig, j10);
        A3P(str, ig);
    }

    @Override // com.facebook.ads.redexgen.X.I4
    public final synchronized File AEx(String str, long j10, long j11) throws I2 {
        IB A09;
        IK.A04(!this.A01);
        A09 = this.A03.A09(str);
        IK.A01(A09);
        IK.A04(A09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACQ(this, str, j10, j11);
        return C1312Ul.A04(this.A04, A09.A02, j10, System.currentTimeMillis());
    }
}
