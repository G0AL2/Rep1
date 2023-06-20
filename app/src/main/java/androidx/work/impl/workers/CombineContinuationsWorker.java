package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.k;
import qe.k;

/* compiled from: CombineContinuationsWorker.kt */
/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public k.a doWork() {
        k.a d10 = k.a.d(getInputData());
        qe.k.e(d10, "success(inputData)");
        return d10;
    }
}
