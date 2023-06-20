package jb;

/* compiled from: Hashing.java */
/* loaded from: classes3.dex */
final class p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d10 * highestOneBit))) {
            int i11 = highestOneBit << 1;
            if (i11 > 0) {
                return i11;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
