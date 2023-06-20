package cb;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* loaded from: classes3.dex */
final class l extends f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f5442b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n f5443c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(n nVar, IBinder iBinder) {
        this.f5443c = nVar;
        this.f5442b = iBinder;
    }

    @Override // cb.f
    public final void a() {
        k kVar;
        List<Runnable> list;
        List list2;
        o oVar = this.f5443c.f5445a;
        kVar = oVar.f5453g;
        oVar.f5457k = (IInterface) kVar.a(this.f5442b);
        o.n(this.f5443c.f5445a);
        this.f5443c.f5445a.f5451e = false;
        list = this.f5443c.f5445a.f5450d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f5443c.f5445a.f5450d;
        list2.clear();
    }
}
