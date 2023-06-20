package ea;

import android.os.SystemClock;
import com.inmobi.media.fq;
import da.e0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient.java */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f29661a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f29662b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f29663c = false;

    /* renamed from: d  reason: collision with root package name */
    private static long f29664d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f29665e = "time.android.com";

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    private static final class c implements e0.b<e0.e> {

        /* renamed from: a  reason: collision with root package name */
        private final b f29666a;

        public c(b bVar) {
            this.f29666a = bVar;
        }

        @Override // da.e0.b
        public void j(e0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // da.e0.b
        public void m(e0.e eVar, long j10, long j11) {
            if (this.f29666a != null) {
                if (!e0.k()) {
                    this.f29666a.a(new IOException(new ConcurrentModificationException()));
                } else {
                    this.f29666a.b();
                }
            }
        }

        @Override // da.e0.b
        public e0.c s(e0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f29666a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return da.e0.f29144e;
        }
    }

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    private static final class d implements e0.e {
        private d() {
        }

        @Override // da.e0.e
        public void b() {
        }

        @Override // da.e0.e
        public void load() throws IOException {
            synchronized (e0.f29661a) {
                synchronized (e0.f29662b) {
                    if (e0.f29663c) {
                        return;
                    }
                    long e10 = e0.e();
                    synchronized (e0.f29662b) {
                        long unused = e0.f29664d = e10;
                        boolean unused2 = e0.f29663c = true;
                    }
                }
            }
        }
    }

    static /* synthetic */ long e() throws IOException {
        return l();
    }

    private static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("SNTP: Untrusted mode: ");
            sb2.append((int) b11);
            throw new IOException(sb2.toString());
        } else if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("SNTP: Untrusted stratum: ");
            sb3.append(i10);
            throw new IOException(sb3.toString());
        }
    }

    public static long h() {
        long j10;
        synchronized (f29662b) {
            j10 = f29663c ? f29664d : -9223372036854775807L;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f29662b) {
            str = f29665e;
        }
        return str;
    }

    public static void j(da.e0 e0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        if (e0Var == null) {
            e0Var = new da.e0("SntpClient");
        }
        e0Var.n(new d(), new c(bVar), 1);
    }

    public static boolean k() {
        boolean z10;
        synchronized (f29662b) {
            z10 = f29663c;
        }
        return z10;
    }

    private static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            int i10 = bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), i10, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    private static long n(byte[] bArr, int i10) {
        long m10 = m(bArr, i10);
        long m11 = m(bArr, i10 + 4);
        if (m10 == 0 && m11 == 0) {
            return 0L;
        }
        return ((m10 - 2208988800L) * 1000) + ((m11 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
