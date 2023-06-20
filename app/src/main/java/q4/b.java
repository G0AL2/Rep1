package q4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import q4.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeferredReleaserConcurrentImpl.java */
/* loaded from: classes.dex */
public class b extends q4.a {

    /* renamed from: b  reason: collision with root package name */
    private final Object f35876b = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f35880f = new a();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<a.InterfaceC0479a> f35878d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a.InterfaceC0479a> f35879e = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f35877c = new Handler(Looper.getMainLooper());

    /* compiled from: DeferredReleaserConcurrentImpl.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f35876b) {
                ArrayList arrayList = b.this.f35879e;
                b bVar = b.this;
                bVar.f35879e = bVar.f35878d;
                b.this.f35878d = arrayList;
            }
            int size = b.this.f35879e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a.InterfaceC0479a) b.this.f35879e.get(i10)).release();
            }
            b.this.f35879e.clear();
        }
    }

    @Override // q4.a
    public void a(a.InterfaceC0479a interfaceC0479a) {
        synchronized (this.f35876b) {
            this.f35878d.remove(interfaceC0479a);
        }
    }

    @Override // q4.a
    public void d(a.InterfaceC0479a interfaceC0479a) {
        if (!q4.a.c()) {
            interfaceC0479a.release();
            return;
        }
        synchronized (this.f35876b) {
            if (this.f35878d.contains(interfaceC0479a)) {
                return;
            }
            this.f35878d.add(interfaceC0479a);
            boolean z10 = true;
            if (this.f35878d.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f35877c.post(this.f35880f);
            }
        }
    }
}
