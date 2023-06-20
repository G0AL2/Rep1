package mf;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.concurrent.atomic.AtomicReference;
import okio.Segment;

/* compiled from: SegmentPool.kt */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    private static final int f34429c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<Segment>[] f34430d;

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f34431e = new a0();

    /* renamed from: a  reason: collision with root package name */
    private static final int f34427a = Constants.MIN_PROGRESS_STEP;

    /* renamed from: b  reason: collision with root package name */
    private static final z f34428b = new z(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f34429c = highestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f34430d = atomicReferenceArr;
    }

    private a0() {
    }

    private final AtomicReference<z> a() {
        Thread currentThread = Thread.currentThread();
        qe.k.e(currentThread, "Thread.currentThread()");
        return f34430d[(int) (currentThread.getId() & (f34429c - 1))];
    }

    public static final void b(z zVar) {
        AtomicReference<z> a10;
        z zVar2;
        qe.k.f(zVar, "segment");
        if (zVar.f34513f == null && zVar.f34514g == null) {
            if (zVar.f34511d || (zVar2 = (a10 = f34431e.a()).get()) == f34428b) {
                return;
            }
            int i10 = zVar2 != null ? zVar2.f34510c : 0;
            if (i10 >= f34427a) {
                return;
            }
            zVar.f34513f = zVar2;
            zVar.f34509b = 0;
            zVar.f34510c = i10 + Constants.BUFFER_SIZE;
            if (a10.compareAndSet(zVar2, zVar)) {
                return;
            }
            zVar.f34513f = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final z c() {
        AtomicReference<z> a10 = f34431e.a();
        z zVar = f34428b;
        z andSet = a10.getAndSet(zVar);
        if (andSet == zVar) {
            return new z();
        }
        if (andSet == null) {
            a10.set(null);
            return new z();
        }
        a10.set(andSet.f34513f);
        andSet.f34513f = null;
        andSet.f34510c = 0;
        return andSet;
    }
}
