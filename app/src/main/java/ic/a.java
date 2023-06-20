package ic;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f31921a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f31922b;

    /* renamed from: c  reason: collision with root package name */
    private final b f31923c;

    public a(int i10, d... dVarArr) {
        this.f31921a = i10;
        this.f31922b = dVarArr;
        this.f31923c = new b(i10);
    }

    @Override // ic.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.f31921a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f31922b) {
            if (stackTraceElementArr2.length <= this.f31921a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f31921a ? this.f31923c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
