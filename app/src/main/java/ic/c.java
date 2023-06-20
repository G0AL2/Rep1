package ic;

import java.util.HashMap;

/* compiled from: RemoveRepeatsStrategy.java */
/* loaded from: classes3.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f31925a;

    public c(int i10) {
        this.f31925a = i10;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i11 + i12 > stackTraceElementArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!stackTraceElementArr[i10 + i13].equals(stackTraceElementArr[i11 + i13])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i10) {
        int i11;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && b(stackTraceElementArr, num.intValue(), i12)) {
                int intValue = i12 - num.intValue();
                if (i14 < i10) {
                    System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, intValue);
                    i13 += intValue;
                    i14++;
                }
                i11 = (intValue - 1) + i12;
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = i12;
                i14 = 1;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return stackTraceElementArr3;
    }

    @Override // ic.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c10 = c(stackTraceElementArr, this.f31925a);
        return c10.length < stackTraceElementArr.length ? c10 : stackTraceElementArr;
    }
}
