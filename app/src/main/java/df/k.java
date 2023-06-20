package df;

import fe.o;
import fe.p;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import qe.l;
import ye.f0;
import ye.r;
import ye.u;

/* compiled from: RouteSelector.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f29459i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private List<? extends Proxy> f29460a;

    /* renamed from: b  reason: collision with root package name */
    private int f29461b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends InetSocketAddress> f29462c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f0> f29463d;

    /* renamed from: e  reason: collision with root package name */
    private final ye.a f29464e;

    /* renamed from: f  reason: collision with root package name */
    private final i f29465f;

    /* renamed from: g  reason: collision with root package name */
    private final ye.e f29466g;

    /* renamed from: h  reason: collision with root package name */
    private final r f29467h;

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            qe.k.f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                qe.k.e(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            qe.k.e(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f29468a;

        /* renamed from: b  reason: collision with root package name */
        private final List<f0> f29469b;

        public b(List<f0> list) {
            qe.k.f(list, "routes");
            this.f29469b = list;
        }

        public final List<f0> a() {
            return this.f29469b;
        }

        public final boolean b() {
            return this.f29468a < this.f29469b.size();
        }

        public final f0 c() {
            if (b()) {
                List<f0> list = this.f29469b;
                int i10 = this.f29468a;
                this.f29468a = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RouteSelector.kt */
    /* loaded from: classes3.dex */
    public static final class c extends l implements pe.a<List<? extends Proxy>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Proxy f29471b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f29472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Proxy proxy, u uVar) {
            super(0);
            this.f29471b = proxy;
            this.f29472c = uVar;
        }

        @Override // pe.a
        /* renamed from: a */
        public final List<Proxy> invoke() {
            List<Proxy> d10;
            Proxy proxy = this.f29471b;
            if (proxy != null) {
                d10 = o.d(proxy);
                return d10;
            }
            URI r10 = this.f29472c.r();
            if (r10.getHost() == null) {
                return ze.c.t(Proxy.NO_PROXY);
            }
            List<Proxy> select = k.this.f29464e.i().select(r10);
            return select == null || select.isEmpty() ? ze.c.t(Proxy.NO_PROXY) : ze.c.R(select);
        }
    }

    public k(ye.a aVar, i iVar, ye.e eVar, r rVar) {
        List<? extends Proxy> h10;
        List<? extends InetSocketAddress> h11;
        qe.k.f(aVar, "address");
        qe.k.f(iVar, "routeDatabase");
        qe.k.f(eVar, "call");
        qe.k.f(rVar, "eventListener");
        this.f29464e = aVar;
        this.f29465f = iVar;
        this.f29466g = eVar;
        this.f29467h = rVar;
        h10 = p.h();
        this.f29460a = h10;
        h11 = p.h();
        this.f29462c = h11;
        this.f29463d = new ArrayList();
        g(aVar.l(), aVar.g());
    }

    private final boolean c() {
        return this.f29461b < this.f29460a.size();
    }

    private final Proxy e() throws IOException {
        if (c()) {
            List<? extends Proxy> list = this.f29460a;
            int i10 = this.f29461b;
            this.f29461b = i10 + 1;
            Proxy proxy = list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f29464e.l().h() + "; exhausted proxy configurations: " + this.f29460a);
    }

    private final void f(Proxy proxy) throws IOException {
        String h10;
        int m10;
        ArrayList arrayList = new ArrayList();
        this.f29462c = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                h10 = f29459i.a(inetSocketAddress);
                m10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            h10 = this.f29464e.l().h();
            m10 = this.f29464e.l().m();
        }
        if (1 <= m10 && 65535 >= m10) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(h10, m10));
                return;
            }
            this.f29467h.n(this.f29466g, h10);
            List<InetAddress> a10 = this.f29464e.c().a(h10);
            if (!a10.isEmpty()) {
                this.f29467h.m(this.f29466g, h10, a10);
                for (InetAddress inetAddress : a10) {
                    arrayList.add(new InetSocketAddress(inetAddress, m10));
                }
                return;
            }
            throw new UnknownHostException(this.f29464e.c() + " returned no addresses for " + h10);
        }
        throw new SocketException("No route to " + h10 + ':' + m10 + "; port is out of range");
    }

    private final void g(u uVar, Proxy proxy) {
        c cVar = new c(proxy, uVar);
        this.f29467h.p(this.f29466g, uVar);
        List<Proxy> invoke = cVar.invoke();
        this.f29460a = invoke;
        this.f29461b = 0;
        this.f29467h.o(this.f29466g, uVar, invoke);
    }

    public final boolean b() {
        return c() || (this.f29463d.isEmpty() ^ true);
    }

    public final b d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e10 = e();
                for (InetSocketAddress inetSocketAddress : this.f29462c) {
                    f0 f0Var = new f0(this.f29464e, e10, inetSocketAddress);
                    if (this.f29465f.c(f0Var)) {
                        this.f29463d.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                fe.u.s(arrayList, this.f29463d);
                this.f29463d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
