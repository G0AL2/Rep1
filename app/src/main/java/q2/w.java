package q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import q2.b;
import q2.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WaitingRequestManager.java */
/* loaded from: classes.dex */
public class w implements n.b {

    /* renamed from: b  reason: collision with root package name */
    private final q f35862b;

    /* renamed from: d  reason: collision with root package name */
    private final c f35864d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<n<?>> f35865e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<n<?>>> f35861a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final o f35863c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(c cVar, BlockingQueue<n<?>> blockingQueue, q qVar) {
        this.f35862b = qVar;
        this.f35864d = cVar;
        this.f35865e = blockingQueue;
    }

    @Override // q2.n.b
    public void a(n<?> nVar, p<?> pVar) {
        List<n<?>> remove;
        b.a aVar = pVar.f35849b;
        if (aVar != null && !aVar.a()) {
            String l10 = nVar.l();
            synchronized (this) {
                remove = this.f35861a.remove(l10);
            }
            if (remove != null) {
                if (v.f35853b) {
                    v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), l10);
                }
                for (n<?> nVar2 : remove) {
                    this.f35862b.b(nVar2, pVar);
                }
                return;
            }
            return;
        }
        b(nVar);
    }

    @Override // q2.n.b
    public synchronized void b(n<?> nVar) {
        BlockingQueue<n<?>> blockingQueue;
        String l10 = nVar.l();
        List<n<?>> remove = this.f35861a.remove(l10);
        if (remove != null && !remove.isEmpty()) {
            if (v.f35853b) {
                v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), l10);
            }
            n<?> remove2 = remove.remove(0);
            this.f35861a.put(l10, remove);
            remove2.I(this);
            o oVar = this.f35863c;
            if (oVar != null) {
                oVar.f(remove2);
            } else if (this.f35864d != null && (blockingQueue = this.f35865e) != null) {
                try {
                    blockingQueue.put(remove2);
                } catch (InterruptedException e10) {
                    v.c("Couldn't add request to queue. %s", e10.toString());
                    Thread.currentThread().interrupt();
                    this.f35864d.d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c(n<?> nVar) {
        String l10 = nVar.l();
        if (this.f35861a.containsKey(l10)) {
            List<n<?>> list = this.f35861a.get(l10);
            if (list == null) {
                list = new ArrayList<>();
            }
            nVar.b("waiting-for-response");
            list.add(nVar);
            this.f35861a.put(l10, list);
            if (v.f35853b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", l10);
            }
            return true;
        }
        this.f35861a.put(l10, null);
        nVar.I(this);
        if (v.f35853b) {
            v.b("new request, sending to network %s", l10);
        }
        return false;
    }
}
