package r5;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: DefaultExecutorSupplier.java */
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f36234b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f36235c;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f36237e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f36233a = Executors.newFixedThreadPool(2, new n(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d  reason: collision with root package name */
    private final Executor f36236d = Executors.newFixedThreadPool(1, new n(10, "FrescoLightWeightBackgroundExecutor", true));

    public b(int i10) {
        this.f36234b = Executors.newFixedThreadPool(i10, new n(10, "FrescoDecodeExecutor", true));
        this.f36235c = Executors.newFixedThreadPool(i10, new n(10, "FrescoBackgroundExecutor", true));
        this.f36237e = Executors.newScheduledThreadPool(i10, new n(10, "FrescoBackgroundExecutor", true));
    }

    @Override // r5.f
    public Executor a() {
        return this.f36236d;
    }

    @Override // r5.f
    public Executor b() {
        return this.f36233a;
    }

    @Override // r5.f
    public ScheduledExecutorService c() {
        return this.f36237e;
    }

    @Override // r5.f
    public Executor d() {
        return this.f36234b;
    }

    @Override // r5.f
    public Executor e() {
        return this.f36235c;
    }

    @Override // r5.f
    public Executor f() {
        return this.f36233a;
    }

    @Override // r5.f
    public Executor g() {
        return this.f36233a;
    }
}
