package ea;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlUtil.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29700a = false;

    /* compiled from: GlUtil.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29701a;

        private a(String str, int i10, int i11) {
            this.f29701a = str;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveAttrib(i10, i11, iArr[0], new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, m.o(bArr));
            return new a(str, i11, m.k(i10, str));
        }
    }

    /* compiled from: GlUtil.java */
    /* loaded from: classes2.dex */
    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    /* compiled from: GlUtil.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f29702a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f29703b;

        /* renamed from: c  reason: collision with root package name */
        private final d[] f29704c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, a> f29705d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<String, d> f29706e;

        public c(String str, String str2) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.f29702a = glCreateProgram;
            m.g();
            m.f(glCreateProgram, 35633, str);
            m.f(glCreateProgram, 35632, str2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = {0};
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
                m.p(valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
            }
            GLES20.glUseProgram(glCreateProgram);
            this.f29705d = new HashMap();
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
            this.f29703b = new a[iArr2[0]];
            for (int i10 = 0; i10 < iArr2[0]; i10++) {
                a a10 = a.a(this.f29702a, i10);
                this.f29703b[i10] = a10;
                this.f29705d.put(a10.f29701a, a10);
            }
            this.f29706e = new HashMap();
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f29702a, 35718, iArr3, 0);
            this.f29704c = new d[iArr3[0]];
            for (int i11 = 0; i11 < iArr3[0]; i11++) {
                d a11 = d.a(this.f29702a, i11);
                this.f29704c[i11] = a11;
                this.f29706e.put(a11.f29707a, a11);
            }
            m.g();
        }

        private int b(String str) {
            return m.k(this.f29702a, str);
        }

        public int a(String str) {
            int b10 = b(str);
            GLES20.glEnableVertexAttribArray(b10);
            m.g();
            return b10;
        }

        public int c(String str) {
            return m.l(this.f29702a, str);
        }
    }

    /* compiled from: GlUtil.java */
    /* loaded from: classes2.dex */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f29707a;

        private d(String str, int i10, int i11) {
            this.f29707a = str;
        }

        public static d a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[iArr[0]];
            GLES20.glGetActiveUniform(i10, i11, iArr[0], new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, m.o(bArr));
            return new d(str, m.l(i10, str), iArr2[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb2 = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 10 + String.valueOf(str).length());
            sb2.append(glGetShaderInfoLog);
            sb2.append(", source: ");
            sb2.append(str);
            p(sb2.toString());
        }
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        g();
    }

    public static void g() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            r.c("GlUtil", valueOf.length() != 0 ? "glError: ".concat(valueOf) : new String("glError: "));
            i10 = glGetError;
        }
        if (i10 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i10));
            p(valueOf2.length() != 0 ? "glError: ".concat(valueOf2) : new String("glError: "));
        }
    }

    public static FloatBuffer h(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) h(fArr.length).put(fArr).flip();
    }

    public static int j() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g();
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public static boolean m(Context context) {
        String eglQueryString;
        int i10 = n0.f29709a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(n0.f29711c) || "XT1650".equals(n0.f29712d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean n() {
        String eglQueryString;
        return n0.f29709a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(String str) {
        r.c("GlUtil", str);
        if (f29700a) {
            throw new b(str);
        }
    }
}
