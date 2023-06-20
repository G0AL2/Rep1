package y3;

/* compiled from: Ints.java */
/* loaded from: classes.dex */
public class i {
    public static int a(int... iArr) {
        k.b(Boolean.valueOf(iArr.length > 0));
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (iArr[i11] > i10) {
                i10 = iArr[i11];
            }
        }
        return i10;
    }
}
