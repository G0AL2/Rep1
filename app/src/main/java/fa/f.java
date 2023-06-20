package fa;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import ea.m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: classes2.dex */
public final class f extends GLSurfaceView implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f30222a;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    /* loaded from: classes2.dex */
    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k  reason: collision with root package name */
        private static final float[] f30223k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: l  reason: collision with root package name */
        private static final float[] f30224l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: m  reason: collision with root package name */
        private static final float[] f30225m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: n  reason: collision with root package name */
        private static final String[] f30226n = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: o  reason: collision with root package name */
        private static final FloatBuffer f30227o = ea.m.i(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a  reason: collision with root package name */
        private final GLSurfaceView f30228a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f30229b = new int[3];

        /* renamed from: c  reason: collision with root package name */
        private final int[] f30230c = new int[3];

        /* renamed from: d  reason: collision with root package name */
        private final int[] f30231d = new int[3];

        /* renamed from: e  reason: collision with root package name */
        private final int[] f30232e = new int[3];

        /* renamed from: f  reason: collision with root package name */
        private final AtomicReference<m8.k> f30233f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private final FloatBuffer[] f30234g = new FloatBuffer[3];

        /* renamed from: h  reason: collision with root package name */
        private m.c f30235h;

        /* renamed from: i  reason: collision with root package name */
        private int f30236i;

        /* renamed from: j  reason: collision with root package name */
        private m8.k f30237j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f30228a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f30231d;
                this.f30232e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            GLES20.glGenTextures(3, this.f30229b, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(this.f30235h.c(f30226n[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f30229b[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            ea.m.g();
        }

        public void a(m8.k kVar) {
            m8.k andSet = this.f30233f.getAndSet(kVar);
            if (andSet != null) {
                andSet.o();
            }
            this.f30228a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            m8.k andSet = this.f30233f.getAndSet(null);
            if (andSet == null && this.f30237j == null) {
                return;
            }
            if (andSet != null) {
                m8.k kVar = this.f30237j;
                if (kVar != null) {
                    kVar.o();
                }
                this.f30237j = andSet;
            }
            m8.k kVar2 = (m8.k) ea.a.e(this.f30237j);
            float[] fArr = f30224l;
            int i10 = kVar2.f34320g;
            if (i10 == 1) {
                fArr = f30223k;
            } else if (i10 == 3) {
                fArr = f30225m;
            }
            GLES20.glUniformMatrix3fv(this.f30236i, 1, false, fArr, 0);
            int[] iArr = (int[]) ea.a.e(kVar2.f34319f);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) ea.a.e(kVar2.f34318e);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? kVar2.f34317d : (kVar2.f34317d + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f30229b[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = (r3[0] + 1) / 2;
            int[] iArr2 = {kVar2.f34316c, i13, i13};
            for (int i14 = 0; i14 < 3; i14++) {
                if (this.f30231d[i14] != iArr2[i14] || this.f30232e[i14] != iArr[i14]) {
                    ea.a.f(iArr[i14] != 0);
                    float f10 = iArr2[i14] / iArr[i14];
                    this.f30234g[i14] = ea.m.i(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f30230c[i14], 2, 5126, false, 0, (Buffer) this.f30234g[i14]);
                    this.f30231d[i14] = iArr2[i14];
                    this.f30232e[i14] = iArr[i14];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            ea.m.g();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            m.c cVar = new m.c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f30235h = cVar;
            GLES20.glVertexAttribPointer(cVar.a("in_pos"), 2, 5126, false, 0, (Buffer) f30227o);
            this.f30230c[0] = this.f30235h.a("in_tc_y");
            this.f30230c[1] = this.f30235h.a("in_tc_u");
            this.f30230c[2] = this.f30235h.a("in_tc_v");
            this.f30236i = this.f30235h.c("mColorConversion");
            ea.m.g();
            b();
            ea.m.g();
        }
    }

    public f(Context context) {
        this(context, null);
    }

    @Deprecated
    public g getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(m8.k kVar) {
        this.f30222a.a(kVar);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f30222a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
