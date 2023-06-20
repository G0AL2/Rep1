package ic;

/* compiled from: MiddleOutStrategy.java */
/* loaded from: classes3.dex */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f31924a;

    public b(int i10) {
        this.f31924a = i10;
    }

    @Override // ic.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f31924a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
