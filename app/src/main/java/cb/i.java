package cb;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f5439b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(o oVar) {
        this.f5439b = oVar;
    }

    @Override // cb.f
    public final void a() {
        IInterface iInterface;
        e eVar;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f5439b.f5457k;
        if (iInterface != null) {
            eVar = this.f5439b.f5448b;
            eVar.f("Unbind from service.", new Object[0]);
            context = this.f5439b.f5447a;
            serviceConnection = this.f5439b.f5456j;
            context.unbindService(serviceConnection);
            this.f5439b.f5451e = false;
            this.f5439b.f5457k = null;
            this.f5439b.f5456j = null;
        }
    }
}
