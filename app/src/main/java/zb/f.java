package zb;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import zb.e;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes3.dex */
class f implements zb.a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f40507d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f40508a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40509b;

    /* renamed from: c  reason: collision with root package name */
    private e f40510c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes3.dex */
    public class a implements e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f40511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f40512b;

        a(f fVar, byte[] bArr, int[] iArr) {
            this.f40511a = bArr;
            this.f40512b = iArr;
        }

        @Override // zb.e.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f40511a, this.f40512b[0], i10);
                int[] iArr = this.f40512b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f40513a;

        /* renamed from: b  reason: collision with root package name */
        public final int f40514b;

        b(byte[] bArr, int i10) {
            this.f40513a = bArr;
            this.f40514b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(File file, int i10) {
        this.f40508a = file;
        this.f40509b = i10;
    }

    private void f(long j10, String str) {
        int i10;
        if (this.f40510c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f40509b / 4) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f40510c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f40507d));
            while (!this.f40510c.A() && this.f40510c.q0() > this.f40509b) {
                this.f40510c.d0();
            }
        } catch (IOException e10) {
            vb.f.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (this.f40508a.exists()) {
            h();
            e eVar = this.f40510c;
            if (eVar == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[eVar.q0()];
            try {
                this.f40510c.y(new a(this, bArr, iArr));
            } catch (IOException e10) {
                vb.f.f().e("A problem occurred while reading the Crashlytics log file.", e10);
            }
            return new b(bArr, iArr[0]);
        }
        return null;
    }

    private void h() {
        if (this.f40510c == null) {
            try {
                this.f40510c = new e(this.f40508a);
            } catch (IOException e10) {
                vb.f f10 = vb.f.f();
                f10.e("Could not open log file: " + this.f40508a, e10);
            }
        }
    }

    @Override // zb.a
    public void a() {
        yb.g.e(this.f40510c, "There was a problem closing the Crashlytics log file.");
        this.f40510c = null;
    }

    @Override // zb.a
    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f40507d);
        }
        return null;
    }

    @Override // zb.a
    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f40514b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f40513a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // zb.a
    public void d() {
        a();
        this.f40508a.delete();
    }

    @Override // zb.a
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
