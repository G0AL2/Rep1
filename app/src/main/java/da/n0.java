package da;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: UdpDataSource.java */
/* loaded from: classes2.dex */
public final class n0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final int f29218e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f29219f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f29220g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f29221h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f29222i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f29223j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f29224k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29225l;

    /* renamed from: m  reason: collision with root package name */
    private int f29226m;

    /* compiled from: UdpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public n0() {
        this(2000);
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f29226m == 0) {
            try {
                ((DatagramSocket) ea.a.e(this.f29222i)).receive(this.f29220g);
                int length = this.f29220g.getLength();
                this.f29226m = length;
                q(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f29220g.getLength();
        int i12 = this.f29226m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f29219f, length2 - i12, bArr, i10, min);
        this.f29226m -= min;
        return min;
    }

    @Override // da.l
    public void close() {
        this.f29221h = null;
        MulticastSocket multicastSocket = this.f29223j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) ea.a.e(this.f29224k));
            } catch (IOException unused) {
            }
            this.f29223j = null;
        }
        DatagramSocket datagramSocket = this.f29222i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f29222i = null;
        }
        this.f29224k = null;
        this.f29226m = 0;
        if (this.f29225l) {
            this.f29225l = false;
            r();
        }
    }

    @Override // da.l
    public long g(p pVar) throws a {
        Uri uri = pVar.f29227a;
        this.f29221h = uri;
        String str = (String) ea.a.e(uri.getHost());
        int port = this.f29221h.getPort();
        s(pVar);
        try {
            this.f29224k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f29224k, port);
            if (this.f29224k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f29223j = multicastSocket;
                multicastSocket.joinGroup(this.f29224k);
                this.f29222i = this.f29223j;
            } else {
                this.f29222i = new DatagramSocket(inetSocketAddress);
            }
            this.f29222i.setSoTimeout(this.f29218e);
            this.f29225l = true;
            t(pVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // da.l
    public Uri o() {
        return this.f29221h;
    }

    public n0(int i10) {
        this(i10, 8000);
    }

    public n0(int i10, int i11) {
        super(true);
        this.f29218e = i11;
        byte[] bArr = new byte[i10];
        this.f29219f = bArr;
        this.f29220g = new DatagramPacket(bArr, 0, i10);
    }
}
