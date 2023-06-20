package ga;

import android.opengl.GLES20;
import ea.m;
import ga.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes2.dex */
final class g {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f30722j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f30723k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f30724l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f30725m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f30726n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f30727a;

    /* renamed from: b  reason: collision with root package name */
    private a f30728b;

    /* renamed from: c  reason: collision with root package name */
    private a f30729c;

    /* renamed from: d  reason: collision with root package name */
    private m.c f30730d;

    /* renamed from: e  reason: collision with root package name */
    private int f30731e;

    /* renamed from: f  reason: collision with root package name */
    private int f30732f;

    /* renamed from: g  reason: collision with root package name */
    private int f30733g;

    /* renamed from: h  reason: collision with root package name */
    private int f30734h;

    /* renamed from: i  reason: collision with root package name */
    private int f30735i;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f30736a;

        /* renamed from: b  reason: collision with root package name */
        private final FloatBuffer f30737b;

        /* renamed from: c  reason: collision with root package name */
        private final FloatBuffer f30738c;

        /* renamed from: d  reason: collision with root package name */
        private final int f30739d;

        public a(e.b bVar) {
            this.f30736a = bVar.a();
            this.f30737b = ea.m.i(bVar.f30720c);
            this.f30738c = ea.m.i(bVar.f30721d);
            int i10 = bVar.f30719b;
            if (i10 == 1) {
                this.f30739d = 5;
            } else if (i10 != 2) {
                this.f30739d = 4;
            } else {
                this.f30739d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f30713a;
        e.a aVar2 = eVar.f30714b;
        return aVar.b() == 1 && aVar.a(0).f30718a == 0 && aVar2.b() == 1 && aVar2.a(0).f30718a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f30729c : this.f30728b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f30727a;
        if (i11 == 1) {
            fArr2 = z10 ? f30724l : f30723k;
        } else if (i11 == 2) {
            fArr2 = z10 ? f30726n : f30725m;
        } else {
            fArr2 = f30722j;
        }
        GLES20.glUniformMatrix3fv(this.f30732f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f30731e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f30735i, 0);
        ea.m.g();
        GLES20.glVertexAttribPointer(this.f30733g, 3, 5126, false, 12, (Buffer) aVar.f30737b);
        ea.m.g();
        GLES20.glVertexAttribPointer(this.f30734h, 2, 5126, false, 8, (Buffer) aVar.f30738c);
        ea.m.g();
        GLES20.glDrawArrays(aVar.f30739d, 0, aVar.f30736a);
        ea.m.g();
    }

    public void b() {
        m.c cVar = new m.c("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        this.f30730d = cVar;
        this.f30731e = cVar.c("uMvpMatrix");
        this.f30732f = this.f30730d.c("uTexMatrix");
        this.f30733g = this.f30730d.a("aPosition");
        this.f30734h = this.f30730d.a("aTexCoords");
        this.f30735i = this.f30730d.c("uTexture");
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f30727a = eVar.f30715c;
            a aVar = new a(eVar.f30713a.a(0));
            this.f30728b = aVar;
            if (!eVar.f30716d) {
                aVar = new a(eVar.f30714b.a(0));
            }
            this.f30729c = aVar;
        }
    }
}
