package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4762a = l.i("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    /* loaded from: classes.dex */
    class a extends y {
        a() {
        }

        @Override // androidx.work.y
        public k a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static y c() {
        return new a();
    }

    public abstract k a(Context context, String str, WorkerParameters workerParameters);

    public final k b(Context context, String str, WorkerParameters workerParameters) {
        k a10 = a(context, str, workerParameters);
        if (a10 == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(k.class);
            } catch (Throwable th) {
                l e10 = l.e();
                String str2 = f4762a;
                e10.d(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a10 = (k) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    l e11 = l.e();
                    String str3 = f4762a;
                    e11.d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a10 == null || !a10.isUsed()) {
            return a10;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
