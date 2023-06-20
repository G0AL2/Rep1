package db;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c<StateT> {

    /* renamed from: a  reason: collision with root package name */
    protected final e f29331a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f29332b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f29333c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set<a<StateT>> f29334d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private b f29335e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f29336f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(e eVar, IntentFilter intentFilter, Context context) {
        this.f29331a = eVar;
        this.f29332b = intentFilter;
        this.f29333c = eb.a.a(context);
    }

    private final void e() {
        b bVar;
        if ((this.f29336f || !this.f29334d.isEmpty()) && this.f29335e == null) {
            b bVar2 = new b(this);
            this.f29335e = bVar2;
            this.f29333c.registerReceiver(bVar2, this.f29332b);
        }
        if (this.f29336f || !this.f29334d.isEmpty() || (bVar = this.f29335e) == null) {
            return;
        }
        this.f29333c.unregisterReceiver(bVar);
        this.f29335e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateT statet) {
        Iterator it = new HashSet(this.f29334d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized void c(boolean z10) {
        this.f29336f = z10;
        e();
    }

    public final synchronized boolean d() {
        return this.f29335e != null;
    }
}
