package androidx.lifecycle;

import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements m {

    /* renamed from: a  reason: collision with root package name */
    private final g f3312a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3313b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3314a;

        static {
            int[] iArr = new int[i.b.values().length];
            f3314a = iArr;
            try {
                iArr[i.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3314a[i.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3314a[i.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3314a[i.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3314a[i.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3314a[i.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3314a[i.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(g gVar, m mVar) {
        this.f3312a = gVar;
        this.f3313b = mVar;
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        switch (a.f3314a[bVar.ordinal()]) {
            case 1:
                this.f3312a.a(pVar);
                break;
            case 2:
                this.f3312a.h(pVar);
                break;
            case 3:
                this.f3312a.c(pVar);
                break;
            case 4:
                this.f3312a.d(pVar);
                break;
            case 5:
                this.f3312a.e(pVar);
                break;
            case 6:
                this.f3312a.f(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        m mVar = this.f3313b;
        if (mVar != null) {
            mVar.b(pVar, bVar);
        }
    }
}
