package m9;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import ea.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DashManifest.java */
/* loaded from: classes2.dex */
public class c implements h9.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f34332a;

    /* renamed from: b  reason: collision with root package name */
    public final long f34333b;

    /* renamed from: c  reason: collision with root package name */
    public final long f34334c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34335d;

    /* renamed from: e  reason: collision with root package name */
    public final long f34336e;

    /* renamed from: f  reason: collision with root package name */
    public final long f34337f;

    /* renamed from: g  reason: collision with root package name */
    public final long f34338g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34339h;

    /* renamed from: i  reason: collision with root package name */
    public final o f34340i;

    /* renamed from: j  reason: collision with root package name */
    public final l f34341j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f34342k;

    /* renamed from: l  reason: collision with root package name */
    public final h f34343l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f34344m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f34332a = j10;
        this.f34333b = j11;
        this.f34334c = j12;
        this.f34335d = z10;
        this.f34336e = j13;
        this.f34337f = j14;
        this.f34338g = j15;
        this.f34339h = j16;
        this.f34343l = hVar;
        this.f34340i = oVar;
        this.f34342k = uri;
        this.f34341j = lVar;
        this.f34344m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<StreamKey> linkedList) {
        StreamKey poll = linkedList.poll();
        int i10 = poll.f21271a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f21272b;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f34324c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f21273c));
                poll = linkedList.poll();
                if (poll.f21271a != i10) {
                    break;
                }
            } while (poll.f21272b == i11);
            arrayList.add(new a(aVar.f34322a, aVar.f34323b, arrayList2, aVar.f34325d, aVar.f34326e, aVar.f34327f));
        } while (poll.f21271a == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // h9.a
    /* renamed from: b */
    public final c a(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f21271a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f34366a, d10.f34367b - j10, c(d10.f34368c, linkedList), d10.f34369d));
            }
            i10++;
        }
        long j11 = this.f34333b;
        return new c(this.f34332a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f34334c, this.f34335d, this.f34336e, this.f34337f, this.f34338g, this.f34339h, this.f34343l, this.f34340i, this.f34341j, this.f34342k, arrayList);
    }

    public final g d(int i10) {
        return this.f34344m.get(i10);
    }

    public final int e() {
        return this.f34344m.size();
    }

    public final long f(int i10) {
        if (i10 == this.f34344m.size() - 1) {
            long j10 = this.f34333b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - this.f34344m.get(i10).f34367b;
        }
        return this.f34344m.get(i10 + 1).f34367b - this.f34344m.get(i10).f34367b;
    }

    public final long g(int i10) {
        return n0.C0(f(i10));
    }
}
