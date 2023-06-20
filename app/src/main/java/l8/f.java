package l8;

import ea.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AudioProcessor.java */
/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f33811a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f33812e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f33813a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33814b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33815c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33816d;

        public a(int i10, int i11, int i12) {
            this.f33813a = i10;
            this.f33814b = i11;
            this.f33815c = i12;
            this.f33816d = n0.u0(i12) ? n0.f0(i12, i11) : -1;
        }

        public String toString() {
            int i10 = this.f33813a;
            int i11 = this.f33814b;
            int i12 = this.f33815c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i10);
            sb2.append(", channelCount=");
            sb2.append(i11);
            sb2.append(", encoding=");
            sb2.append(i12);
            sb2.append(']');
            return sb2.toString();
        }
    }

    /* compiled from: AudioProcessor.java */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(l8.f.a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.f.b.<init>(l8.f$a):void");
        }
    }

    boolean a();

    ByteBuffer b();

    a c(a aVar) throws b;

    boolean d();

    void e(ByteBuffer byteBuffer);

    void f();

    void flush();

    void reset();
}
