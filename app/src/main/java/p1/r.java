package p1;

import androidx.work.WorkerParameters;
import androidx.work.impl.e0;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private e0 f35465a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.impl.v f35466b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f35467c;

    public r(e0 e0Var, androidx.work.impl.v vVar, WorkerParameters.a aVar) {
        this.f35465a = e0Var;
        this.f35466b = vVar;
        this.f35467c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f35465a.p().q(this.f35466b, this.f35467c);
    }
}
