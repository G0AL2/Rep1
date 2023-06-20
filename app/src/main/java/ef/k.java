package ef;

import java.io.IOException;
import java.net.ProtocolException;
import ve.p;
import ye.a0;

/* compiled from: StatusLine.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f29836d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f29837a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29838b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29839c;

    /* compiled from: StatusLine.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final k a(String str) throws IOException {
            boolean y10;
            boolean y11;
            a0 a0Var;
            String str2;
            qe.k.f(str, "statusLine");
            y10 = p.y(str, "HTTP/1.", false, 2, null);
            int i10 = 9;
            if (y10) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt == 0) {
                        a0Var = a0.HTTP_1_0;
                    } else if (charAt == 1) {
                        a0Var = a0.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                y11 = p.y(str, "ICY ", false, 2, null);
                if (y11) {
                    a0Var = a0.HTTP_1_0;
                    i10 = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        qe.k.e(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            throw new ProtocolException("Unexpected status line: " + str);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public k(a0 a0Var, int i10, String str) {
        qe.k.f(a0Var, "protocol");
        qe.k.f(str, "message");
        this.f29837a = a0Var;
        this.f29838b = i10;
        this.f29839c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f29837a == a0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f29838b);
        sb2.append(' ');
        sb2.append(this.f29839c);
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
