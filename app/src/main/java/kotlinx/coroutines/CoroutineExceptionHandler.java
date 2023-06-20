package kotlinx.coroutines;

import ie.g;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f33475c0 = a.f33476a;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f33476a = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
