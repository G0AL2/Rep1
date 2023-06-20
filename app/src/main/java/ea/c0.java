package ea;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

/* compiled from: PriorityTaskManager.java */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f29652a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f29653b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f29654c = RecyclerView.UNDEFINED_DURATION;

    public void a(int i10) {
        synchronized (this.f29652a) {
            this.f29653b.add(Integer.valueOf(i10));
            this.f29654c = Math.max(this.f29654c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f29652a) {
            this.f29653b.remove(Integer.valueOf(i10));
            this.f29654c = this.f29653b.isEmpty() ? RecyclerView.UNDEFINED_DURATION : ((Integer) n0.j(this.f29653b.peek())).intValue();
            this.f29652a.notifyAll();
        }
    }
}
