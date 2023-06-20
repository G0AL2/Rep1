package ea;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CodecSpecificDataUtil.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f29655a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f29656b = {"", "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f29656b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(n0.C("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f29655a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int e(byte[] bArr, int i10) {
        int length = bArr.length - f29655a.length;
        while (i10 <= length) {
            if (f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static boolean f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f29655a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f29655a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        a0Var.P(9);
        int D = a0Var.D();
        a0Var.P(20);
        return Pair.create(Integer.valueOf(a0Var.H()), Integer.valueOf(D));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] i(byte[] bArr) {
        if (f(bArr, 0)) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            do {
                arrayList.add(Integer.valueOf(i10));
                i10 = e(bArr, i10 + f29655a.length);
            } while (i10 != -1);
            byte[][] bArr2 = new byte[arrayList.size()];
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i11)).intValue();
                int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
                byte[] bArr3 = new byte[intValue2];
                System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
                bArr2[i11] = bArr3;
                i11++;
            }
            return bArr2;
        }
        return null;
    }
}
