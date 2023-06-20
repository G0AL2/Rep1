package m6;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* compiled from: SendAccessibilityEvent.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f34261a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34262b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34263c;

    public f(int i10, int i11, int i12) {
        this.f34261a = i10;
        this.f34262b = i11;
        this.f34263c = i12;
    }

    @Override // m6.d
    public int a() {
        return this.f34261a;
    }

    @Override // m6.d
    public void b(l6.c cVar) {
        try {
            cVar.o(this.f34261a, this.f34262b, this.f34263c);
        } catch (RetryableMountingLayerException e10) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", e10);
        }
    }

    public String toString() {
        return "SendAccessibilityEvent [" + this.f34262b + "] " + this.f34263c;
    }
}
