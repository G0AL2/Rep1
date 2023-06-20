package fe;

/* compiled from: ArraysJVM.kt */
/* loaded from: classes3.dex */
class i {
    public static final void a(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
