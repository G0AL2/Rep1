package m6;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.m0;

/* compiled from: PreAllocateViewMountItem.java */
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f34254a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34255b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34256c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadableMap f34257d;

    /* renamed from: e  reason: collision with root package name */
    private final m0 f34258e;

    /* renamed from: f  reason: collision with root package name */
    private final EventEmitterWrapper f34259f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f34260g;

    public e(int i10, int i11, String str, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        this.f34254a = str;
        this.f34255b = i10;
        this.f34257d = readableMap;
        this.f34258e = m0Var;
        this.f34259f = eventEmitterWrapper;
        this.f34256c = i11;
        this.f34260g = z10;
    }

    @Override // m6.d
    public int a() {
        return this.f34255b;
    }

    @Override // m6.d
    public void b(l6.c cVar) {
        l6.d d10 = cVar.d(this.f34255b);
        if (d10 == null) {
            String str = FabricUIManager.TAG;
            z3.a.j(str, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.f34255b + "]");
            return;
        }
        d10.F(this.f34254a, this.f34256c, this.f34257d, this.f34258e, this.f34259f, this.f34260g);
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.f34256c + "] - component: " + this.f34254a + " surfaceId: " + this.f34255b + " isLayoutable: " + this.f34260g;
    }
}
