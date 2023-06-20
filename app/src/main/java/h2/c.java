package h2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import mf.f;
import mf.h;
import mf.i;
import mf.u;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f31056g = new String[128];

    /* renamed from: a  reason: collision with root package name */
    int f31057a;

    /* renamed from: b  reason: collision with root package name */
    int[] f31058b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f31059c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f31060d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    boolean f31061e;

    /* renamed from: f  reason: collision with root package name */
    boolean f31062f;

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f31063a;

        /* renamed from: b  reason: collision with root package name */
        final u f31064b;

        private a(String[] strArr, u uVar) {
            this.f31063a = strArr;
            this.f31064b = uVar;
        }

        public static a a(String... strArr) {
            try {
                i[] iVarArr = new i[strArr.length];
                f fVar = new f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.d0(fVar, strArr[i10]);
                    fVar.readByte();
                    iVarArr[i10] = fVar.g0();
                }
                return new a((String[]) strArr.clone(), u.l(iVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31056g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31056g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c C(h hVar) {
        return new e(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d0(mf.g r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = h2.c.f31056g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.S(r8, r4, r3)
        L2e:
            r7.M(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.S(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c.d0(mf.g, java.lang.String):void");
    }

    public abstract String A() throws IOException;

    public abstract b L() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(int i10) {
        int i11 = this.f31057a;
        int[] iArr = this.f31058b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f31058b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f31059c;
                this.f31059c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f31060d;
                this.f31060d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new h2.a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f31058b;
        int i12 = this.f31057a;
        this.f31057a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int T(a aVar) throws IOException;

    public abstract void U() throws IOException;

    public abstract void Z() throws IOException;

    public abstract void b() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h2.b g0(String str) throws h2.b {
        throw new h2.b(str + " at path " + getPath());
    }

    public final String getPath() {
        return d.a(this.f31057a, this.f31058b, this.f31059c, this.f31060d);
    }

    public abstract void h() throws IOException;

    public abstract boolean l() throws IOException;

    public abstract boolean q() throws IOException;

    public abstract double w() throws IOException;

    public abstract int y() throws IOException;

    public abstract String z() throws IOException;
}
