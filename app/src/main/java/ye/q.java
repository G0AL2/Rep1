package ye;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: Dns.kt */
/* loaded from: classes3.dex */
public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f39742a;

    /* compiled from: Dns.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Dns.kt */
        /* renamed from: ye.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0555a implements q {
            @Override // ye.q
            public List<InetAddress> a(String str) {
                List<InetAddress> B;
                qe.k.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    qe.k.e(allByName, "InetAddress.getAllByName(hostname)");
                    B = fe.l.B(allByName);
                    return B;
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        f39742a = new a.C0555a();
    }

    List<InetAddress> a(String str) throws UnknownHostException;
}
