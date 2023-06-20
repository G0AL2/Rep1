package we;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38655a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38656b;

    /* renamed from: c  reason: collision with root package name */
    public final w1 f38657c;

    public t(Object obj, Object obj2, w1 w1Var) {
        qe.k.g(w1Var, IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY);
        this.f38655a = obj;
        this.f38656b = obj2;
        this.f38657c = w1Var;
    }

    public String toString() {
        return "CompletedIdempotentResult[" + this.f38656b + ']';
    }
}
